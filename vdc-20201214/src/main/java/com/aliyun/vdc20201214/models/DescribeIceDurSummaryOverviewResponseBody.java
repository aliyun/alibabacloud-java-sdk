// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeIceDurSummaryOverviewResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 任务信息
    @NameInMap("JobInfoList")
    public java.util.List<DescribeIceDurSummaryOverviewResponseBodyJobInfoList> jobInfoList;

    public static DescribeIceDurSummaryOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIceDurSummaryOverviewResponseBody self = new DescribeIceDurSummaryOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIceDurSummaryOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIceDurSummaryOverviewResponseBody setJobInfoList(java.util.List<DescribeIceDurSummaryOverviewResponseBodyJobInfoList> jobInfoList) {
        this.jobInfoList = jobInfoList;
        return this;
    }
    public java.util.List<DescribeIceDurSummaryOverviewResponseBodyJobInfoList> getJobInfoList() {
        return this.jobInfoList;
    }

    public static class DescribeIceDurSummaryOverviewResponseBodyJobInfoList extends TeaModel {
        // 作业类型
        @NameInMap("JobType")
        public String jobType;

        // 时间维度
        @NameInMap("TimeRange")
        public String timeRange;

        // 任务时长
        @NameInMap("Duration")
        public Long duration;

        public static DescribeIceDurSummaryOverviewResponseBodyJobInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeIceDurSummaryOverviewResponseBodyJobInfoList self = new DescribeIceDurSummaryOverviewResponseBodyJobInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeIceDurSummaryOverviewResponseBodyJobInfoList setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public DescribeIceDurSummaryOverviewResponseBodyJobInfoList setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public String getTimeRange() {
            return this.timeRange;
        }

        public DescribeIceDurSummaryOverviewResponseBodyJobInfoList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

}
