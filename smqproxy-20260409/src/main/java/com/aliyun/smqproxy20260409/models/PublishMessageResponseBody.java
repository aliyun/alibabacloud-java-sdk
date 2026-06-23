// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class PublishMessageResponseBody extends TeaModel {
    @NameInMap("MessageBodyMD5")
    public String messageBodyMD5;

    @NameInMap("MessageId")
    public String messageId;

    public static PublishMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishMessageResponseBody self = new PublishMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishMessageResponseBody setMessageBodyMD5(String messageBodyMD5) {
        this.messageBodyMD5 = messageBodyMD5;
        return this;
    }
    public String getMessageBodyMD5() {
        return this.messageBodyMD5;
    }

    public PublishMessageResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
