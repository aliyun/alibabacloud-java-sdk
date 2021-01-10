// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutIterationsRequest extends TeaModel {
    @NameInMap("BahamutTenant")
    public String bahamutTenant;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Search")
    public String search;

    public static QueryLinkeBahamutIterationsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutIterationsRequest self = new QueryLinkeBahamutIterationsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutIterationsRequest setBahamutTenant(String bahamutTenant) {
        this.bahamutTenant = bahamutTenant;
        return this;
    }
    public String getBahamutTenant() {
        return this.bahamutTenant;
    }

    public QueryLinkeBahamutIterationsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public QueryLinkeBahamutIterationsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryLinkeBahamutIterationsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

}
