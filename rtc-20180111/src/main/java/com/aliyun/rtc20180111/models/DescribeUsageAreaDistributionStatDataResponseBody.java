// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeUsageAreaDistributionStatDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>45</p>
         */
        @NameInMap("AudioCallDuration")
        public Integer audioCallDuration;

        /**
         * <strong>example:</strong>
         * <p>中国</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>4821</p>
         */
        @NameInMap("TotalCallDuration")
        public Integer totalCallDuration;

        /**
         * <strong>example:</strong>
         * <p>4776</p>
         */
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
