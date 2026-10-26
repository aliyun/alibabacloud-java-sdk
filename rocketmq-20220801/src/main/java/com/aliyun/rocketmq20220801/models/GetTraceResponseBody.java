// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetTraceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidConsumerGroupId</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("data")
    public GetTraceResponseBodyData data;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The instance cannot be found.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID. Each request has a unique ID that you can use to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7779A8FC-1BCD-5A1D-A603-C4A9BD8ADC49</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTraceResponseBody self = new GetTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTraceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTraceResponseBody setData(GetTraceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTraceResponseBodyData getData() {
        return this.data;
    }

    public GetTraceResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetTraceResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetTraceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTraceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTraceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTraceResponseBodyDataBrokerInfoOperations extends TeaModel {
        /**
         * <p>The operation time, in YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("operateTime")
        public String operateTime;

        /**
         * <p>The operation type.</p>
         * 
         * <strong>example:</strong>
         * <p>ADD</p>
         */
        @NameInMap("operateType")
        public String operateType;

        public static GetTraceResponseBodyDataBrokerInfoOperations build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyDataBrokerInfoOperations self = new GetTraceResponseBodyDataBrokerInfoOperations();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyDataBrokerInfoOperations setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public GetTraceResponseBodyDataBrokerInfoOperations setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

    }

    public static class GetTraceResponseBodyDataBrokerInfo extends TeaModel {
        /**
         * <p>The scheduled message status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("delayStatus")
        public String delayStatus;

        /**
         * <p>The list of operations.</p>
         */
        @NameInMap("operations")
        public java.util.List<GetTraceResponseBodyDataBrokerInfoOperations> operations;

        /**
         * <p>The preset delivery time, in YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("presetDelayTime")
        public String presetDelayTime;

        /**
         * <p>The recall result. This field is non-empty when a recall record exists.</p>
         * 
         * <strong>example:</strong>
         * <p>RECALL_OK | RECALL_FAIL</p>
         */
        @NameInMap("recallResult")
        public String recallResult;

        public static GetTraceResponseBodyDataBrokerInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyDataBrokerInfo self = new GetTraceResponseBodyDataBrokerInfo();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyDataBrokerInfo setDelayStatus(String delayStatus) {
            this.delayStatus = delayStatus;
            return this;
        }
        public String getDelayStatus() {
            return this.delayStatus;
        }

        public GetTraceResponseBodyDataBrokerInfo setOperations(java.util.List<GetTraceResponseBodyDataBrokerInfoOperations> operations) {
            this.operations = operations;
            return this;
        }
        public java.util.List<GetTraceResponseBodyDataBrokerInfoOperations> getOperations() {
            return this.operations;
        }

        public GetTraceResponseBodyDataBrokerInfo setPresetDelayTime(String presetDelayTime) {
            this.presetDelayTime = presetDelayTime;
            return this;
        }
        public String getPresetDelayTime() {
            return this.presetDelayTime;
        }

        public GetTraceResponseBodyDataBrokerInfo setRecallResult(String recallResult) {
            this.recallResult = recallResult;
            return this;
        }
        public String getRecallResult() {
            return this.recallResult;
        }

    }

    public static class GetTraceResponseBodyDataConsumerInfosDeadLetterInfo extends TeaModel {
        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7F000001001F7A4F0F29463F0376047D</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>The time when the message arrived in the dead-letter queue, in YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("toDlqTime")
        public String toDlqTime;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>Register_Sync</p>
         */
        @NameInMap("topicName")
        public String topicName;

        public static GetTraceResponseBodyDataConsumerInfosDeadLetterInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyDataConsumerInfosDeadLetterInfo self = new GetTraceResponseBodyDataConsumerInfosDeadLetterInfo();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyDataConsumerInfosDeadLetterInfo setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public GetTraceResponseBodyDataConsumerInfosDeadLetterInfo setToDlqTime(String toDlqTime) {
            this.toDlqTime = toDlqTime;
            return this;
        }
        public String getToDlqTime() {
            return this.toDlqTime;
        }

        public GetTraceResponseBodyDataConsumerInfosDeadLetterInfo setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class GetTraceResponseBodyDataConsumerInfosRecordsOperations extends TeaModel {
        /**
         * <p>Indicates whether the message is a dead-letter message.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("deadMessage")
        public Boolean deadMessage;

        /**
         * <p>The invisible time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("invisibleTime")
        public Long invisibleTime;

        /**
         * <p>The operation time, in YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("operateTime")
        public String operateTime;

        /**
         * <p>The operation type.</p>
         * 
         * <strong>example:</strong>
         * <p>ADD</p>
         */
        @NameInMap("operateType")
        public String operateType;

        public static GetTraceResponseBodyDataConsumerInfosRecordsOperations build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyDataConsumerInfosRecordsOperations self = new GetTraceResponseBodyDataConsumerInfosRecordsOperations();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyDataConsumerInfosRecordsOperations setDeadMessage(Boolean deadMessage) {
            this.deadMessage = deadMessage;
            return this;
        }
        public Boolean getDeadMessage() {
            return this.deadMessage;
        }

        public GetTraceResponseBodyDataConsumerInfosRecordsOperations setInvisibleTime(Long invisibleTime) {
            this.invisibleTime = invisibleTime;
            return this;
        }
        public Long getInvisibleTime() {
            return this.invisibleTime;
        }

        public GetTraceResponseBodyDataConsumerInfosRecordsOperations setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public GetTraceResponseBodyDataConsumerInfosRecordsOperations setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

    }

    public static class GetTraceResponseBodyDataConsumerInfosRecords extends TeaModel {
        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("clientHost")
        public String clientHost;

        /**
         * <p>The consumption status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("consumeStatus")
        public String consumeStatus;

        /**
         * <p>Indicates whether ordered consumption is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("fifoEnable")
        public Boolean fifoEnable;

        /**
         * <p>The list of operations.</p>
         */
        @NameInMap("operations")
        public java.util.List<GetTraceResponseBodyDataConsumerInfosRecordsOperations> operations;

        /**
         * <p>POP_CK</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("popCk")
        public String popCk;

        /**
         * <p>The consumer name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("userName")
        public String userName;

        public static GetTraceResponseBodyDataConsumerInfosRecords build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyDataConsumerInfosRecords self = new GetTraceResponseBodyDataConsumerInfosRecords();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyDataConsumerInfosRecords setClientHost(String clientHost) {
            this.clientHost = clientHost;
            return this;
        }
        public String getClientHost() {
            return this.clientHost;
        }

        public GetTraceResponseBodyDataConsumerInfosRecords setConsumeStatus(String consumeStatus) {
            this.consumeStatus = consumeStatus;
            return this;
        }
        public String getConsumeStatus() {
            return this.consumeStatus;
        }

        public GetTraceResponseBodyDataConsumerInfosRecords setFifoEnable(Boolean fifoEnable) {
            this.fifoEnable = fifoEnable;
            return this;
        }
        public Boolean getFifoEnable() {
            return this.fifoEnable;
        }

        public GetTraceResponseBodyDataConsumerInfosRecords setOperations(java.util.List<GetTraceResponseBodyDataConsumerInfosRecordsOperations> operations) {
            this.operations = operations;
            return this;
        }
        public java.util.List<GetTraceResponseBodyDataConsumerInfosRecordsOperations> getOperations() {
            return this.operations;
        }

        public GetTraceResponseBodyDataConsumerInfosRecords setPopCk(String popCk) {
            this.popCk = popCk;
            return this;
        }
        public String getPopCk() {
            return this.popCk;
        }

        public GetTraceResponseBodyDataConsumerInfosRecords setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class GetTraceResponseBodyDataConsumerInfos extends TeaModel {
        /**
         * <p>The consumption status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("consumeStatus")
        public String consumeStatus;

        /**
         * <p>The consumer group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_inspector_group</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The dead-letter message information.</p>
         */
        @NameInMap("deadLetterInfo")
        public GetTraceResponseBodyDataConsumerInfosDeadLetterInfo deadLetterInfo;

        /**
         * <p>Indicates whether the message is a dead-letter message.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("deadMessage")
        public Boolean deadMessage;

        /**
         * <p>The list of consumption records.</p>
         */
        @NameInMap("records")
        public java.util.List<GetTraceResponseBodyDataConsumerInfosRecords> records;

        public static GetTraceResponseBodyDataConsumerInfos build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyDataConsumerInfos self = new GetTraceResponseBodyDataConsumerInfos();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyDataConsumerInfos setConsumeStatus(String consumeStatus) {
            this.consumeStatus = consumeStatus;
            return this;
        }
        public String getConsumeStatus() {
            return this.consumeStatus;
        }

        public GetTraceResponseBodyDataConsumerInfos setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public GetTraceResponseBodyDataConsumerInfos setDeadLetterInfo(GetTraceResponseBodyDataConsumerInfosDeadLetterInfo deadLetterInfo) {
            this.deadLetterInfo = deadLetterInfo;
            return this;
        }
        public GetTraceResponseBodyDataConsumerInfosDeadLetterInfo getDeadLetterInfo() {
            return this.deadLetterInfo;
        }

        public GetTraceResponseBodyDataConsumerInfos setDeadMessage(Boolean deadMessage) {
            this.deadMessage = deadMessage;
            return this;
        }
        public Boolean getDeadMessage() {
            return this.deadMessage;
        }

        public GetTraceResponseBodyDataConsumerInfos setRecords(java.util.List<GetTraceResponseBodyDataConsumerInfosRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetTraceResponseBodyDataConsumerInfosRecords> getRecords() {
            return this.records;
        }

    }

    public static class GetTraceResponseBodyDataMessageInfo extends TeaModel {
        /**
         * <p>The message body.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("body")
        public String body;

        /**
         * <p>The origin of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>x.x.x.x</p>
         */
        @NameInMap("bornHost")
        public String bornHost;

        /**
         * <p>The time when the message was generated, in YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("bornTime")
        public String bornTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-u0t2ygjq505</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The lite topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("liteTopicName")
        public String liteTopicName;

        /**
         * <p>The previous sharding key. This field is exclusive to ordered messages.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("messageGroup")
        public String messageGroup;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0A79275A00207A4F0F2916C92F9A0B94</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>The message key.</p>
         */
        @NameInMap("messageKeys")
        public java.util.List<String> messageKeys;

        /**
         * <p>The list of tags.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("messageTag")
        public String messageTag;

        /**
         * <p>The message type.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("messageType")
        public String messageType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The log broker address where the message is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>x.x.x.x</p>
         */
        @NameInMap("storeHost")
        public String storeHost;

        /**
         * <p>The time when the message was stored in the log broker, in YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("storeTime")
        public String storeTime;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>Topic_normal_inspector</p>
         */
        @NameInMap("topicName")
        public String topicName;

        /**
         * <p>The transaction ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("transactionId")
        public String transactionId;

        /**
         * <p>The user properties.</p>
         */
        @NameInMap("userProperties")
        public java.util.Map<String, String> userProperties;

        public static GetTraceResponseBodyDataMessageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyDataMessageInfo self = new GetTraceResponseBodyDataMessageInfo();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyDataMessageInfo setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public GetTraceResponseBodyDataMessageInfo setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

        public GetTraceResponseBodyDataMessageInfo setBornTime(String bornTime) {
            this.bornTime = bornTime;
            return this;
        }
        public String getBornTime() {
            return this.bornTime;
        }

        public GetTraceResponseBodyDataMessageInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetTraceResponseBodyDataMessageInfo setLiteTopicName(String liteTopicName) {
            this.liteTopicName = liteTopicName;
            return this;
        }
        public String getLiteTopicName() {
            return this.liteTopicName;
        }

        public GetTraceResponseBodyDataMessageInfo setMessageGroup(String messageGroup) {
            this.messageGroup = messageGroup;
            return this;
        }
        public String getMessageGroup() {
            return this.messageGroup;
        }

        public GetTraceResponseBodyDataMessageInfo setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public GetTraceResponseBodyDataMessageInfo setMessageKeys(java.util.List<String> messageKeys) {
            this.messageKeys = messageKeys;
            return this;
        }
        public java.util.List<String> getMessageKeys() {
            return this.messageKeys;
        }

        public GetTraceResponseBodyDataMessageInfo setMessageTag(String messageTag) {
            this.messageTag = messageTag;
            return this;
        }
        public String getMessageTag() {
            return this.messageTag;
        }

        public GetTraceResponseBodyDataMessageInfo setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public GetTraceResponseBodyDataMessageInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetTraceResponseBodyDataMessageInfo setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public GetTraceResponseBodyDataMessageInfo setStoreTime(String storeTime) {
            this.storeTime = storeTime;
            return this;
        }
        public String getStoreTime() {
            return this.storeTime;
        }

        public GetTraceResponseBodyDataMessageInfo setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public GetTraceResponseBodyDataMessageInfo setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

        public GetTraceResponseBodyDataMessageInfo setUserProperties(java.util.Map<String, String> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public java.util.Map<String, String> getUserProperties() {
            return this.userProperties;
        }

    }

    public static class GetTraceResponseBodyDataProducerInfoRecords extends TeaModel {
        /**
         * <p>The time when the message arrived, in YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("arriveTime")
        public String arriveTime;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("clientHost")
        public String clientHost;

        /**
         * <p>The dead-letter queue message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0A79275A00207A4F0F2916C92F9A0B94</p>
         */
        @NameInMap("dlqOriginMessageId")
        public String dlqOriginMessageId;

        /**
         * <p>The dead-letter queue topic.</p>
         * 
         * <strong>example:</strong>
         * <p>test_topic</p>
         */
        @NameInMap("dlqOriginTopic")
        public String dlqOriginTopic;

        /**
         * <p>The message source.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSOLE</p>
         */
        @NameInMap("messageSource")
        public String messageSource;

        /**
         * <p>The time taken to send the message.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("produceDuration")
        public Long produceDuration;

        /**
         * <p>The send status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("produceStatus")
        public String produceStatus;

        /**
         * <p>The time when the message was sent, in YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("produceTime")
        public String produceTime;

        /**
         * <p>The time when the recall request was initiated. This field is non-empty when messageSource is &quot;recall&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("recallTime")
        public String recallTime;

        /**
         * <p>The producer name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("userName")
        public String userName;

        public static GetTraceResponseBodyDataProducerInfoRecords build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyDataProducerInfoRecords self = new GetTraceResponseBodyDataProducerInfoRecords();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyDataProducerInfoRecords setArriveTime(String arriveTime) {
            this.arriveTime = arriveTime;
            return this;
        }
        public String getArriveTime() {
            return this.arriveTime;
        }

        public GetTraceResponseBodyDataProducerInfoRecords setClientHost(String clientHost) {
            this.clientHost = clientHost;
            return this;
        }
        public String getClientHost() {
            return this.clientHost;
        }

        public GetTraceResponseBodyDataProducerInfoRecords setDlqOriginMessageId(String dlqOriginMessageId) {
            this.dlqOriginMessageId = dlqOriginMessageId;
            return this;
        }
        public String getDlqOriginMessageId() {
            return this.dlqOriginMessageId;
        }

        public GetTraceResponseBodyDataProducerInfoRecords setDlqOriginTopic(String dlqOriginTopic) {
            this.dlqOriginTopic = dlqOriginTopic;
            return this;
        }
        public String getDlqOriginTopic() {
            return this.dlqOriginTopic;
        }

        public GetTraceResponseBodyDataProducerInfoRecords setMessageSource(String messageSource) {
            this.messageSource = messageSource;
            return this;
        }
        public String getMessageSource() {
            return this.messageSource;
        }

        public GetTraceResponseBodyDataProducerInfoRecords setProduceDuration(Long produceDuration) {
            this.produceDuration = produceDuration;
            return this;
        }
        public Long getProduceDuration() {
            return this.produceDuration;
        }

        public GetTraceResponseBodyDataProducerInfoRecords setProduceStatus(String produceStatus) {
            this.produceStatus = produceStatus;
            return this;
        }
        public String getProduceStatus() {
            return this.produceStatus;
        }

        public GetTraceResponseBodyDataProducerInfoRecords setProduceTime(String produceTime) {
            this.produceTime = produceTime;
            return this;
        }
        public String getProduceTime() {
            return this.produceTime;
        }

        public GetTraceResponseBodyDataProducerInfoRecords setRecallTime(String recallTime) {
            this.recallTime = recallTime;
            return this;
        }
        public String getRecallTime() {
            return this.recallTime;
        }

        public GetTraceResponseBodyDataProducerInfoRecords setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class GetTraceResponseBodyDataProducerInfo extends TeaModel {
        /**
         * <p>The list of producer records.</p>
         */
        @NameInMap("records")
        public java.util.List<GetTraceResponseBodyDataProducerInfoRecords> records;

        public static GetTraceResponseBodyDataProducerInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyDataProducerInfo self = new GetTraceResponseBodyDataProducerInfo();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyDataProducerInfo setRecords(java.util.List<GetTraceResponseBodyDataProducerInfoRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetTraceResponseBodyDataProducerInfoRecords> getRecords() {
            return this.records;
        }

    }

    public static class GetTraceResponseBodyData extends TeaModel {
        /**
         * <p>The broker message trace information.</p>
         */
        @NameInMap("brokerInfo")
        public GetTraceResponseBodyDataBrokerInfo brokerInfo;

        /**
         * <p>The consumer message trace information.</p>
         */
        @NameInMap("consumerInfos")
        public java.util.List<GetTraceResponseBodyDataConsumerInfos> consumerInfos;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The message information.</p>
         */
        @NameInMap("messageInfo")
        public GetTraceResponseBodyDataMessageInfo messageInfo;

        /**
         * <p>The producer message trace information.</p>
         */
        @NameInMap("producerInfo")
        public GetTraceResponseBodyDataProducerInfo producerInfo;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_test</p>
         */
        @NameInMap("topicName")
        public String topicName;

        public static GetTraceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyData self = new GetTraceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyData setBrokerInfo(GetTraceResponseBodyDataBrokerInfo brokerInfo) {
            this.brokerInfo = brokerInfo;
            return this;
        }
        public GetTraceResponseBodyDataBrokerInfo getBrokerInfo() {
            return this.brokerInfo;
        }

        public GetTraceResponseBodyData setConsumerInfos(java.util.List<GetTraceResponseBodyDataConsumerInfos> consumerInfos) {
            this.consumerInfos = consumerInfos;
            return this;
        }
        public java.util.List<GetTraceResponseBodyDataConsumerInfos> getConsumerInfos() {
            return this.consumerInfos;
        }

        public GetTraceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetTraceResponseBodyData setMessageInfo(GetTraceResponseBodyDataMessageInfo messageInfo) {
            this.messageInfo = messageInfo;
            return this;
        }
        public GetTraceResponseBodyDataMessageInfo getMessageInfo() {
            return this.messageInfo;
        }

        public GetTraceResponseBodyData setProducerInfo(GetTraceResponseBodyDataProducerInfo producerInfo) {
            this.producerInfo = producerInfo;
            return this;
        }
        public GetTraceResponseBodyDataProducerInfo getProducerInfo() {
            return this.producerInfo;
        }

        public GetTraceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetTraceResponseBodyData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

}
