// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsDLQMessageGetByIdResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public OnsDLQMessageGetByIdResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A07E3902-B92E-44A6-B6C5-6AA111111****</p>
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
        @NameInMap("Name")
        public String name;

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
         * 
         * <strong>example:</strong>
         * <p>914112295</p>
         */
        @NameInMap("BodyCRC")
        public Integer bodyCRC;

        /**
         * <p>The producer instance that generated the message.</p>
         * 
         * <strong>example:</strong>
         * <p><code>42.120.**.**</code>:64646</p>
         */
        @NameInMap("BornHost")
        public String bornHost;

        /**
         * <p>The timestamp that indicates the point in time when the message was generated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1570761026630</p>
         */
        @NameInMap("BornTimestamp")
        public Long bornTimestamp;

        /**
         * <p>The ID of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_111111111111_DOxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the dead-letter message.</p>
         * 
         * <strong>example:</strong>
         * <p>0BC16699165C03B925DB8A404E2D****</p>
         */
        @NameInMap("MsgId")
        public String msgId;

        @NameInMap("PropertyList")
        public OnsDLQMessageGetByIdResponseBodyDataPropertyList propertyList;

        /**
         * <p>The number of retries that were performed to send the message to consumers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReconsumeTimes")
        public Integer reconsumeTimes;

        /**
         * <p>The ApsaraMQ for RocketMQ broker that stores the message.</p>
         * 
         * <strong>example:</strong>
         * <p>11.220.<em><strong>.</strong></em>:10911</p>
         */
        @NameInMap("StoreHost")
        public String storeHost;

        /**
         * <p>The size of the message. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>407</p>
         */
        @NameInMap("StoreSize")
        public Integer storeSize;

        /**
         * <p>The timestamp that indicates the point in time when the ApsaraMQ for RocketMQ broker stored the message. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1570761026708</p>
         */
        @NameInMap("StoreTimestamp")
        public Long storeTimestamp;

        /**
         * <p>The topic to which the message belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test-mq_topic</p>
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
