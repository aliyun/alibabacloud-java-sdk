// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetQualityCheckSchemeRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;schemeId&quot;:&quot;187&quot;,&quot;ruleRequireInfos&quot;:[&quot;BusinessNameInfo&quot;,&quot;RuleCategory&quot;]}</p>
     */
    @NameInMap("jsonStr")
    public String jsonStr;

    public static GetQualityCheckSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityCheckSchemeRequest self = new GetQualityCheckSchemeRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityCheckSchemeRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetQualityCheckSchemeRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
