// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeUsageAreaDistributionStatDataResponseBody extends TeaModel {
    // 用量统计地域分布数据
    @NameInMap("UsageAreaStatList")
    public java.util.List<DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList> usageAreaStatList;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUsageAreaDistributionStatDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageAreaDistributionStatDataResponseBody self = new DescribeUsageAreaDistributionStatDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUsageAreaDistributionStatDataResponseBody setUsageAreaStatList(java.util.List<DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList> usageAreaStatList) {
        this.usageAreaStatList = usageAreaStatList;
        return this;
    }
    public java.util.List<DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList> getUsageAreaStatList() {
        return this.usageAreaStatList;
    }

    public DescribeUsageAreaDistributionStatDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList extends TeaModel {
        // 地域名称，如中国
        @NameInMap("Name")
        public String name;

        // 音频通话时长，单位分钟
        @NameInMap("AudioCallDuration")
        public Integer audioCallDuration;

        // 视频通话时长，单位分钟
        @NameInMap("VideoCallDuration")
        public Integer videoCallDuration;

        // 总通话时长，单位分钟
        @NameInMap("TotalCallDuration")
        public Integer totalCallDuration;

        public static DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList self = new DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList();
            return TeaModel.build(map, self);
        }

        public DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList setAudioCallDuration(Integer audioCallDuration) {
            this.audioCallDuration = audioCallDuration;
            return this;
        }
        public Integer getAudioCallDuration() {
            return this.audioCallDuration;
        }

        public DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList setVideoCallDuration(Integer videoCallDuration) {
            this.videoCallDuration = videoCallDuration;
            return this;
        }
        public Integer getVideoCallDuration() {
            return this.videoCallDuration;
        }

        public DescribeUsageAreaDistributionStatDataResponseBodyUsageAreaStatList setTotalCallDuration(Integer totalCallDuration) {
            this.totalCallDuration = totalCallDuration;
            return this;
        }
        public Integer getTotalCallDuration() {
            return this.totalCallDuration;
        }

    }

}
