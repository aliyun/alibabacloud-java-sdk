// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AddRuleV4Request extends TeaModel {
    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>Specifies whether to copy the rule. Set this to \<code>true\\</code> to copy the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsCopy")
    public Boolean isCopy;

    /**
     * <p>For more information about JsonStrForRule, see <a href="https://help.aliyun.com/document_detail/453053.html"><code>Rule object description</code></a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("JsonStrForRule")
    public String jsonStrForRule;

    public static AddRuleV4Request build(java.util.Map<String, ?> map) throws Exception {
        AddRuleV4Request self = new AddRuleV4Request();
        return TeaModel.build(map, self);
    }

    public AddRuleV4Request setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public AddRuleV4Request setIsCopy(Boolean isCopy) {
        this.isCopy = isCopy;
        return this;
    }
    public Boolean getIsCopy() {
        return this.isCopy;
    }

    public AddRuleV4Request setJsonStrForRule(String jsonStrForRule) {
        this.jsonStrForRule = jsonStrForRule;
        return this;
    }
    public String getJsonStrForRule() {
        return this.jsonStrForRule;
    }

}
