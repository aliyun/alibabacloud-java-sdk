// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageGetByMsgIdResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public OnsMessageGetByMsgIdResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>A07E3902-B92E-44A6-B6C5-6AA111111****</p>
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
        @NameInMap("Name")
        public String name;

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
         * <p>The timestamp that indicates when the message was produced.</p>
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
         * <p>The ID of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>1E0578FE110F18B4AAC235C0C8460BA2</p>
         */
        @NameInMap("MsgId")
        public String msgId;

        @NameInMap("PropertyList")
        public OnsMessageGetByMsgIdResponseBodyDataPropertyList propertyList;

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
         * <p>The size of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>407</p>
         */
        @NameInMap("StoreSize")
        public Integer storeSize;

        /**
         * <p>The timestamp that indicates when the ApsaraMQ for RocketMQ broker stored the message.</p>
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
