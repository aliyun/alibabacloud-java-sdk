// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelDistributionStatDataResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The channel distribution statistics list.</p>
     */
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
        /**
         * <p>The number of communicating users.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallUserCount")
        public Integer callUserCount;

        /**
         * <p>The proportion of communicating users, represented as a decimal. For example, 1.0000 indicates that the proportion is 100%.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0000</p>
         */
        @NameInMap("CallUserRatio")
        public String callUserRatio;

        /**
         * <p>The statistical dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>OS</p>
         */
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
