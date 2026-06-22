// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class BatchReceiveMessageResponseBody extends TeaModel {
    @NameInMap("Messages")
    public java.util.List<BatchReceiveMessageResponseBodyMessages> messages;

    public static BatchReceiveMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchReceiveMessageResponseBody self = new BatchReceiveMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchReceiveMessageResponseBody setMessages(java.util.List<BatchReceiveMessageResponseBodyMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<BatchReceiveMessageResponseBodyMessages> getMessages() {
        return this.messages;
    }

    public static class BatchReceiveMessageResponseBodyMessages extends TeaModel {
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

        @NameInMap("NextVisibleTime")
        public Long nextVisibleTime;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("ReceiptHandle")
        public String receiptHandle;

        @NameInMap("UserProperties")
        public String userProperties;

        public static BatchReceiveMessageResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            BatchReceiveMessageResponseBodyMessages self = new BatchReceiveMessageResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public BatchReceiveMessageResponseBodyMessages setDequeueCount(Long dequeueCount) {
            this.dequeueCount = dequeueCount;
            return this;
        }
        public Long getDequeueCount() {
            return this.dequeueCount;
        }

        public BatchReceiveMessageResponseBodyMessages setEnqueueTime(Long enqueueTime) {
            this.enqueueTime = enqueueTime;
            return this;
        }
        public Long getEnqueueTime() {
            return this.enqueueTime;
        }

        public BatchReceiveMessageResponseBodyMessages setFirstDequeueTime(Long firstDequeueTime) {
            this.firstDequeueTime = firstDequeueTime;
            return this;
        }
        public Long getFirstDequeueTime() {
            return this.firstDequeueTime;
        }

        public BatchReceiveMessageResponseBodyMessages setMessageBody(String messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        public String getMessageBody() {
            return this.messageBody;
        }

        public BatchReceiveMessageResponseBodyMessages setMessageBodyMD5(String messageBodyMD5) {
            this.messageBodyMD5 = messageBodyMD5;
            return this;
        }
        public String getMessageBodyMD5() {
            return this.messageBodyMD5;
        }

        public BatchReceiveMessageResponseBodyMessages setMessageGroupId(String messageGroupId) {
            this.messageGroupId = messageGroupId;
            return this;
        }
        public String getMessageGroupId() {
            return this.messageGroupId;
        }

        public BatchReceiveMessageResponseBodyMessages setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public BatchReceiveMessageResponseBodyMessages setNextVisibleTime(Long nextVisibleTime) {
            this.nextVisibleTime = nextVisibleTime;
            return this;
        }
        public Long getNextVisibleTime() {
            return this.nextVisibleTime;
        }

        public BatchReceiveMessageResponseBodyMessages setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public BatchReceiveMessageResponseBodyMessages setReceiptHandle(String receiptHandle) {
            this.receiptHandle = receiptHandle;
            return this;
        }
        public String getReceiptHandle() {
            return this.receiptHandle;
        }

        public BatchReceiveMessageResponseBodyMessages setUserProperties(String userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public String getUserProperties() {
            return this.userProperties;
        }

    }

}
