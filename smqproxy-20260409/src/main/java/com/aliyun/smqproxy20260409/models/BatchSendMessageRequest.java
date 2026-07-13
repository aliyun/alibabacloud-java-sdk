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
        @NameInMap("DelaySeconds")
        public Integer delaySeconds;

        @NameInMap("MessageBody")
        public String messageBody;

        @NameInMap("MessageGroupId")
        public String messageGroupId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("UserProperties")
        public java.util.Map<String, MessagesUserPropertiesValue> userProperties;

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

        public BatchSendMessageRequestMessages setUserProperties(java.util.Map<String, MessagesUserPropertiesValue> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public java.util.Map<String, MessagesUserPropertiesValue> getUserProperties() {
            return this.userProperties;
        }

    }

}
