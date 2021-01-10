// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushLDCFlowRuleRequest extends TeaModel {
    @NameInMap("AppsRepeatList")
    public java.util.List<String> appsRepeatList;

    @NameInMap("Gray")
    public Boolean gray;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Override")
    public Boolean override;

    @NameInMap("PushAll")
    public Boolean pushAll;

    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("RuleValue")
    public String ruleValue;

    @NameInMap("TargetsRepeatList")
    public java.util.List<String> targetsRepeatList;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static PushLDCFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PushLDCFlowRuleRequest self = new PushLDCFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public PushLDCFlowRuleRequest setAppsRepeatList(java.util.List<String> appsRepeatList) {
        this.appsRepeatList = appsRepeatList;
        return this;
    }
    public java.util.List<String> getAppsRepeatList() {
        return this.appsRepeatList;
    }

    public PushLDCFlowRuleRequest setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

    public PushLDCFlowRuleRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public PushLDCFlowRuleRequest setOverride(Boolean override) {
        this.override = override;
        return this;
    }
    public Boolean getOverride() {
        return this.override;
    }

    public PushLDCFlowRuleRequest setPushAll(Boolean pushAll) {
        this.pushAll = pushAll;
        return this;
    }
    public Boolean getPushAll() {
        return this.pushAll;
    }

    public PushLDCFlowRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public PushLDCFlowRuleRequest setRuleValue(String ruleValue) {
        this.ruleValue = ruleValue;
        return this;
    }
    public String getRuleValue() {
        return this.ruleValue;
    }

    public PushLDCFlowRuleRequest setTargetsRepeatList(java.util.List<String> targetsRepeatList) {
        this.targetsRepeatList = targetsRepeatList;
        return this;
    }
    public java.util.List<String> getTargetsRepeatList() {
        return this.targetsRepeatList;
    }

    public PushLDCFlowRuleRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
