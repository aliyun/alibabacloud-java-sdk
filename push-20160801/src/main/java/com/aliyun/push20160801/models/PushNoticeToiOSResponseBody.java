// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushNoticeToiOSResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9998B3CC-ED9E-4CB3-A8FB-DCC61296BFBC</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <strong>example:</strong>
     * <p>501029</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PushNoticeToiOSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushNoticeToiOSResponseBody self = new PushNoticeToiOSResponseBody();
        return TeaModel.build(map, self);
    }

    public PushNoticeToiOSResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public PushNoticeToiOSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
