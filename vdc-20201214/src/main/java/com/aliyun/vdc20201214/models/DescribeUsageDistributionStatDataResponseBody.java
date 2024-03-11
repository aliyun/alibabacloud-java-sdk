// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeUsageDistributionStatDataResponseBody extends TeaModel {
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
        @NameInMap("AudioCallDuration")
        public Long audioCallDuration;

        @NameInMap("CallDurationRatio")
        public String callDurationRatio;

        @NameInMap("Name")
        public String name;

        @NameInMap("TotalCallDuration")
        public Long totalCallDuration;

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
