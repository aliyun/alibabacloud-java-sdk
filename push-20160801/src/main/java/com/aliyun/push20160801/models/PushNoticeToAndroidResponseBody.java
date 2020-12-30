// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushNoticeToAndroidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MessageId")
    public String messageId;

    public static PushNoticeToAndroidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushNoticeToAndroidResponseBody self = new PushNoticeToAndroidResponseBody();
        return TeaModel.build(map, self);
    }

    public PushNoticeToAndroidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushNoticeToAndroidResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
