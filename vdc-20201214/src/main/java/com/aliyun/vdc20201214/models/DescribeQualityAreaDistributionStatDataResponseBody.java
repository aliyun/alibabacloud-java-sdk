// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeQualityAreaDistributionStatDataResponseBody extends TeaModel {
    // 质量分布数据列表
    @NameInMap("QualityStatDataList")
    public java.util.List<DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList> qualityStatDataList;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeQualityAreaDistributionStatDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualityAreaDistributionStatDataResponseBody self = new DescribeQualityAreaDistributionStatDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQualityAreaDistributionStatDataResponseBody setQualityStatDataList(java.util.List<DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList> qualityStatDataList) {
        this.qualityStatDataList = qualityStatDataList;
        return this;
    }
    public java.util.List<DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList> getQualityStatDataList() {
        return this.qualityStatDataList;
    }

    public DescribeQualityAreaDistributionStatDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList extends TeaModel {
        // 音频延时，单位毫秒
        @NameInMap("AudioDelay")
        public Long audioDelay;

        // 音频优质传输率， 四位小数表示，如0.9927
        @NameInMap("AudioHighQualityTransmissionRate")
        public String audioHighQualityTransmissionRate;

        // 音频首次出声时间，单位毫秒
        @NameInMap("AudioSpeakOutDuration")
        public Long audioSpeakOutDuration;

        // 音频卡顿率， 四位小数表示，如0.0034
        @NameInMap("AudioStuckRate")
        public String audioStuckRate;

        // 通话时长用量占比，四位小数表示，如1.0000
        @NameInMap("CallDurationRatio")
        public String callDurationRatio;

        // 5秒加入频道成功率， 四位小数表示，如1.0000
        @NameInMap("JoinChannelSucFiveSecRate")
        public String joinChannelSucFiveSecRate;

        // 加入频道成功率， 四位小数表示，如1.0000
        @NameInMap("JoinChannelSucRate")
        public String joinChannelSucRate;

        // 区域名称，如广东省
        @NameInMap("Name")
        public String name;

        // 视频延时，单位毫秒
        @NameInMap("VideoDelay")
        public Long videoDelay;

        // 视频首次出图时间，单位毫秒
        @NameInMap("VideoFirstPicDuration")
        public Long videoFirstPicDuration;

        // 视频优质传输率，四位小数表示，如0.9965
        @NameInMap("VideoHighQualityTransmissionRate")
        public String videoHighQualityTransmissionRate;

        // 视频卡顿率， 四位小数表示，如0.0038
        @NameInMap("VideoStuckRate")
        public String videoStuckRate;

        public static DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList self = new DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList();
            return TeaModel.build(map, self);
        }

        public DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList setAudioDelay(Long audioDelay) {
            this.audioDelay = audioDelay;
            return this;
        }
        public Long getAudioDelay() {
            return this.audioDelay;
        }

        public DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList setAudioHighQualityTransmissionRate(String audioHighQualityTransmissionRate) {
            this.audioHighQualityTransmissionRate = audioHighQualityTransmissionRate;
            return this;
        }
        public String getAudioHighQualityTransmissionRate() {
            return this.audioHighQualityTransmissionRate;
        }

        public DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList setAudioSpeakOutDuration(Long audioSpeakOutDuration) {
            this.audioSpeakOutDuration = audioSpeakOutDuration;
            return this;
        }
        public Long getAudioSpeakOutDuration() {
            return this.audioSpeakOutDuration;
        }

        public DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList setAudioStuckRate(String audioStuckRate) {
            this.audioStuckRate = audioStuckRate;
            return this;
        }
        public String getAudioStuckRate() {
            return this.audioStuckRate;
        }

        public DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList setCallDurationRatio(String callDurationRatio) {
            this.callDurationRatio = callDurationRatio;
            return this;
        }
        public String getCallDurationRatio() {
            return this.callDurationRatio;
        }

        public DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList setJoinChannelSucFiveSecRate(String joinChannelSucFiveSecRate) {
            this.joinChannelSucFiveSecRate = joinChannelSucFiveSecRate;
            return this;
        }
        public String getJoinChannelSucFiveSecRate() {
            return this.joinChannelSucFiveSecRate;
        }

        public DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList setJoinChannelSucRate(String joinChannelSucRate) {
            this.joinChannelSucRate = joinChannelSucRate;
            return this;
        }
        public String getJoinChannelSucRate() {
            return this.joinChannelSucRate;
        }

        public DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList setVideoDelay(Long videoDelay) {
            this.videoDelay = videoDelay;
            return this;
        }
        public Long getVideoDelay() {
            return this.videoDelay;
        }

        public DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList setVideoFirstPicDuration(Long videoFirstPicDuration) {
            this.videoFirstPicDuration = videoFirstPicDuration;
            return this;
        }
        public Long getVideoFirstPicDuration() {
            return this.videoFirstPicDuration;
        }

        public DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList setVideoHighQualityTransmissionRate(String videoHighQualityTransmissionRate) {
            this.videoHighQualityTransmissionRate = videoHighQualityTransmissionRate;
            return this;
        }
        public String getVideoHighQualityTransmissionRate() {
            return this.videoHighQualityTransmissionRate;
        }

        public DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList setVideoStuckRate(String videoStuckRate) {
            this.videoStuckRate = videoStuckRate;
            return this;
        }
        public String getVideoStuckRate() {
            return this.videoStuckRate;
        }

    }

}
