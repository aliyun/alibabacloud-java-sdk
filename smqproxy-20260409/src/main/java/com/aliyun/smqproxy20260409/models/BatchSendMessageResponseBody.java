// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class BatchSendMessageResponseBody extends TeaModel {
    @NameInMap("Messages")
    public java.util.List<BatchSendMessageResponseBodyMessages> messages;

    public static BatchSendMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMessageResponseBody self = new BatchSendMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSendMessageResponseBody setMessages(java.util.List<BatchSendMessageResponseBodyMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<BatchSendMessageResponseBodyMessages> getMessages() {
        return this.messages;
    }

    public static class BatchSendMessageResponseBodyMessages extends TeaModel {
        @NameInMap("MessageBodyMD5")
        public String messageBodyMD5;

        @NameInMap("MessageId")
        public String messageId;

        public static BatchSendMessageResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            BatchSendMessageResponseBodyMessages self = new BatchSendMessageResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public BatchSendMessageResponseBodyMessages setMessageBodyMD5(String messageBodyMD5) {
            this.messageBodyMD5 = messageBodyMD5;
            return this;
        }
        public String getMessageBodyMD5() {
            return this.messageBodyMD5;
        }

        public BatchSendMessageResponseBodyMessages setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

}
