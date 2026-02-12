// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageGetByKeyResponseBody extends TeaModel {
    @NameInMap("Data")
    public OnsMessageGetByKeyResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>A07E3902-B92E-44A6-B6C5-6AA111111****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsMessageGetByKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageGetByKeyResponseBody self = new OnsMessageGetByKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMessageGetByKeyResponseBody setData(OnsMessageGetByKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsMessageGetByKeyResponseBodyData getData() {
        return this.data;
    }

    public OnsMessageGetByKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyListMessageProperty extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyListMessageProperty build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyListMessageProperty self = new OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyListMessageProperty();
            return TeaModel.build(map, self);
        }

        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyListMessageProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyListMessageProperty setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyList extends TeaModel {
        @NameInMap("MessageProperty")
        public java.util.List<OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyListMessageProperty> messageProperty;

        public static OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyList build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyList self = new OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyList();
            return TeaModel.build(map, self);
        }

        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyList setMessageProperty(java.util.List<OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyListMessageProperty> messageProperty) {
            this.messageProperty = messageProperty;
            return this;
        }
        public java.util.List<OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyListMessageProperty> getMessageProperty() {
            return this.messageProperty;
        }

    }

    public static class OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo extends TeaModel {
        @NameInMap("BodyCRC")
        public Integer bodyCRC;

        @NameInMap("BornHost")
        public String bornHost;

        @NameInMap("BornTimestamp")
        public Long bornTimestamp;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MsgId")
        public String msgId;

        @NameInMap("PropertyList")
        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyList propertyList;

        @NameInMap("ReconsumeTimes")
        public Integer reconsumeTimes;

        @NameInMap("StoreHost")
        public String storeHost;

        @NameInMap("StoreSize")
        public Integer storeSize;

        @NameInMap("StoreTimestamp")
        public Long storeTimestamp;

        @NameInMap("Topic")
        public String topic;

        public static OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo self = new OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo();
            return TeaModel.build(map, self);
        }

        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo setBodyCRC(Integer bodyCRC) {
            this.bodyCRC = bodyCRC;
            return this;
        }
        public Integer getBodyCRC() {
            return this.bodyCRC;
        }

        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo setBornTimestamp(Long bornTimestamp) {
            this.bornTimestamp = bornTimestamp;
            return this;
        }
        public Long getBornTimestamp() {
            return this.bornTimestamp;
        }

        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo setPropertyList(OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyList propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyList getPropertyList() {
            return this.propertyList;
        }

        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo setReconsumeTimes(Integer reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo setStoreSize(Integer storeSize) {
            this.storeSize = storeSize;
            return this;
        }
        public Integer getStoreSize() {
            return this.storeSize;
        }

        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class OnsMessageGetByKeyResponseBodyData extends TeaModel {
        @NameInMap("OnsRestMessageDo")
        public java.util.List<OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo> onsRestMessageDo;

        public static OnsMessageGetByKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageGetByKeyResponseBodyData self = new OnsMessageGetByKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsMessageGetByKeyResponseBodyData setOnsRestMessageDo(java.util.List<OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo> onsRestMessageDo) {
            this.onsRestMessageDo = onsRestMessageDo;
            return this;
        }
        public java.util.List<OnsMessageGetByKeyResponseBodyDataOnsRestMessageDo> getOnsRestMessageDo() {
            return this.onsRestMessageDo;
        }

    }

}
