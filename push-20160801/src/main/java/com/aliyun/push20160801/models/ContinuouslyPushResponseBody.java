// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class ContinuouslyPushResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MessageId")
    public String messageId;

    public static ContinuouslyPushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ContinuouslyPushResponseBody self = new ContinuouslyPushResponseBody();
        return TeaModel.build(map, self);
    }

    public ContinuouslyPushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ContinuouslyPushResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
