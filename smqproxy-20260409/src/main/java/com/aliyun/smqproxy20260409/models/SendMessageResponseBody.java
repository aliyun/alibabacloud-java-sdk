// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class SendMessageResponseBody extends TeaModel {
    @NameInMap("MessageBodyMD5")
    public String messageBodyMD5;

    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("ReceiptHandle")
    public String receiptHandle;

    public static SendMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendMessageResponseBody self = new SendMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendMessageResponseBody setMessageBodyMD5(String messageBodyMD5) {
        this.messageBodyMD5 = messageBodyMD5;
        return this;
    }
    public String getMessageBodyMD5() {
        return this.messageBodyMD5;
    }

    public SendMessageResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public SendMessageResponseBody setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
        return this;
    }
    public String getReceiptHandle() {
        return this.receiptHandle;
    }

}
