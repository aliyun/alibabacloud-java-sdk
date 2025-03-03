// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteAutoGroupingRuleRequest extends TeaModel {
    /**
     * <p>The ID of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gr-acfo******hy6a</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static DeleteAutoGroupingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoGroupingRuleRequest self = new DeleteAutoGroupingRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoGroupingRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
