package com.example.singleton.singleton

object PatternSingleton {

    fun getData(): String {

        val builder =
            PatternBuilder().ConfigurationBuilder().setNumber(45).setColor(0).setSensitivity(300)
                .build()
        return "${builder.number} ${builder.color}${builder.sensitivity}"
    }
}