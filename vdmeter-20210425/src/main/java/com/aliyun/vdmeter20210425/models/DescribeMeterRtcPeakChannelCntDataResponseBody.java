// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcPeakChannelCntDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterRtcPeakChannelCntDataResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterRtcPeakChannelCntDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcPeakChannelCntDataResponseBody self = new DescribeMeterRtcPeakChannelCntDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcPeakChannelCntDataResponseBody setData(java.util.List<DescribeMeterRtcPeakChannelCntDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterRtcPeakChannelCntDataResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterRtcPeakChannelCntDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterRtcPeakChannelCntDataResponseBodyData extends TeaModel {
        @NameInMap("ActiveChannelPeak")
        public Long activeChannelPeak;

        @NameInMap("ActiveChannelPeakTime")
        public Long activeChannelPeakTime;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeMeterRtcPeakChannelCntDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterRtcPeakChannelCntDataResponseBodyData self = new DescribeMeterRtcPeakChannelCntDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterRtcPeakChannelCntDataResponseBodyData setActiveChannelPeak(Long activeChannelPeak) {
            this.activeChannelPeak = activeChannelPeak;
            return this;
        }
        public Long getActiveChannelPeak() {
            return this.activeChannelPeak;
        }

        public DescribeMeterRtcPeakChannelCntDataResponseBodyData setActiveChannelPeakTime(Long activeChannelPeakTime) {
            this.activeChannelPeakTime = activeChannelPeakTime;
            return this;
        }
        public Long getActiveChannelPeakTime() {
            return this.activeChannelPeakTime;
        }

        public DescribeMeterRtcPeakChannelCntDataResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
