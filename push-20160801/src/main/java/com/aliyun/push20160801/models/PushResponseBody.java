// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushResponseBody extends TeaModel {
    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("RequestId")
    public String requestId;

    public static PushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushResponseBody self = new PushResponseBody();
        return TeaModel.build(map, self);
    }

    public PushResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public PushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
