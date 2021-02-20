// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcPeakUserCntDataResponseBody extends TeaModel {
    @NameInMap("PeakUserCntDataPerInterval")
    public DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerInterval peakUserCntDataPerInterval;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRtcPeakUserCntDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcPeakUserCntDataResponseBody self = new DescribeRtcPeakUserCntDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcPeakUserCntDataResponseBody setPeakUserCntDataPerInterval(DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerInterval peakUserCntDataPerInterval) {
        this.peakUserCntDataPerInterval = peakUserCntDataPerInterval;
        return this;
    }
    public DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerInterval getPeakUserCntDataPerInterval() {
        return this.peakUserCntDataPerInterval;
    }

    public DescribeRtcPeakUserCntDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerIntervalPeakUserCntModule extends TeaModel {
        @NameInMap("ActiveUserPeakTime")
        public String activeUserPeakTime;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("ActiveUserPeak")
        public Long activeUserPeak;

        public static DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerIntervalPeakUserCntModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerIntervalPeakUserCntModule self = new DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerIntervalPeakUserCntModule();
            return TeaModel.build(map, self);
        }

        public DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerIntervalPeakUserCntModule setActiveUserPeakTime(String activeUserPeakTime) {
            this.activeUserPeakTime = activeUserPeakTime;
            return this;
        }
        public String getActiveUserPeakTime() {
            return this.activeUserPeakTime;
        }

        public DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerIntervalPeakUserCntModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerIntervalPeakUserCntModule setActiveUserPeak(Long activeUserPeak) {
            this.activeUserPeak = activeUserPeak;
            return this;
        }
        public Long getActiveUserPeak() {
            return this.activeUserPeak;
        }

    }

    public static class DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerInterval extends TeaModel {
        @NameInMap("PeakUserCntModule")
        public java.util.List<DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerIntervalPeakUserCntModule> peakUserCntModule;

        public static DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerInterval self = new DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerInterval setPeakUserCntModule(java.util.List<DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerIntervalPeakUserCntModule> peakUserCntModule) {
            this.peakUserCntModule = peakUserCntModule;
            return this;
        }
        public java.util.List<DescribeRtcPeakUserCntDataResponseBodyPeakUserCntDataPerIntervalPeakUserCntModule> getPeakUserCntModule() {
            return this.peakUserCntModule;
        }

    }

}
