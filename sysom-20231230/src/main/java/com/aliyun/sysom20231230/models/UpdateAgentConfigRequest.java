// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateAgentConfigRequest extends TeaModel {
    /**
     * <p>The ID of the component whose configuration you want to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>The ID of the component configuration to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f0078fbb-4213-11f0-a19b-00163e4ae208</p>
     */
    @NameInMap("configId")
    public String configId;

    /**
     * <p>The new content of the component configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;oomkill&quot;:{&quot;enable&quot;:false}}</p>
     */
    @NameInMap("content")
    public String content;

    public static UpdateAgentConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentConfigRequest self = new UpdateAgentConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentConfigRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdateAgentConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public UpdateAgentConfigRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
