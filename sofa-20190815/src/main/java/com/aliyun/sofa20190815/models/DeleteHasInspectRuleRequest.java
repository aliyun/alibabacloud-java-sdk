// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasInspectRuleRequest extends TeaModel {
    @NameInMap("RuleId")
    public String ruleId;

    public static DeleteHasInspectRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasInspectRuleRequest self = new DeleteHasInspectRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasInspectRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
