// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateCheckTypeToSchemeRequest extends TeaModel {
    /**
     * <p>The baseMeAgentId.</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>Input parameter in JSON format. For more information, see the request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;schemeId&quot;:&quot;187&quot;,&quot;checkName&quot;:&quot;服务规范性检测2&quot;,&quot;sourceScore&quot;:20,&quot;checkType&quot;:0}</p>
     */
    @NameInMap("jsonStr")
    public String jsonStr;

    public static UpdateCheckTypeToSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCheckTypeToSchemeRequest self = new UpdateCheckTypeToSchemeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCheckTypeToSchemeRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UpdateCheckTypeToSchemeRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
