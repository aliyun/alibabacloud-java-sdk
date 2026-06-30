// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateQualityCheckSchemeRequest extends TeaModel {
    /**
     * <p>Workspace ID</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>JSON request body. For details, see the parameter description in the request parameters section.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dataType&quot;:1,&quot;name&quot;:&quot;质检方案A&quot;,&quot;type&quot;:1}</p>
     */
    @NameInMap("jsonStr")
    public String jsonStr;

    public static CreateQualityCheckSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityCheckSchemeRequest self = new CreateQualityCheckSchemeRequest();
        return TeaModel.build(map, self);
    }

    public CreateQualityCheckSchemeRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public CreateQualityCheckSchemeRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
