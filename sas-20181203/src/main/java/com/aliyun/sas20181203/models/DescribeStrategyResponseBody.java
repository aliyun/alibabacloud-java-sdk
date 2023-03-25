// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the baseline check policies.</p>
     */
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
        /**
         * <p>Indicates whether the baseline check policy is applied to the asset group. Valid values:</p>
         * <br>
         * <p>*   **add**: yes</p>
         * <p>*   **del**: no</p>
         */
        @NameInMap("Flag")
        public String flag;

        /**
         * <p>The asset group ID or UUID of the asset to which the baseline check policy is applied.</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The condition by which the baseline check policy is applied to the asset. Valid values:</p>
         * <br>
         * <p>*   **groupId**: the ID of the asset group</p>
         * <p>*   **uuid**: the UUID of the asset</p>
         */
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
        /**
         * <p>An array consisting of the assets to which the baseline check policy is applied.</p>
         */
        @NameInMap("ConfigTargets")
        public java.util.List<DescribeStrategyResponseBodyStrategiesConfigTargets> configTargets;

        /**
         * <p>The type of the baseline check policy. Valid values:</p>
         * <br>
         * <p>*   **common**: standard baseline check policy</p>
         * <p>*   **custom**: custom baseline check policy</p>
         */
        @NameInMap("CustomType")
        public String customType;

        /**
         * <p>The cycle of the baseline check. Valid values:</p>
         * <br>
         * <p>*   **1**: every 2 days</p>
         * <p>*   **3**: every 4 days</p>
         * <p>*   **7**: every 8 days</p>
         * <p>*   30: every 31 days</p>
         */
        @NameInMap("CycleDays")
        public Integer cycleDays;

        /**
         * <p>The time when the baseline check starts. Valid values:</p>
         * <br>
         * <p>*   **0**: The baseline check starts within the time range from 00:00 to 06:00.</p>
         * <p>*   **6**: The baseline check starts within the time range from 06:00 to 12:00.</p>
         * <p>*   **12**: The baseline check starts within the time range from 12:00 to 18:00.</p>
         * <p>*   **18**: The baseline check starts within the time range from 18:00 to 24:00.</p>
         */
        @NameInMap("CycleStartTime")
        public Integer cycleStartTime;

        /**
         * <p>The number of the assets to which the baseline check policy is applied.</p>
         */
        @NameInMap("EcsCount")
        public Integer ecsCount;

        /**
         * <p>The time when the baseline check based on the baseline check policy ends.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The status of the baseline check policy. Valid values:</p>
         * <br>
         * <p>*   **1**: disabled</p>
         * <p>*   **2**: enabled</p>
         */
        @NameInMap("ExecStatus")
        public Integer execStatus;

        /**
         * <p>The ID of the baseline check policy.</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The name of the baseline check policy.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The proportion of risk items to all baseline check items in the baseline check result.</p>
         */
        @NameInMap("PassRate")
        public Integer passRate;

        /**
         * <p>The number of the assets on which the baseline check is complete.</p>
         */
        @NameInMap("ProcessRate")
        public Integer processRate;

        /**
         * <p>The number of baseline check items in the baseline check policy.</p>
         */
        @NameInMap("RiskCount")
        public Integer riskCount;

        /**
         * <p>The time when the baseline check based on the baseline check policy starts.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The source of the baseline check policy. Valid values:</p>
         * <br>
         * <p>*   **1**: built-in policy, which indicates that the baseline check policy is provided and performed by Security Center by default.</p>
         * <p>*   **2**: user-defined policy, which can be a standard or custom baseline check policy.</p>
         */
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
