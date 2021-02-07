// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageTraceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsMessageTraceResponseBodyData data;

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

    public OnsMessageTraceResponseBody setData(OnsMessageTraceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsMessageTraceResponseBodyData getData() {
        return this.data;
    }

    public static class OnsMessageTraceResponseBodyDataMessageTrack extends TeaModel {
        @NameInMap("TrackType")
        public String trackType;

        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        @NameInMap("InstanceId")
        public String instanceId;

        public static OnsMessageTraceResponseBodyDataMessageTrack build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageTraceResponseBodyDataMessageTrack self = new OnsMessageTraceResponseBodyDataMessageTrack();
            return TeaModel.build(map, self);
        }

        public OnsMessageTraceResponseBodyDataMessageTrack setTrackType(String trackType) {
            this.trackType = trackType;
            return this;
        }
        public String getTrackType() {
            return this.trackType;
        }

        public OnsMessageTraceResponseBodyDataMessageTrack setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        public OnsMessageTraceResponseBodyDataMessageTrack setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class OnsMessageTraceResponseBodyData extends TeaModel {
        @NameInMap("MessageTrack")
        public java.util.List<OnsMessageTraceResponseBodyDataMessageTrack> messageTrack;

        public static OnsMessageTraceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsMessageTraceResponseBodyData self = new OnsMessageTraceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsMessageTraceResponseBodyData setMessageTrack(java.util.List<OnsMessageTraceResponseBodyDataMessageTrack> messageTrack) {
            this.messageTrack = messageTrack;
            return this;
        }
        public java.util.List<OnsMessageTraceResponseBodyDataMessageTrack> getMessageTrack() {
            return this.messageTrack;
        }

    }

}
