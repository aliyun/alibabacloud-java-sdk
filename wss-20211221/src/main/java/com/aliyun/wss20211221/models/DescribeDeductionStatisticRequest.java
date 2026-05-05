// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeDeductionStatisticRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Periods")
    public java.util.List<DescribeDeductionStatisticRequestPeriods> periods;

    @NameInMap("ResourceTypes")
    public java.util.List<String> resourceTypes;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDeductionStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeductionStatisticRequest self = new DescribeDeductionStatisticRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeductionStatisticRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDeductionStatisticRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeDeductionStatisticRequest setPeriods(java.util.List<DescribeDeductionStatisticRequestPeriods> periods) {
        this.periods = periods;
        return this;
    }
    public java.util.List<DescribeDeductionStatisticRequestPeriods> getPeriods() {
        return this.periods;
    }

    public DescribeDeductionStatisticRequest setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    public DescribeDeductionStatisticRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class DescribeDeductionStatisticRequestPeriods extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-01-01</p>
         */
        @NameInMap("BaseTime")
        public String baseTime;

        @NameInMap("PeriodUnit")
        public String periodUnit;

        public static DescribeDeductionStatisticRequestPeriods build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeductionStatisticRequestPeriods self = new DescribeDeductionStatisticRequestPeriods();
            return TeaModel.build(map, self);
        }

        public DescribeDeductionStatisticRequestPeriods setBaseTime(String baseTime) {
            this.baseTime = baseTime;
            return this;
        }
        public String getBaseTime() {
            return this.baseTime;
        }

        public DescribeDeductionStatisticRequestPeriods setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

    }

}
