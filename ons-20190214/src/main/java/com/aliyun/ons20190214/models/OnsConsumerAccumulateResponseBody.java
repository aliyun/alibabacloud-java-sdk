// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerAccumulateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsConsumerAccumulateResponseBodyData data;

    public static OnsConsumerAccumulateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerAccumulateResponseBody self = new OnsConsumerAccumulateResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsConsumerAccumulateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsConsumerAccumulateResponseBody setData(OnsConsumerAccumulateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsConsumerAccumulateResponseBodyData getData() {
        return this.data;
    }

    public static class OnsConsumerAccumulateResponseBodyDataDetailInTopicListDetailInTopicDo extends TeaModel {
        @NameInMap("DelayTime")
        public Long delayTime;

        @NameInMap("TotalDiff")
        public Long totalDiff;

        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        @NameInMap("Topic")
        public String topic;

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

        public OnsConsumerAccumulateResponseBodyDataDetailInTopicListDetailInTopicDo setTotalDiff(Long totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public Long getTotalDiff() {
            return this.totalDiff;
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
        @NameInMap("ConsumeTps")
        public Float consumeTps;

        @NameInMap("DelayTime")
        public Long delayTime;

        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        @NameInMap("TotalDiff")
        public Long totalDiff;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("DetailInTopicList")
        public OnsConsumerAccumulateResponseBodyDataDetailInTopicList detailInTopicList;

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

        public OnsConsumerAccumulateResponseBodyData setLastTimestamp(Long lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        public OnsConsumerAccumulateResponseBodyData setTotalDiff(Long totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public Long getTotalDiff() {
            return this.totalDiff;
        }

        public OnsConsumerAccumulateResponseBodyData setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public OnsConsumerAccumulateResponseBodyData setDetailInTopicList(OnsConsumerAccumulateResponseBodyDataDetailInTopicList detailInTopicList) {
            this.detailInTopicList = detailInTopicList;
            return this;
        }
        public OnsConsumerAccumulateResponseBodyDataDetailInTopicList getDetailInTopicList() {
            return this.detailInTopicList;
        }

    }

}
