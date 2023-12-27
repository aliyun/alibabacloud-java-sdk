// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcPeakChannelCntDataResponseBody extends TeaModel {
    @NameInMap("PeakChannelCntDataPerInterval")
    public DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerInterval peakChannelCntDataPerInterval;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRtcPeakChannelCntDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcPeakChannelCntDataResponseBody self = new DescribeRtcPeakChannelCntDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcPeakChannelCntDataResponseBody setPeakChannelCntDataPerInterval(DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerInterval peakChannelCntDataPerInterval) {
        this.peakChannelCntDataPerInterval = peakChannelCntDataPerInterval;
        return this;
    }
    public DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerInterval getPeakChannelCntDataPerInterval() {
        return this.peakChannelCntDataPerInterval;
    }

    public DescribeRtcPeakChannelCntDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerIntervalPeakChannelCntModule extends TeaModel {
        @NameInMap("ActiveChannelPeak")
        public Long activeChannelPeak;

        @NameInMap("ActiveChannelPeakTime")
        public String activeChannelPeakTime;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerIntervalPeakChannelCntModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerIntervalPeakChannelCntModule self = new DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerIntervalPeakChannelCntModule();
            return TeaModel.build(map, self);
        }

        public DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerIntervalPeakChannelCntModule setActiveChannelPeak(Long activeChannelPeak) {
            this.activeChannelPeak = activeChannelPeak;
            return this;
        }
        public Long getActiveChannelPeak() {
            return this.activeChannelPeak;
        }

        public DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerIntervalPeakChannelCntModule setActiveChannelPeakTime(String activeChannelPeakTime) {
            this.activeChannelPeakTime = activeChannelPeakTime;
            return this;
        }
        public String getActiveChannelPeakTime() {
            return this.activeChannelPeakTime;
        }

        public DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerIntervalPeakChannelCntModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerInterval extends TeaModel {
        @NameInMap("PeakChannelCntModule")
        public java.util.List<DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerIntervalPeakChannelCntModule> peakChannelCntModule;

        public static DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerInterval self = new DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerInterval setPeakChannelCntModule(java.util.List<DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerIntervalPeakChannelCntModule> peakChannelCntModule) {
            this.peakChannelCntModule = peakChannelCntModule;
            return this;
        }
        public java.util.List<DescribeRtcPeakChannelCntDataResponseBodyPeakChannelCntDataPerIntervalPeakChannelCntModule> getPeakChannelCntModule() {
            return this.peakChannelCntModule;
        }

    }

}
