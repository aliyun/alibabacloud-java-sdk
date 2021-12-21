// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeUsageOsSdkVersionDistributionStatDataResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 用量统计SDK版本数据列表
    @NameInMap("UsageOsSdkVersionStatList")
    public java.util.List<DescribeUsageOsSdkVersionDistributionStatDataResponseBodyUsageOsSdkVersionStatList> usageOsSdkVersionStatList;

    public static DescribeUsageOsSdkVersionDistributionStatDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageOsSdkVersionDistributionStatDataResponseBody self = new DescribeUsageOsSdkVersionDistributionStatDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUsageOsSdkVersionDistributionStatDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUsageOsSdkVersionDistributionStatDataResponseBody setUsageOsSdkVersionStatList(java.util.List<DescribeUsageOsSdkVersionDistributionStatDataResponseBodyUsageOsSdkVersionStatList> usageOsSdkVersionStatList) {
        this.usageOsSdkVersionStatList = usageOsSdkVersionStatList;
        return this;
    }
    public java.util.List<DescribeUsageOsSdkVersionDistributionStatDataResponseBodyUsageOsSdkVersionStatList> getUsageOsSdkVersionStatList() {
        return this.usageOsSdkVersionStatList;
    }

    public static class DescribeUsageOsSdkVersionDistributionStatDataResponseBodyUsageOsSdkVersionStatList extends TeaModel {
        // 音频通话时长，单位分钟
        @NameInMap("AudioCallDuration")
        public Long audioCallDuration;

        // 通话时长占比，四位小数表示，如1.0000
        @NameInMap("CallDurationRatio")
        public String callDurationRatio;

        // SDK版本名称，1.0.0、1.1.1等
        @NameInMap("Name")
        public String name;

        // 操作系统，如iOS、android等
        @NameInMap("Os")
        public String os;

        // 总通话时长，单位分钟
        @NameInMap("TotalCallDuration")
        public Long totalCallDuration;

        // 视频通话时长，单位分钟
        @NameInMap("VideoCallDuration")
        public Long videoCallDuration;

        public static DescribeUsageOsSdkVersionDistributionStatDataResponseBodyUsageOsSdkVersionStatList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsageOsSdkVersionDistributionStatDataResponseBodyUsageOsSdkVersionStatList self = new DescribeUsageOsSdkVersionDistributionStatDataResponseBodyUsageOsSdkVersionStatList();
            return TeaModel.build(map, self);
        }

        public DescribeUsageOsSdkVersionDistributionStatDataResponseBodyUsageOsSdkVersionStatList setAudioCallDuration(Long audioCallDuration) {
            this.audioCallDuration = audioCallDuration;
            return this;
        }
        public Long getAudioCallDuration() {
            return this.audioCallDuration;
        }

        public DescribeUsageOsSdkVersionDistributionStatDataResponseBodyUsageOsSdkVersionStatList setCallDurationRatio(String callDurationRatio) {
            this.callDurationRatio = callDurationRatio;
            return this;
        }
        public String getCallDurationRatio() {
            return this.callDurationRatio;
        }

        public DescribeUsageOsSdkVersionDistributionStatDataResponseBodyUsageOsSdkVersionStatList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeUsageOsSdkVersionDistributionStatDataResponseBodyUsageOsSdkVersionStatList setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeUsageOsSdkVersionDistributionStatDataResponseBodyUsageOsSdkVersionStatList setTotalCallDuration(Long totalCallDuration) {
            this.totalCallDuration = totalCallDuration;
            return this;
        }
        public Long getTotalCallDuration() {
            return this.totalCallDuration;
        }

        public DescribeUsageOsSdkVersionDistributionStatDataResponseBodyUsageOsSdkVersionStatList setVideoCallDuration(Long videoCallDuration) {
            this.videoCallDuration = videoCallDuration;
            return this;
        }
        public Long getVideoCallDuration() {
            return this.videoCallDuration;
        }

    }

}
