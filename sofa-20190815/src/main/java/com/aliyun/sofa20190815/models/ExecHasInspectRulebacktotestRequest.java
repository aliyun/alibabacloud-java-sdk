// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectRulebacktotestRequest extends TeaModel {
    @NameInMap("RuleId")
    public String ruleId;

    public static ExecHasInspectRulebacktotestRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectRulebacktotestRequest self = new ExecHasInspectRulebacktotestRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectRulebacktotestRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
