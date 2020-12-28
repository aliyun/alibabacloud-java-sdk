// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageGetByMsgIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsMessageGetByMsgIdResponseBodyData data;

    public static OnsMessageGetByMsgIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageGetByMsgIdResponseBody self = new OnsMessageGetByMsgIdResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMessageGetByMsgIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsMessageGetByMsgIdResponseBody setData(OnsMessageGetByMsgIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsMessageGetByMsgIdResponseBodyData getData() {
        return this.data;
    }

    public static class OnsMessageGetByMsgIdResponseBodyDataPropertyList extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static OnsMessageGetByMsgIdResponseBodyDataPropertyList build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageGetByMsgIdResponseBodyDataPropertyList self = new OnsMessageGetByMsgIdResponseBodyDataPropertyList();
            return TeaModel.build(map, self);
        }

        public OnsMessageGetByMsgIdResponseBodyDataPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public OnsMessageGetByMsgIdResponseBodyDataPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class OnsMessageGetByMsgIdResponseBodyData extends TeaModel {
        @NameInMap("StoreSize")
        public Integer storeSize;

        @NameInMap("ReconsumeTimes")
        public Integer reconsumeTimes;

        @NameInMap("StoreTimestamp")
        public Long storeTimestamp;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MsgId")
        public String msgId;

        @NameInMap("StoreHost")
        public String storeHost;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("PropertyList")
        public java.util.List<OnsMessageGetByMsgIdResponseBodyDataPropertyList> propertyList;

        @NameInMap("BornTimestamp")
        public Long bornTimestamp;

        @NameInMap("BodyCRC")
        public Integer bodyCRC;

        @NameInMap("BornHost")
        public String bornHost;

        public static OnsMessageGetByMsgIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageGetByMsgIdResponseBodyData self = new OnsMessageGetByMsgIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsMessageGetByMsgIdResponseBodyData setStoreSize(Integer storeSize) {
            this.storeSize = storeSize;
            return this;
        }
        public Integer getStoreSize() {
            return this.storeSize;
        }

        public OnsMessageGetByMsgIdResponseBodyData setReconsumeTimes(Integer reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public OnsMessageGetByMsgIdResponseBodyData setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public OnsMessageGetByMsgIdResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsMessageGetByMsgIdResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public OnsMessageGetByMsgIdResponseBodyData setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public OnsMessageGetByMsgIdResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public OnsMessageGetByMsgIdResponseBodyData setPropertyList(java.util.List<OnsMessageGetByMsgIdResponseBodyDataPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<OnsMessageGetByMsgIdResponseBodyDataPropertyList> getPropertyList() {
            return this.propertyList;
        }

        public OnsMessageGetByMsgIdResponseBodyData setBornTimestamp(Long bornTimestamp) {
            this.bornTimestamp = bornTimestamp;
            return this;
        }
        public Long getBornTimestamp() {
            return this.bornTimestamp;
        }

        public OnsMessageGetByMsgIdResponseBodyData setBodyCRC(Integer bodyCRC) {
            this.bodyCRC = bodyCRC;
            return this;
        }
        public Integer getBodyCRC() {
            return this.bodyCRC;
        }

        public OnsMessageGetByMsgIdResponseBodyData setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

    }

}
