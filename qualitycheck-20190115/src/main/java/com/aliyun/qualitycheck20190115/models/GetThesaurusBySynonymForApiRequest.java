// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetThesaurusBySynonymForApiRequest extends TeaModel {
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetThesaurusBySynonymForApiRequest build(java.util.Map<String, ?> map) throws Exception {
        GetThesaurusBySynonymForApiRequest self = new GetThesaurusBySynonymForApiRequest();
        return TeaModel.build(map, self);
    }

    public GetThesaurusBySynonymForApiRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetThesaurusBySynonymForApiRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
