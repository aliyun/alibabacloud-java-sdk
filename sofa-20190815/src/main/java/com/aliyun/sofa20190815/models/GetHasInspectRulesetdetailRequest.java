// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectRulesetdetailRequest extends TeaModel {
    @NameInMap("RuleSetId")
    public String ruleSetId;

    public static GetHasInspectRulesetdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectRulesetdetailRequest self = new GetHasInspectRulesetdetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectRulesetdetailRequest setRuleSetId(String ruleSetId) {
        this.ruleSetId = ruleSetId;
        return this;
    }
    public String getRuleSetId() {
        return this.ruleSetId;
    }

}
