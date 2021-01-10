// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqRouterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryMqSofamqRouterResponseBodyData> data;

    public static QueryMqSofamqRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqRouterResponseBody self = new QueryMqSofamqRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqSofamqRouterResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMqSofamqRouterResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMqSofamqRouterResponseBody setData(java.util.List<QueryMqSofamqRouterResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryMqSofamqRouterResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryMqSofamqRouterResponseBodyData extends TeaModel {
        @NameInMap("ConsumerId")
        public String consumerId;

        @NameInMap("ConsumeFromType")
        public Long consumeFromType;

        @NameInMap("ConsumeFromValue")
        public Long consumeFromValue;

        @NameInMap("ConsumeToType")
        public Long consumeToType;

        @NameInMap("ConsumeToValue")
        public Long consumeToValue;

        @NameInMap("DelayTime")
        public String delayTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationCell")
        public String destinationCell;

        @NameInMap("DestinationInstanceId")
        public String destinationInstanceId;

        @NameInMap("DestinationTopic")
        public String destinationTopic;

        @NameInMap("Disaster")
        public Boolean disaster;

        @NameInMap("DisasterRecoveryDatacenter")
        public String disasterRecoveryDatacenter;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("SourceCell")
        public String sourceCell;

        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        @NameInMap("SourceTopic")
        public String sourceTopic;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("TaskStatus")
        public Long taskStatus;

        @NameInMap("TaskType")
        public Long taskType;

        public static QueryMqSofamqRouterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqRouterResponseBodyData self = new QueryMqSofamqRouterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqRouterResponseBodyData setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public QueryMqSofamqRouterResponseBodyData setConsumeFromType(Long consumeFromType) {
            this.consumeFromType = consumeFromType;
            return this;
        }
        public Long getConsumeFromType() {
            return this.consumeFromType;
        }

        public QueryMqSofamqRouterResponseBodyData setConsumeFromValue(Long consumeFromValue) {
            this.consumeFromValue = consumeFromValue;
            return this;
        }
        public Long getConsumeFromValue() {
            return this.consumeFromValue;
        }

        public QueryMqSofamqRouterResponseBodyData setConsumeToType(Long consumeToType) {
            this.consumeToType = consumeToType;
            return this;
        }
        public Long getConsumeToType() {
            return this.consumeToType;
        }

        public QueryMqSofamqRouterResponseBodyData setConsumeToValue(Long consumeToValue) {
            this.consumeToValue = consumeToValue;
            return this;
        }
        public Long getConsumeToValue() {
            return this.consumeToValue;
        }

        public QueryMqSofamqRouterResponseBodyData setDelayTime(String delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public String getDelayTime() {
            return this.delayTime;
        }

        public QueryMqSofamqRouterResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryMqSofamqRouterResponseBodyData setDestinationCell(String destinationCell) {
            this.destinationCell = destinationCell;
            return this;
        }
        public String getDestinationCell() {
            return this.destinationCell;
        }

        public QueryMqSofamqRouterResponseBodyData setDestinationInstanceId(String destinationInstanceId) {
            this.destinationInstanceId = destinationInstanceId;
            return this;
        }
        public String getDestinationInstanceId() {
            return this.destinationInstanceId;
        }

        public QueryMqSofamqRouterResponseBodyData setDestinationTopic(String destinationTopic) {
            this.destinationTopic = destinationTopic;
            return this;
        }
        public String getDestinationTopic() {
            return this.destinationTopic;
        }

        public QueryMqSofamqRouterResponseBodyData setDisaster(Boolean disaster) {
            this.disaster = disaster;
            return this;
        }
        public Boolean getDisaster() {
            return this.disaster;
        }

        public QueryMqSofamqRouterResponseBodyData setDisasterRecoveryDatacenter(String disasterRecoveryDatacenter) {
            this.disasterRecoveryDatacenter = disasterRecoveryDatacenter;
            return this;
        }
        public String getDisasterRecoveryDatacenter() {
            return this.disasterRecoveryDatacenter;
        }

        public QueryMqSofamqRouterResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryMqSofamqRouterResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryMqSofamqRouterResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMqSofamqRouterResponseBodyData setSourceCell(String sourceCell) {
            this.sourceCell = sourceCell;
            return this;
        }
        public String getSourceCell() {
            return this.sourceCell;
        }

        public QueryMqSofamqRouterResponseBodyData setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public QueryMqSofamqRouterResponseBodyData setSourceTopic(String sourceTopic) {
            this.sourceTopic = sourceTopic;
            return this;
        }
        public String getSourceTopic() {
            return this.sourceTopic;
        }

        public QueryMqSofamqRouterResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public QueryMqSofamqRouterResponseBodyData setTaskStatus(Long taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Long getTaskStatus() {
            return this.taskStatus;
        }

        public QueryMqSofamqRouterResponseBodyData setTaskType(Long taskType) {
            this.taskType = taskType;
            return this;
        }
        public Long getTaskType() {
            return this.taskType;
        }

    }

}
