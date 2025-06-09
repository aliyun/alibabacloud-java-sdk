// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateAgentInstanceConfigRequest extends TeaModel {
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

    @NameInMap("grayConfigs")
    public String grayConfigs;

    public static UpdateAgentInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentInstanceConfigRequest self = new UpdateAgentInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentInstanceConfigRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public UpdateAgentInstanceConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateAgentInstanceConfigRequest setGrayConfigs(String grayConfigs) {
        this.grayConfigs = grayConfigs;
        return this;
    }
    public String getGrayConfigs() {
        return this.grayConfigs;
    }

}
