// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAgentRequest extends TeaModel {
    @NameInMap("agent_id")
    public String agentId;

    public static GetAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentRequest self = new GetAgentRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

}
