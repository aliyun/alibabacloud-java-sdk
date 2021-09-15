// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExcludeSystemPathRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static DescribeExcludeSystemPathRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcludeSystemPathRequest self = new DescribeExcludeSystemPathRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExcludeSystemPathRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeExcludeSystemPathRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
