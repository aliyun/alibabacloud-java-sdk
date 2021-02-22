// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryFilterListResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 筛选模板列表。
    @NameInMap("filters")
    public java.util.List<Filter> filters;

    // 总条数
    @NameInMap("totalCount")
    public Long totalCount;

    public static QueryFilterListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFilterListResponseBody self = new QueryFilterListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFilterListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFilterListResponseBody setFilters(java.util.List<Filter> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<Filter> getFilters() {
        return this.filters;
    }

    public QueryFilterListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
