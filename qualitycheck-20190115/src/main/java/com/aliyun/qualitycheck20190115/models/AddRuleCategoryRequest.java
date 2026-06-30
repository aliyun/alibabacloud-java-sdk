// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AddRuleCategoryRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     * 
     * <strong>example:</strong>
     * <p>1232927</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>A JSON-formatted string. For details, see the following information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;typeName&quot;:&quot;规则类型A&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static AddRuleCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRuleCategoryRequest self = new AddRuleCategoryRequest();
        return TeaModel.build(map, self);
    }

    public AddRuleCategoryRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public AddRuleCategoryRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
