// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqDLQMessageByGroupIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryMqSofamqDLQMessageByGroupIdResponseBodyData data;

    public static QueryMqSofamqDLQMessageByGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqDLQMessageByGroupIdResponseBody self = new QueryMqSofamqDLQMessageByGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqDLQMessageByGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqSofamqDLQMessageByGroupIdResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMqSofamqDLQMessageByGroupIdResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMqSofamqDLQMessageByGroupIdResponseBody setData(QueryMqSofamqDLQMessageByGroupIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMqSofamqDLQMessageByGroupIdResponseBodyData getData() {
        return this.data;
    }

    public static class QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContentPropertyList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContentPropertyList build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContentPropertyList self = new QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContentPropertyList();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContentPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContentPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent extends TeaModel {
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
        public java.util.List<QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContentPropertyList> propertyList;

        public static QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent self = new QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent setBodyCrc(Long bodyCrc) {
            this.bodyCrc = bodyCrc;
            return this;
        }
        public Long getBodyCrc() {
            return this.bodyCrc;
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent setBornTimestamp(Long bornTimestamp) {
            this.bornTimestamp = bornTimestamp;
            return this;
        }
        public Long getBornTimestamp() {
            return this.bornTimestamp;
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent setReconsumeTimes(Long reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Long getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent setStoreSize(Long storeSize) {
            this.storeSize = storeSize;
            return this;
        }
        public Long getStoreSize() {
            return this.storeSize;
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent setPropertyList(java.util.List<QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContentPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContentPropertyList> getPropertyList() {
            return this.propertyList;
        }

    }

    public static class QueryMqSofamqDLQMessageByGroupIdResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Content")
        public java.util.List<QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent> content;

        public static QueryMqSofamqDLQMessageByGroupIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqDLQMessageByGroupIdResponseBodyData self = new QueryMqSofamqDLQMessageByGroupIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryMqSofamqDLQMessageByGroupIdResponseBodyData setContent(java.util.List<QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<QueryMqSofamqDLQMessageByGroupIdResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
