// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class BatchPeekMessageResponseBody extends TeaModel {
    @NameInMap("Messages")
    public java.util.List<BatchPeekMessageResponseBodyMessages> messages;

    public static BatchPeekMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchPeekMessageResponseBody self = new BatchPeekMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchPeekMessageResponseBody setMessages(java.util.List<BatchPeekMessageResponseBodyMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<BatchPeekMessageResponseBodyMessages> getMessages() {
        return this.messages;
    }

    public static class BatchPeekMessageResponseBodyMessages extends TeaModel {
        @NameInMap("DequeueCount")
        public Long dequeueCount;

        @NameInMap("EnqueueTime")
        public Long enqueueTime;

        @NameInMap("FirstDequeueTime")
        public Long firstDequeueTime;

        @NameInMap("MessageBody")
        public String messageBody;

        @NameInMap("MessageBodyMD5")
        public String messageBodyMD5;

        @NameInMap("MessageGroupId")
        public String messageGroupId;

        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("UserProperties")
        public java.util.Map<String, MessagesUserPropertiesValue> userProperties;

        public static BatchPeekMessageResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            BatchPeekMessageResponseBodyMessages self = new BatchPeekMessageResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public BatchPeekMessageResponseBodyMessages setDequeueCount(Long dequeueCount) {
            this.dequeueCount = dequeueCount;
            return this;
        }
        public Long getDequeueCount() {
            return this.dequeueCount;
        }

        public BatchPeekMessageResponseBodyMessages setEnqueueTime(Long enqueueTime) {
            this.enqueueTime = enqueueTime;
            return this;
        }
        public Long getEnqueueTime() {
            return this.enqueueTime;
        }

        public BatchPeekMessageResponseBodyMessages setFirstDequeueTime(Long firstDequeueTime) {
            this.firstDequeueTime = firstDequeueTime;
            return this;
        }
        public Long getFirstDequeueTime() {
            return this.firstDequeueTime;
        }

        public BatchPeekMessageResponseBodyMessages setMessageBody(String messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        public String getMessageBody() {
            return this.messageBody;
        }

        public BatchPeekMessageResponseBodyMessages setMessageBodyMD5(String messageBodyMD5) {
            this.messageBodyMD5 = messageBodyMD5;
            return this;
        }
        public String getMessageBodyMD5() {
            return this.messageBodyMD5;
        }

        public BatchPeekMessageResponseBodyMessages setMessageGroupId(String messageGroupId) {
            this.messageGroupId = messageGroupId;
            return this;
        }
        public String getMessageGroupId() {
            return this.messageGroupId;
        }

        public BatchPeekMessageResponseBodyMessages setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public BatchPeekMessageResponseBodyMessages setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public BatchPeekMessageResponseBodyMessages setUserProperties(java.util.Map<String, MessagesUserPropertiesValue> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public java.util.Map<String, MessagesUserPropertiesValue> getUserProperties() {
            return this.userProperties;
        }

    }

}
