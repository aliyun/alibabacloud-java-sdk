// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerAccumulateResponseBody extends TeaModel {
    /**
     * <p>The message accumulation information about topics to which the specified consumer subscribes.</p>
     */
    @NameInMap("Data")
    public OnsConsumerAccumulateResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CE817BFF-B389-43CD-9419-95011AC9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsConsumerAccumulateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerAccumulateResponseBody self = new OnsConsumerAccumulateResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsConsumerAccumulateResponseBody setData(OnsConsumerAccumulateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsConsumerAccumulateResponseBodyData getData() {
        return this.data;
    }

    public OnsConsumerAccumulateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsConsumerAccumulateResponseBodyDataDetailInTopicListDetailInTopicDo extends TeaModel {
        @NameInMap("DelayTime")
        public Long delayTime;

        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("TotalDiff")
        public Long totalDiff;

        public static OnsConsumerAccumulateResponseBodyDataDetailInTopicListDetailInTopicDo build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerAccumulateResponseBodyDataDetailInTopicListDetailInTopicDo self = new OnsConsumerAccumulateResponseBodyDataDetailInTopicListDetailInTopicDo();
            return TeaModel.build(map, self);
        }

        public OnsConsumerAccumulateResponseBodyDataDetailInTopicListDetailInTopicDo setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public OnsConsumerAccumulateResponseBodyDataDetailInTopicListDetailInTopicDo setLastTimestamp(Long lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        public OnsConsumerAccumulateResponseBodyDataDetailInTopicListDetailInTopicDo setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public OnsConsumerAccumulateResponseBodyDataDetailInTopicListDetailInTopicDo setTotalDiff(Long totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public Long getTotalDiff() {
            return this.totalDiff;
        }

    }

    public static class OnsConsumerAccumulateResponseBodyDataDetailInTopicList extends TeaModel {
        @NameInMap("DetailInTopicDo")
        public java.util.List<OnsConsumerAccumulateResponseBodyDataDetailInTopicListDetailInTopicDo> detailInTopicDo;

        public static OnsConsumerAccumulateResponseBodyDataDetailInTopicList build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerAccumulateResponseBodyDataDetailInTopicList self = new OnsConsumerAccumulateResponseBodyDataDetailInTopicList();
            return TeaModel.build(map, self);
        }

        public OnsConsumerAccumulateResponseBodyDataDetailInTopicList setDetailInTopicDo(java.util.List<OnsConsumerAccumulateResponseBodyDataDetailInTopicListDetailInTopicDo> detailInTopicDo) {
            this.detailInTopicDo = detailInTopicDo;
            return this;
        }
        public java.util.List<OnsConsumerAccumulateResponseBodyDataDetailInTopicListDetailInTopicDo> getDetailInTopicDo() {
            return this.detailInTopicDo;
        }

    }

    public static class OnsConsumerAccumulateResponseBodyData extends TeaModel {
        /**
         * <p>The transactions per second (TPS) for message consumption performed by consumers in the group.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ConsumeTps")
        public Float consumeTps;

        /**
         * <p>The consumption latency.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("DelayTime")
        public Long delayTime;

        @NameInMap("DetailInTopicList")
        public OnsConsumerAccumulateResponseBodyDataDetailInTopicList detailInTopicList;

        /**
         * <p>The point in time when the latest message consumed by a consumer in the consumer group was produced.</p>
         * 
         * <strong>example:</strong>
         * <p>1566231000000</p>
         */
        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        /**
         * <p>Indicates whether the consumer group is online. The consumer group is online if one of the consumers in the group is online. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The consumer group is online.</li>
         * <li><strong>false</strong>: The consumer group is offline.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>The total number of accumulated messages in all topics to which the consumer group subscribes.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalDiff")
        public Long totalDiff;

        public static OnsConsumerAccumulateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerAccumulateResponseBodyData self = new OnsConsumerAccumulateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsConsumerAccumulateResponseBodyData setConsumeTps(Float consumeTps) {
            this.consumeTps = consumeTps;
            return this;
        }
        public Float getConsumeTps() {
            return this.consumeTps;
        }

        public OnsConsumerAccumulateResponseBodyData setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public OnsConsumerAccumulateResponseBodyData setDetailInTopicList(OnsConsumerAccumulateResponseBodyDataDetailInTopicList detailInTopicList) {
            this.detailInTopicList = detailInTopicList;
            return this;
        }
        public OnsConsumerAccumulateResponseBodyDataDetailInTopicList getDetailInTopicList() {
            return this.detailInTopicList;
        }

        public OnsConsumerAccumulateResponseBodyData setLastTimestamp(Long lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        public OnsConsumerAccumulateResponseBodyData setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public OnsConsumerAccumulateResponseBodyData setTotalDiff(Long totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public Long getTotalDiff() {
            return this.totalDiff;
        }

    }

}
