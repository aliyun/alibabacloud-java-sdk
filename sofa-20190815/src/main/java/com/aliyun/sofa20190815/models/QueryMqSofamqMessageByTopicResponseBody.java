// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqMessageByTopicResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryMqSofamqMessageByTopicResponseBodyData data;

    public static QueryMqSofamqMessageByTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqMessageByTopicResponseBody self = new QueryMqSofamqMessageByTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqMessageByTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqSofamqMessageByTopicResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMqSofamqMessageByTopicResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMqSofamqMessageByTopicResponseBody setData(QueryMqSofamqMessageByTopicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMqSofamqMessageByTopicResponseBodyData getData() {
        return this.data;
    }

    public static class QueryMqSofamqMessageByTopicResponseBodyDataContentPropertyList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static QueryMqSofamqMessageByTopicResponseBodyDataContentPropertyList build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqMessageByTopicResponseBodyDataContentPropertyList self = new QueryMqSofamqMessageByTopicResponseBodyDataContentPropertyList();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqMessageByTopicResponseBodyDataContentPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMqSofamqMessageByTopicResponseBodyDataContentPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryMqSofamqMessageByTopicResponseBodyDataContent extends TeaModel {
        @NameInMap("Body")
        public String body;

        @NameInMap("BodyCrc")
        public Long bodyCrc;

        @NameInMap("BornHost")
        public String bornHost;

        @NameInMap("BornTimestamp")
        public Long bornTimestamp;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MsgId")
        public String msgId;

        @NameInMap("ReconsumeTimes")
        public Long reconsumeTimes;

        @NameInMap("StoreHost")
        public String storeHost;

        @NameInMap("StoreSize")
        public Long storeSize;

        @NameInMap("StoreTimestamp")
        public Long storeTimestamp;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("PropertyList")
        public java.util.List<QueryMqSofamqMessageByTopicResponseBodyDataContentPropertyList> propertyList;

        public static QueryMqSofamqMessageByTopicResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqMessageByTopicResponseBodyDataContent self = new QueryMqSofamqMessageByTopicResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqMessageByTopicResponseBodyDataContent setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public QueryMqSofamqMessageByTopicResponseBodyDataContent setBodyCrc(Long bodyCrc) {
            this.bodyCrc = bodyCrc;
            return this;
        }
        public Long getBodyCrc() {
            return this.bodyCrc;
        }

        public QueryMqSofamqMessageByTopicResponseBodyDataContent setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

        public QueryMqSofamqMessageByTopicResponseBodyDataContent setBornTimestamp(Long bornTimestamp) {
            this.bornTimestamp = bornTimestamp;
            return this;
        }
        public Long getBornTimestamp() {
            return this.bornTimestamp;
        }

        public QueryMqSofamqMessageByTopicResponseBodyDataContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMqSofamqMessageByTopicResponseBodyDataContent setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public QueryMqSofamqMessageByTopicResponseBodyDataContent setReconsumeTimes(Long reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Long getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public QueryMqSofamqMessageByTopicResponseBodyDataContent setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public QueryMqSofamqMessageByTopicResponseBodyDataContent setStoreSize(Long storeSize) {
            this.storeSize = storeSize;
            return this;
        }
        public Long getStoreSize() {
            return this.storeSize;
        }

        public QueryMqSofamqMessageByTopicResponseBodyDataContent setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public QueryMqSofamqMessageByTopicResponseBodyDataContent setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public QueryMqSofamqMessageByTopicResponseBodyDataContent setPropertyList(java.util.List<QueryMqSofamqMessageByTopicResponseBodyDataContentPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<QueryMqSofamqMessageByTopicResponseBodyDataContentPropertyList> getPropertyList() {
            return this.propertyList;
        }

    }

    public static class QueryMqSofamqMessageByTopicResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Content")
        public java.util.List<QueryMqSofamqMessageByTopicResponseBodyDataContent> content;

        public static QueryMqSofamqMessageByTopicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqMessageByTopicResponseBodyData self = new QueryMqSofamqMessageByTopicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqMessageByTopicResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public QueryMqSofamqMessageByTopicResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryMqSofamqMessageByTopicResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryMqSofamqMessageByTopicResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryMqSofamqMessageByTopicResponseBodyData setContent(java.util.List<QueryMqSofamqMessageByTopicResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<QueryMqSofamqMessageByTopicResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
