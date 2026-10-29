// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryPenetrationTestListRequest extends TeaModel {
    /**
     * <p>The current page number.</p>
     * <blockquote>
     * <p>Default value: 1</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page.</p>
     * <blockquote>
     * <p>Valid values: 1 to 100. Starting value: 1. Default value: 10.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryPenetrationTestListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPenetrationTestListRequest self = new QueryPenetrationTestListRequest();
        return TeaModel.build(map, self);
    }

    public QueryPenetrationTestListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryPenetrationTestListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
