// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeQualityDistributionStatDataResponseBody extends TeaModel {
    @NameInMap("QualityStatDataList")
    public java.util.List<DescribeQualityDistributionStatDataResponseBodyQualityStatDataList> qualityStatDataList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeQualityDistributionStatDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualityDistributionStatDataResponseBody self = new DescribeQualityDistributionStatDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQualityDistributionStatDataResponseBody setQualityStatDataList(java.util.List<DescribeQualityDistributionStatDataResponseBodyQualityStatDataList> qualityStatDataList) {
        this.qualityStatDataList = qualityStatDataList;
        return this;
    }
    public java.util.List<DescribeQualityDistributionStatDataResponseBodyQualityStatDataList> getQualityStatDataList() {
        return this.qualityStatDataList;
    }

    public DescribeQualityDistributionStatDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeQualityDistributionStatDataResponseBodyQualityStatDataList extends TeaModel {
        @NameInMap("AudioDelay")
        public Long audioDelay;

        @NameInMap("AudioHighQualityTransmissionRate")
        public String audioHighQualityTransmissionRate;

        @NameInMap("AudioStuckRate")
        public String audioStuckRate;

        @NameInMap("CallDurationRatio")
        public String callDurationRatio;

        @NameInMap("JoinChannelSucFiveSecRate")
        public String joinChannelSucFiveSecRate;

        @NameInMap("JoinChannelSucRate")
        public String joinChannelSucRate;

        @NameInMap("Name")
        public String name;

        @NameInMap("VideoDelay")
        public Long videoDelay;

        @NameInMap("VideoFirstPicDuration")
        public Long videoFirstPicDuration;

        @NameInMap("VideoHighQualityTransmissionRate")
        public String videoHighQualityTransmissionRate;

        @NameInMap("VideoStuckRate")
        public String videoStuckRate;

        public static DescribeQualityDistributionStatDataResponseBodyQualityStatDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeQualityDistributionStatDataResponseBodyQualityStatDataList self = new DescribeQualityDistributionStatDataResponseBodyQualityStatDataList();
            return TeaModel.build(map, self);
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setAudioDelay(Long audioDelay) {
            this.audioDelay = audioDelay;
            return this;
        }
        public Long getAudioDelay() {
            return this.audioDelay;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setAudioHighQualityTransmissionRate(String audioHighQualityTransmissionRate) {
            this.audioHighQualityTransmissionRate = audioHighQualityTransmissionRate;
            return this;
        }
        public String getAudioHighQualityTransmissionRate() {
            return this.audioHighQualityTransmissionRate;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setAudioStuckRate(String audioStuckRate) {
            this.audioStuckRate = audioStuckRate;
            return this;
        }
        public String getAudioStuckRate() {
            return this.audioStuckRate;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setCallDurationRatio(String callDurationRatio) {
            this.callDurationRatio = callDurationRatio;
            return this;
        }
        public String getCallDurationRatio() {
            return this.callDurationRatio;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setJoinChannelSucFiveSecRate(String joinChannelSucFiveSecRate) {
            this.joinChannelSucFiveSecRate = joinChannelSucFiveSecRate;
            return this;
        }
        public String getJoinChannelSucFiveSecRate() {
            return this.joinChannelSucFiveSecRate;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setJoinChannelSucRate(String joinChannelSucRate) {
            this.joinChannelSucRate = joinChannelSucRate;
            return this;
        }
        public String getJoinChannelSucRate() {
            return this.joinChannelSucRate;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setVideoDelay(Long videoDelay) {
            this.videoDelay = videoDelay;
            return this;
        }
        public Long getVideoDelay() {
            return this.videoDelay;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setVideoFirstPicDuration(Long videoFirstPicDuration) {
            this.videoFirstPicDuration = videoFirstPicDuration;
            return this;
        }
        public Long getVideoFirstPicDuration() {
            return this.videoFirstPicDuration;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setVideoHighQualityTransmissionRate(String videoHighQualityTransmissionRate) {
            this.videoHighQualityTransmissionRate = videoHighQualityTransmissionRate;
            return this;
        }
        public String getVideoHighQualityTransmissionRate() {
            return this.videoHighQualityTransmissionRate;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setVideoStuckRate(String videoStuckRate) {
            this.videoStuckRate = videoStuckRate;
            return this;
        }
        public String getVideoStuckRate() {
            return this.videoStuckRate;
        }

    }

}
