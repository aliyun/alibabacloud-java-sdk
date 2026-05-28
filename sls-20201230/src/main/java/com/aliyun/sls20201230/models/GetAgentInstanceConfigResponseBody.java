// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetAgentInstanceConfigResponseBody extends TeaModel {
    @NameInMap("attributes")
    public java.util.Map<String, String> attributes;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <strong>example:</strong>
     * <p>apm_biz_trace</p>
     */
    @NameInMap("configType")
    public String configType;

    /**
     * <strong>example:</strong>
     * <p>1749543828</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    @NameInMap("grayConfigs")
    public java.util.List<AgentInstanceConfigGrayConfigs> grayConfigs;

    /**
     * <strong>example:</strong>
     * <p>1749543828</p>
     */
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    public static GetAgentInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentInstanceConfigResponseBody self = new GetAgentInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentInstanceConfigResponseBody setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    public GetAgentInstanceConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetAgentInstanceConfigResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetAgentInstanceConfigResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetAgentInstanceConfigResponseBody setGrayConfigs(java.util.List<AgentInstanceConfigGrayConfigs> grayConfigs) {
        this.grayConfigs = grayConfigs;
        return this;
    }
    public java.util.List<AgentInstanceConfigGrayConfigs> getGrayConfigs() {
        return this.grayConfigs;
    }

    public GetAgentInstanceConfigResponseBody setLastModifyTime(Long lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

}
