// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeQualityOsSdkVersionDistributionStatDataResponseBody extends TeaModel {
    /**
     * <p>The list of data for operating systems and SDK versions in quality statistics.</p>
     */
    @NameInMap("QualityOsSdkVersionStatDataList")
    public java.util.List<DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList> qualityOsSdkVersionStatDataList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeQualityOsSdkVersionDistributionStatDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualityOsSdkVersionDistributionStatDataResponseBody self = new DescribeQualityOsSdkVersionDistributionStatDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQualityOsSdkVersionDistributionStatDataResponseBody setQualityOsSdkVersionStatDataList(java.util.List<DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList> qualityOsSdkVersionStatDataList) {
        this.qualityOsSdkVersionStatDataList = qualityOsSdkVersionStatDataList;
        return this;
    }
    public java.util.List<DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList> getQualityOsSdkVersionStatDataList() {
        return this.qualityOsSdkVersionStatDataList;
    }

    public DescribeQualityOsSdkVersionDistributionStatDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList extends TeaModel {
        /**
         * <p>The audio delay, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>248</p>
         */
        @NameInMap("AudioDelay")
        public Long audioDelay;

        /**
         * <p>The audio high-quality transmission rate, represented by four decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9987</p>
         */
        @NameInMap("AudioHighQualityTransmissionRate")
        public String audioHighQualityTransmissionRate;

        /**
         * <p>The audio stuttering rate, represented by four decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0011</p>
         */
        @NameInMap("AudioStuckRate")
        public String audioStuckRate;

        /**
         * <p>The call duration ratio, represented by four decimal places. For example, 1.0000 indicates that the call duration ratio is 100%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0984</p>
         */
        @NameInMap("CallDurationRatio")
        public String callDurationRatio;

        /**
         * <p>The 5-second channel join success rate, represented by four decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8276</p>
         */
        @NameInMap("JoinChannelSucFiveSecRate")
        public String joinChannelSucFiveSecRate;

        /**
         * <p>The channel join success rate, represented by four decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8276</p>
         */
        @NameInMap("JoinChannelSucRate")
        public String joinChannelSucRate;

        /**
         * <p>The SDK version name, such as 1.0.0 or 1.1.1.</p>
         * 
         * <strong>example:</strong>
         * <p>2.1.0.210316.dev--release/rtcsdk_v2.1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operating system name, such as iOS or Android.</p>
         * 
         * <strong>example:</strong>
         * <p>macOS</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The video delay, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>333</p>
         */
        @NameInMap("VideoDelay")
        public Long videoDelay;

        /**
         * <p>The first video frame rendering time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5643</p>
         */
        @NameInMap("VideoFirstPicDuration")
        public Long videoFirstPicDuration;

        /**
         * <p>The video high-quality transmission rate, represented by four decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9997</p>
         */
        @NameInMap("VideoHighQualityTransmissionRate")
        public String videoHighQualityTransmissionRate;

        /**
         * <p>The video stuttering rate, represented by four decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0054</p>
         */
        @NameInMap("VideoStuckRate")
        public String videoStuckRate;

        public static DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList self = new DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList();
            return TeaModel.build(map, self);
        }

        public DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList setAudioDelay(Long audioDelay) {
            this.audioDelay = audioDelay;
            return this;
        }
        public Long getAudioDelay() {
            return this.audioDelay;
        }

        public DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList setAudioHighQualityTransmissionRate(String audioHighQualityTransmissionRate) {
            this.audioHighQualityTransmissionRate = audioHighQualityTransmissionRate;
            return this;
        }
        public String getAudioHighQualityTransmissionRate() {
            return this.audioHighQualityTransmissionRate;
        }

        public DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList setAudioStuckRate(String audioStuckRate) {
            this.audioStuckRate = audioStuckRate;
            return this;
        }
        public String getAudioStuckRate() {
            return this.audioStuckRate;
        }

        public DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList setCallDurationRatio(String callDurationRatio) {
            this.callDurationRatio = callDurationRatio;
            return this;
        }
        public String getCallDurationRatio() {
            return this.callDurationRatio;
        }

        public DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList setJoinChannelSucFiveSecRate(String joinChannelSucFiveSecRate) {
            this.joinChannelSucFiveSecRate = joinChannelSucFiveSecRate;
            return this;
        }
        public String getJoinChannelSucFiveSecRate() {
            return this.joinChannelSucFiveSecRate;
        }

        public DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList setJoinChannelSucRate(String joinChannelSucRate) {
            this.joinChannelSucRate = joinChannelSucRate;
            return this;
        }
        public String getJoinChannelSucRate() {
            return this.joinChannelSucRate;
        }

        public DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList setVideoDelay(Long videoDelay) {
            this.videoDelay = videoDelay;
            return this;
        }
        public Long getVideoDelay() {
            return this.videoDelay;
        }

        public DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList setVideoFirstPicDuration(Long videoFirstPicDuration) {
            this.videoFirstPicDuration = videoFirstPicDuration;
            return this;
        }
        public Long getVideoFirstPicDuration() {
            return this.videoFirstPicDuration;
        }

        public DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList setVideoHighQualityTransmissionRate(String videoHighQualityTransmissionRate) {
            this.videoHighQualityTransmissionRate = videoHighQualityTransmissionRate;
            return this;
        }
        public String getVideoHighQualityTransmissionRate() {
            return this.videoHighQualityTransmissionRate;
        }

        public DescribeQualityOsSdkVersionDistributionStatDataResponseBodyQualityOsSdkVersionStatDataList setVideoStuckRate(String videoStuckRate) {
            this.videoStuckRate = videoStuckRate;
            return this;
        }
        public String getVideoStuckRate() {
            return this.videoStuckRate;
        }

    }

}
