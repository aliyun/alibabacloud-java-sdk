// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeQualityAreaDistributionStatDataResponseBody extends TeaModel {
    /**
     * <p>The list of quality distribution data.</p>
     */
    @NameInMap("QualityStatDataList")
    public java.util.List<DescribeQualityAreaDistributionStatDataResponseBodyQualityStatDataList> qualityStatDataList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
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
        /**
         * <p>The audio delay, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>347</p>
         */
        @NameInMap("AudioDelay")
        public Long audioDelay;

        /**
         * <p>The high-quality transmission rate of audio, represented by a four-decimal number.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9933</p>
         */
        @NameInMap("AudioHighQualityTransmissionRate")
        public String audioHighQualityTransmissionRate;

        /**
         * <p>The audio stuttering rate, represented by a four-decimal number.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0021</p>
         */
        @NameInMap("AudioStuckRate")
        public String audioStuckRate;

        /**
         * <p>The ratio of the call duration, represented by a four-decimal number. For example, 1.0000 indicates that the call duration ratio is 100%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6654</p>
         */
        @NameInMap("CallDurationRatio")
        public String callDurationRatio;

        /**
         * <p>The success rate of joining a channel within 5 seconds, represented by a four-decimal number.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9338</p>
         */
        @NameInMap("JoinChannelSucFiveSecRate")
        public String joinChannelSucFiveSecRate;

        /**
         * <p>The success rate of joining a channel, represented by a four-decimal number.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9356</p>
         */
        @NameInMap("JoinChannelSucRate")
        public String joinChannelSucRate;

        /**
         * <p>The name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>China_Zhejiang Province</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The video delay, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>291</p>
         */
        @NameInMap("VideoDelay")
        public Long videoDelay;

        /**
         * <p>The time taken to render the first video frame, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1363</p>
         */
        @NameInMap("VideoFirstPicDuration")
        public Long videoFirstPicDuration;

        /**
         * <p>The high-quality transmission rate of video, represented by a four-decimal number.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9967</p>
         */
        @NameInMap("VideoHighQualityTransmissionRate")
        public String videoHighQualityTransmissionRate;

        /**
         * <p>The video stuttering rate, represented by a four-decimal number.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0058</p>
         */
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
