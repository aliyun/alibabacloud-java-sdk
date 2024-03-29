// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageGetByMsgIdResponseBody extends TeaModel {
    /**
     * <p>The information about the message that is queried.</p>
     */
    @NameInMap("Data")
    public OnsMessageGetByMsgIdResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsMessageGetByMsgIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageGetByMsgIdResponseBody self = new OnsMessageGetByMsgIdResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMessageGetByMsgIdResponseBody setData(OnsMessageGetByMsgIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsMessageGetByMsgIdResponseBodyData getData() {
        return this.data;
    }

    public OnsMessageGetByMsgIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsMessageGetByMsgIdResponseBodyDataPropertyListMessageProperty extends TeaModel {
        /**
         * <p>The name of the attribute. Valid values:</p>
         * <br>
         * <p>*   **TRACE_ON**: indicates whether a trace of the message exists.</p>
         * <p>*   **KEYS**: indicates the key of the message.</p>
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

        public static OnsMessageGetByMsgIdResponseBodyDataPropertyListMessageProperty build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageGetByMsgIdResponseBodyDataPropertyListMessageProperty self = new OnsMessageGetByMsgIdResponseBodyDataPropertyListMessageProperty();
            return TeaModel.build(map, self);
        }

        public OnsMessageGetByMsgIdResponseBodyDataPropertyListMessageProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public OnsMessageGetByMsgIdResponseBodyDataPropertyListMessageProperty setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class OnsMessageGetByMsgIdResponseBodyDataPropertyList extends TeaModel {
        @NameInMap("MessageProperty")
        public java.util.List<OnsMessageGetByMsgIdResponseBodyDataPropertyListMessageProperty> messageProperty;

        public static OnsMessageGetByMsgIdResponseBodyDataPropertyList build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageGetByMsgIdResponseBodyDataPropertyList self = new OnsMessageGetByMsgIdResponseBodyDataPropertyList();
            return TeaModel.build(map, self);
        }

        public OnsMessageGetByMsgIdResponseBodyDataPropertyList setMessageProperty(java.util.List<OnsMessageGetByMsgIdResponseBodyDataPropertyListMessageProperty> messageProperty) {
            this.messageProperty = messageProperty;
            return this;
        }
        public java.util.List<OnsMessageGetByMsgIdResponseBodyDataPropertyListMessageProperty> getMessageProperty() {
            return this.messageProperty;
        }

    }

    public static class OnsMessageGetByMsgIdResponseBodyData extends TeaModel {
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
        public OnsMessageGetByMsgIdResponseBodyDataPropertyList propertyList;

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

        public static OnsMessageGetByMsgIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageGetByMsgIdResponseBodyData self = new OnsMessageGetByMsgIdResponseBodyData();
            return TeaModel.build(map, self);
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

        public OnsMessageGetByMsgIdResponseBodyData setBornTimestamp(Long bornTimestamp) {
            this.bornTimestamp = bornTimestamp;
            return this;
        }
        public Long getBornTimestamp() {
            return this.bornTimestamp;
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

        public OnsMessageGetByMsgIdResponseBodyData setPropertyList(OnsMessageGetByMsgIdResponseBodyDataPropertyList propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public OnsMessageGetByMsgIdResponseBodyDataPropertyList getPropertyList() {
            return this.propertyList;
        }

        public OnsMessageGetByMsgIdResponseBodyData setReconsumeTimes(Integer reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public OnsMessageGetByMsgIdResponseBodyData setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public OnsMessageGetByMsgIdResponseBodyData setStoreSize(Integer storeSize) {
            this.storeSize = storeSize;
            return this;
        }
        public Integer getStoreSize() {
            return this.storeSize;
        }

        public OnsMessageGetByMsgIdResponseBodyData setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public OnsMessageGetByMsgIdResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

}
