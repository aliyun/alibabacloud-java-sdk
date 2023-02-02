// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageGetByKeyResponseBody extends TeaModel {
    /**
     * <p>The information about the message that is queried.</p>
     */
    @NameInMap("Data")
    public OnsMessageGetByKeyResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
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
        /**
         * <p>The name of the attribute. Valid values:</p>
         * <br>
         * <p>*   **TRACE_ON**: indicates whether a trace of the message exists.</p>
         * <br>
         * <p>\-\*\* KEYS\*\*: indicates the key of the message.</p>
         * <br>
         * <p>*   **TAGS**: indicates the tag that is attached to the message.</p>
         * <p>*   **INSTANCE_ID**: indicates the ID of the instance that contains the message.</p>
         * <br>
         * <p>For more information about the terms that are used in Message Queue for Apache RocketMQ, see [Terms](~~29533~~).</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the attribute.</p>
         */
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
        /**
         * <p>The cyclic redundancy check (CRC) value of the message body.</p>
         */
        @NameInMap("BodyCRC")
        public Integer bodyCRC;

        /**
         * <p>The producer client that generated the message.</p>
         */
        @NameInMap("BornHost")
        public String bornHost;

        /**
         * <p>The timestamp when the message was produced.</p>
         */
        @NameInMap("BornTimestamp")
        public Long bornTimestamp;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the message.</p>
         */
        @NameInMap("MsgId")
        public String msgId;

        /**
         * <p>The attributes of the message.</p>
         */
        @NameInMap("PropertyList")
        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyList propertyList;

        /**
         * <p>The number of retries that Message Queue for Apache RocketMQ performed to send the message to consumers.</p>
         */
        @NameInMap("ReconsumeTimes")
        public Integer reconsumeTimes;

        /**
         * <p>The Message Queue for Apache RocketMQ broker that stores the message.</p>
         */
        @NameInMap("StoreHost")
        public String storeHost;

        /**
         * <p>The size of the message.</p>
         */
        @NameInMap("StoreSize")
        public Integer storeSize;

        /**
         * <p>The timestamp when the Message Queue for Apache RocketMQ broker stored the message.</p>
         */
        @NameInMap("StoreTimestamp")
        public Long storeTimestamp;

        /**
         * <p>The topic to which the message belongs.</p>
         */
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
