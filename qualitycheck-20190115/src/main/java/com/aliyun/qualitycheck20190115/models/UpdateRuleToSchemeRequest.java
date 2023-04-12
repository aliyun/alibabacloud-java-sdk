// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateRuleToSchemeRequest extends TeaModel {
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    @NameInMap("jsonStr")
    public String jsonStr;

    public static UpdateRuleToSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleToSchemeRequest self = new UpdateRuleToSchemeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRuleToSchemeRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UpdateRuleToSchemeRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
