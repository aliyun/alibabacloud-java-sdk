// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateAgentInstanceConfigShrinkRequest extends TeaModel {
    @NameInMap("attributes")
    public String attributesShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("config")
    public String config;

    @NameInMap("grayConfigs")
    public java.util.List<AgentInstanceConfigGrayConfigs> grayConfigs;

    public static UpdateAgentInstanceConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentInstanceConfigShrinkRequest self = new UpdateAgentInstanceConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentInstanceConfigShrinkRequest setAttributesShrink(String attributesShrink) {
        this.attributesShrink = attributesShrink;
        return this;
    }
    public String getAttributesShrink() {
        return this.attributesShrink;
    }

    public UpdateAgentInstanceConfigShrinkRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateAgentInstanceConfigShrinkRequest setGrayConfigs(java.util.List<AgentInstanceConfigGrayConfigs> grayConfigs) {
        this.grayConfigs = grayConfigs;
        return this;
    }
    public java.util.List<AgentInstanceConfigGrayConfigs> getGrayConfigs() {
        return this.grayConfigs;
    }

}
