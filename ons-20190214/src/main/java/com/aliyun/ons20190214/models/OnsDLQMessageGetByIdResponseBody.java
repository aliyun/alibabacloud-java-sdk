// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsDLQMessageGetByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsDLQMessageGetByIdResponseBodyData data;

    public static OnsDLQMessageGetByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsDLQMessageGetByIdResponseBody self = new OnsDLQMessageGetByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsDLQMessageGetByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsDLQMessageGetByIdResponseBody setData(OnsDLQMessageGetByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsDLQMessageGetByIdResponseBodyData getData() {
        return this.data;
    }

    public static class OnsDLQMessageGetByIdResponseBodyDataPropertyListMessageProperty extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static OnsDLQMessageGetByIdResponseBodyDataPropertyListMessageProperty build(java.util.Map<String, ?> map) throws Exception {
            OnsDLQMessageGetByIdResponseBodyDataPropertyListMessageProperty self = new OnsDLQMessageGetByIdResponseBodyDataPropertyListMessageProperty();
            return TeaModel.build(map, self);
        }

        public OnsDLQMessageGetByIdResponseBodyDataPropertyListMessageProperty setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public OnsDLQMessageGetByIdResponseBodyDataPropertyListMessageProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class OnsDLQMessageGetByIdResponseBodyDataPropertyList extends TeaModel {
        @NameInMap("MessageProperty")
        public java.util.List<OnsDLQMessageGetByIdResponseBodyDataPropertyListMessageProperty> messageProperty;

        public static OnsDLQMessageGetByIdResponseBodyDataPropertyList build(java.util.Map<String, ?> map) throws Exception {
            OnsDLQMessageGetByIdResponseBodyDataPropertyList self = new OnsDLQMessageGetByIdResponseBodyDataPropertyList();
            return TeaModel.build(map, self);
        }

        public OnsDLQMessageGetByIdResponseBodyDataPropertyList setMessageProperty(java.util.List<OnsDLQMessageGetByIdResponseBodyDataPropertyListMessageProperty> messageProperty) {
            this.messageProperty = messageProperty;
            return this;
        }
        public java.util.List<OnsDLQMessageGetByIdResponseBodyDataPropertyListMessageProperty> getMessageProperty() {
            return this.messageProperty;
        }

    }

    public static class OnsDLQMessageGetByIdResponseBodyData extends TeaModel {
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
        public OnsDLQMessageGetByIdResponseBodyDataPropertyList propertyList;

        @NameInMap("BornTimestamp")
        public Long bornTimestamp;

        @NameInMap("BodyCRC")
        public Integer bodyCRC;

        @NameInMap("BornHost")
        public String bornHost;

        public static OnsDLQMessageGetByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsDLQMessageGetByIdResponseBodyData self = new OnsDLQMessageGetByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsDLQMessageGetByIdResponseBodyData setStoreSize(Integer storeSize) {
            this.storeSize = storeSize;
            return this;
        }
        public Integer getStoreSize() {
            return this.storeSize;
        }

        public OnsDLQMessageGetByIdResponseBodyData setReconsumeTimes(Integer reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public OnsDLQMessageGetByIdResponseBodyData setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public OnsDLQMessageGetByIdResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsDLQMessageGetByIdResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public OnsDLQMessageGetByIdResponseBodyData setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public OnsDLQMessageGetByIdResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public OnsDLQMessageGetByIdResponseBodyData setPropertyList(OnsDLQMessageGetByIdResponseBodyDataPropertyList propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public OnsDLQMessageGetByIdResponseBodyDataPropertyList getPropertyList() {
            return this.propertyList;
        }

        public OnsDLQMessageGetByIdResponseBodyData setBornTimestamp(Long bornTimestamp) {
            this.bornTimestamp = bornTimestamp;
            return this;
        }
        public Long getBornTimestamp() {
            return this.bornTimestamp;
        }

        public OnsDLQMessageGetByIdResponseBodyData setBodyCRC(Integer bodyCRC) {
            this.bodyCRC = bodyCRC;
            return this;
        }
        public Integer getBodyCRC() {
            return this.bodyCRC;
        }

        public OnsDLQMessageGetByIdResponseBodyData setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

    }

}
