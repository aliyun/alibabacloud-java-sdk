// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetContainerDefenseRuleDetailRequest extends TeaModel {
    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>>  You can call the [ListContainerDefenseRule](~~xx~~) operation to obtain the IDs of rules.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static GetContainerDefenseRuleDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContainerDefenseRuleDetailRequest self = new GetContainerDefenseRuleDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetContainerDefenseRuleDetailRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
