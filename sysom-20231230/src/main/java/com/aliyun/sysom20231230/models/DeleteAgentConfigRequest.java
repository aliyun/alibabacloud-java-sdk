// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class DeleteAgentConfigRequest extends TeaModel {
    /**
     * <p>The ID of the component associated with the configuration to be deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>The ID of the component configuration to delete.</p>
     * 
     * <strong>example:</strong>
     * <p>4d5ecf02-3d01-11f0-8c90-00163e1029af</p>
     */
    @NameInMap("configId")
    public String configId;

    public static DeleteAgentConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentConfigRequest self = new DeleteAgentConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgentConfigRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public DeleteAgentConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

}
