// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqTopicResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ListMqSofamqTopicResponseBodyData data;

    public static ListMqSofamqTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqTopicResponseBody self = new ListMqSofamqTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMqSofamqTopicResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMqSofamqTopicResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMqSofamqTopicResponseBody setData(ListMqSofamqTopicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMqSofamqTopicResponseBodyData getData() {
        return this.data;
    }

    public static class ListMqSofamqTopicResponseBodyDataContent extends TeaModel {
        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MessageType")
        public Long messageType;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Perm")
        public Long perm;

        @NameInMap("ReadQueueNum")
        public Long readQueueNum;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("WriteQueueNum")
        public Long writeQueueNum;

        public static ListMqSofamqTopicResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqTopicResponseBodyDataContent self = new ListMqSofamqTopicResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqTopicResponseBodyDataContent setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListMqSofamqTopicResponseBodyDataContent setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMqSofamqTopicResponseBodyDataContent setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListMqSofamqTopicResponseBodyDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMqSofamqTopicResponseBodyDataContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMqSofamqTopicResponseBodyDataContent setMessageType(Long messageType) {
            this.messageType = messageType;
            return this;
        }
        public Long getMessageType() {
            return this.messageType;
        }

        public ListMqSofamqTopicResponseBodyDataContent setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListMqSofamqTopicResponseBodyDataContent setPerm(Long perm) {
            this.perm = perm;
            return this;
        }
        public Long getPerm() {
            return this.perm;
        }

        public ListMqSofamqTopicResponseBodyDataContent setReadQueueNum(Long readQueueNum) {
            this.readQueueNum = readQueueNum;
            return this;
        }
        public Long getReadQueueNum() {
            return this.readQueueNum;
        }

        public ListMqSofamqTopicResponseBodyDataContent setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListMqSofamqTopicResponseBodyDataContent setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListMqSofamqTopicResponseBodyDataContent setWriteQueueNum(Long writeQueueNum) {
            this.writeQueueNum = writeQueueNum;
            return this;
        }
        public Long getWriteQueueNum() {
            return this.writeQueueNum;
        }

    }

    public static class ListMqSofamqTopicResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Content")
        public java.util.List<ListMqSofamqTopicResponseBodyDataContent> content;

        public static ListMqSofamqTopicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqTopicResponseBodyData self = new ListMqSofamqTopicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqTopicResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListMqSofamqTopicResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListMqSofamqTopicResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListMqSofamqTopicResponseBodyData setContent(java.util.List<ListMqSofamqTopicResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListMqSofamqTopicResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
