package com.zinc.android_flutter_annotation.channel.receiver.basic

import android.util.Log
import com.joyy.ued.android_flutter_annotation.annotation.basic.FlutterBasicChannel
import com.joyy.ued.android_flutter_annotation.annotation.common.Callback
import com.joyy.ued.android_flutter_annotation.annotation.method.HandleMessage
import com.joyy.ued.android_flutter_annotation.annotation.model.ChannelType
import com.zinc.android_flutter_annotation.config.Config
import io.flutter.plugin.common.BasicMessageChannel
import io.flutter.plugin.common.StringCodec

/**
 * @author: Jiang Pengyong
 * @date: 2021/8/10 3:44 下午
 * @email: 56002982@qq.com
 * @des: string channel
 */
@FlutterBasicChannel(
    codecClass = StringCodec::class,
    channelName = Config.STRING_BASIC_CHANNEL_NONE_SENDER,
    type = ChannelType.RECEIVER
)
class NezaStringBasicChannelNoneSender {

    @Callback
    var reply: BasicMessageChannel.Reply<String>? = null

    @HandleMessage
    fun test(json: String?) {
        Log.e(
            "Neza", "[test] " +
                    "receiverJsonFromFlutter(json: $json)"
        )
    }
}