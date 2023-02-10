// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateInterceptionRuleRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("DstTargetList")
    public java.util.Map<String, ?> dstTargetList;

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
    public java.util.Map<String, ?> srcTarget;

    public static CreateInterceptionRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInterceptionRuleRequest self = new CreateInterceptionRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateInterceptionRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateInterceptionRuleRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateInterceptionRuleRequest setDstTargetList(java.util.Map<String, ?> dstTargetList) {
        this.dstTargetList = dstTargetList;
        return this;
    }
    public java.util.Map<String, ?> getDstTargetList() {
        return this.dstTargetList;
    }

    public CreateInterceptionRuleRequest setInterceptType(Long interceptType) {
        this.interceptType = interceptType;
        return this;
    }
    public Long getInterceptType() {
        return this.interceptType;
    }

    public CreateInterceptionRuleRequest setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        return this;
    }
    public Long getOrderIndex() {
        return this.orderIndex;
    }

    public CreateInterceptionRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateInterceptionRuleRequest setRuleSwitch(Integer ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

    public CreateInterceptionRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public CreateInterceptionRuleRequest setSrcTarget(java.util.Map<String, ?> srcTarget) {
        this.srcTarget = srcTarget;
        return this;
    }
    public java.util.Map<String, ?> getSrcTarget() {
        return this.srcTarget;
    }

}
