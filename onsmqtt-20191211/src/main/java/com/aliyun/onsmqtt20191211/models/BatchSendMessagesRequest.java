// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20191211.models;

import com.aliyun.tea.*;

public class BatchSendMessagesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Messages")
    public java.util.List<BatchSendMessagesRequestMessages> messages;

    public static BatchSendMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMessagesRequest self = new BatchSendMessagesRequest();
        return TeaModel.build(map, self);
    }

    public BatchSendMessagesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchSendMessagesRequest setMessages(java.util.List<BatchSendMessagesRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<BatchSendMessagesRequestMessages> getMessages() {
        return this.messages;
    }

    public static class BatchSendMessagesRequestMessages extends TeaModel {
        @NameInMap("Id")
        public Integer id;

        @NameInMap("Payload")
        public String payload;

        @NameInMap("ReceiptId")
        public String receiptId;

        @NameInMap("Topics")
        public java.util.List<String> topics;

        public static BatchSendMessagesRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            BatchSendMessagesRequestMessages self = new BatchSendMessagesRequestMessages();
            return TeaModel.build(map, self);
        }

        public BatchSendMessagesRequestMessages setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public BatchSendMessagesRequestMessages setPayload(String payload) {
            this.payload = payload;
            return this;
        }
        public String getPayload() {
            return this.payload;
        }

        public BatchSendMessagesRequestMessages setReceiptId(String receiptId) {
            this.receiptId = receiptId;
            return this;
        }
        public String getReceiptId() {
            return this.receiptId;
        }

        public BatchSendMessagesRequestMessages setTopics(java.util.List<String> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<String> getTopics() {
            return this.topics;
        }

    }

}
