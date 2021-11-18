// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcFlowUsageResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RtcFlowUsageVoList")
    public java.util.List<DescribeMeterRtcFlowUsageResponseBodyRtcFlowUsageVoList> rtcFlowUsageVoList;

    public static DescribeMeterRtcFlowUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcFlowUsageResponseBody self = new DescribeMeterRtcFlowUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcFlowUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMeterRtcFlowUsageResponseBody setRtcFlowUsageVoList(java.util.List<DescribeMeterRtcFlowUsageResponseBodyRtcFlowUsageVoList> rtcFlowUsageVoList) {
        this.rtcFlowUsageVoList = rtcFlowUsageVoList;
        return this;
    }
    public java.util.List<DescribeMeterRtcFlowUsageResponseBodyRtcFlowUsageVoList> getRtcFlowUsageVoList() {
        return this.rtcFlowUsageVoList;
    }

    public static class DescribeMeterRtcFlowUsageResponseBodyRtcFlowUsageVoList extends TeaModel {
        @NameInMap("AnchorFlowValue")
        public Float anchorFlowValue;

        @NameInMap("AudienceFlowValue")
        public Float audienceFlowValue;

        @NameInMap("FlowValue")
        public Float flowValue;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeMeterRtcFlowUsageResponseBodyRtcFlowUsageVoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterRtcFlowUsageResponseBodyRtcFlowUsageVoList self = new DescribeMeterRtcFlowUsageResponseBodyRtcFlowUsageVoList();
            return TeaModel.build(map, self);
        }

        public DescribeMeterRtcFlowUsageResponseBodyRtcFlowUsageVoList setAnchorFlowValue(Float anchorFlowValue) {
            this.anchorFlowValue = anchorFlowValue;
            return this;
        }
        public Float getAnchorFlowValue() {
            return this.anchorFlowValue;
        }

        public DescribeMeterRtcFlowUsageResponseBodyRtcFlowUsageVoList setAudienceFlowValue(Float audienceFlowValue) {
            this.audienceFlowValue = audienceFlowValue;
            return this;
        }
        public Float getAudienceFlowValue() {
            return this.audienceFlowValue;
        }

        public DescribeMeterRtcFlowUsageResponseBodyRtcFlowUsageVoList setFlowValue(Float flowValue) {
            this.flowValue = flowValue;
            return this;
        }
        public Float getFlowValue() {
            return this.flowValue;
        }

        public DescribeMeterRtcFlowUsageResponseBodyRtcFlowUsageVoList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
