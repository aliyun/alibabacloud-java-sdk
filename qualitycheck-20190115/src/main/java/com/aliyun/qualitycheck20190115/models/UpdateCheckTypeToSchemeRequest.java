// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateCheckTypeToSchemeRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

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
