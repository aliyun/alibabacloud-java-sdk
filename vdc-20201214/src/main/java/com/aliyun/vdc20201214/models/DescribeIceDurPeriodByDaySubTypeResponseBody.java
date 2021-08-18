// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeIceDurPeriodByDaySubTypeResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 任务信息列表
    @NameInMap("JobInfoList")
    public java.util.List<DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList> jobInfoList;

    public static DescribeIceDurPeriodByDaySubTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIceDurPeriodByDaySubTypeResponseBody self = new DescribeIceDurPeriodByDaySubTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIceDurPeriodByDaySubTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIceDurPeriodByDaySubTypeResponseBody setJobInfoList(java.util.List<DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList> jobInfoList) {
        this.jobInfoList = jobInfoList;
        return this;
    }
    public java.util.List<DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList> getJobInfoList() {
        return this.jobInfoList;
    }

    public static class DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoListSubJobInfoList extends TeaModel {
        // 子任务类型
        @NameInMap("SubJobType")
        public String subJobType;

        // 子任务时长
        @NameInMap("SubJobDuration")
        public Long subJobDuration;

        public static DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoListSubJobInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoListSubJobInfoList self = new DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoListSubJobInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoListSubJobInfoList setSubJobType(String subJobType) {
            this.subJobType = subJobType;
            return this;
        }
        public String getSubJobType() {
            return this.subJobType;
        }

        public DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoListSubJobInfoList setSubJobDuration(Long subJobDuration) {
            this.subJobDuration = subJobDuration;
            return this;
        }
        public Long getSubJobDuration() {
            return this.subJobDuration;
        }

    }

    public static class DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList extends TeaModel {
        // 任务总时长,单位分钟
        @NameInMap("Duration")
        public Long duration;

        // 日期时间戳
        @NameInMap("DateTs")
        public Long dateTs;

        // 子任务信息列表
        @NameInMap("SubJobInfoList")
        public java.util.List<DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoListSubJobInfoList> subJobInfoList;

        public static DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList self = new DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList setDateTs(Long dateTs) {
            this.dateTs = dateTs;
            return this;
        }
        public Long getDateTs() {
            return this.dateTs;
        }

        public DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList setSubJobInfoList(java.util.List<DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoListSubJobInfoList> subJobInfoList) {
            this.subJobInfoList = subJobInfoList;
            return this;
        }
        public java.util.List<DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoListSubJobInfoList> getSubJobInfoList() {
            return this.subJobInfoList;
        }

    }

}
