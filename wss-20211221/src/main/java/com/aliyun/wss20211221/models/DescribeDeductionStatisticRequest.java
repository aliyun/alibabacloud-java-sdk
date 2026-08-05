// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeDeductionStatisticRequest extends TeaModel {
    /**
     * <p>The end time (timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-06T02:14:00Z</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The list of instance IDs (JSON array).</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The list of time periods in JSON array format. Each element is a <code>PeriodParam</code> object.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Periods")
    public java.util.List<DescribeDeductionStatisticRequestPeriods> periods;

    /**
     * <p>The list of resource types in JSON array format.</p>
     */
    @NameInMap("ResourceTypes")
    public java.util.List<String> resourceTypes;

    /**
     * <p>The start time (timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-03-20T16:00:00Z</p>
     */
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
         * <p>The base time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01</p>
         */
        @NameInMap("BaseTime")
        public String baseTime;

        /**
         * <p>The time period unit. For more information, see the <code>PeriodUnit</code> enumeration.</p>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
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
