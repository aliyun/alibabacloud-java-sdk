// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcDurationDataResponseBody extends TeaModel {
    @NameInMap("DurationDataPerInterval")
    public DescribeRtcDurationDataResponseBodyDurationDataPerInterval durationDataPerInterval;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRtcDurationDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcDurationDataResponseBody self = new DescribeRtcDurationDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcDurationDataResponseBody setDurationDataPerInterval(DescribeRtcDurationDataResponseBodyDurationDataPerInterval durationDataPerInterval) {
        this.durationDataPerInterval = durationDataPerInterval;
        return this;
    }
    public DescribeRtcDurationDataResponseBodyDurationDataPerInterval getDurationDataPerInterval() {
        return this.durationDataPerInterval;
    }

    public DescribeRtcDurationDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRtcDurationDataResponseBodyDurationDataPerIntervalDurationModule extends TeaModel {
        @NameInMap("AudioDuration")
        public Long audioDuration;

        @NameInMap("ContentDuration")
        public Long contentDuration;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("TotalDuration")
        public Long totalDuration;

        @NameInMap("V1080Duration")
        public Long v1080Duration;

        @NameInMap("V360Duration")
        public Long v360Duration;

        @NameInMap("V720Duration")
        public Long v720Duration;

        public static DescribeRtcDurationDataResponseBodyDurationDataPerIntervalDurationModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcDurationDataResponseBodyDurationDataPerIntervalDurationModule self = new DescribeRtcDurationDataResponseBodyDurationDataPerIntervalDurationModule();
            return TeaModel.build(map, self);
        }

        public DescribeRtcDurationDataResponseBodyDurationDataPerIntervalDurationModule setAudioDuration(Long audioDuration) {
            this.audioDuration = audioDuration;
            return this;
        }
        public Long getAudioDuration() {
            return this.audioDuration;
        }

        public DescribeRtcDurationDataResponseBodyDurationDataPerIntervalDurationModule setContentDuration(Long contentDuration) {
            this.contentDuration = contentDuration;
            return this;
        }
        public Long getContentDuration() {
            return this.contentDuration;
        }

        public DescribeRtcDurationDataResponseBodyDurationDataPerIntervalDurationModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeRtcDurationDataResponseBodyDurationDataPerIntervalDurationModule setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public DescribeRtcDurationDataResponseBodyDurationDataPerIntervalDurationModule setV1080Duration(Long v1080Duration) {
            this.v1080Duration = v1080Duration;
            return this;
        }
        public Long getV1080Duration() {
            return this.v1080Duration;
        }

        public DescribeRtcDurationDataResponseBodyDurationDataPerIntervalDurationModule setV360Duration(Long v360Duration) {
            this.v360Duration = v360Duration;
            return this;
        }
        public Long getV360Duration() {
            return this.v360Duration;
        }

        public DescribeRtcDurationDataResponseBodyDurationDataPerIntervalDurationModule setV720Duration(Long v720Duration) {
            this.v720Duration = v720Duration;
            return this;
        }
        public Long getV720Duration() {
            return this.v720Duration;
        }

    }

    public static class DescribeRtcDurationDataResponseBodyDurationDataPerInterval extends TeaModel {
        @NameInMap("DurationModule")
        public java.util.List<DescribeRtcDurationDataResponseBodyDurationDataPerIntervalDurationModule> durationModule;

        public static DescribeRtcDurationDataResponseBodyDurationDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcDurationDataResponseBodyDurationDataPerInterval self = new DescribeRtcDurationDataResponseBodyDurationDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeRtcDurationDataResponseBodyDurationDataPerInterval setDurationModule(java.util.List<DescribeRtcDurationDataResponseBodyDurationDataPerIntervalDurationModule> durationModule) {
            this.durationModule = durationModule;
            return this;
        }
        public java.util.List<DescribeRtcDurationDataResponseBodyDurationDataPerIntervalDurationModule> getDurationModule() {
            return this.durationModule;
        }

    }

}
