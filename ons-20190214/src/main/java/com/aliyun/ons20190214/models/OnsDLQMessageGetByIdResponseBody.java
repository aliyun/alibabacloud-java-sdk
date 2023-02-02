// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsDLQMessageGetByIdResponseBody extends TeaModel {
    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Data")
    public OnsDLQMessageGetByIdResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsDLQMessageGetByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsDLQMessageGetByIdResponseBody self = new OnsDLQMessageGetByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsDLQMessageGetByIdResponseBody setData(OnsDLQMessageGetByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsDLQMessageGetByIdResponseBodyData getData() {
        return this.data;
    }

    public OnsDLQMessageGetByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsDLQMessageGetByIdResponseBodyDataPropertyListMessageProperty extends TeaModel {
        /**
         * <p>The name of the attribute. Valid values:</p>
         * <br>
         * <p>*   **TRACE_ON**: indicates whether a trace of the message exists.</p>
         * <p>*   **KEYS**: indicates the message key of the message.</p>
         * <p>*   **TAGS**: indicates the tag that is attached to the message.</p>
         * <p>*   **INSTANCE_ID**: indicates the ID of the instance that contains the dead-letter message.</p>
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

        public static OnsDLQMessageGetByIdResponseBodyDataPropertyListMessageProperty build(java.util.Map<String, ?> map) throws Exception {
            OnsDLQMessageGetByIdResponseBodyDataPropertyListMessageProperty self = new OnsDLQMessageGetByIdResponseBodyDataPropertyListMessageProperty();
            return TeaModel.build(map, self);
        }

        public OnsDLQMessageGetByIdResponseBodyDataPropertyListMessageProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public OnsDLQMessageGetByIdResponseBodyDataPropertyListMessageProperty setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
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
        /**
         * <p>The cyclic redundancy check (CRC) value of the message body.</p>
         */
        @NameInMap("BodyCRC")
        public Integer bodyCRC;

        /**
         * <p>The producer instance that generated the message.</p>
         */
        @NameInMap("BornHost")
        public String bornHost;

        /**
         * <p>The timestamp that indicates the point in time when the dead-letter message was generated. Unit: milliseconds.</p>
         */
        @NameInMap("BornTimestamp")
        public Long bornTimestamp;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the dead-letter message.</p>
         */
        @NameInMap("MsgId")
        public String msgId;

        /**
         * <p>The attributes of the message.</p>
         */
        @NameInMap("PropertyList")
        public OnsDLQMessageGetByIdResponseBodyDataPropertyList propertyList;

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
         * <p>The size of the message. Unit: KB.</p>
         */
        @NameInMap("StoreSize")
        public Integer storeSize;

        /**
         * <p>The timestamp when the Message Queue for Apache RocketMQ broker stored the message. Unit: milliseconds.</p>
         */
        @NameInMap("StoreTimestamp")
        public Long storeTimestamp;

        /**
         * <p>The topic to which the message belongs.</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static OnsDLQMessageGetByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsDLQMessageGetByIdResponseBodyData self = new OnsDLQMessageGetByIdResponseBodyData();
            return TeaModel.build(map, self);
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

        public OnsDLQMessageGetByIdResponseBodyData setBornTimestamp(Long bornTimestamp) {
            this.bornTimestamp = bornTimestamp;
            return this;
        }
        public Long getBornTimestamp() {
            return this.bornTimestamp;
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

        public OnsDLQMessageGetByIdResponseBodyData setPropertyList(OnsDLQMessageGetByIdResponseBodyDataPropertyList propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public OnsDLQMessageGetByIdResponseBodyDataPropertyList getPropertyList() {
            return this.propertyList;
        }

        public OnsDLQMessageGetByIdResponseBodyData setReconsumeTimes(Integer reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public OnsDLQMessageGetByIdResponseBodyData setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public OnsDLQMessageGetByIdResponseBodyData setStoreSize(Integer storeSize) {
            this.storeSize = storeSize;
            return this;
        }
        public Integer getStoreSize() {
            return this.storeSize;
        }

        public OnsDLQMessageGetByIdResponseBodyData setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public OnsDLQMessageGetByIdResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

}
