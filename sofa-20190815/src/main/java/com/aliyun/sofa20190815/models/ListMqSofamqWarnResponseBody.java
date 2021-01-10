// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqWarnResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ListMqSofamqWarnResponseBodyData data;

    public static ListMqSofamqWarnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqWarnResponseBody self = new ListMqSofamqWarnResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqWarnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMqSofamqWarnResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMqSofamqWarnResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMqSofamqWarnResponseBody setData(ListMqSofamqWarnResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMqSofamqWarnResponseBodyData getData() {
        return this.data;
    }

    public static class ListMqSofamqWarnResponseBodyDataContent extends TeaModel {
        @NameInMap("AlertTime")
        public String alertTime;

        @NameInMap("Attribute")
        public String attribute;

        @NameInMap("BlockTime")
        public Long blockTime;

        @NameInMap("Contacts")
        public String contacts;

        @NameInMap("DelayTime")
        public Long delayTime;

        @NameInMap("Frequency")
        public Long frequency;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Threshold")
        public Long threshold;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("WarnLevel")
        public Long warnLevel;

        @NameInMap("WarnStatus")
        public Long warnStatus;

        @NameInMap("WarnType")
        public Long warnType;

        public static ListMqSofamqWarnResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqWarnResponseBodyDataContent self = new ListMqSofamqWarnResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqWarnResponseBodyDataContent setAlertTime(String alertTime) {
            this.alertTime = alertTime;
            return this;
        }
        public String getAlertTime() {
            return this.alertTime;
        }

        public ListMqSofamqWarnResponseBodyDataContent setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public ListMqSofamqWarnResponseBodyDataContent setBlockTime(Long blockTime) {
            this.blockTime = blockTime;
            return this;
        }
        public Long getBlockTime() {
            return this.blockTime;
        }

        public ListMqSofamqWarnResponseBodyDataContent setContacts(String contacts) {
            this.contacts = contacts;
            return this;
        }
        public String getContacts() {
            return this.contacts;
        }

        public ListMqSofamqWarnResponseBodyDataContent setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public ListMqSofamqWarnResponseBodyDataContent setFrequency(Long frequency) {
            this.frequency = frequency;
            return this;
        }
        public Long getFrequency() {
            return this.frequency;
        }

        public ListMqSofamqWarnResponseBodyDataContent setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMqSofamqWarnResponseBodyDataContent setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListMqSofamqWarnResponseBodyDataContent setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListMqSofamqWarnResponseBodyDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMqSofamqWarnResponseBodyDataContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMqSofamqWarnResponseBodyDataContent setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListMqSofamqWarnResponseBodyDataContent setThreshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }
        public Long getThreshold() {
            return this.threshold;
        }

        public ListMqSofamqWarnResponseBodyDataContent setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListMqSofamqWarnResponseBodyDataContent setWarnLevel(Long warnLevel) {
            this.warnLevel = warnLevel;
            return this;
        }
        public Long getWarnLevel() {
            return this.warnLevel;
        }

        public ListMqSofamqWarnResponseBodyDataContent setWarnStatus(Long warnStatus) {
            this.warnStatus = warnStatus;
            return this;
        }
        public Long getWarnStatus() {
            return this.warnStatus;
        }

        public ListMqSofamqWarnResponseBodyDataContent setWarnType(Long warnType) {
            this.warnType = warnType;
            return this;
        }
        public Long getWarnType() {
            return this.warnType;
        }

    }

    public static class ListMqSofamqWarnResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Content")
        public java.util.List<ListMqSofamqWarnResponseBodyDataContent> content;

        public static ListMqSofamqWarnResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqWarnResponseBodyData self = new ListMqSofamqWarnResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqWarnResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListMqSofamqWarnResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListMqSofamqWarnResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListMqSofamqWarnResponseBodyData setContent(java.util.List<ListMqSofamqWarnResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListMqSofamqWarnResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
