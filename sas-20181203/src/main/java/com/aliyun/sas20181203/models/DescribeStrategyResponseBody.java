// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // An array that consists of the baseline check policies.
    @NameInMap("Strategies")
    public java.util.List<DescribeStrategyResponseBodyStrategies> strategies;

    public static DescribeStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyResponseBody self = new DescribeStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStrategyResponseBody setStrategies(java.util.List<DescribeStrategyResponseBodyStrategies> strategies) {
        this.strategies = strategies;
        return this;
    }
    public java.util.List<DescribeStrategyResponseBodyStrategies> getStrategies() {
        return this.strategies;
    }

    public static class DescribeStrategyResponseBodyStrategiesConfigTargets extends TeaModel {
        // Indicates whether the baseline check policy is applied to the asset group. Valid values:
        // 
        // *   **add**: yes
        // *   **del**: no
        @NameInMap("Flag")
        public String flag;

        // The asset group ID or UUID of the asset to which the baseline check policy is applied.
        @NameInMap("Target")
        public String target;

        // The condition by which the baseline check policy is applied to the asset. Valid values:
        // 
        // *   **groupId**: the ID of the asset group
        // *   **uuid**: the UUID of the asset
        @NameInMap("TargetType")
        public String targetType;

        public static DescribeStrategyResponseBodyStrategiesConfigTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeStrategyResponseBodyStrategiesConfigTargets self = new DescribeStrategyResponseBodyStrategiesConfigTargets();
            return TeaModel.build(map, self);
        }

        public DescribeStrategyResponseBodyStrategiesConfigTargets setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeStrategyResponseBodyStrategiesConfigTargets setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeStrategyResponseBodyStrategiesConfigTargets setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class DescribeStrategyResponseBodyStrategies extends TeaModel {
        // An array consisting of the assets to which the baseline check policy is applied.
        @NameInMap("ConfigTargets")
        public java.util.List<DescribeStrategyResponseBodyStrategiesConfigTargets> configTargets;

        // The type of the baseline check policy. Valid values:
        // 
        // *   **common**: standard baseline check policy
        // *   **custom**: custom baseline check policy
        @NameInMap("CustomType")
        public String customType;

        // The cycle of the baseline check. Valid values:
        // 
        // *   **1**: every 2 days
        // *   **3**: every 4 days
        // *   **7**: every 8 days
        // *   30: every 31 days
        @NameInMap("CycleDays")
        public Integer cycleDays;

        // The time when the baseline check starts. Valid values:
        // 
        // *   **0**: The baseline check starts within the time range from 00:00 to 06:00.
        // *   **6**: The baseline check starts within the time range from 06:00 to 12:00.
        // *   **12**: The baseline check starts within the time range from 12:00 to 18:00.
        // *   **18**: The baseline check starts within the time range from 18:00 to 24:00.
        @NameInMap("CycleStartTime")
        public Integer cycleStartTime;

        // The number of the assets to which the baseline check policy is applied.
        @NameInMap("EcsCount")
        public Integer ecsCount;

        // The time when the baseline check based on the baseline check policy ends.
        @NameInMap("EndTime")
        public String endTime;

        // The status of the baseline check policy. Valid values:
        // 
        // *   **1**: disabled
        // *   **2**: enabled
        @NameInMap("ExecStatus")
        public Integer execStatus;

        // The ID of the baseline check policy.
        @NameInMap("Id")
        public Integer id;

        // The name of the baseline check policy.
        @NameInMap("Name")
        public String name;

        // The proportion of risk items to all baseline check items in the baseline check result.
        @NameInMap("PassRate")
        public Integer passRate;

        // The number of the assets on which the baseline check is complete.
        @NameInMap("ProcessRate")
        public Integer processRate;

        // The number of baseline check items in the baseline check policy.
        @NameInMap("RiskCount")
        public Integer riskCount;

        // The time when the baseline check based on the baseline check policy starts.
        @NameInMap("StartTime")
        public String startTime;

        // The source of the baseline check policy. Valid values:
        // 
        // *   **1**: built-in policy, which indicates that the baseline check policy is provided and performed by Security Center by default.
        // *   **2**: user-defined policy, which can be a standard or custom baseline check policy.
        @NameInMap("Type")
        public Integer type;

        public static DescribeStrategyResponseBodyStrategies build(java.util.Map<String, ?> map) throws Exception {
            DescribeStrategyResponseBodyStrategies self = new DescribeStrategyResponseBodyStrategies();
            return TeaModel.build(map, self);
        }

        public DescribeStrategyResponseBodyStrategies setConfigTargets(java.util.List<DescribeStrategyResponseBodyStrategiesConfigTargets> configTargets) {
            this.configTargets = configTargets;
            return this;
        }
        public java.util.List<DescribeStrategyResponseBodyStrategiesConfigTargets> getConfigTargets() {
            return this.configTargets;
        }

        public DescribeStrategyResponseBodyStrategies setCustomType(String customType) {
            this.customType = customType;
            return this;
        }
        public String getCustomType() {
            return this.customType;
        }

        public DescribeStrategyResponseBodyStrategies setCycleDays(Integer cycleDays) {
            this.cycleDays = cycleDays;
            return this;
        }
        public Integer getCycleDays() {
            return this.cycleDays;
        }

        public DescribeStrategyResponseBodyStrategies setCycleStartTime(Integer cycleStartTime) {
            this.cycleStartTime = cycleStartTime;
            return this;
        }
        public Integer getCycleStartTime() {
            return this.cycleStartTime;
        }

        public DescribeStrategyResponseBodyStrategies setEcsCount(Integer ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        public DescribeStrategyResponseBodyStrategies setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeStrategyResponseBodyStrategies setExecStatus(Integer execStatus) {
            this.execStatus = execStatus;
            return this;
        }
        public Integer getExecStatus() {
            return this.execStatus;
        }

        public DescribeStrategyResponseBodyStrategies setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeStrategyResponseBodyStrategies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeStrategyResponseBodyStrategies setPassRate(Integer passRate) {
            this.passRate = passRate;
            return this;
        }
        public Integer getPassRate() {
            return this.passRate;
        }

        public DescribeStrategyResponseBodyStrategies setProcessRate(Integer processRate) {
            this.processRate = processRate;
            return this;
        }
        public Integer getProcessRate() {
            return this.processRate;
        }

        public DescribeStrategyResponseBodyStrategies setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public DescribeStrategyResponseBodyStrategies setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeStrategyResponseBodyStrategies setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
