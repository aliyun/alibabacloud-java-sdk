// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingRulesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<Data> data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListAutoScalingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingRulesResponseBody self = new ListAutoScalingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAutoScalingRulesResponseBody setData(java.util.List<Data> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Data> getData() {
        return this.data;
    }

    public ListAutoScalingRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAutoScalingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAutoScalingRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Data extends TeaModel {
        // 调整数量
        @NameInMap("adjustmentValue")
        public Integer adjustmentValue;

        @NameInMap("byLoadScalingRuleSpec")
        public ByLoadScalingRuleSpec byLoadScalingRuleSpec;

        @NameInMap("byTimeScalingRuleSpec")
        public ByTimeScalingRuleSpec byTimeScalingRuleSpec;

        // 集群Id
        @NameInMap("clusterId")
        public String clusterId;

        // 冷却时间 单位为妙
        @NameInMap("coolDownInterval")
        public Integer coolDownInterval;

        // 节点组Id
        @NameInMap("nodeGroupId")
        public String nodeGroupId;

        // 伸缩活动类型
        @NameInMap("scalingActivityType")
        public String scalingActivityType;

        // 所属弹性伸缩策略 Id
        @NameInMap("scalingPolicyId")
        public String scalingPolicyId;

        // 伸缩规则Id
        @NameInMap("scalingRuleId")
        public String scalingRuleId;

        // 伸缩规则名称
        @NameInMap("scalingRuleName")
        public String scalingRuleName;

        // INACTIVE/ACTIVE
        @NameInMap("scalingRuleStatus")
        public String scalingRuleStatus;

        // 伸缩规则类型
        @NameInMap("scalingRuleType")
        public String scalingRuleType;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setAdjustmentValue(Integer adjustmentValue) {
            this.adjustmentValue = adjustmentValue;
            return this;
        }
        public Integer getAdjustmentValue() {
            return this.adjustmentValue;
        }

        public Data setByLoadScalingRuleSpec(ByLoadScalingRuleSpec byLoadScalingRuleSpec) {
            this.byLoadScalingRuleSpec = byLoadScalingRuleSpec;
            return this;
        }
        public ByLoadScalingRuleSpec getByLoadScalingRuleSpec() {
            return this.byLoadScalingRuleSpec;
        }

        public Data setByTimeScalingRuleSpec(ByTimeScalingRuleSpec byTimeScalingRuleSpec) {
            this.byTimeScalingRuleSpec = byTimeScalingRuleSpec;
            return this;
        }
        public ByTimeScalingRuleSpec getByTimeScalingRuleSpec() {
            return this.byTimeScalingRuleSpec;
        }

        public Data setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public Data setCoolDownInterval(Integer coolDownInterval) {
            this.coolDownInterval = coolDownInterval;
            return this;
        }
        public Integer getCoolDownInterval() {
            return this.coolDownInterval;
        }

        public Data setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public Data setScalingActivityType(String scalingActivityType) {
            this.scalingActivityType = scalingActivityType;
            return this;
        }
        public String getScalingActivityType() {
            return this.scalingActivityType;
        }

        public Data setScalingPolicyId(String scalingPolicyId) {
            this.scalingPolicyId = scalingPolicyId;
            return this;
        }
        public String getScalingPolicyId() {
            return this.scalingPolicyId;
        }

        public Data setScalingRuleId(String scalingRuleId) {
            this.scalingRuleId = scalingRuleId;
            return this;
        }
        public String getScalingRuleId() {
            return this.scalingRuleId;
        }

        public Data setScalingRuleName(String scalingRuleName) {
            this.scalingRuleName = scalingRuleName;
            return this;
        }
        public String getScalingRuleName() {
            return this.scalingRuleName;
        }

        public Data setScalingRuleStatus(String scalingRuleStatus) {
            this.scalingRuleStatus = scalingRuleStatus;
            return this;
        }
        public String getScalingRuleStatus() {
            return this.scalingRuleStatus;
        }

        public Data setScalingRuleType(String scalingRuleType) {
            this.scalingRuleType = scalingRuleType;
            return this;
        }
        public String getScalingRuleType() {
            return this.scalingRuleType;
        }

    }

}
