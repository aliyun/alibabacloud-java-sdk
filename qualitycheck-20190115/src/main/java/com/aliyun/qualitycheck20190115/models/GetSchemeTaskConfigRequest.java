// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetSchemeTaskConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;sourceDataType&quot;:3,&quot;id&quot;:588}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetSchemeTaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSchemeTaskConfigRequest self = new GetSchemeTaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetSchemeTaskConfigRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetSchemeTaskConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
