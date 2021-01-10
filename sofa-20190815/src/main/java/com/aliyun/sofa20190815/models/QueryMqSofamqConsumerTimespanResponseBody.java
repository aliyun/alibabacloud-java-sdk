// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqConsumerTimespanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryMqSofamqConsumerTimespanResponseBodyData data;

    public static QueryMqSofamqConsumerTimespanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqConsumerTimespanResponseBody self = new QueryMqSofamqConsumerTimespanResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqConsumerTimespanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqSofamqConsumerTimespanResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMqSofamqConsumerTimespanResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMqSofamqConsumerTimespanResponseBody setData(QueryMqSofamqConsumerTimespanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMqSofamqConsumerTimespanResponseBodyData getData() {
        return this.data;
    }

    public static class QueryMqSofamqConsumerTimespanResponseBodyData extends TeaModel {
        @NameInMap("ConsumeTimestamp")
        public Long consumeTimestamp;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MaxTimestamp")
        public Long maxTimestamp;

        @NameInMap("MinTimestamp")
        public Long minTimestamp;

        @NameInMap("Topic")
        public String topic;

        public static QueryMqSofamqConsumerTimespanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqConsumerTimespanResponseBodyData self = new QueryMqSofamqConsumerTimespanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqConsumerTimespanResponseBodyData setConsumeTimestamp(Long consumeTimestamp) {
            this.consumeTimestamp = consumeTimestamp;
            return this;
        }
        public Long getConsumeTimestamp() {
            return this.consumeTimestamp;
        }

        public QueryMqSofamqConsumerTimespanResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMqSofamqConsumerTimespanResponseBodyData setMaxTimestamp(Long maxTimestamp) {
            this.maxTimestamp = maxTimestamp;
            return this;
        }
        public Long getMaxTimestamp() {
            return this.maxTimestamp;
        }

        public QueryMqSofamqConsumerTimespanResponseBodyData setMinTimestamp(Long minTimestamp) {
            this.minTimestamp = minTimestamp;
            return this;
        }
        public Long getMinTimestamp() {
            return this.minTimestamp;
        }

        public QueryMqSofamqConsumerTimespanResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

}
