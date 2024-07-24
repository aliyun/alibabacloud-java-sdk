// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleDetailRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ruleIds&quot;:&quot;123&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetRuleDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuleDetailRequest self = new GetRuleDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetRuleDetailRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetRuleDetailRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
