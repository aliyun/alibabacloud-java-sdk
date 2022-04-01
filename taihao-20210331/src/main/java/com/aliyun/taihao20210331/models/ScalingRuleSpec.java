// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ScalingRuleSpec extends TeaModel {
    // 伸缩数量
    @NameInMap("adjustmentValue")
    public Integer adjustmentValue;

    // 按负载伸缩参数描述
    @NameInMap("byLoadScalingRuleSpec")
    public ByLoadScalingRuleSpec byLoadScalingRuleSpec;

    // 按时间伸缩参数描述
    @NameInMap("byTimeScalingRuleSpec")
    public ByTimeScalingRuleSpec byTimeScalingRuleSpec;

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

    public static ScalingRuleSpec build(java.util.Map<String, ?> map) throws Exception {
        ScalingRuleSpec self = new ScalingRuleSpec();
        return TeaModel.build(map, self);
    }

    public ScalingRuleSpec setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public ScalingRuleSpec setByLoadScalingRuleSpec(ByLoadScalingRuleSpec byLoadScalingRuleSpec) {
        this.byLoadScalingRuleSpec = byLoadScalingRuleSpec;
        return this;
    }
    public ByLoadScalingRuleSpec getByLoadScalingRuleSpec() {
        return this.byLoadScalingRuleSpec;
    }

    public ScalingRuleSpec setByTimeScalingRuleSpec(ByTimeScalingRuleSpec byTimeScalingRuleSpec) {
        this.byTimeScalingRuleSpec = byTimeScalingRuleSpec;
        return this;
    }
    public ByTimeScalingRuleSpec getByTimeScalingRuleSpec() {
        return this.byTimeScalingRuleSpec;
    }

    public ScalingRuleSpec setCoolDownInterval(Integer coolDownInterval) {
        this.coolDownInterval = coolDownInterval;
        return this;
    }
    public Integer getCoolDownInterval() {
        return this.coolDownInterval;
    }

    public ScalingRuleSpec setScalingActivityType(String scalingActivityType) {
        this.scalingActivityType = scalingActivityType;
        return this;
    }
    public String getScalingActivityType() {
        return this.scalingActivityType;
    }

    public ScalingRuleSpec setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public ScalingRuleSpec setScalingRuleType(String scalingRuleType) {
        this.scalingRuleType = scalingRuleType;
        return this;
    }
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

}
