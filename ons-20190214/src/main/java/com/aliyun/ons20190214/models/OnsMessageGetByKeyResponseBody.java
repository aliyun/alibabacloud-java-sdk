// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageGetByKeyResponseBody extends TeaModel {
    /**
     * <p>The list of returned results.</p>
     */
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
        /**
         * <p>The name of the attribute. Valid values:</p>
         * <ul>
         * <li><p><strong>TRACE_ON</strong>: indicates whether the message trace exists.</p>
         * </li>
         * <li><p><strong>KEYS</strong>: indicates the key of the message.</p>
         * </li>
         * <li><p><strong>TAGS</strong>: indicates the tag that is attached to the message.</p>
         * </li>
         * <li><p><strong>INSTANCE_ID</strong>: indicates the ID of the instance that contains the message.</p>
         * </li>
         * </ul>
         * <p>For information about the terms that are used in ApsaraMQ for RocketMQ, see <a href="https://help.aliyun.com/document_detail/29533.html">Terms</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>TAGS</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>TagA</p>
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
         * 
         * <strong>example:</strong>
         * <p>914112295</p>
         */
        @NameInMap("BodyCRC")
        public Integer bodyCRC;

        /**
         * <p>The producer client that generated the message.</p>
         * 
         * <strong>example:</strong>
         * <p>42.120.<em><strong>.</strong></em>:59270</p>
         */
        @NameInMap("BornHost")
        public String bornHost;

        /**
         * <p>The timestamp that indicates when the message was produced.</p>
         * 
         * <strong>example:</strong>
         * <p>1570760999721</p>
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
         * <p>1E0578FE110F18B4AAC235C05F2*****</p>
         */
        @NameInMap("MsgId")
        public String msgId;

        /**
         * <p>The attributes of the message.</p>
         */
        @NameInMap("PropertyList")
        public OnsMessageGetByKeyResponseBodyDataOnsRestMessageDoPropertyList propertyList;

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
         * <p>11.193.<em><strong>.</strong></em>:10911</p>
         */
        @NameInMap("StoreHost")
        public String storeHost;

        /**
         * <p>The size of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>406</p>
         */
        @NameInMap("StoreSize")
        public Integer storeSize;

        /**
         * <p>The timestamp that indicates when the ApsaraMQ for RocketMQ broker stored the message.</p>
         * 
         * <strong>example:</strong>
         * <p>1570760999811</p>
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
