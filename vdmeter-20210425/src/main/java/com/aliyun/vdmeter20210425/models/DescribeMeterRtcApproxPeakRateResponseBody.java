// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcApproxPeakRateResponseBody extends TeaModel {
    @NameInMap("ApproxPeakRate")
    public Float approxPeakRate;

    @NameInMap("ApproxPeakTs")
    public Long approxPeakTs;

    @NameInMap("PeakRateVoList")
    public java.util.List<DescribeMeterRtcApproxPeakRateResponseBodyPeakRateVoList> peakRateVoList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterRtcApproxPeakRateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcApproxPeakRateResponseBody self = new DescribeMeterRtcApproxPeakRateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcApproxPeakRateResponseBody setApproxPeakRate(Float approxPeakRate) {
        this.approxPeakRate = approxPeakRate;
        return this;
    }
    public Float getApproxPeakRate() {
        return this.approxPeakRate;
    }

    public DescribeMeterRtcApproxPeakRateResponseBody setApproxPeakTs(Long approxPeakTs) {
        this.approxPeakTs = approxPeakTs;
        return this;
    }
    public Long getApproxPeakTs() {
        return this.approxPeakTs;
    }

    public DescribeMeterRtcApproxPeakRateResponseBody setPeakRateVoList(java.util.List<DescribeMeterRtcApproxPeakRateResponseBodyPeakRateVoList> peakRateVoList) {
        this.peakRateVoList = peakRateVoList;
        return this;
    }
    public java.util.List<DescribeMeterRtcApproxPeakRateResponseBodyPeakRateVoList> getPeakRateVoList() {
        return this.peakRateVoList;
    }

    public DescribeMeterRtcApproxPeakRateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterRtcApproxPeakRateResponseBodyPeakRateVoList extends TeaModel {
        @NameInMap("PeakRate")
        public Float peakRate;

        @NameInMap("PeakTs")
        public Long peakTs;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeMeterRtcApproxPeakRateResponseBodyPeakRateVoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterRtcApproxPeakRateResponseBodyPeakRateVoList self = new DescribeMeterRtcApproxPeakRateResponseBodyPeakRateVoList();
            return TeaModel.build(map, self);
        }

        public DescribeMeterRtcApproxPeakRateResponseBodyPeakRateVoList setPeakRate(Float peakRate) {
            this.peakRate = peakRate;
            return this;
        }
        public Float getPeakRate() {
            return this.peakRate;
        }

        public DescribeMeterRtcApproxPeakRateResponseBodyPeakRateVoList setPeakTs(Long peakTs) {
            this.peakTs = peakTs;
            return this;
        }
        public Long getPeakTs() {
            return this.peakTs;
        }

        public DescribeMeterRtcApproxPeakRateResponseBodyPeakRateVoList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
