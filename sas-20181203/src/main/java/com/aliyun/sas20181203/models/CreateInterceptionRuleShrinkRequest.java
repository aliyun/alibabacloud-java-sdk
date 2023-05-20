// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateInterceptionRuleShrinkRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("DstTargetList")
    public String dstTargetListShrink;

    @NameInMap("InterceptType")
    public Long interceptType;

    @NameInMap("OrderIndex")
    public Long orderIndex;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleSwitch")
    public Integer ruleSwitch;

    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("SrcTarget")
    public String srcTargetShrink;

    public static CreateInterceptionRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInterceptionRuleShrinkRequest self = new CreateInterceptionRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateInterceptionRuleShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateInterceptionRuleShrinkRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateInterceptionRuleShrinkRequest setDstTargetListShrink(String dstTargetListShrink) {
        this.dstTargetListShrink = dstTargetListShrink;
        return this;
    }
    public String getDstTargetListShrink() {
        return this.dstTargetListShrink;
    }

    public CreateInterceptionRuleShrinkRequest setInterceptType(Long interceptType) {
        this.interceptType = interceptType;
        return this;
    }
    public Long getInterceptType() {
        return this.interceptType;
    }

    public CreateInterceptionRuleShrinkRequest setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        return this;
    }
    public Long getOrderIndex() {
        return this.orderIndex;
    }

    public CreateInterceptionRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateInterceptionRuleShrinkRequest setRuleSwitch(Integer ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

    public CreateInterceptionRuleShrinkRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public CreateInterceptionRuleShrinkRequest setSrcTargetShrink(String srcTargetShrink) {
        this.srcTargetShrink = srcTargetShrink;
        return this;
    }
    public String getSrcTargetShrink() {
        return this.srcTargetShrink;
    }

}
