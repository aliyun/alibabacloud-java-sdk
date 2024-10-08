// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteContainerDefenseRuleRequest extends TeaModel {
    /**
     * <p>The IDs of the rules that you want to delete.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2590599.html">ListContainerDefenseRule</a> operation to query the rule IDs.</p>
     * </blockquote>
     */
    @NameInMap("RuleIds")
    public java.util.List<Long> ruleIds;

    public static DeleteContainerDefenseRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContainerDefenseRuleRequest self = new DeleteContainerDefenseRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContainerDefenseRuleRequest setRuleIds(java.util.List<Long> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public java.util.List<Long> getRuleIds() {
        return this.ruleIds;
    }

}
