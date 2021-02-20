// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcScaleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scale")
    public java.util.List<DescribeRtcScaleResponseBodyScale> scale;

    public static DescribeRtcScaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcScaleResponseBody self = new DescribeRtcScaleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcScaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcScaleResponseBody setScale(java.util.List<DescribeRtcScaleResponseBodyScale> scale) {
        this.scale = scale;
        return this;
    }
    public java.util.List<DescribeRtcScaleResponseBodyScale> getScale() {
        return this.scale;
    }

    public static class DescribeRtcScaleResponseBodyScale extends TeaModel {
        @NameInMap("SessionCount")
        public Long sessionCount;

        @NameInMap("Time")
        public String time;

        @NameInMap("ChannelCount")
        public Long channelCount;

        @NameInMap("AudioDuration")
        public Long audioDuration;

        @NameInMap("UserCount")
        public Long userCount;

        @NameInMap("VideoDuration")
        public Long videoDuration;

        public static DescribeRtcScaleResponseBodyScale build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcScaleResponseBodyScale self = new DescribeRtcScaleResponseBodyScale();
            return TeaModel.build(map, self);
        }

        public DescribeRtcScaleResponseBodyScale setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeRtcScaleResponseBodyScale setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeRtcScaleResponseBodyScale setChannelCount(Long channelCount) {
            this.channelCount = channelCount;
            return this;
        }
        public Long getChannelCount() {
            return this.channelCount;
        }

        public DescribeRtcScaleResponseBodyScale setAudioDuration(Long audioDuration) {
            this.audioDuration = audioDuration;
            return this;
        }
        public Long getAudioDuration() {
            return this.audioDuration;
        }

        public DescribeRtcScaleResponseBodyScale setUserCount(Long userCount) {
            this.userCount = userCount;
            return this;
        }
        public Long getUserCount() {
            return this.userCount;
        }

        public DescribeRtcScaleResponseBodyScale setVideoDuration(Long videoDuration) {
            this.videoDuration = videoDuration;
            return this;
        }
        public Long getVideoDuration() {
            return this.videoDuration;
        }

    }

}
