// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateAgentInstanceConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("configMatcher")
    public String configMatcher;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("configName")
    public String configName;

    @NameInMap("isGray")
    public Boolean isGray;

    public static CreateAgentInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentInstanceConfigRequest self = new CreateAgentInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentInstanceConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateAgentInstanceConfigRequest setConfigMatcher(String configMatcher) {
        this.configMatcher = configMatcher;
        return this;
    }
    public String getConfigMatcher() {
        return this.configMatcher;
    }

    public CreateAgentInstanceConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public CreateAgentInstanceConfigRequest setIsGray(Boolean isGray) {
        this.isGray = isGray;
        return this;
    }
    public Boolean getIsGray() {
        return this.isGray;
    }

}
