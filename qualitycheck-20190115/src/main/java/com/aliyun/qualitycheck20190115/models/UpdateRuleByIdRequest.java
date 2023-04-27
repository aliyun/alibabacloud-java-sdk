// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateRuleByIdRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    @NameInMap("IsCopy")
    public Boolean isCopy;

    @NameInMap("JsonStrForRule")
    public String jsonStrForRule;

    @NameInMap("ReturnRelatedSchemes")
    public Boolean returnRelatedSchemes;

    @NameInMap("RuleId")
    public Long ruleId;

    public static UpdateRuleByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleByIdRequest self = new UpdateRuleByIdRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRuleByIdRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UpdateRuleByIdRequest setIsCopy(Boolean isCopy) {
        this.isCopy = isCopy;
        return this;
    }
    public Boolean getIsCopy() {
        return this.isCopy;
    }

    public UpdateRuleByIdRequest setJsonStrForRule(String jsonStrForRule) {
        this.jsonStrForRule = jsonStrForRule;
        return this;
    }
    public String getJsonStrForRule() {
        return this.jsonStrForRule;
    }

    public UpdateRuleByIdRequest setReturnRelatedSchemes(Boolean returnRelatedSchemes) {
        this.returnRelatedSchemes = returnRelatedSchemes;
        return this;
    }
    public Boolean getReturnRelatedSchemes() {
        return this.returnRelatedSchemes;
    }

    public UpdateRuleByIdRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
