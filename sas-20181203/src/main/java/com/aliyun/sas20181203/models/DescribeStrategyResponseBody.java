// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Flag")
        public String flag;

        @NameInMap("Target")
        public String target;

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
        @NameInMap("ExecStatus")
        public Integer execStatus;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("CycleStartTime")
        public Integer cycleStartTime;

        @NameInMap("EcsCount")
        public Integer ecsCount;

        @NameInMap("ProcessRate")
        public Integer processRate;

        @NameInMap("CycleDays")
        public Integer cycleDays;

        @NameInMap("RiskCount")
        public Integer riskCount;

        @NameInMap("Name")
        public String name;

        @NameInMap("PassRate")
        public Integer passRate;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("ConfigTargets")
        public java.util.List<DescribeStrategyResponseBodyStrategiesConfigTargets> configTargets;

        public static DescribeStrategyResponseBodyStrategies build(java.util.Map<String, ?> map) throws Exception {
            DescribeStrategyResponseBodyStrategies self = new DescribeStrategyResponseBodyStrategies();
            return TeaModel.build(map, self);
        }

        public DescribeStrategyResponseBodyStrategies setExecStatus(Integer execStatus) {
            this.execStatus = execStatus;
            return this;
        }
        public Integer getExecStatus() {
            return this.execStatus;
        }

        public DescribeStrategyResponseBodyStrategies setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
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

        public DescribeStrategyResponseBodyStrategies setProcessRate(Integer processRate) {
            this.processRate = processRate;
            return this;
        }
        public Integer getProcessRate() {
            return this.processRate;
        }

        public DescribeStrategyResponseBodyStrategies setCycleDays(Integer cycleDays) {
            this.cycleDays = cycleDays;
            return this;
        }
        public Integer getCycleDays() {
            return this.cycleDays;
        }

        public DescribeStrategyResponseBodyStrategies setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
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

        public DescribeStrategyResponseBodyStrategies setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeStrategyResponseBodyStrategies setConfigTargets(java.util.List<DescribeStrategyResponseBodyStrategiesConfigTargets> configTargets) {
            this.configTargets = configTargets;
            return this;
        }
        public java.util.List<DescribeStrategyResponseBodyStrategiesConfigTargets> getConfigTargets() {
            return this.configTargets;
        }

    }

}
