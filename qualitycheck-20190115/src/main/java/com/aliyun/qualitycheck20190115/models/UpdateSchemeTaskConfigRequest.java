// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateSchemeTaskConfigRequest extends TeaModel {
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    @NameInMap("jsonStr")
    public String jsonStr;

    public static UpdateSchemeTaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchemeTaskConfigRequest self = new UpdateSchemeTaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSchemeTaskConfigRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UpdateSchemeTaskConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
