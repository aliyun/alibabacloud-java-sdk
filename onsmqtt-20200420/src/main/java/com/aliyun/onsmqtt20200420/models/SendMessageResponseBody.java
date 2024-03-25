// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class SendMessageResponseBody extends TeaModel {
    /**
     * <p>The unique message ID that is returned by the ApsaraMQ for MQTT broker after the message is sent.</p>
     */
    @NameInMap("MsgId")
    public String msgId;

    /**
     * <p>The unique ID that the system generates for the request. This parameter is a common parameter.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SendMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendMessageResponseBody self = new SendMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendMessageResponseBody setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public SendMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
