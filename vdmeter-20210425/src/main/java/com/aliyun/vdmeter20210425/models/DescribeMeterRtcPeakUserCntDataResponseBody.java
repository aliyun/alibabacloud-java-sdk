// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcPeakUserCntDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterRtcPeakUserCntDataResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterRtcPeakUserCntDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcPeakUserCntDataResponseBody self = new DescribeMeterRtcPeakUserCntDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcPeakUserCntDataResponseBody setData(java.util.List<DescribeMeterRtcPeakUserCntDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterRtcPeakUserCntDataResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterRtcPeakUserCntDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterRtcPeakUserCntDataResponseBodyData extends TeaModel {
        @NameInMap("ActiveUserPeak")
        public Long activeUserPeak;

        @NameInMap("ActiveUserPeakTime")
        public Long activeUserPeakTime;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeMeterRtcPeakUserCntDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterRtcPeakUserCntDataResponseBodyData self = new DescribeMeterRtcPeakUserCntDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterRtcPeakUserCntDataResponseBodyData setActiveUserPeak(Long activeUserPeak) {
            this.activeUserPeak = activeUserPeak;
            return this;
        }
        public Long getActiveUserPeak() {
            return this.activeUserPeak;
        }

        public DescribeMeterRtcPeakUserCntDataResponseBodyData setActiveUserPeakTime(Long activeUserPeakTime) {
            this.activeUserPeakTime = activeUserPeakTime;
            return this;
        }
        public Long getActiveUserPeakTime() {
            return this.activeUserPeakTime;
        }

        public DescribeMeterRtcPeakUserCntDataResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
