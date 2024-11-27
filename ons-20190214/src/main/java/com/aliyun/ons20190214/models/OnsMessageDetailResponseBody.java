// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageDetailResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public OnsMessageDetailResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>EAE5BE23-37A1-4354-94D6-E44AE17E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsMessageDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageDetailResponseBody self = new OnsMessageDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMessageDetailResponseBody setData(OnsMessageDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsMessageDetailResponseBodyData getData() {
        return this.data;
    }

    public OnsMessageDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsMessageDetailResponseBodyDataPropertyList extends TeaModel {
        /**
         * <p>The name of the attribute. Valid values:</p>
         * <ul>
         * <li><strong>TRACE_ON</strong>: indicates whether the trace of the message exists.</li>
         * <li><strong>MSG_REGION</strong>: The region ID of the instance to which the topic belongs.</li>
         * <li><strong>__MESSAGE_DECODED_TIME</strong>: The time when the message was decoded.</li>
         * <li><strong>__BORNHOST</strong>: The IP address of the producer client.</li>
         * <li><strong>UNIQ_KEY</strong>: The ID of the message.</li>
         * </ul>
         * <p>For information about the terms that are used in ApsaraMQ for RocketMQ, see <a href="https://help.aliyun.com/document_detail/29533.html">Terms</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>MSG_REGION</p>
         */
        @NameInMap("Value")
        public String value;

        public static OnsMessageDetailResponseBodyDataPropertyList build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageDetailResponseBodyDataPropertyList self = new OnsMessageDetailResponseBodyDataPropertyList();
            return TeaModel.build(map, self);
        }

        public OnsMessageDetailResponseBodyDataPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public OnsMessageDetailResponseBodyDataPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class OnsMessageDetailResponseBodyData extends TeaModel {
        /**
         * <p>The string that is obtained after the message body is encrypted by using the Base 64 algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>aGVsbG8=</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>The cyclic redundancy check (CRC) value of the message body.</p>
         * 
         * <strong>example:</strong>
         * <p>907060870</p>
         */
        @NameInMap("BodyCRC")
        public Integer bodyCRC;

        /**
         * <p>The information about the message body.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("BodyStr")
        public String bodyStr;

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
         * <p>The ID of the ApsaraMQ for RocketMQ Instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_184681981******_BXig0x6A</p>
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
        public java.util.List<OnsMessageDetailResponseBodyDataPropertyList> propertyList;

        /**
         * <p>The number of retries that ApsaraMQ for RocketMQ performed to send the message to consumers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>2</p>
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

        public static OnsMessageDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageDetailResponseBodyData self = new OnsMessageDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsMessageDetailResponseBodyData setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public OnsMessageDetailResponseBodyData setBodyCRC(Integer bodyCRC) {
            this.bodyCRC = bodyCRC;
            return this;
        }
        public Integer getBodyCRC() {
            return this.bodyCRC;
        }

        public OnsMessageDetailResponseBodyData setBodyStr(String bodyStr) {
            this.bodyStr = bodyStr;
            return this;
        }
        public String getBodyStr() {
            return this.bodyStr;
        }

        public OnsMessageDetailResponseBodyData setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

        public OnsMessageDetailResponseBodyData setBornTimestamp(Long bornTimestamp) {
            this.bornTimestamp = bornTimestamp;
            return this;
        }
        public Long getBornTimestamp() {
            return this.bornTimestamp;
        }

        public OnsMessageDetailResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsMessageDetailResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public OnsMessageDetailResponseBodyData setPropertyList(java.util.List<OnsMessageDetailResponseBodyDataPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<OnsMessageDetailResponseBodyDataPropertyList> getPropertyList() {
            return this.propertyList;
        }

        public OnsMessageDetailResponseBodyData setReconsumeTimes(Integer reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public OnsMessageDetailResponseBodyData setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public OnsMessageDetailResponseBodyData setStoreSize(Integer storeSize) {
            this.storeSize = storeSize;
            return this;
        }
        public Integer getStoreSize() {
            return this.storeSize;
        }

        public OnsMessageDetailResponseBodyData setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public OnsMessageDetailResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

}
