// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricMsgpretaskRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("EnvName")
    public String envName;

    @NameInMap("ExtraQuery")
    public Boolean extraQuery;

    @NameInMap("IsProdUrl")
    public Boolean isProdUrl;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static ExecLinkefabricFabricMsgpretaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricMsgpretaskRequest self = new ExecLinkefabricFabricMsgpretaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricMsgpretaskRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ExecLinkefabricFabricMsgpretaskRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public ExecLinkefabricFabricMsgpretaskRequest setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public ExecLinkefabricFabricMsgpretaskRequest setExtraQuery(Boolean extraQuery) {
        this.extraQuery = extraQuery;
        return this;
    }
    public Boolean getExtraQuery() {
        return this.extraQuery;
    }

    public ExecLinkefabricFabricMsgpretaskRequest setIsProdUrl(Boolean isProdUrl) {
        this.isProdUrl = isProdUrl;
        return this;
    }
    public Boolean getIsProdUrl() {
        return this.isProdUrl;
    }

    public ExecLinkefabricFabricMsgpretaskRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ExecLinkefabricFabricMsgpretaskRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public ExecLinkefabricFabricMsgpretaskRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
