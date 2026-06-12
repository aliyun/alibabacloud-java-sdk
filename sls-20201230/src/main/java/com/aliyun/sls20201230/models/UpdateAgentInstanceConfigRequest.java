// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateAgentInstanceConfigRequest extends TeaModel {
    /**
     * <p>The attributes that specify the scope of the process-level configuration.</p>
     */
    @NameInMap("attributes")
    public java.util.Map<String, String> attributes;

    /**
     * <p>The default configurations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The configurations for the canary release environment.</p>
     */
    @NameInMap("grayConfigs")
    public java.util.List<AgentInstanceConfigGrayConfigs> grayConfigs;

    public static UpdateAgentInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentInstanceConfigRequest self = new UpdateAgentInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentInstanceConfigRequest setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    public UpdateAgentInstanceConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateAgentInstanceConfigRequest setGrayConfigs(java.util.List<AgentInstanceConfigGrayConfigs> grayConfigs) {
        this.grayConfigs = grayConfigs;
        return this;
    }
    public java.util.List<AgentInstanceConfigGrayConfigs> getGrayConfigs() {
        return this.grayConfigs;
    }

}
