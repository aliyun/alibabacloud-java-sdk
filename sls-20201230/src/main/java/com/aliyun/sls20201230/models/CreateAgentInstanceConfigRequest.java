// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateAgentInstanceConfigRequest extends TeaModel {
    /**
     * <p>The process that the configuration applies to.</p>
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
     * <p>The type of the process-level configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apm_trace</p>
     */
    @NameInMap("configType")
    public String configType;

    /**
     * <p>The canary release environment.</p>
     */
    @NameInMap("grayConfigs")
    public java.util.List<AgentInstanceConfigGrayConfigs> grayConfigs;

    public static CreateAgentInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentInstanceConfigRequest self = new CreateAgentInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentInstanceConfigRequest setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    public CreateAgentInstanceConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateAgentInstanceConfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public CreateAgentInstanceConfigRequest setGrayConfigs(java.util.List<AgentInstanceConfigGrayConfigs> grayConfigs) {
        this.grayConfigs = grayConfigs;
        return this;
    }
    public java.util.List<AgentInstanceConfigGrayConfigs> getGrayConfigs() {
        return this.grayConfigs;
    }

}
