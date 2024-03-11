// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeIceDurSummaryOverviewResponseBody extends TeaModel {
    @NameInMap("JobInfoList")
    public java.util.List<DescribeIceDurSummaryOverviewResponseBodyJobInfoList> jobInfoList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIceDurSummaryOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIceDurSummaryOverviewResponseBody self = new DescribeIceDurSummaryOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIceDurSummaryOverviewResponseBody setJobInfoList(java.util.List<DescribeIceDurSummaryOverviewResponseBodyJobInfoList> jobInfoList) {
        this.jobInfoList = jobInfoList;
        return this;
    }
    public java.util.List<DescribeIceDurSummaryOverviewResponseBodyJobInfoList> getJobInfoList() {
        return this.jobInfoList;
    }

    public DescribeIceDurSummaryOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeIceDurSummaryOverviewResponseBodyJobInfoList extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("TimeRange")
        public String timeRange;

        public static DescribeIceDurSummaryOverviewResponseBodyJobInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeIceDurSummaryOverviewResponseBodyJobInfoList self = new DescribeIceDurSummaryOverviewResponseBodyJobInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeIceDurSummaryOverviewResponseBodyJobInfoList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
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

    }

}
