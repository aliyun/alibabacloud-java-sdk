// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeIceDurPeriodByDaySubTypeRequest extends TeaModel {
    // 结束是时间戳
    @NameInMap("EndTs")
    public Long endTs;

    // 任务类型
    @NameInMap("JobType")
    public String jobType;

    // 起始时间戳
    @NameInMap("StartTs")
    public Long startTs;

    // 时区
    @NameInMap("TimeZone")
    public String timeZone;

    public static DescribeIceDurPeriodByDaySubTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIceDurPeriodByDaySubTypeRequest self = new DescribeIceDurPeriodByDaySubTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIceDurPeriodByDaySubTypeRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeIceDurPeriodByDaySubTypeRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public DescribeIceDurPeriodByDaySubTypeRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

    public DescribeIceDurPeriodByDaySubTypeRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
