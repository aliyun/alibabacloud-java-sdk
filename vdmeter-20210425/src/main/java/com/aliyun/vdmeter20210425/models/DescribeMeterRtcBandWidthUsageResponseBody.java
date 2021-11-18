// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcBandWidthUsageResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RtcBandWidthUsageVoList")
    public java.util.List<DescribeMeterRtcBandWidthUsageResponseBodyRtcBandWidthUsageVoList> rtcBandWidthUsageVoList;

    public static DescribeMeterRtcBandWidthUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcBandWidthUsageResponseBody self = new DescribeMeterRtcBandWidthUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcBandWidthUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMeterRtcBandWidthUsageResponseBody setRtcBandWidthUsageVoList(java.util.List<DescribeMeterRtcBandWidthUsageResponseBodyRtcBandWidthUsageVoList> rtcBandWidthUsageVoList) {
        this.rtcBandWidthUsageVoList = rtcBandWidthUsageVoList;
        return this;
    }
    public java.util.List<DescribeMeterRtcBandWidthUsageResponseBodyRtcBandWidthUsageVoList> getRtcBandWidthUsageVoList() {
        return this.rtcBandWidthUsageVoList;
    }

    public static class DescribeMeterRtcBandWidthUsageResponseBodyRtcBandWidthUsageVoList extends TeaModel {
        @NameInMap("AnchorPeakRate")
        public Float anchorPeakRate;

        @NameInMap("AnchorPeakTs")
        public Long anchorPeakTs;

        @NameInMap("AudiencePeakRate")
        public Float audiencePeakRate;

        @NameInMap("AudiencePeakTs")
        public Long audiencePeakTs;

        @NameInMap("PeakRate")
        public Float peakRate;

        @NameInMap("PeakTs")
        public Long peakTs;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeMeterRtcBandWidthUsageResponseBodyRtcBandWidthUsageVoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterRtcBandWidthUsageResponseBodyRtcBandWidthUsageVoList self = new DescribeMeterRtcBandWidthUsageResponseBodyRtcBandWidthUsageVoList();
            return TeaModel.build(map, self);
        }

        public DescribeMeterRtcBandWidthUsageResponseBodyRtcBandWidthUsageVoList setAnchorPeakRate(Float anchorPeakRate) {
            this.anchorPeakRate = anchorPeakRate;
            return this;
        }
        public Float getAnchorPeakRate() {
            return this.anchorPeakRate;
        }

        public DescribeMeterRtcBandWidthUsageResponseBodyRtcBandWidthUsageVoList setAnchorPeakTs(Long anchorPeakTs) {
            this.anchorPeakTs = anchorPeakTs;
            return this;
        }
        public Long getAnchorPeakTs() {
            return this.anchorPeakTs;
        }

        public DescribeMeterRtcBandWidthUsageResponseBodyRtcBandWidthUsageVoList setAudiencePeakRate(Float audiencePeakRate) {
            this.audiencePeakRate = audiencePeakRate;
            return this;
        }
        public Float getAudiencePeakRate() {
            return this.audiencePeakRate;
        }

        public DescribeMeterRtcBandWidthUsageResponseBodyRtcBandWidthUsageVoList setAudiencePeakTs(Long audiencePeakTs) {
            this.audiencePeakTs = audiencePeakTs;
            return this;
        }
        public Long getAudiencePeakTs() {
            return this.audiencePeakTs;
        }

        public DescribeMeterRtcBandWidthUsageResponseBodyRtcBandWidthUsageVoList setPeakRate(Float peakRate) {
            this.peakRate = peakRate;
            return this;
        }
        public Float getPeakRate() {
            return this.peakRate;
        }

        public DescribeMeterRtcBandWidthUsageResponseBodyRtcBandWidthUsageVoList setPeakTs(Long peakTs) {
            this.peakTs = peakTs;
            return this;
        }
        public Long getPeakTs() {
            return this.peakTs;
        }

        public DescribeMeterRtcBandWidthUsageResponseBodyRtcBandWidthUsageVoList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
