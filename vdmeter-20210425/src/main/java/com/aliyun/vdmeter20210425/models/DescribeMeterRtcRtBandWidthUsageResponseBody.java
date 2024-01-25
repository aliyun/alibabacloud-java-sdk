// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcRtBandWidthUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterRtcRtBandWidthUsageResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterRtcRtBandWidthUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcRtBandWidthUsageResponseBody self = new DescribeMeterRtcRtBandWidthUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcRtBandWidthUsageResponseBody setData(java.util.List<DescribeMeterRtcRtBandWidthUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterRtcRtBandWidthUsageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterRtcRtBandWidthUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterRtcRtBandWidthUsageResponseBodyData extends TeaModel {
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

        public static DescribeMeterRtcRtBandWidthUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterRtcRtBandWidthUsageResponseBodyData self = new DescribeMeterRtcRtBandWidthUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterRtcRtBandWidthUsageResponseBodyData setAnchorPeakRate(Float anchorPeakRate) {
            this.anchorPeakRate = anchorPeakRate;
            return this;
        }
        public Float getAnchorPeakRate() {
            return this.anchorPeakRate;
        }

        public DescribeMeterRtcRtBandWidthUsageResponseBodyData setAnchorPeakTs(Long anchorPeakTs) {
            this.anchorPeakTs = anchorPeakTs;
            return this;
        }
        public Long getAnchorPeakTs() {
            return this.anchorPeakTs;
        }

        public DescribeMeterRtcRtBandWidthUsageResponseBodyData setAudiencePeakRate(Float audiencePeakRate) {
            this.audiencePeakRate = audiencePeakRate;
            return this;
        }
        public Float getAudiencePeakRate() {
            return this.audiencePeakRate;
        }

        public DescribeMeterRtcRtBandWidthUsageResponseBodyData setAudiencePeakTs(Long audiencePeakTs) {
            this.audiencePeakTs = audiencePeakTs;
            return this;
        }
        public Long getAudiencePeakTs() {
            return this.audiencePeakTs;
        }

        public DescribeMeterRtcRtBandWidthUsageResponseBodyData setPeakRate(Float peakRate) {
            this.peakRate = peakRate;
            return this;
        }
        public Float getPeakRate() {
            return this.peakRate;
        }

        public DescribeMeterRtcRtBandWidthUsageResponseBodyData setPeakTs(Long peakTs) {
            this.peakTs = peakTs;
            return this;
        }
        public Long getPeakTs() {
            return this.peakTs;
        }

        public DescribeMeterRtcRtBandWidthUsageResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
