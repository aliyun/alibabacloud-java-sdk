// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseAccountRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("DatabaseId")
    public String databaseId;

    @NameInMap("PageSize")
    public Long pageSize;

    public static QueryCasDatabaseAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseAccountRequest self = new QueryCasDatabaseAccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseAccountRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCasDatabaseAccountRequest setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }
    public String getDatabaseId() {
        return this.databaseId;
    }

    public QueryCasDatabaseAccountRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
