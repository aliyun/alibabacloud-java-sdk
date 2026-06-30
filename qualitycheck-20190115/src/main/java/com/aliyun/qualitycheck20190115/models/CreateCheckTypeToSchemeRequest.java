// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateCheckTypeToSchemeRequest extends TeaModel {
    /**
     * <p>Workspace ID</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>Request parameter in JSON format. For details, see the additional information about request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;schemeId&quot;:&quot;187&quot;,&quot;checkName&quot;:&quot;质检维度名&quot;,&quot;sourceScore&quot;:20}</p>
     */
    @NameInMap("jsonStr")
    public String jsonStr;

    public static CreateCheckTypeToSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCheckTypeToSchemeRequest self = new CreateCheckTypeToSchemeRequest();
        return TeaModel.build(map, self);
    }

    public CreateCheckTypeToSchemeRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public CreateCheckTypeToSchemeRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
