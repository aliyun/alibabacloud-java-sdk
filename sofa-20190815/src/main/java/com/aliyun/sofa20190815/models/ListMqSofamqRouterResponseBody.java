// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqRouterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ListMqSofamqRouterResponseBodyData data;

    public static ListMqSofamqRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqRouterResponseBody self = new ListMqSofamqRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMqSofamqRouterResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMqSofamqRouterResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMqSofamqRouterResponseBody setData(ListMqSofamqRouterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMqSofamqRouterResponseBodyData getData() {
        return this.data;
    }

    public static class ListMqSofamqRouterResponseBodyDataContent extends TeaModel {
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

        public static ListMqSofamqRouterResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqRouterResponseBodyDataContent self = new ListMqSofamqRouterResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqRouterResponseBodyDataContent setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public ListMqSofamqRouterResponseBodyDataContent setConsumeFromType(Long consumeFromType) {
            this.consumeFromType = consumeFromType;
            return this;
        }
        public Long getConsumeFromType() {
            return this.consumeFromType;
        }

        public ListMqSofamqRouterResponseBodyDataContent setConsumeFromValue(Long consumeFromValue) {
            this.consumeFromValue = consumeFromValue;
            return this;
        }
        public Long getConsumeFromValue() {
            return this.consumeFromValue;
        }

        public ListMqSofamqRouterResponseBodyDataContent setConsumeToType(Long consumeToType) {
            this.consumeToType = consumeToType;
            return this;
        }
        public Long getConsumeToType() {
            return this.consumeToType;
        }

        public ListMqSofamqRouterResponseBodyDataContent setConsumeToValue(Long consumeToValue) {
            this.consumeToValue = consumeToValue;
            return this;
        }
        public Long getConsumeToValue() {
            return this.consumeToValue;
        }

        public ListMqSofamqRouterResponseBodyDataContent setDelayTime(String delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public String getDelayTime() {
            return this.delayTime;
        }

        public ListMqSofamqRouterResponseBodyDataContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMqSofamqRouterResponseBodyDataContent setDestinationCell(String destinationCell) {
            this.destinationCell = destinationCell;
            return this;
        }
        public String getDestinationCell() {
            return this.destinationCell;
        }

        public ListMqSofamqRouterResponseBodyDataContent setDestinationInstanceId(String destinationInstanceId) {
            this.destinationInstanceId = destinationInstanceId;
            return this;
        }
        public String getDestinationInstanceId() {
            return this.destinationInstanceId;
        }

        public ListMqSofamqRouterResponseBodyDataContent setDestinationTopic(String destinationTopic) {
            this.destinationTopic = destinationTopic;
            return this;
        }
        public String getDestinationTopic() {
            return this.destinationTopic;
        }

        public ListMqSofamqRouterResponseBodyDataContent setDisaster(Boolean disaster) {
            this.disaster = disaster;
            return this;
        }
        public Boolean getDisaster() {
            return this.disaster;
        }

        public ListMqSofamqRouterResponseBodyDataContent setDisasterRecoveryDatacenter(String disasterRecoveryDatacenter) {
            this.disasterRecoveryDatacenter = disasterRecoveryDatacenter;
            return this;
        }
        public String getDisasterRecoveryDatacenter() {
            return this.disasterRecoveryDatacenter;
        }

        public ListMqSofamqRouterResponseBodyDataContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMqSofamqRouterResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMqSofamqRouterResponseBodyDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMqSofamqRouterResponseBodyDataContent setSourceCell(String sourceCell) {
            this.sourceCell = sourceCell;
            return this;
        }
        public String getSourceCell() {
            return this.sourceCell;
        }

        public ListMqSofamqRouterResponseBodyDataContent setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public ListMqSofamqRouterResponseBodyDataContent setSourceTopic(String sourceTopic) {
            this.sourceTopic = sourceTopic;
            return this;
        }
        public String getSourceTopic() {
            return this.sourceTopic;
        }

        public ListMqSofamqRouterResponseBodyDataContent setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListMqSofamqRouterResponseBodyDataContent setTaskStatus(Long taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Long getTaskStatus() {
            return this.taskStatus;
        }

        public ListMqSofamqRouterResponseBodyDataContent setTaskType(Long taskType) {
            this.taskType = taskType;
            return this;
        }
        public Long getTaskType() {
            return this.taskType;
        }

    }

    public static class ListMqSofamqRouterResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Content")
        public java.util.List<ListMqSofamqRouterResponseBodyDataContent> content;

        public static ListMqSofamqRouterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqRouterResponseBodyData self = new ListMqSofamqRouterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqRouterResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListMqSofamqRouterResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListMqSofamqRouterResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListMqSofamqRouterResponseBodyData setContent(java.util.List<ListMqSofamqRouterResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListMqSofamqRouterResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
