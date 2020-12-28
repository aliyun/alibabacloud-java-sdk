// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerTimeSpanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsConsumerTimeSpanResponseBodyData data;

    public static OnsConsumerTimeSpanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerTimeSpanResponseBody self = new OnsConsumerTimeSpanResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsConsumerTimeSpanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsConsumerTimeSpanResponseBody setData(OnsConsumerTimeSpanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsConsumerTimeSpanResponseBodyData getData() {
        return this.data;
    }

    public static class OnsConsumerTimeSpanResponseBodyData extends TeaModel {
        @NameInMap("MaxTimeStamp")
        public Long maxTimeStamp;

        @NameInMap("ConsumeTimeStamp")
        public Long consumeTimeStamp;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("MinTimeStamp")
        public Long minTimeStamp;

        @NameInMap("InstanceId")
        public String instanceId;

        public static OnsConsumerTimeSpanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerTimeSpanResponseBodyData self = new OnsConsumerTimeSpanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsConsumerTimeSpanResponseBodyData setMaxTimeStamp(Long maxTimeStamp) {
            this.maxTimeStamp = maxTimeStamp;
            return this;
        }
        public Long getMaxTimeStamp() {
            return this.maxTimeStamp;
        }

        public OnsConsumerTimeSpanResponseBodyData setConsumeTimeStamp(Long consumeTimeStamp) {
            this.consumeTimeStamp = consumeTimeStamp;
            return this;
        }
        public Long getConsumeTimeStamp() {
            return this.consumeTimeStamp;
        }

        public OnsConsumerTimeSpanResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public OnsConsumerTimeSpanResponseBodyData setMinTimeStamp(Long minTimeStamp) {
            this.minTimeStamp = minTimeStamp;
            return this;
        }
        public Long getMinTimeStamp() {
            return this.minTimeStamp;
        }

        public OnsConsumerTimeSpanResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
