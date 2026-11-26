// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetHttpEventConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;id&quot;:&quot;配置ID&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetHttpEventConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHttpEventConfigRequest self = new GetHttpEventConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetHttpEventConfigRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetHttpEventConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
