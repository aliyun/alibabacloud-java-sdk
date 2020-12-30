// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushMessageToAndroidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MessageId")
    public String messageId;

    public static PushMessageToAndroidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushMessageToAndroidResponseBody self = new PushMessageToAndroidResponseBody();
        return TeaModel.build(map, self);
    }

    public PushMessageToAndroidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushMessageToAndroidResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
