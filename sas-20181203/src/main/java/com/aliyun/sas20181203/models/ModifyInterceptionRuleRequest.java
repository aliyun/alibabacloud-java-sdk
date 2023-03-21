// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionRuleRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DstTarget")
    public java.util.Map<String, ?> dstTarget;

    @NameInMap("InterceptType")
    public Integer interceptType;

    @NameInMap("OrderIndex")
    public Long orderIndex;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleSwitch")
    public Integer ruleSwitch;

    @NameInMap("SrcTarget")
    public java.util.Map<String, ?> srcTarget;

    public static ModifyInterceptionRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInterceptionRuleRequest self = new ModifyInterceptionRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInterceptionRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyInterceptionRuleRequest setDstTarget(java.util.Map<String, ?> dstTarget) {
        this.dstTarget = dstTarget;
        return this;
    }
    public java.util.Map<String, ?> getDstTarget() {
        return this.dstTarget;
    }

    public ModifyInterceptionRuleRequest setInterceptType(Integer interceptType) {
        this.interceptType = interceptType;
        return this;
    }
    public Integer getInterceptType() {
        return this.interceptType;
    }

    public ModifyInterceptionRuleRequest setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        return this;
    }
    public Long getOrderIndex() {
        return this.orderIndex;
    }

    public ModifyInterceptionRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyInterceptionRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ModifyInterceptionRuleRequest setRuleSwitch(Integer ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

    public ModifyInterceptionRuleRequest setSrcTarget(java.util.Map<String, ?> srcTarget) {
        this.srcTarget = srcTarget;
        return this;
    }
    public java.util.Map<String, ?> getSrcTarget() {
        return this.srcTarget;
    }

}
