// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelMetricResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ChannelMetricInfo")
    public DescribeRtcChannelMetricResponseBodyChannelMetricInfo channelMetricInfo;

    public static DescribeRtcChannelMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelMetricResponseBody self = new DescribeRtcChannelMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcChannelMetricResponseBody setChannelMetricInfo(DescribeRtcChannelMetricResponseBodyChannelMetricInfo channelMetricInfo) {
        this.channelMetricInfo = channelMetricInfo;
        return this;
    }
    public DescribeRtcChannelMetricResponseBodyChannelMetricInfo getChannelMetricInfo() {
        return this.channelMetricInfo;
    }

    public static class DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration extends TeaModel {
        @NameInMap("Video720")
        public Integer video720;

        @NameInMap("Video1080")
        public Integer video1080;

        @NameInMap("Video360")
        public Integer video360;

        @NameInMap("Content")
        public Integer content;

        @NameInMap("Audio")
        public Integer audio;

        public static DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration self = new DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration setVideo720(Integer video720) {
            this.video720 = video720;
            return this;
        }
        public Integer getVideo720() {
            return this.video720;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration setVideo1080(Integer video1080) {
            this.video1080 = video1080;
            return this;
        }
        public Integer getVideo1080() {
            return this.video1080;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration setVideo360(Integer video360) {
            this.video360 = video360;
            return this;
        }
        public Integer getVideo360() {
            return this.video360;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration setContent(Integer content) {
            this.content = content;
            return this;
        }
        public Integer getContent() {
            return this.content;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration setAudio(Integer audio) {
            this.audio = audio;
            return this;
        }
        public Integer getAudio() {
            return this.audio;
        }

    }

    public static class DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration extends TeaModel {
        @NameInMap("Video720")
        public Integer video720;

        @NameInMap("Video1080")
        public Integer video1080;

        @NameInMap("Video360")
        public Integer video360;

        @NameInMap("Content")
        public Integer content;

        @NameInMap("Audio")
        public Integer audio;

        public static DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration self = new DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration setVideo720(Integer video720) {
            this.video720 = video720;
            return this;
        }
        public Integer getVideo720() {
            return this.video720;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration setVideo1080(Integer video1080) {
            this.video1080 = video1080;
            return this;
        }
        public Integer getVideo1080() {
            return this.video1080;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration setVideo360(Integer video360) {
            this.video360 = video360;
            return this;
        }
        public Integer getVideo360() {
            return this.video360;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration setContent(Integer content) {
            this.content = content;
            return this;
        }
        public Integer getContent() {
            return this.content;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration setAudio(Integer audio) {
            this.audio = audio;
            return this;
        }
        public Integer getAudio() {
            return this.audio;
        }

    }

    public static class DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration extends TeaModel {
        @NameInMap("SubDuration")
        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration subDuration;

        @NameInMap("PubDuration")
        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration pubDuration;

        public static DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration self = new DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration setSubDuration(DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration subDuration) {
            this.subDuration = subDuration;
            return this;
        }
        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration getSubDuration() {
            return this.subDuration;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration setPubDuration(DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration pubDuration) {
            this.pubDuration = pubDuration;
            return this;
        }
        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration getPubDuration() {
            return this.pubDuration;
        }

    }

    public static class DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("SubUserCount")
        public Integer subUserCount;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("UserCount")
        public Integer userCount;

        @NameInMap("PubUserCount")
        public Integer pubUserCount;

        public static DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric self = new DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric setSubUserCount(Integer subUserCount) {
            this.subUserCount = subUserCount;
            return this;
        }
        public Integer getSubUserCount() {
            return this.subUserCount;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric setPubUserCount(Integer pubUserCount) {
            this.pubUserCount = pubUserCount;
            return this;
        }
        public Integer getPubUserCount() {
            return this.pubUserCount;
        }

    }

    public static class DescribeRtcChannelMetricResponseBodyChannelMetricInfo extends TeaModel {
        @NameInMap("Duration")
        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration duration;

        @NameInMap("ChannelMetric")
        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric channelMetric;

        public static DescribeRtcChannelMetricResponseBodyChannelMetricInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelMetricResponseBodyChannelMetricInfo self = new DescribeRtcChannelMetricResponseBodyChannelMetricInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfo setDuration(DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration duration) {
            this.duration = duration;
            return this;
        }
        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration getDuration() {
            return this.duration;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfo setChannelMetric(DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric channelMetric) {
            this.channelMetric = channelMetric;
            return this;
        }
        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric getChannelMetric() {
            return this.channelMetric;
        }

    }

}
