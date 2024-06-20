// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeUsageDistributionStatDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("AudioCallDuration")
        public Long audioCallDuration;

        /**
         * <strong>example:</strong>
         * <p>0.9782</p>
         */
        @NameInMap("CallDurationRatio")
        public String callDurationRatio;

        /**
         * <strong>example:</strong>
         * <p>ONE_TO_FIVE</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>10636</p>
         */
        @NameInMap("TotalCallDuration")
        public Long totalCallDuration;

        /**
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
