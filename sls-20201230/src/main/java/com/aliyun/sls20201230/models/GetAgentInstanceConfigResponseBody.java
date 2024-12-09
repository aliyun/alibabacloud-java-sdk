// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetAgentInstanceConfigResponseBody extends TeaModel {
    @NameInMap("config")
    public String config;

    @NameInMap("configMatcher")
    public String configMatcher;

    @NameInMap("configName")
    public String configName;

    @NameInMap("createTime")
    public Long createTime;

    @NameInMap("isGray")
    public Boolean isGray;

    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    public static GetAgentInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentInstanceConfigResponseBody self = new GetAgentInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentInstanceConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetAgentInstanceConfigResponseBody setConfigMatcher(String configMatcher) {
        this.configMatcher = configMatcher;
        return this;
    }
    public String getConfigMatcher() {
        return this.configMatcher;
    }

    public GetAgentInstanceConfigResponseBody setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public GetAgentInstanceConfigResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetAgentInstanceConfigResponseBody setIsGray(Boolean isGray) {
        this.isGray = isGray;
        return this;
    }
    public Boolean getIsGray() {
        return this.isGray;
    }

    public GetAgentInstanceConfigResponseBody setLastModifyTime(Long lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

}
