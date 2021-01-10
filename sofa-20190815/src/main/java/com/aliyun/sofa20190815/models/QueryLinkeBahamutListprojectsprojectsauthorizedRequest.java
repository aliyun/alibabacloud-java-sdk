// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutListprojectsprojectsauthorizedRequest extends TeaModel {
    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Search")
    public String search;

    @NameInMap("SearchType")
    public String searchType;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutListprojectsprojectsauthorizedRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutListprojectsprojectsauthorizedRequest self = new QueryLinkeBahamutListprojectsprojectsauthorizedRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
