// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class InvalidRuleRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ruleIds&quot;:[3,4]}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static InvalidRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        InvalidRuleRequest self = new InvalidRuleRequest();
        return TeaModel.build(map, self);
    }

    public InvalidRuleRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public InvalidRuleRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
