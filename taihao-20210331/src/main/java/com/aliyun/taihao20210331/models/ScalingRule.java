// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ScalingRule extends TeaModel {
    // 伸缩数量
    @NameInMap("adjustmentValue")
    public Integer adjustmentValue;

    // 按负载伸缩参数描述
    @NameInMap("byLoadScalingRule")
    public ByLoadScalingRule byLoadScalingRule;

    // 按时间伸缩参数描述
    @NameInMap("byTimeScalingRule")
    public ByTimeScalingRule byTimeScalingRule;

    // 冷却时间
    @NameInMap("coolDownInterval")
    public Integer coolDownInterval;

    // 伸缩活动类型
    @NameInMap("scalingActivityType")
    public String scalingActivityType;

    // 规则名称
    @NameInMap("scalingRuleName")
    public String scalingRuleName;

    // 伸缩规则类型
    @NameInMap("scalingRuleType")
    public String scalingRuleType;

    public static ScalingRule build(java.util.Map<String, ?> map) throws Exception {
        ScalingRule self = new ScalingRule();
        return TeaModel.build(map, self);
    }

    public ScalingRule setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public ScalingRule setByLoadScalingRule(ByLoadScalingRule byLoadScalingRule) {
        this.byLoadScalingRule = byLoadScalingRule;
        return this;
    }
    public ByLoadScalingRule getByLoadScalingRule() {
        return this.byLoadScalingRule;
    }

    public ScalingRule setByTimeScalingRule(ByTimeScalingRule byTimeScalingRule) {
        this.byTimeScalingRule = byTimeScalingRule;
        return this;
    }
    public ByTimeScalingRule getByTimeScalingRule() {
        return this.byTimeScalingRule;
    }

    public ScalingRule setCoolDownInterval(Integer coolDownInterval) {
        this.coolDownInterval = coolDownInterval;
        return this;
    }
    public Integer getCoolDownInterval() {
        return this.coolDownInterval;
    }

    public ScalingRule setScalingActivityType(String scalingActivityType) {
        this.scalingActivityType = scalingActivityType;
        return this;
    }
    public String getScalingActivityType() {
        return this.scalingActivityType;
    }

    public ScalingRule setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public ScalingRule setScalingRuleType(String scalingRuleType) {
        this.scalingRuleType = scalingRuleType;
        return this;
    }
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

}
