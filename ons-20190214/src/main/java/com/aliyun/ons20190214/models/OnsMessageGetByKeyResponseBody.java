// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageGetByKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<OnsMessageGetByKeyResponseBodyData> data;

    public static OnsMessageGetByKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageGetByKeyResponseBody self = new OnsMessageGetByKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMessageGetByKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsMessageGetByKeyResponseBody setData(java.util.List<OnsMessageGetByKeyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<OnsMessageGetByKeyResponseBodyData> getData() {
        return this.data;
    }

    public static class OnsMessageGetByKeyResponseBodyDataPropertyList extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static OnsMessageGetByKeyResponseBodyDataPropertyList build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageGetByKeyResponseBodyDataPropertyList self = new OnsMessageGetByKeyResponseBodyDataPropertyList();
            return TeaModel.build(map, self);
        }

        public OnsMessageGetByKeyResponseBodyDataPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public OnsMessageGetByKeyResponseBodyDataPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class OnsMessageGetByKeyResponseBodyData extends TeaModel {
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
        public java.util.List<OnsMessageGetByKeyResponseBodyDataPropertyList> propertyList;

        @NameInMap("BornTimestamp")
        public Long bornTimestamp;

        @NameInMap("BodyCRC")
        public Integer bodyCRC;

        @NameInMap("BornHost")
        public String bornHost;

        public static OnsMessageGetByKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageGetByKeyResponseBodyData self = new OnsMessageGetByKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsMessageGetByKeyResponseBodyData setStoreSize(Integer storeSize) {
            this.storeSize = storeSize;
            return this;
        }
        public Integer getStoreSize() {
            return this.storeSize;
        }

        public OnsMessageGetByKeyResponseBodyData setReconsumeTimes(Integer reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public OnsMessageGetByKeyResponseBodyData setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public OnsMessageGetByKeyResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsMessageGetByKeyResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public OnsMessageGetByKeyResponseBodyData setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public OnsMessageGetByKeyResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public OnsMessageGetByKeyResponseBodyData setPropertyList(java.util.List<OnsMessageGetByKeyResponseBodyDataPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<OnsMessageGetByKeyResponseBodyDataPropertyList> getPropertyList() {
            return this.propertyList;
        }

        public OnsMessageGetByKeyResponseBodyData setBornTimestamp(Long bornTimestamp) {
            this.bornTimestamp = bornTimestamp;
            return this;
        }
        public Long getBornTimestamp() {
            return this.bornTimestamp;
        }

        public OnsMessageGetByKeyResponseBodyData setBodyCRC(Integer bodyCRC) {
            this.bodyCRC = bodyCRC;
            return this;
        }
        public Integer getBodyCRC() {
            return this.bodyCRC;
        }

        public OnsMessageGetByKeyResponseBodyData setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

    }

}
