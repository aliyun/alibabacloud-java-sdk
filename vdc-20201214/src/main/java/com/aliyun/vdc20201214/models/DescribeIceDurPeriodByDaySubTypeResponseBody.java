// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeIceDurPeriodByDaySubTypeResponseBody extends TeaModel {
    @NameInMap("JobInfoList")
    public java.util.List<DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList> jobInfoList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIceDurPeriodByDaySubTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIceDurPeriodByDaySubTypeResponseBody self = new DescribeIceDurPeriodByDaySubTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIceDurPeriodByDaySubTypeResponseBody setJobInfoList(java.util.List<DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList> jobInfoList) {
        this.jobInfoList = jobInfoList;
        return this;
    }
    public java.util.List<DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList> getJobInfoList() {
        return this.jobInfoList;
    }

    public DescribeIceDurPeriodByDaySubTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoListSubJobInfoList extends TeaModel {
        @NameInMap("SubJobDuration")
        public Long subJobDuration;

        @NameInMap("SubJobType")
        public String subJobType;

        public static DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoListSubJobInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoListSubJobInfoList self = new DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoListSubJobInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoListSubJobInfoList setSubJobDuration(Long subJobDuration) {
            this.subJobDuration = subJobDuration;
            return this;
        }
        public Long getSubJobDuration() {
            return this.subJobDuration;
        }

        public DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoListSubJobInfoList setSubJobType(String subJobType) {
            this.subJobType = subJobType;
            return this;
        }
        public String getSubJobType() {
            return this.subJobType;
        }

    }

    public static class DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList extends TeaModel {
        @NameInMap("DateTs")
        public Long dateTs;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("SubJobInfoList")
        public java.util.List<DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoListSubJobInfoList> subJobInfoList;

        public static DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList self = new DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList setDateTs(Long dateTs) {
            this.dateTs = dateTs;
            return this;
        }
        public Long getDateTs() {
            return this.dateTs;
        }

        public DescribeIceDurPeriodByDaySubTypeResponseBodyJobInfoList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
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
