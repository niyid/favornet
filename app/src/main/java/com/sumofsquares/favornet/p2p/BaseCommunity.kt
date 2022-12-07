package com.sumofsquares.favornet.p2p

import android.content.Context
import android.preference.PreferenceManager
import android.util.Log
import com.sumofsquares.favornet.BaseMsg
import nl.tudelft.ipv8.Community
import nl.tudelft.ipv8.android.keyvault.AndroidCryptoProvider
import nl.tudelft.ipv8.keyvault.PrivateKey
import nl.tudelft.ipv8.messaging.Packet
import nl.tudelft.ipv8.util.hexToBytes
import nl.tudelft.ipv8.util.toHex
import java.util.*

class BaseCommunity : Community() {

    override val serviceId = "02313685c1912098765432148fc8db5899c5df5a"

    fun broadcastGreeting() {
        for (peer in getPeers()) {
            val packet = serializePacket(MESSAGE_ID, BaseMsg("Hello!"))
            send(peer.address, packet)
        }
    }

    private fun getRandomHexString(numchars: Int): String {
        val r = Random()
        val sb = StringBuffer()
        while (sb.length < numchars) {
            sb.append(Integer.toHexString(r.nextInt()))
        }
        return sb.toString().substring(0, numchars)
    }

    private fun getPrivateKey(context: Context): PrivateKey {
        // Load a key from the shared preferences
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val privateKey = prefs.getString(PREF_PRIVATE_KEY, null)
        return if (privateKey == null) {
            // Generate a new key on the first launch
            val newKey = AndroidCryptoProvider.generateKey()
            prefs.edit()
                .putString(PREF_PRIVATE_KEY, newKey.keyToBin().toHex())
                .apply()
            newKey
        } else {
            AndroidCryptoProvider.keyFromPrivateBin(privateKey.hexToBytes())
        }
    }

    init {
        messageHandlers[MESSAGE_ID] = ::onMessage
    }

    private fun onMessage(packet: Packet) {
        val (peer, payload) = packet.getAuthPayload(BaseMsg)
        Log.d("BaseCommunity", peer.mid + ": " + payload.message)
    }

    companion object {
        private const val PREF_PRIVATE_KEY = "private_key"
        private const val MESSAGE_ID = 1
    }
}