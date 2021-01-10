// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricAllmsgappliesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkefabricFabricAllmsgappliesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricAllmsgappliesRequest self = new QueryLinkefabricFabricAllmsgappliesRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricAllmsgappliesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkefabricFabricAllmsgappliesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryLinkefabricFabricAllmsgappliesRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public QueryLinkefabricFabricAllmsgappliesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
