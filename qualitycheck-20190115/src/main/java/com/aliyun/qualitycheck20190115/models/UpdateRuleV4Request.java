// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateRuleV4Request extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>For details about JsonStrForRule, see the document <a href="https://help.aliyun.com/document_detail/453053.html"><code>Rule Object Description</code></a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("JsonStrForRule")
    public String jsonStrForRule;

    /**
     * <p>Rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static UpdateRuleV4Request build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleV4Request self = new UpdateRuleV4Request();
        return TeaModel.build(map, self);
    }

    public UpdateRuleV4Request setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UpdateRuleV4Request setJsonStrForRule(String jsonStrForRule) {
        this.jsonStrForRule = jsonStrForRule;
        return this;
    }
    public String getJsonStrForRule() {
        return this.jsonStrForRule;
    }

    public UpdateRuleV4Request setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
