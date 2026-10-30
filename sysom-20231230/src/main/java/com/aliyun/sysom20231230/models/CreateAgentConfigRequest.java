// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateAgentConfigRequest extends TeaModel {
    /**
     * <p>The ID of the agent associated with the configuration. You can obtain the agent ID from ListAgents.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>The name of the configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Configuration 1</p>
     */
    @NameInMap("configName")
    public String configName;

    /**
     * <p>The content of the configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;oomkill&quot;:{&quot;enable&quot;:false}}</p>
     */
    @NameInMap("content")
    public String content;

    public static CreateAgentConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentConfigRequest self = new CreateAgentConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentConfigRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CreateAgentConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public CreateAgentConfigRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
