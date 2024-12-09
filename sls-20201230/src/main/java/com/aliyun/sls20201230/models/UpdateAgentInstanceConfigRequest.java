// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateAgentInstanceConfigRequest extends TeaModel {
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

    @NameInMap("isGray")
    public Boolean isGray;

    public static UpdateAgentInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentInstanceConfigRequest self = new UpdateAgentInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentInstanceConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateAgentInstanceConfigRequest setConfigMatcher(String configMatcher) {
        this.configMatcher = configMatcher;
        return this;
    }
    public String getConfigMatcher() {
        return this.configMatcher;
    }

    public UpdateAgentInstanceConfigRequest setIsGray(Boolean isGray) {
        this.isGray = isGray;
        return this;
    }
    public Boolean getIsGray() {
        return this.isGray;
    }

}
