// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CompleteContinuouslyPushResponseBody extends TeaModel {
    /**
     * <p>The message ID for the push request.</p>
     * 
     * <strong>example:</strong>
     * <p>9998B3CC-ED9E-4CB3-A8FB-DCC61296BFBC</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>500131</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CompleteContinuouslyPushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompleteContinuouslyPushResponseBody self = new CompleteContinuouslyPushResponseBody();
        return TeaModel.build(map, self);
    }

    public CompleteContinuouslyPushResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public CompleteContinuouslyPushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
