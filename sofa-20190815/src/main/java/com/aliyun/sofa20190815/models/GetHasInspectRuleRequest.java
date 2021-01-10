// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectRuleRequest extends TeaModel {
    @NameInMap("RuleId")
    public String ruleId;

    public static GetHasInspectRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectRuleRequest self = new GetHasInspectRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
