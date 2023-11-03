// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteContainerDefenseRuleRequest extends TeaModel {
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
