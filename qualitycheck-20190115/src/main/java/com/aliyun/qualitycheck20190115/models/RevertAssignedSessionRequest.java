// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RevertAssignedSessionRequest extends TeaModel {
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    @NameInMap("jsonStr")
    public String jsonStr;

    public static RevertAssignedSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        RevertAssignedSessionRequest self = new RevertAssignedSessionRequest();
        return TeaModel.build(map, self);
    }

    public RevertAssignedSessionRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public RevertAssignedSessionRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
