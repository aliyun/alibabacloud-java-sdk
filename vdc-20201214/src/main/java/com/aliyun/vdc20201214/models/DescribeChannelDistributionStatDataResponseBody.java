// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelDistributionStatDataResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 频道分布统计列表。
    @NameInMap("StatList")
    public java.util.List<DescribeChannelDistributionStatDataResponseBodyStatList> statList;

    public static DescribeChannelDistributionStatDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelDistributionStatDataResponseBody self = new DescribeChannelDistributionStatDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelDistributionStatDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChannelDistributionStatDataResponseBody setStatList(java.util.List<DescribeChannelDistributionStatDataResponseBodyStatList> statList) {
        this.statList = statList;
        return this;
    }
    public java.util.List<DescribeChannelDistributionStatDataResponseBodyStatList> getStatList() {
        return this.statList;
    }

    public static class DescribeChannelDistributionStatDataResponseBodyStatList extends TeaModel {
        // 通信人数。
        @NameInMap("CallUserCount")
        public Integer callUserCount;

        // 通信人数占比，用小数表示，例如1.0000表示通信人数占比为100%。
        @NameInMap("CallUserRatio")
        public String callUserRatio;

        // 统计维度。
        @NameInMap("Name")
        public String name;

        public static DescribeChannelDistributionStatDataResponseBodyStatList build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelDistributionStatDataResponseBodyStatList self = new DescribeChannelDistributionStatDataResponseBodyStatList();
            return TeaModel.build(map, self);
        }

        public DescribeChannelDistributionStatDataResponseBodyStatList setCallUserCount(Integer callUserCount) {
            this.callUserCount = callUserCount;
            return this;
        }
        public Integer getCallUserCount() {
            return this.callUserCount;
        }

        public DescribeChannelDistributionStatDataResponseBodyStatList setCallUserRatio(String callUserRatio) {
            this.callUserRatio = callUserRatio;
            return this;
        }
        public String getCallUserRatio() {
            return this.callUserRatio;
        }

        public DescribeChannelDistributionStatDataResponseBodyStatList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
