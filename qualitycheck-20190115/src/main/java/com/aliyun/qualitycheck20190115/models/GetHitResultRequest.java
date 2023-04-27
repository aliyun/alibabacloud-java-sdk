// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetHitResultRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetHitResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHitResultRequest self = new GetHitResultRequest();
        return TeaModel.build(map, self);
    }

    public GetHitResultRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetHitResultRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
