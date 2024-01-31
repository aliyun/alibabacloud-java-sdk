// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeUsageAreaDistributionStatDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UsageAreaStatList")
    public java.util.List<DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList> usageAreaStatList;

    public static DescribeUsageAreaDistributionStatDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageAreaDistributionStatDataResponseBody self = new DescribeUsageAreaDistributionStatDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUsageAreaDistributionStatDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUsageAreaDistributionStatDataResponseBody setUsageAreaStatList(java.util.List<DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList> usageAreaStatList) {
        this.usageAreaStatList = usageAreaStatList;
        return this;
    }
    public java.util.List<DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList> getUsageAreaStatList() {
        return this.usageAreaStatList;
    }

    public static class DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList extends TeaModel {
        @NameInMap("AudioCallDuration")
        public Integer audioCallDuration;

        @NameInMap("Name")
        public String name;

        @NameInMap("TotalCallDuration")
        public Integer totalCallDuration;

        @NameInMap("VideoCallDuration")
        public Integer videoCallDuration;

        public static DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList self = new DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList();
            return TeaModel.build(map, self);
        }

        public DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList setAudioCallDuration(Integer audioCallDuration) {
            this.audioCallDuration = audioCallDuration;
            return this;
        }
        public Integer getAudioCallDuration() {
            return this.audioCallDuration;
        }

        public DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList setTotalCallDuration(Integer totalCallDuration) {
            this.totalCallDuration = totalCallDuration;
            return this;
        }
        public Integer getTotalCallDuration() {
            return this.totalCallDuration;
        }

        public DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList setVideoCallDuration(Integer videoCallDuration) {
            this.videoCallDuration = videoCallDuration;
            return this;
        }
        public Integer getVideoCallDuration() {
            return this.videoCallDuration;
        }

    }

}
