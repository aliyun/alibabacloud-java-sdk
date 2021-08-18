// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeQualityDistributionStatDataResponseBody extends TeaModel {
    // 分布数据列表
    @NameInMap("QualityStatDataList")
    public java.util.List<DescribeQualityDistributionStatDataResponseBodyQualityStatDataList> qualityStatDataList;

    // 请求ID
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
        // 统计名称， 当StatDim=CHANNEL_ONLINE： ONE_TO_FIVE：1-5人 SIX_TO_TEN：6-10人 ELEVEN_TO_TWENTY：11-20人 TWENTY_ONE_TO_FIFTY: 21-50人 ABOVE_FIFTY：50人以上  当StatDim=NETWORK： WiFi，4G等  当StatDim=OS： iOS、android等
        @NameInMap("Name")
        public String name;

        // 通话时长用量占比，四位小数表示，如1.0000
        @NameInMap("CallDurationRatio")
        public String callDurationRatio;

        // 加入频道成功率， 四位小数表示，如1.0000
        @NameInMap("JoinChannelSucRate")
        public String joinChannelSucRate;

        // 5秒加入频道成功率， 四位小数表示，如1.0000
        @NameInMap("JoinChannelSucFiveSecRate")
        public String joinChannelSucFiveSecRate;

        // 音频首次出声时间，单位毫秒
        @NameInMap("AudioSpeakOutDuration")
        public Long audioSpeakOutDuration;

        // 视频首次出图时间，单位毫秒
        @NameInMap("VideoFirstPicDuration")
        public Long videoFirstPicDuration;

        // 音频卡顿率， 四位小数表示，如0.0034
        @NameInMap("AudioStuckRate")
        public String audioStuckRate;

        // 视频卡顿率， 四位小数表示，如0.0038
        @NameInMap("VideoStuckRate")
        public String videoStuckRate;

        // 音频延时，单位毫秒
        @NameInMap("AudioDelay")
        public Long audioDelay;

        // 视频延时，单位毫秒
        @NameInMap("VideoDelay")
        public Long videoDelay;

        // 音频优质传输率， 四位小数表示，如0.9927
        @NameInMap("AudioHighQualityTransmissionRate")
        public String audioHighQualityTransmissionRate;

        // 视频优质传输率，四位小数表示，如0.9965
        @NameInMap("VideoHighQualityTransmissionRate")
        public String videoHighQualityTransmissionRate;

        public static DescribeQualityDistributionStatDataResponseBodyQualityStatDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeQualityDistributionStatDataResponseBodyQualityStatDataList self = new DescribeQualityDistributionStatDataResponseBodyQualityStatDataList();
            return TeaModel.build(map, self);
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setCallDurationRatio(String callDurationRatio) {
            this.callDurationRatio = callDurationRatio;
            return this;
        }
        public String getCallDurationRatio() {
            return this.callDurationRatio;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setJoinChannelSucRate(String joinChannelSucRate) {
            this.joinChannelSucRate = joinChannelSucRate;
            return this;
        }
        public String getJoinChannelSucRate() {
            return this.joinChannelSucRate;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setJoinChannelSucFiveSecRate(String joinChannelSucFiveSecRate) {
            this.joinChannelSucFiveSecRate = joinChannelSucFiveSecRate;
            return this;
        }
        public String getJoinChannelSucFiveSecRate() {
            return this.joinChannelSucFiveSecRate;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setAudioSpeakOutDuration(Long audioSpeakOutDuration) {
            this.audioSpeakOutDuration = audioSpeakOutDuration;
            return this;
        }
        public Long getAudioSpeakOutDuration() {
            return this.audioSpeakOutDuration;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setVideoFirstPicDuration(Long videoFirstPicDuration) {
            this.videoFirstPicDuration = videoFirstPicDuration;
            return this;
        }
        public Long getVideoFirstPicDuration() {
            return this.videoFirstPicDuration;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setAudioStuckRate(String audioStuckRate) {
            this.audioStuckRate = audioStuckRate;
            return this;
        }
        public String getAudioStuckRate() {
            return this.audioStuckRate;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setVideoStuckRate(String videoStuckRate) {
            this.videoStuckRate = videoStuckRate;
            return this;
        }
        public String getVideoStuckRate() {
            return this.videoStuckRate;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setAudioDelay(Long audioDelay) {
            this.audioDelay = audioDelay;
            return this;
        }
        public Long getAudioDelay() {
            return this.audioDelay;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setVideoDelay(Long videoDelay) {
            this.videoDelay = videoDelay;
            return this;
        }
        public Long getVideoDelay() {
            return this.videoDelay;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setAudioHighQualityTransmissionRate(String audioHighQualityTransmissionRate) {
            this.audioHighQualityTransmissionRate = audioHighQualityTransmissionRate;
            return this;
        }
        public String getAudioHighQualityTransmissionRate() {
            return this.audioHighQualityTransmissionRate;
        }

        public DescribeQualityDistributionStatDataResponseBodyQualityStatDataList setVideoHighQualityTransmissionRate(String videoHighQualityTransmissionRate) {
            this.videoHighQualityTransmissionRate = videoHighQualityTransmissionRate;
            return this;
        }
        public String getVideoHighQualityTransmissionRate() {
            return this.videoHighQualityTransmissionRate;
        }

    }

}
