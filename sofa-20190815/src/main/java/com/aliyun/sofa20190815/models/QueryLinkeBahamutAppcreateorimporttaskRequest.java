// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppcreateorimporttaskRequest extends TeaModel {
    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Search")
    public String search;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    @NameInMap("UserType")
    public String userType;

    public static QueryLinkeBahamutAppcreateorimporttaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppcreateorimporttaskRequest self = new QueryLinkeBahamutAppcreateorimporttaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppcreateorimporttaskRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public QueryLinkeBahamutAppcreateorimporttaskRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryLinkeBahamutAppcreateorimporttaskRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public QueryLinkeBahamutAppcreateorimporttaskRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

    public QueryLinkeBahamutAppcreateorimporttaskRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
