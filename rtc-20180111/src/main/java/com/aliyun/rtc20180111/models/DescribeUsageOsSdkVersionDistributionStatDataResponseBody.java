// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeUsageOsSdkVersionDistributionStatDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AudioCallDuration")
        public Long audioCallDuration;

        /**
         * <strong>example:</strong>
         * <p>0.0984</p>
         */
        @NameInMap("CallDurationRatio")
        public String callDurationRatio;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>macOS</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <strong>example:</strong>
         * <p>476</p>
         */
        @NameInMap("TotalCallDuration")
        public Long totalCallDuration;

        /**
         * <strong>example:</strong>
         * <p>473</p>
         */
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
