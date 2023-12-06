// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteSasContainerWebDefenseRuleRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * <br>
     * <p>>  You can call the ListContainerWebDefenseRule operation to query the rule ID.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static DeleteSasContainerWebDefenseRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSasContainerWebDefenseRuleRequest self = new DeleteSasContainerWebDefenseRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSasContainerWebDefenseRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
