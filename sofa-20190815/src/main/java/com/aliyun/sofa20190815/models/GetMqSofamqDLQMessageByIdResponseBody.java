// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMqSofamqDLQMessageByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetMqSofamqDLQMessageByIdResponseBodyData data;

    public static GetMqSofamqDLQMessageByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMqSofamqDLQMessageByIdResponseBody self = new GetMqSofamqDLQMessageByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMqSofamqDLQMessageByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMqSofamqDLQMessageByIdResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMqSofamqDLQMessageByIdResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetMqSofamqDLQMessageByIdResponseBody setData(GetMqSofamqDLQMessageByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMqSofamqDLQMessageByIdResponseBodyData getData() {
        return this.data;
    }

    public static class GetMqSofamqDLQMessageByIdResponseBodyDataPropertyList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static GetMqSofamqDLQMessageByIdResponseBodyDataPropertyList build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqDLQMessageByIdResponseBodyDataPropertyList self = new GetMqSofamqDLQMessageByIdResponseBodyDataPropertyList();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqDLQMessageByIdResponseBodyDataPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMqSofamqDLQMessageByIdResponseBodyDataPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetMqSofamqDLQMessageByIdResponseBodyData extends TeaModel {
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
        public java.util.List<GetMqSofamqDLQMessageByIdResponseBodyDataPropertyList> propertyList;

        public static GetMqSofamqDLQMessageByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqDLQMessageByIdResponseBodyData self = new GetMqSofamqDLQMessageByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqDLQMessageByIdResponseBodyData setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public GetMqSofamqDLQMessageByIdResponseBodyData setBodyCrc(Long bodyCrc) {
            this.bodyCrc = bodyCrc;
            return this;
        }
        public Long getBodyCrc() {
            return this.bodyCrc;
        }

        public GetMqSofamqDLQMessageByIdResponseBodyData setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

        public GetMqSofamqDLQMessageByIdResponseBodyData setBornTimestamp(Long bornTimestamp) {
            this.bornTimestamp = bornTimestamp;
            return this;
        }
        public Long getBornTimestamp() {
            return this.bornTimestamp;
        }

        public GetMqSofamqDLQMessageByIdResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMqSofamqDLQMessageByIdResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public GetMqSofamqDLQMessageByIdResponseBodyData setReconsumeTimes(Long reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Long getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public GetMqSofamqDLQMessageByIdResponseBodyData setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public GetMqSofamqDLQMessageByIdResponseBodyData setStoreSize(Long storeSize) {
            this.storeSize = storeSize;
            return this;
        }
        public Long getStoreSize() {
            return this.storeSize;
        }

        public GetMqSofamqDLQMessageByIdResponseBodyData setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public GetMqSofamqDLQMessageByIdResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetMqSofamqDLQMessageByIdResponseBodyData setPropertyList(java.util.List<GetMqSofamqDLQMessageByIdResponseBodyDataPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<GetMqSofamqDLQMessageByIdResponseBodyDataPropertyList> getPropertyList() {
            return this.propertyList;
        }

    }

}
