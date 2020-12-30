// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushNoticeToiOSResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MessageId")
    public String messageId;

    public static PushNoticeToiOSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushNoticeToiOSResponseBody self = new PushNoticeToiOSResponseBody();
        return TeaModel.build(map, self);
    }

    public PushNoticeToiOSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushNoticeToiOSResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
