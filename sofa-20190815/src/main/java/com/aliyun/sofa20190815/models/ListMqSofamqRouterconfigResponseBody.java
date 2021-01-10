// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqRouterconfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ListMqSofamqRouterconfigResponseBodyData data;

    public static ListMqSofamqRouterconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqRouterconfigResponseBody self = new ListMqSofamqRouterconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqRouterconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMqSofamqRouterconfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMqSofamqRouterconfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMqSofamqRouterconfigResponseBody setData(ListMqSofamqRouterconfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMqSofamqRouterconfigResponseBodyData getData() {
        return this.data;
    }

    public static class ListMqSofamqRouterconfigResponseBodyDataContent extends TeaModel {
        @NameInMap("ConsumerId")
        public String consumerId;

        @NameInMap("ConsumeFromType")
        public String consumeFromType;

        @NameInMap("ConsumeFromValue")
        public String consumeFromValue;

        @NameInMap("ConsumeToType")
        public String consumeToType;

        @NameInMap("ConsumeToValue")
        public String consumeToValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationCell")
        public String destinationCell;

        @NameInMap("DestinationNamespaceId")
        public String destinationNamespaceId;

        @NameInMap("DestinationTopic")
        public String destinationTopic;

        @NameInMap("Disaster")
        public String disaster;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("SourceCell")
        public String sourceCell;

        @NameInMap("SourceNamespaceId")
        public String sourceNamespaceId;

        @NameInMap("SourceTopic")
        public String sourceTopic;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("TaskStatus")
        public String taskStatus;

        public static ListMqSofamqRouterconfigResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqRouterconfigResponseBodyDataContent self = new ListMqSofamqRouterconfigResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setConsumeFromType(String consumeFromType) {
            this.consumeFromType = consumeFromType;
            return this;
        }
        public String getConsumeFromType() {
            return this.consumeFromType;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setConsumeFromValue(String consumeFromValue) {
            this.consumeFromValue = consumeFromValue;
            return this;
        }
        public String getConsumeFromValue() {
            return this.consumeFromValue;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setConsumeToType(String consumeToType) {
            this.consumeToType = consumeToType;
            return this;
        }
        public String getConsumeToType() {
            return this.consumeToType;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setConsumeToValue(String consumeToValue) {
            this.consumeToValue = consumeToValue;
            return this;
        }
        public String getConsumeToValue() {
            return this.consumeToValue;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setDestinationCell(String destinationCell) {
            this.destinationCell = destinationCell;
            return this;
        }
        public String getDestinationCell() {
            return this.destinationCell;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setDestinationNamespaceId(String destinationNamespaceId) {
            this.destinationNamespaceId = destinationNamespaceId;
            return this;
        }
        public String getDestinationNamespaceId() {
            return this.destinationNamespaceId;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setDestinationTopic(String destinationTopic) {
            this.destinationTopic = destinationTopic;
            return this;
        }
        public String getDestinationTopic() {
            return this.destinationTopic;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setDisaster(String disaster) {
            this.disaster = disaster;
            return this;
        }
        public String getDisaster() {
            return this.disaster;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setSourceCell(String sourceCell) {
            this.sourceCell = sourceCell;
            return this;
        }
        public String getSourceCell() {
            return this.sourceCell;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setSourceNamespaceId(String sourceNamespaceId) {
            this.sourceNamespaceId = sourceNamespaceId;
            return this;
        }
        public String getSourceNamespaceId() {
            return this.sourceNamespaceId;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setSourceTopic(String sourceTopic) {
            this.sourceTopic = sourceTopic;
            return this;
        }
        public String getSourceTopic() {
            return this.sourceTopic;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListMqSofamqRouterconfigResponseBodyDataContent setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

    public static class ListMqSofamqRouterconfigResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Content")
        public java.util.List<ListMqSofamqRouterconfigResponseBodyDataContent> content;

        public static ListMqSofamqRouterconfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqRouterconfigResponseBodyData self = new ListMqSofamqRouterconfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqRouterconfigResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListMqSofamqRouterconfigResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListMqSofamqRouterconfigResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListMqSofamqRouterconfigResponseBodyData setContent(java.util.List<ListMqSofamqRouterconfigResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListMqSofamqRouterconfigResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
