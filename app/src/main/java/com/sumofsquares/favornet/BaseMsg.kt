package com.sumofsquares.favornet

import nl.tudelft.ipv8.messaging.Deserializable
import nl.tudelft.ipv8.messaging.Serializable

class BaseMsg(val message: String) : Serializable {

    override fun serialize(): ByteArray {
        return message.toByteArray()
    }

    companion object Deserializer : Deserializable<BaseMsg> {
        override fun deserialize(buffer: ByteArray, offset: Int): Pair<BaseMsg, Int> {
            return Pair(BaseMsg(buffer.toString(Charsets.UTF_8)), buffer.size)
        }
    }
}