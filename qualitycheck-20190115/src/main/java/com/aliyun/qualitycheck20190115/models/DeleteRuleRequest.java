// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteRuleRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    @NameInMap("ForceDelete")
    public Boolean forceDelete;

    @NameInMap("IsSchemeData")
    public Integer isSchemeData;

    @NameInMap("RuleId")
    public Long ruleId;

    public static DeleteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleRequest self = new DeleteRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRuleRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public DeleteRuleRequest setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
        return this;
    }
    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    public DeleteRuleRequest setIsSchemeData(Integer isSchemeData) {
        this.isSchemeData = isSchemeData;
        return this;
    }
    public Integer getIsSchemeData() {
        return this.isSchemeData;
    }

    public DeleteRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
