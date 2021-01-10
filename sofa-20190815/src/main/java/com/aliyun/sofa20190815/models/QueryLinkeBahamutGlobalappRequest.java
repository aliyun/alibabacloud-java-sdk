// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutGlobalappRequest extends TeaModel {
    @NameInMap("Field")
    public String field;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Order")
    public String order;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutGlobalappRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutGlobalappRequest self = new QueryLinkeBahamutGlobalappRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutGlobalappRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public QueryLinkeBahamutGlobalappRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryLinkeBahamutGlobalappRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryLinkeBahamutGlobalappRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public QueryLinkeBahamutGlobalappRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryLinkeBahamutGlobalappRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
