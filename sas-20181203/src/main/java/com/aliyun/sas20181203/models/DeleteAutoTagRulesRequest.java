// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAutoTagRulesRequest extends TeaModel {
    /**
     * <p>The ID of the asset auto-tagging rule. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListAutoTagRules~~">ListAutoTagRules</a> operation to query the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2331,56,5644</p>
     */
    @NameInMap("RuleIdList")
    public String ruleIdList;

    public static DeleteAutoTagRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoTagRulesRequest self = new DeleteAutoTagRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoTagRulesRequest setRuleIdList(String ruleIdList) {
        this.ruleIdList = ruleIdList;
        return this;
    }
    public String getRuleIdList() {
        return this.ruleIdList;
    }

}
