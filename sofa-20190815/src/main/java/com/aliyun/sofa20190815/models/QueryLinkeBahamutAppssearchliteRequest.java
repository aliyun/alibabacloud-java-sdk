// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppssearchliteRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("TenantPath")
    public String tenantPath;

    public static QueryLinkeBahamutAppssearchliteRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppssearchliteRequest self = new QueryLinkeBahamutAppssearchliteRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppssearchliteRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryLinkeBahamutAppssearchliteRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public QueryLinkeBahamutAppssearchliteRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryLinkeBahamutAppssearchliteRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
