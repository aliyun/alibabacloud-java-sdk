// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeUsageDistributionStatDataResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 用量统计数据列表
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
        // 音频通话时长，单位分钟
        @NameInMap("AudioCallDuration")
        public Long audioCallDuration;

        // 通话时长占比，四位小数表示，如1.0000
        @NameInMap("CallDurationRatio")
        public String callDurationRatio;

        // 统计名称， 当StatDim=CHANNEL_ONLINE： ONE_TO_FIVE：1-5人 SIX_TO_TEN：6-10人 ELEVEN_TO_TWENTY：11-20人 TWENTY_ONE_TO_FIFTY: 21-50人 ABOVE_FIFTY：50人以上  当StatDim=NETWORK： WiFi，4G等  当StatDim=OS： iOS、android等
        @NameInMap("Name")
        public String name;

        // 总通话时长，单位分钟
        @NameInMap("TotalCallDuration")
        public Long totalCallDuration;

        // 视频通话时长，单位分钟
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
