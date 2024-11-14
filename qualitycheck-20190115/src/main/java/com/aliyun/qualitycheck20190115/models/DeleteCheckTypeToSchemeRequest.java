// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteCheckTypeToSchemeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;schemeId&quot;:&quot;1376&quot;,&quot;checkType&quot;:&quot;4&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteCheckTypeToSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCheckTypeToSchemeRequest self = new DeleteCheckTypeToSchemeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCheckTypeToSchemeRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public DeleteCheckTypeToSchemeRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
