// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricDrmresourcetplRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("SiteType")
    public String siteType;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkefabricFabricDrmresourcetplRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricDrmresourcetplRequest self = new QueryLinkefabricFabricDrmresourcetplRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricDrmresourcetplRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkefabricFabricDrmresourcetplRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryLinkefabricFabricDrmresourcetplRequest setSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }
    public String getSiteType() {
        return this.siteType;
    }

    public QueryLinkefabricFabricDrmresourcetplRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
