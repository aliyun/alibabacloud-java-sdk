// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeQualityDistributionStatDataResponseBody extends TeaModel {
    /**
     * <p>The list of quality statistics data.</p>
     */
    @NameInMap("QualityStatDataList")
    public java.util.List<DescribeQualityDistributionStatDataResponseBodyQualityStatDataList> qualityStatDataList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
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
        /**
         * <p>Audio delay, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>554</p>
         */
        @NameInMap("AudioDelay")
        public Long audioDelay;

        /**
         * <p>Audio high-quality transmission rate, represented as a four-digit decimal.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9953</p>
         */
        @NameInMap("AudioHighQualityTransmissionRate")
        public String audioHighQualityTransmissionRate;

        /**
         * <p>The Audio Lag Rate, represented as a four-digit decimal.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0014</p>
         */
        @NameInMap("AudioStuckRate")
        public String audioStuckRate;

        /**
         * <p>The call duration ratio, represented as a four-digit decimal. For example, 1.0000 indicates that the call duration accounts for 100% of the total usage.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0000</p>
         */
        @NameInMap("CallDurationRatio")
        public String callDurationRatio;

        /**
         * <p>Five-second channel join success rate, represented as a four-digit decimal.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9560</p>
         */
        @NameInMap("JoinChannelSucFiveSecRate")
        public String joinChannelSucFiveSecRate;

        /**
         * <p>The channel join success rate, represented as a four-digit decimal.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9575</p>
         */
        @NameInMap("JoinChannelSucRate")
        public String joinChannelSucRate;

        /**
         * <p>Statistical dimension. Valid values:  </p>
         * <ul>
         * <li>When StatDim is CHANNELONLINE: <strong>ONE_TO_FIVE</strong> (1–5 participants), <strong>SIX_TO_TEN</strong> (6–10 participants), <strong>ELEVEN_TO_TWENTY</strong> (11–20 participants), <strong>TWENTYONE_TO_FIFTY</strong> (21–50 participants), <strong>ABOVE_FIFTY</strong> (more than 50 participants).  </li>
         * <li>When StatDim is NETWORK: <strong>WiFi</strong>, <strong>4G</strong>, etc.  </li>
         * <li>When StatDim is OS: <strong>iOS</strong>, <strong>Android</strong>, etc.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONE_TO_FIVE</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Video delay, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>517</p>
         */
        @NameInMap("VideoDelay")
        public Long videoDelay;

        /**
         * <p>Time to first video frame, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1299</p>
         */
        @NameInMap("VideoFirstPicDuration")
        public Long videoFirstPicDuration;

        /**
         * <p>Video high-quality transmission rate, represented as a four-digit decimal.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9981</p>
         */
        @NameInMap("VideoHighQualityTransmissionRate")
        public String videoHighQualityTransmissionRate;

        /**
         * <p>The Video Lag Rate, represented as a four-digit decimal.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0264</p>
         */
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
