// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMqSofamqMessageByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetMqSofamqMessageByIdResponseBodyData data;

    public static GetMqSofamqMessageByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMqSofamqMessageByIdResponseBody self = new GetMqSofamqMessageByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMqSofamqMessageByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMqSofamqMessageByIdResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMqSofamqMessageByIdResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetMqSofamqMessageByIdResponseBody setData(GetMqSofamqMessageByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMqSofamqMessageByIdResponseBodyData getData() {
        return this.data;
    }

    public static class GetMqSofamqMessageByIdResponseBodyDataPropertyList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static GetMqSofamqMessageByIdResponseBodyDataPropertyList build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqMessageByIdResponseBodyDataPropertyList self = new GetMqSofamqMessageByIdResponseBodyDataPropertyList();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqMessageByIdResponseBodyDataPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMqSofamqMessageByIdResponseBodyDataPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetMqSofamqMessageByIdResponseBodyData extends TeaModel {
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
        public java.util.List<GetMqSofamqMessageByIdResponseBodyDataPropertyList> propertyList;

        public static GetMqSofamqMessageByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqMessageByIdResponseBodyData self = new GetMqSofamqMessageByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqMessageByIdResponseBodyData setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public GetMqSofamqMessageByIdResponseBodyData setBodyCrc(Long bodyCrc) {
            this.bodyCrc = bodyCrc;
            return this;
        }
        public Long getBodyCrc() {
            return this.bodyCrc;
        }

        public GetMqSofamqMessageByIdResponseBodyData setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

        public GetMqSofamqMessageByIdResponseBodyData setBornTimestamp(Long bornTimestamp) {
            this.bornTimestamp = bornTimestamp;
            return this;
        }
        public Long getBornTimestamp() {
            return this.bornTimestamp;
        }

        public GetMqSofamqMessageByIdResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMqSofamqMessageByIdResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public GetMqSofamqMessageByIdResponseBodyData setReconsumeTimes(Long reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Long getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public GetMqSofamqMessageByIdResponseBodyData setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public GetMqSofamqMessageByIdResponseBodyData setStoreSize(Long storeSize) {
            this.storeSize = storeSize;
            return this;
        }
        public Long getStoreSize() {
            return this.storeSize;
        }

        public GetMqSofamqMessageByIdResponseBodyData setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public GetMqSofamqMessageByIdResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetMqSofamqMessageByIdResponseBodyData setPropertyList(java.util.List<GetMqSofamqMessageByIdResponseBodyDataPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<GetMqSofamqMessageByIdResponseBodyDataPropertyList> getPropertyList() {
            return this.propertyList;
        }

    }

}
