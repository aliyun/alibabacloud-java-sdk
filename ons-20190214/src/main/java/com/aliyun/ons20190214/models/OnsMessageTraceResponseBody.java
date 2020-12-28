// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageTraceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<OnsMessageTraceResponseBodyData> data;

    public static OnsMessageTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageTraceResponseBody self = new OnsMessageTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMessageTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsMessageTraceResponseBody setData(java.util.List<OnsMessageTraceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<OnsMessageTraceResponseBodyData> getData() {
        return this.data;
    }

    public static class OnsMessageTraceResponseBodyData extends TeaModel {
        @NameInMap("TrackType")
        public String trackType;

        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        @NameInMap("InstanceId")
        public String instanceId;

        public static OnsMessageTraceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageTraceResponseBodyData self = new OnsMessageTraceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsMessageTraceResponseBodyData setTrackType(String trackType) {
            this.trackType = trackType;
            return this;
        }
        public String getTrackType() {
            return this.trackType;
        }

        public OnsMessageTraceResponseBodyData setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        public OnsMessageTraceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
