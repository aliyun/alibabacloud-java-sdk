// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CompleteContinuouslyPushResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MessageId")
    public String messageId;

    public static CompleteContinuouslyPushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompleteContinuouslyPushResponseBody self = new CompleteContinuouslyPushResponseBody();
        return TeaModel.build(map, self);
    }

    public CompleteContinuouslyPushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompleteContinuouslyPushResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
