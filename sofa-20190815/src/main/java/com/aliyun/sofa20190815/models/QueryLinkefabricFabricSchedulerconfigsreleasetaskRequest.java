// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSchedulerconfigsreleasetaskRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("SiteType")
    public String siteType;

    @NameInMap("TenantId")
    public Long tenantId;

    public static QueryLinkefabricFabricSchedulerconfigsreleasetaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSchedulerconfigsreleasetaskRequest self = new QueryLinkefabricFabricSchedulerconfigsreleasetaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSchedulerconfigsreleasetaskRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkefabricFabricSchedulerconfigsreleasetaskRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public QueryLinkefabricFabricSchedulerconfigsreleasetaskRequest setSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }
    public String getSiteType() {
        return this.siteType;
    }

    public QueryLinkefabricFabricSchedulerconfigsreleasetaskRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
