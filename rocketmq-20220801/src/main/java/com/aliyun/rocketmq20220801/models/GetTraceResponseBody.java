// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetTraceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidConsumerGroupId</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetTraceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>The instance cannot be found.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7779A8FC-1BCD-5A1D-A603-C4A9BD8ADC49</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("operateTime")
        public String operateTime;

        /**
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
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("delayStatus")
        public String delayStatus;

        @NameInMap("operations")
        public java.util.List<GetTraceResponseBodyDataBrokerInfoOperations> operations;

        /**
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("presetDelayTime")
        public String presetDelayTime;

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

    }

    public static class GetTraceResponseBodyDataConsumerInfosDeadLetterInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7F000001001F7A4F0F29463F0376047D</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("toDlqTime")
        public String toDlqTime;

        /**
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("deadMessage")
        public Boolean deadMessage;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("invisibleTime")
        public Long invisibleTime;

        /**
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("operateTime")
        public String operateTime;

        /**
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
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("clientHost")
        public String clientHost;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("consumeStatus")
        public String consumeStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("fifoEnable")
        public Boolean fifoEnable;

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
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("consumeStatus")
        public String consumeStatus;

        /**
         * <strong>example:</strong>
         * <p>GID_inspector_group</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        @NameInMap("deadLetterInfo")
        public GetTraceResponseBodyDataConsumerInfosDeadLetterInfo deadLetterInfo;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("deadMessage")
        public Boolean deadMessage;

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
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("body")
        public String body;

        /**
         * <strong>example:</strong>
         * <p>x.x.x.x</p>
         */
        @NameInMap("bornHost")
        public String bornHost;

        /**
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("bornTime")
        public String bornTime;

        /**
         * <strong>example:</strong>
         * <p>rmq-cn-u0t2ygjq505</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("messageGroup")
        public String messageGroup;

        /**
         * <strong>example:</strong>
         * <p>0A79275A00207A4F0F2916C92F9A0B94</p>
         */
        @NameInMap("messageId")
        public String messageId;

        @NameInMap("messageKeys")
        public java.util.List<String> messageKeys;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("messageTag")
        public String messageTag;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("messageType")
        public String messageType;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("setted")
        public Boolean setted;

        /**
         * <strong>example:</strong>
         * <p>x.x.x.x</p>
         */
        @NameInMap("storeHost")
        public String storeHost;

        /**
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("storeTime")
        public String storeTime;

        /**
         * <strong>example:</strong>
         * <p>Topic_normal_inspector</p>
         */
        @NameInMap("topicName")
        public String topicName;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("transactionId")
        public String transactionId;

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

        public GetTraceResponseBodyDataMessageInfo setSetted(Boolean setted) {
            this.setted = setted;
            return this;
        }
        public Boolean getSetted() {
            return this.setted;
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
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("arriveTime")
        public String arriveTime;

        /**
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("clientHost")
        public String clientHost;

        /**
         * <strong>example:</strong>
         * <p>0A79275A00207A4F0F2916C92F9A0B94</p>
         */
        @NameInMap("dlqOriginMessageId")
        public String dlqOriginMessageId;

        /**
         * <strong>example:</strong>
         * <p>test_topic</p>
         */
        @NameInMap("dlqOriginTopic")
        public String dlqOriginTopic;

        /**
         * <strong>example:</strong>
         * <p>CONSOLE</p>
         */
        @NameInMap("messageSource")
        public String messageSource;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("produceDuration")
        public Long produceDuration;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("produceStatus")
        public String produceStatus;

        /**
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("produceTime")
        public String produceTime;

        /**
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

        public GetTraceResponseBodyDataProducerInfoRecords setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class GetTraceResponseBodyDataProducerInfo extends TeaModel {
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
        @NameInMap("brokerInfo")
        public GetTraceResponseBodyDataBrokerInfo brokerInfo;

        @NameInMap("consumerInfos")
        public java.util.List<GetTraceResponseBodyDataConsumerInfos> consumerInfos;

        /**
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("messageInfo")
        public GetTraceResponseBodyDataMessageInfo messageInfo;

        @NameInMap("producerInfo")
        public GetTraceResponseBodyDataProducerInfo producerInfo;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
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
