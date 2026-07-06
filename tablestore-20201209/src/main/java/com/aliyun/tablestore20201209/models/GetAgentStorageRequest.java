// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class GetAgentStorageRequest extends TeaModel {
    /**
     * <p>The name of the agent storage.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-test</p>
     */
    @NameInMap("AgentStorageName")
    public String agentStorageName;

    public static GetAgentStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentStorageRequest self = new GetAgentStorageRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentStorageRequest setAgentStorageName(String agentStorageName) {
        this.agentStorageName = agentStorageName;
        return this;
    }
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

}
