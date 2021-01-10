// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSchedulerconfigsqueryallzoneRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("SiteType")
    public String siteType;

    @NameInMap("TenantId")
    public Long tenantId;

    public static QueryLinkefabricFabricSchedulerconfigsqueryallzoneRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSchedulerconfigsqueryallzoneRequest self = new QueryLinkefabricFabricSchedulerconfigsqueryallzoneRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSchedulerconfigsqueryallzoneRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkefabricFabricSchedulerconfigsqueryallzoneRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public QueryLinkefabricFabricSchedulerconfigsqueryallzoneRequest setSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }
    public String getSiteType() {
        return this.siteType;
    }

    public QueryLinkefabricFabricSchedulerconfigsqueryallzoneRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
