// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class BatchReceiveMessageResponseBody extends TeaModel {
    /**
     * <p>The array of messages.</p>
     */
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
        /**
         * <p>The total number of times the message has been consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DequeueCount")
        public Long dequeueCount;

        /**
         * <p>The time when the message was sent to the queue, in milliseconds since 1970-01-01 00:00:00 000.</p>
         * 
         * <strong>example:</strong>
         * <p>1250700979348</p>
         */
        @NameInMap("EnqueueTime")
        public Long enqueueTime;

        /**
         * <p>The time when the message was first consumed, in milliseconds (timestamp). If <code>DequeueCount=0</code>, this value is the same as <code>EnqueueTime</code>.</p>
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
         * <p>This is test message 1.</p>
         */
        @NameInMap("MessageBody")
        public String messageBody;

        /**
         * <p>The MD5 hash of the message body.</p>
         * 
         * <strong>example:</strong>
         * <p>C5DD56A39F5F7BB8B3337C6D11B6D8BE</p>
         */
        @NameInMap("MessageBodyMD5")
        public String messageBodyMD5;

        /**
         * <p>The message group ID. This parameter applies only to FIFO queues.</p>
         * 
         * <strong>example:</strong>
         * <p>test-group</p>
         */
        @NameInMap("MessageGroupId")
        public String messageGroupId;

        /**
         * <p>The message ID, which is unique within a queue.</p>
         * 
         * <strong>example:</strong>
         * <p>5F290C926D472878214D9529A8FA200000001</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The time when the message becomes available for consumption again, in milliseconds (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1250700979348</p>
         */
        @NameInMap("NextVisibleTime")
        public Long nextVisibleTime;

        /**
         * <p>The priority of the message. 1 indicates the highest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>The temporary handle generated for this message retrieval. This handle is used to delete or modify Inactive messages and is valid until NextVisibleTime.</p>
         * 
         * <strong>example:</strong>
         * <p>1-ODU4OTkzNDU5My0xNDMyNzI3ODI3LTItOA==</p>
         */
        @NameInMap("ReceiptHandle")
        public String receiptHandle;

        /**
         * <p>The user-defined properties in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;properties1&quot;:&quot;value&quot;}</p>
         */
        @NameInMap("UserProperties")
        public java.util.Map<String, MessagesUserPropertiesValue> userProperties;

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

        public BatchReceiveMessageResponseBodyMessages setUserProperties(java.util.Map<String, MessagesUserPropertiesValue> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public java.util.Map<String, MessagesUserPropertiesValue> getUserProperties() {
            return this.userProperties;
        }

    }

}
