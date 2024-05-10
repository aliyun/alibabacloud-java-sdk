// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetContainerDefenseRuleDetailRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * <br>
     * <p>>  You can call the [ListContainerDefenseRule](https://help.aliyun.com/document_detail/2590599.html) operation to query the rule ID.</p>
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
