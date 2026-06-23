// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class BatchSendMessageRequest extends TeaModel {
    @NameInMap("Messages")
    public java.util.List<BatchSendMessageRequestMessages> messages;

    public static BatchSendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMessageRequest self = new BatchSendMessageRequest();
        return TeaModel.build(map, self);
    }

    public BatchSendMessageRequest setMessages(java.util.List<BatchSendMessageRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<BatchSendMessageRequestMessages> getMessages() {
        return this.messages;
    }

    public static class BatchSendMessageRequestMessages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("DelaySeconds")
        public Integer delaySeconds;

        /**
         * <strong>example:</strong>
         * <p>This is test message 1.</p>
         */
        @NameInMap("MessageBody")
        public String messageBody;

        /**
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("MessageGroupId")
        public String messageGroupId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static BatchSendMessageRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            BatchSendMessageRequestMessages self = new BatchSendMessageRequestMessages();
            return TeaModel.build(map, self);
        }

        public BatchSendMessageRequestMessages setDelaySeconds(Integer delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }
        public Integer getDelaySeconds() {
            return this.delaySeconds;
        }

        public BatchSendMessageRequestMessages setMessageBody(String messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        public String getMessageBody() {
            return this.messageBody;
        }

        public BatchSendMessageRequestMessages setMessageGroupId(String messageGroupId) {
            this.messageGroupId = messageGroupId;
            return this;
        }
        public String getMessageGroupId() {
            return this.messageGroupId;
        }

        public BatchSendMessageRequestMessages setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
