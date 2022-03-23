// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeSearchTablesRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SearchTableIds")
    public String searchTableIds;

    public static DescribeSearchTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchTablesRequest self = new DescribeSearchTablesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSearchTablesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSearchTablesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSearchTablesRequest setSearchTableIds(String searchTableIds) {
        this.searchTableIds = searchTableIds;
        return this;
    }
    public String getSearchTableIds() {
        return this.searchTableIds;
    }

}
