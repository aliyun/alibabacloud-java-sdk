// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleByIdRequest extends TeaModel {
    /**
     * <p>The business space ID.</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>53</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static GetRuleByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuleByIdRequest self = new GetRuleByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetRuleByIdRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetRuleByIdRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
