// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloneHasInspectRuleRequest extends TeaModel {
    @NameInMap("RuleId")
    public String ruleId;

    public static CloneHasInspectRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneHasInspectRuleRequest self = new CloneHasInspectRuleRequest();
        return TeaModel.build(map, self);
    }

    public CloneHasInspectRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
