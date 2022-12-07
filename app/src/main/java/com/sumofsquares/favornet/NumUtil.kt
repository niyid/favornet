package com.sumofsquares.favornet

import java.util.*

class NumUtil {
    private fun getRandomHexString(numchars: Int): String {
        val r = Random()
        val sb = StringBuffer()
        while (sb.length < numchars) {
            sb.append(Integer.toHexString(r.nextInt()))
        }
        return sb.toString().substring(0, numchars)
    }
}