// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class BatchPeekMessageResponseBody extends TeaModel {
    /**
     * <p>The message list.</p>
     */
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
        /**
         * <p>The total number of times the message has been consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DequeueCount")
        public Long dequeueCount;

        /**
         * <p>The time when the message was sent to the queue. The value is a UNIX timestamp that starts from 1970-01-01 00:00:00.000.</p>
         * 
         * <strong>example:</strong>
         * <p>1250700979248</p>
         */
        @NameInMap("EnqueueTime")
        public Long enqueueTime;

        /**
         * <p>The time when the message was first consumed. The value is a UNIX timestamp in milliseconds that starts from 1970-01-01 00:00:00.000. If DequeueCount is 0, this value is the same as EnqueueTime.</p>
         * 
         * <strong>example:</strong>
         * <p>1250700979348</p>
         */
        @NameInMap("FirstDequeueTime")
        public Long firstDequeueTime;

        /**
         * <p>The message body.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test message</p>
         */
        @NameInMap("MessageBody")
        public String messageBody;

        /**
         * <p>The MD5 hash of the message body.</p>
         * 
         * <strong>example:</strong>
         * <p>F9360F391579E71CA77BC5D50242****</p>
         */
        @NameInMap("MessageBodyMD5")
        public String messageBodyMD5;

        /**
         * <p>The message group ID (FIFO queues only).</p>
         * 
         * <strong>example:</strong>
         * <p>test-group</p>
         */
        @NameInMap("MessageGroupId")
        public String messageGroupId;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C0A80255D7D1163042EA3F2814D055F1</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The priority. Valid values: 1 to 16. Default value: 8. A value of 1 indicates the highest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>The user-defined properties (JSON-formatted string).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;properties1&quot;:&quot;value&quot;}</p>
         */
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
