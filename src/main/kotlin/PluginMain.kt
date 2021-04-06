package com.anywugn.mirai.QQSleep

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.utils.info

object PluginMain : KotlinPlugin(
    JvmPluginDescription(
        id = "com.anywugn.mirai.QQSleep",
        name = "QQ-sleep-statistics-bot",
        version = "0.1.0"
    ) {
        author("anywugn")

        info("""
            通过追踪用户在各个群内发言的时间, 
            推测其睡眠作息的插件.
        """.trimIndent())

        // author 和 info 可以删除.
    }
) {
    override fun onEnable() {
        logger.info { "Plugin loaded" }
    }
}