// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateRuleByIdRequest extends TeaModel {
    /**
     * <p>Workspace ID</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>Whether to copy. Setting to true is equivalent to copying the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsCopy")
    public Boolean isCopy;

    /**
     * <p>For more information about the format of JsonStrForlRule, see <a href="https://help.aliyun.com/document_detail/453053.html"><code>Rule object description</code></a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("JsonStrForRule")
    public String jsonStrForRule;

    /**
     * <p>Returns the IDs and names of quality inspection schemes associated with this rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnRelatedSchemes")
    public Boolean returnRelatedSchemes;

    /**
     * <p>Rule ID. Not required when creating, required when modifying.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
