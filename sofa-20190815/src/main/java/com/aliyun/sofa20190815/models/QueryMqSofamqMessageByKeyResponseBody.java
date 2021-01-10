// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqMessageByKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryMqSofamqMessageByKeyResponseBodyData> data;

    public static QueryMqSofamqMessageByKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqMessageByKeyResponseBody self = new QueryMqSofamqMessageByKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqMessageByKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqSofamqMessageByKeyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMqSofamqMessageByKeyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMqSofamqMessageByKeyResponseBody setData(java.util.List<QueryMqSofamqMessageByKeyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryMqSofamqMessageByKeyResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryMqSofamqMessageByKeyResponseBodyDataPropertyList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static QueryMqSofamqMessageByKeyResponseBodyDataPropertyList build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqMessageByKeyResponseBodyDataPropertyList self = new QueryMqSofamqMessageByKeyResponseBodyDataPropertyList();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqMessageByKeyResponseBodyDataPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMqSofamqMessageByKeyResponseBodyDataPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryMqSofamqMessageByKeyResponseBodyData extends TeaModel {
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
        public java.util.List<QueryMqSofamqMessageByKeyResponseBodyDataPropertyList> propertyList;

        public static QueryMqSofamqMessageByKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqMessageByKeyResponseBodyData self = new QueryMqSofamqMessageByKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqMessageByKeyResponseBodyData setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public QueryMqSofamqMessageByKeyResponseBodyData setBodyCrc(Long bodyCrc) {
            this.bodyCrc = bodyCrc;
            return this;
        }
        public Long getBodyCrc() {
            return this.bodyCrc;
        }

        public QueryMqSofamqMessageByKeyResponseBodyData setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

        public QueryMqSofamqMessageByKeyResponseBodyData setBornTimestamp(Long bornTimestamp) {
            this.bornTimestamp = bornTimestamp;
            return this;
        }
        public Long getBornTimestamp() {
            return this.bornTimestamp;
        }

        public QueryMqSofamqMessageByKeyResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMqSofamqMessageByKeyResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public QueryMqSofamqMessageByKeyResponseBodyData setReconsumeTimes(Long reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Long getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public QueryMqSofamqMessageByKeyResponseBodyData setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public QueryMqSofamqMessageByKeyResponseBodyData setStoreSize(Long storeSize) {
            this.storeSize = storeSize;
            return this;
        }
        public Long getStoreSize() {
            return this.storeSize;
        }

        public QueryMqSofamqMessageByKeyResponseBodyData setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public QueryMqSofamqMessageByKeyResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public QueryMqSofamqMessageByKeyResponseBodyData setPropertyList(java.util.List<QueryMqSofamqMessageByKeyResponseBodyDataPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<QueryMqSofamqMessageByKeyResponseBodyDataPropertyList> getPropertyList() {
            return this.propertyList;
        }

    }

}
