// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqConsumerAccumulateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryMqSofamqConsumerAccumulateResponseBodyData data;

    public static QueryMqSofamqConsumerAccumulateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqConsumerAccumulateResponseBody self = new QueryMqSofamqConsumerAccumulateResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqConsumerAccumulateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqSofamqConsumerAccumulateResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMqSofamqConsumerAccumulateResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMqSofamqConsumerAccumulateResponseBody setData(QueryMqSofamqConsumerAccumulateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMqSofamqConsumerAccumulateResponseBodyData getData() {
        return this.data;
    }

    public static class QueryMqSofamqConsumerAccumulateResponseBodyDataDetailInTopicList extends TeaModel {
        @NameInMap("DelayTime")
        public Long delayTime;

        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("TotalDiff")
        public Long totalDiff;

        public static QueryMqSofamqConsumerAccumulateResponseBodyDataDetailInTopicList build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqConsumerAccumulateResponseBodyDataDetailInTopicList self = new QueryMqSofamqConsumerAccumulateResponseBodyDataDetailInTopicList();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqConsumerAccumulateResponseBodyDataDetailInTopicList setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public QueryMqSofamqConsumerAccumulateResponseBodyDataDetailInTopicList setLastTimestamp(Long lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        public QueryMqSofamqConsumerAccumulateResponseBodyDataDetailInTopicList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public QueryMqSofamqConsumerAccumulateResponseBodyDataDetailInTopicList setTotalDiff(Long totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public Long getTotalDiff() {
            return this.totalDiff;
        }

    }

    public static class QueryMqSofamqConsumerAccumulateResponseBodyData extends TeaModel {
        @NameInMap("ConsumeTps")
        public String consumeTps;

        @NameInMap("DelayTime")
        public Long delayTime;

        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("TotalDiff")
        public Long totalDiff;

        @NameInMap("DetailInTopicList")
        public java.util.List<QueryMqSofamqConsumerAccumulateResponseBodyDataDetailInTopicList> detailInTopicList;

        public static QueryMqSofamqConsumerAccumulateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqConsumerAccumulateResponseBodyData self = new QueryMqSofamqConsumerAccumulateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqConsumerAccumulateResponseBodyData setConsumeTps(String consumeTps) {
            this.consumeTps = consumeTps;
            return this;
        }
        public String getConsumeTps() {
            return this.consumeTps;
        }

        public QueryMqSofamqConsumerAccumulateResponseBodyData setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public QueryMqSofamqConsumerAccumulateResponseBodyData setLastTimestamp(Long lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        public QueryMqSofamqConsumerAccumulateResponseBodyData setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public QueryMqSofamqConsumerAccumulateResponseBodyData setTotalDiff(Long totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public Long getTotalDiff() {
            return this.totalDiff;
        }

        public QueryMqSofamqConsumerAccumulateResponseBodyData setDetailInTopicList(java.util.List<QueryMqSofamqConsumerAccumulateResponseBodyDataDetailInTopicList> detailInTopicList) {
            this.detailInTopicList = detailInTopicList;
            return this;
        }
        public java.util.List<QueryMqSofamqConsumerAccumulateResponseBodyDataDetailInTopicList> getDetailInTopicList() {
            return this.detailInTopicList;
        }

    }

}
