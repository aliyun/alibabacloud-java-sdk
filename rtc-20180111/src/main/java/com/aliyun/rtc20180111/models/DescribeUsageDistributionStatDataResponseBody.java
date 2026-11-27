// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeUsageDistributionStatDataResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of usage statistics.</p>
     */
    @NameInMap("UsageStatList")
    public java.util.List<DescribeUsageDistributionStatDataResponseBodyUsageStatList> usageStatList;

    public static DescribeUsageDistributionStatDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageDistributionStatDataResponseBody self = new DescribeUsageDistributionStatDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUsageDistributionStatDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUsageDistributionStatDataResponseBody setUsageStatList(java.util.List<DescribeUsageDistributionStatDataResponseBodyUsageStatList> usageStatList) {
        this.usageStatList = usageStatList;
        return this;
    }
    public java.util.List<DescribeUsageDistributionStatDataResponseBodyUsageStatList> getUsageStatList() {
        return this.usageStatList;
    }

    public static class DescribeUsageDistributionStatDataResponseBodyUsageStatList extends TeaModel {
        /**
         * <p>The duration of audio calls, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("AudioCallDuration")
        public Long audioCallDuration;

        /**
         * <p>The ratio of the call duration, represented by four decimal places, such as 0.9782.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9782</p>
         */
        @NameInMap("CallDurationRatio")
        public String callDurationRatio;

        /**
         * <p>The statistical dimension. Valid values:</p>
         * <ul>
         * <li>When StatDim is set to CHANNEL_ONLINE, valid values are <strong>ONE_TO_FIVE</strong> (1 to 5 users), <strong>SIX_TO_TEN</strong> (6 to 10 users), <strong>ELEVEN_TO_TWENTY</strong> (11 to 20 users), <strong>TWENTY_ONE_TO_FIFTY</strong> (21 to 50 users), and <strong>ABOVE_FIFTY</strong> (more than 50 users).  </li>
         * <li>When StatDim is set to NETWORK, valid values are <strong>WiFi</strong>, <strong>4G</strong>, and others.  </li>
         * <li>When StatDim is set to OS, valid values are <strong>iOS</strong>, <strong>Android</strong>, and others.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONE_TO_FIVE</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The total duration of calls, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10636</p>
         */
        @NameInMap("TotalCallDuration")
        public Long totalCallDuration;

        /**
         * <p>The duration of video calls, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10585</p>
         */
        @NameInMap("VideoCallDuration")
        public Long videoCallDuration;

        public static DescribeUsageDistributionStatDataResponseBodyUsageStatList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsageDistributionStatDataResponseBodyUsageStatList self = new DescribeUsageDistributionStatDataResponseBodyUsageStatList();
            return TeaModel.build(map, self);
        }

        public DescribeUsageDistributionStatDataResponseBodyUsageStatList setAudioCallDuration(Long audioCallDuration) {
            this.audioCallDuration = audioCallDuration;
            return this;
        }
        public Long getAudioCallDuration() {
            return this.audioCallDuration;
        }

        public DescribeUsageDistributionStatDataResponseBodyUsageStatList setCallDurationRatio(String callDurationRatio) {
            this.callDurationRatio = callDurationRatio;
            return this;
        }
        public String getCallDurationRatio() {
            return this.callDurationRatio;
        }

        public DescribeUsageDistributionStatDataResponseBodyUsageStatList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeUsageDistributionStatDataResponseBodyUsageStatList setTotalCallDuration(Long totalCallDuration) {
            this.totalCallDuration = totalCallDuration;
            return this;
        }
        public Long getTotalCallDuration() {
            return this.totalCallDuration;
        }

        public DescribeUsageDistributionStatDataResponseBodyUsageStatList setVideoCallDuration(Long videoCallDuration) {
            this.videoCallDuration = videoCallDuration;
            return this;
        }
        public Long getVideoCallDuration() {
            return this.videoCallDuration;
        }

    }

}
