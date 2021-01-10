// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutArchdomainRequest extends TeaModel {
    @NameInMap("Current")
    public String current;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("TenantPath")
    public String tenantPath;

    public static QueryLinkeBahamutArchdomainRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutArchdomainRequest self = new QueryLinkeBahamutArchdomainRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutArchdomainRequest setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public QueryLinkeBahamutArchdomainRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryLinkeBahamutArchdomainRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryLinkeBahamutArchdomainRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
