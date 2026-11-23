// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bchat20261121.models;

import com.aliyun.tea.*;

public class StreamVoiceResponseBody extends TeaModel {
    /**
     * <p>仅描述 WebSocket 接入/握手的请求标识，不代表后续语音轮次或音频结果。成功连接后使用下文 VoiceEvent 文本事件和 VoiceOutputAudio 二进制帧，不能把整条 WSS 连接按单次 JSON 响应处理。</p>
     * 
     * <strong>example:</strong>
     * <p>A3677B53-C3AE-5F04-953E-AA332CABB87B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StreamVoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StreamVoiceResponseBody self = new StreamVoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public StreamVoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
