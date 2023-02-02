// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerTimeSpanResponseBody extends TeaModel {
    /**
     * <p>The query results.</p>
     */
    @NameInMap("Data")
    public OnsConsumerTimeSpanResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsConsumerTimeSpanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerTimeSpanResponseBody self = new OnsConsumerTimeSpanResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsConsumerTimeSpanResponseBody setData(OnsConsumerTimeSpanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsConsumerTimeSpanResponseBodyData getData() {
        return this.data;
    }

    public OnsConsumerTimeSpanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsConsumerTimeSpanResponseBodyData extends TeaModel {
        /**
         * <p>The most recent point in time when a message in the topic was consumed by the customer group.</p>
         */
        @NameInMap("ConsumeTimeStamp")
        public Long consumeTimeStamp;

        /**
         * <p>The ID of the instance to which the consumer group belongs.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The earliest point in time when a message was published to the topic.</p>
         */
        @NameInMap("MaxTimeStamp")
        public Long maxTimeStamp;

        /**
         * <p>The most recent point in time when a message was published to the topic.</p>
         */
        @NameInMap("MinTimeStamp")
        public Long minTimeStamp;

        /**
         * <p>The name of the topic that you want to query.</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static OnsConsumerTimeSpanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerTimeSpanResponseBodyData self = new OnsConsumerTimeSpanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsConsumerTimeSpanResponseBodyData setConsumeTimeStamp(Long consumeTimeStamp) {
            this.consumeTimeStamp = consumeTimeStamp;
            return this;
        }
        public Long getConsumeTimeStamp() {
            return this.consumeTimeStamp;
        }

        public OnsConsumerTimeSpanResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsConsumerTimeSpanResponseBodyData setMaxTimeStamp(Long maxTimeStamp) {
            this.maxTimeStamp = maxTimeStamp;
            return this;
        }
        public Long getMaxTimeStamp() {
            return this.maxTimeStamp;
        }

        public OnsConsumerTimeSpanResponseBodyData setMinTimeStamp(Long minTimeStamp) {
            this.minTimeStamp = minTimeStamp;
            return this;
        }
        public Long getMinTimeStamp() {
            return this.minTimeStamp;
        }

        public OnsConsumerTimeSpanResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

}
