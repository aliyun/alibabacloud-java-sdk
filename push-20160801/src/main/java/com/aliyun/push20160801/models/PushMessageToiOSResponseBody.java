// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushMessageToiOSResponseBody extends TeaModel {
    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("RequestId")
    public String requestId;

    public static PushMessageToiOSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushMessageToiOSResponseBody self = new PushMessageToiOSResponseBody();
        return TeaModel.build(map, self);
    }

    public PushMessageToiOSResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public PushMessageToiOSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
