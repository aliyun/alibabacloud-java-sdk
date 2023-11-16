// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSasContainerWebDefenseRuleApplicationRequest extends TeaModel {
    @NameInMap("RuleId")
    public Long ruleId;

    public static GetSasContainerWebDefenseRuleApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSasContainerWebDefenseRuleApplicationRequest self = new GetSasContainerWebDefenseRuleApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetSasContainerWebDefenseRuleApplicationRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
