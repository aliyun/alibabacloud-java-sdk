// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectRuleapplyfordeleteRequest extends TeaModel {
    @NameInMap("RuleId")
    public String ruleId;

    public static ExecHasInspectRuleapplyfordeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectRuleapplyfordeleteRequest self = new ExecHasInspectRuleapplyfordeleteRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectRuleapplyfordeleteRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
