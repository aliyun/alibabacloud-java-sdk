// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportLDCFlowRuleRequest extends TeaModel {
    @NameInMap("Check")
    public Boolean check;

    @NameInMap("Gray")
    public Boolean gray;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    @NameInMap("AppsRepeatList")
    public java.util.List<String> appsRepeatList;

    public static ExportLDCFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportLDCFlowRuleRequest self = new ExportLDCFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public ExportLDCFlowRuleRequest setCheck(Boolean check) {
        this.check = check;
        return this;
    }
    public Boolean getCheck() {
        return this.check;
    }

    public ExportLDCFlowRuleRequest setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

    public ExportLDCFlowRuleRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ExportLDCFlowRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public ExportLDCFlowRuleRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public ExportLDCFlowRuleRequest setAppsRepeatList(java.util.List<String> appsRepeatList) {
        this.appsRepeatList = appsRepeatList;
        return this;
    }
    public java.util.List<String> getAppsRepeatList() {
        return this.appsRepeatList;
    }

}
