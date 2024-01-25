// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcRtFlowUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterRtcRtFlowUsageResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterRtcRtFlowUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcRtFlowUsageResponseBody self = new DescribeMeterRtcRtFlowUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcRtFlowUsageResponseBody setData(java.util.List<DescribeMeterRtcRtFlowUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterRtcRtFlowUsageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterRtcRtFlowUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterRtcRtFlowUsageResponseBodyData extends TeaModel {
        @NameInMap("AnchorFlowValue")
        public Float anchorFlowValue;

        @NameInMap("AudienceFlowValue")
        public Float audienceFlowValue;

        @NameInMap("FlowValue")
        public Float flowValue;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeMeterRtcRtFlowUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterRtcRtFlowUsageResponseBodyData self = new DescribeMeterRtcRtFlowUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterRtcRtFlowUsageResponseBodyData setAnchorFlowValue(Float anchorFlowValue) {
            this.anchorFlowValue = anchorFlowValue;
            return this;
        }
        public Float getAnchorFlowValue() {
            return this.anchorFlowValue;
        }

        public DescribeMeterRtcRtFlowUsageResponseBodyData setAudienceFlowValue(Float audienceFlowValue) {
            this.audienceFlowValue = audienceFlowValue;
            return this;
        }
        public Float getAudienceFlowValue() {
            return this.audienceFlowValue;
        }

        public DescribeMeterRtcRtFlowUsageResponseBodyData setFlowValue(Float flowValue) {
            this.flowValue = flowValue;
            return this;
        }
        public Float getFlowValue() {
            return this.flowValue;
        }

        public DescribeMeterRtcRtFlowUsageResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
