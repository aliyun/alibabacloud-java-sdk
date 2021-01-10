// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCFlowRuleRequest extends TeaModel {
    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static QueryLDCFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCFlowRuleRequest self = new QueryLDCFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public QueryLDCFlowRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public QueryLDCFlowRuleRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
