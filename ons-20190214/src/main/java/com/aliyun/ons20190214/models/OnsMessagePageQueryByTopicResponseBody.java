// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessagePageQueryByTopicResponseBody extends TeaModel {
    /**
     * <p>The information about the message that is queried.</p>
     */
    @NameInMap("MsgFoundDo")
    public OnsMessagePageQueryByTopicResponseBodyMsgFoundDo msgFoundDo;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5DC2A47E-2B31-4722-96C8-FA59C9*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsMessagePageQueryByTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMessagePageQueryByTopicResponseBody self = new OnsMessagePageQueryByTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMessagePageQueryByTopicResponseBody setMsgFoundDo(OnsMessagePageQueryByTopicResponseBodyMsgFoundDo msgFoundDo) {
        this.msgFoundDo = msgFoundDo;
        return this;
    }
    public OnsMessagePageQueryByTopicResponseBodyMsgFoundDo getMsgFoundDo() {
        return this.msgFoundDo;
    }

    public OnsMessagePageQueryByTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty extends TeaModel {
        /**
         * <p>The name of the attribute. Valid values:</p>
         * <ul>
         * <li><strong>TRACE_ON</strong>: indicates whether a trace of the message exists.</li>
         * <li><strong>KEYS</strong>: indicates the key of the message.</li>
         * <li><strong>TAGS</strong>: indicates the tag of the message.</li>
         * <li><strong>INSTANCE_ID</strong>: indicates the ID of the instance that contains the message.</li>
         * </ul>
         * <p>For information about the terms that are used in ApsaraMQ for RocketMQ see <a href="https://help.aliyun.com/document_detail/29533.html">Terms</a>.</p>
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

        public static OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty build(java.util.Map<String, ?> map) throws Exception {
            OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty self = new OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty();
            return TeaModel.build(map, self);
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyList extends TeaModel {
        @NameInMap("MessageProperty")
        public java.util.List<OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty> messageProperty;

        public static OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyList build(java.util.Map<String, ?> map) throws Exception {
            OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyList self = new OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyList();
            return TeaModel.build(map, self);
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyList setMessageProperty(java.util.List<OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty> messageProperty) {
            this.messageProperty = messageProperty;
            return this;
        }
        public java.util.List<OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty> getMessageProperty() {
            return this.messageProperty;
        }

    }

    public static class OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo extends TeaModel {
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
         * <p>The time when the message was generated. The value is a UNIX timestamp that represents the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
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
        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyList propertyList;

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
         * <p>The size of the message. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>406</p>
         */
        @NameInMap("StoreSize")
        public Integer storeSize;

        /**
         * <p>The time when the ApsaraMQ for RocketMQ broker stored the message. The value is a UNIX timestamp that represents the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
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

        public static OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo build(java.util.Map<String, ?> map) throws Exception {
            OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo self = new OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo();
            return TeaModel.build(map, self);
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setBodyCRC(Integer bodyCRC) {
            this.bodyCRC = bodyCRC;
            return this;
        }
        public Integer getBodyCRC() {
            return this.bodyCRC;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setBornTimestamp(Long bornTimestamp) {
            this.bornTimestamp = bornTimestamp;
            return this;
        }
        public Long getBornTimestamp() {
            return this.bornTimestamp;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setPropertyList(OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyList propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyList getPropertyList() {
            return this.propertyList;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setReconsumeTimes(Integer reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setStoreSize(Integer storeSize) {
            this.storeSize = storeSize;
            return this;
        }
        public Integer getStoreSize() {
            return this.storeSize;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList extends TeaModel {
        @NameInMap("OnsRestMessageDo")
        public java.util.List<OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo> onsRestMessageDo;

        public static OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList build(java.util.Map<String, ?> map) throws Exception {
            OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList self = new OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList();
            return TeaModel.build(map, self);
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList setOnsRestMessageDo(java.util.List<OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo> onsRestMessageDo) {
            this.onsRestMessageDo = onsRestMessageDo;
            return this;
        }
        public java.util.List<OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo> getOnsRestMessageDo() {
            return this.onsRestMessageDo;
        }

    }

    public static class OnsMessagePageQueryByTopicResponseBodyMsgFoundDo extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Long currentPage;

        /**
         * <p>The total number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("MaxPageCount")
        public Long maxPageCount;

        /**
         * <p>The information about messages on the returned page. The information that is contained in this parameter is the same as the information that is returned by the <a href="https://help.aliyun.com/document_detail/29607.html">OnsMessageGetByMsgId</a> operation.</p>
         */
        @NameInMap("MsgFoundList")
        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList msgFoundList;

        /**
         * <p>The ID of the query task. The first time you call this operation to query the messages that are sent to a specified consumer group within a specified time range, this parameter is returned. You can use the task ID to query the details of messages on other returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>0BC1310300002A9F000021E4D7A48346</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static OnsMessagePageQueryByTopicResponseBodyMsgFoundDo build(java.util.Map<String, ?> map) throws Exception {
            OnsMessagePageQueryByTopicResponseBodyMsgFoundDo self = new OnsMessagePageQueryByTopicResponseBodyMsgFoundDo();
            return TeaModel.build(map, self);
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDo setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDo setMaxPageCount(Long maxPageCount) {
            this.maxPageCount = maxPageCount;
            return this;
        }
        public Long getMaxPageCount() {
            return this.maxPageCount;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDo setMsgFoundList(OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList msgFoundList) {
            this.msgFoundList = msgFoundList;
            return this;
        }
        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList getMsgFoundList() {
            return this.msgFoundList;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
