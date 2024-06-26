// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushNoticeToAndroidResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>501029</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <strong>example:</strong>
     * <p>9998B3CC-ED9E-4CB3-A8FB-DCC61296BFBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PushNoticeToAndroidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushNoticeToAndroidResponseBody self = new PushNoticeToAndroidResponseBody();
        return TeaModel.build(map, self);
    }

    public PushNoticeToAndroidResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public PushNoticeToAndroidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
