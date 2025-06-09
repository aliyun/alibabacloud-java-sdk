// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateAgentInstanceConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("attributes")
    public String attributes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("configType")
    public String configType;

    @NameInMap("grayConfigs")
    public String grayConfigs;

    public static CreateAgentInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentInstanceConfigRequest self = new CreateAgentInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentInstanceConfigRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
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

    public CreateAgentInstanceConfigRequest setGrayConfigs(String grayConfigs) {
        this.grayConfigs = grayConfigs;
        return this;
    }
    public String getGrayConfigs() {
        return this.grayConfigs;
    }

}
