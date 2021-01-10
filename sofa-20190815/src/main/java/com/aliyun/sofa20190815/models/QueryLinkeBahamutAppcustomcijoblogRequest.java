// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppcustomcijoblogRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Branch")
    public String branch;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutAppcustomcijoblogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppcustomcijoblogRequest self = new QueryLinkeBahamutAppcustomcijoblogRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppcustomcijoblogRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryLinkeBahamutAppcustomcijoblogRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public QueryLinkeBahamutAppcustomcijoblogRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public QueryLinkeBahamutAppcustomcijoblogRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryLinkeBahamutAppcustomcijoblogRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
