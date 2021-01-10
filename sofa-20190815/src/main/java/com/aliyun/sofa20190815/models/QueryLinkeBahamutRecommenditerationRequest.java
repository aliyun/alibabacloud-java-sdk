// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutRecommenditerationRequest extends TeaModel {
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

    public static QueryLinkeBahamutRecommenditerationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutRecommenditerationRequest self = new QueryLinkeBahamutRecommenditerationRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutRecommenditerationRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public QueryLinkeBahamutRecommenditerationRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryLinkeBahamutRecommenditerationRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryLinkeBahamutRecommenditerationRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public QueryLinkeBahamutRecommenditerationRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryLinkeBahamutRecommenditerationRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
