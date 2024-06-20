// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelMetricResponseBody extends TeaModel {
    @NameInMap("ChannelMetricInfo")
    public DescribeRtcChannelMetricResponseBodyChannelMetricInfo channelMetricInfo;

    /**
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRtcChannelMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelMetricResponseBody self = new DescribeRtcChannelMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelMetricResponseBody setChannelMetricInfo(DescribeRtcChannelMetricResponseBodyChannelMetricInfo channelMetricInfo) {
        this.channelMetricInfo = channelMetricInfo;
        return this;
    }
    public DescribeRtcChannelMetricResponseBodyChannelMetricInfo getChannelMetricInfo() {
        return this.channelMetricInfo;
    }

    public DescribeRtcChannelMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example_channel</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>2019-06-06T18:57:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PubUserCount")
        public Integer pubUserCount;

        /**
         * <strong>example:</strong>
         * <p>2019-06-06T17:57:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("SubUserCount")
        public Integer subUserCount;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("UserCount")
        public Integer userCount;

        public static DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric self = new DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric setPubUserCount(Integer pubUserCount) {
            this.pubUserCount = pubUserCount;
            return this;
        }
        public Integer getPubUserCount() {
            return this.pubUserCount;
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

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

    }

    public static class DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Audio")
        public Integer audio;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Content")
        public Integer content;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Video1080")
        public Integer video1080;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Video360")
        public Integer video360;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Video720")
        public Integer video720;

        public static DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration self = new DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration setAudio(Integer audio) {
            this.audio = audio;
            return this;
        }
        public Integer getAudio() {
            return this.audio;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration setContent(Integer content) {
            this.content = content;
            return this;
        }
        public Integer getContent() {
            return this.content;
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

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration setVideo720(Integer video720) {
            this.video720 = video720;
            return this;
        }
        public Integer getVideo720() {
            return this.video720;
        }

    }

    public static class DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Audio")
        public Integer audio;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Content")
        public Integer content;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Video1080")
        public Integer video1080;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Video360")
        public Integer video360;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Video720")
        public Integer video720;

        public static DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration self = new DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration setAudio(Integer audio) {
            this.audio = audio;
            return this;
        }
        public Integer getAudio() {
            return this.audio;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration setContent(Integer content) {
            this.content = content;
            return this;
        }
        public Integer getContent() {
            return this.content;
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

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration setVideo720(Integer video720) {
            this.video720 = video720;
            return this;
        }
        public Integer getVideo720() {
            return this.video720;
        }

    }

    public static class DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration extends TeaModel {
        @NameInMap("PubDuration")
        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration pubDuration;

        @NameInMap("SubDuration")
        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration subDuration;

        public static DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration self = new DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration setPubDuration(DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration pubDuration) {
            this.pubDuration = pubDuration;
            return this;
        }
        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationPubDuration getPubDuration() {
            return this.pubDuration;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration setSubDuration(DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration subDuration) {
            this.subDuration = subDuration;
            return this;
        }
        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDurationSubDuration getSubDuration() {
            return this.subDuration;
        }

    }

    public static class DescribeRtcChannelMetricResponseBodyChannelMetricInfo extends TeaModel {
        @NameInMap("ChannelMetric")
        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric channelMetric;

        @NameInMap("Duration")
        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration duration;

        public static DescribeRtcChannelMetricResponseBodyChannelMetricInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelMetricResponseBodyChannelMetricInfo self = new DescribeRtcChannelMetricResponseBodyChannelMetricInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfo setChannelMetric(DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric channelMetric) {
            this.channelMetric = channelMetric;
            return this;
        }
        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoChannelMetric getChannelMetric() {
            return this.channelMetric;
        }

        public DescribeRtcChannelMetricResponseBodyChannelMetricInfo setDuration(DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration duration) {
            this.duration = duration;
            return this;
        }
        public DescribeRtcChannelMetricResponseBodyChannelMetricInfoDuration getDuration() {
            return this.duration;
        }

    }

}
