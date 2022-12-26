// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockProcessBlockStatisticsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeWebLockProcessBlockStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockProcessBlockStatisticsRequest self = new DescribeWebLockProcessBlockStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockProcessBlockStatisticsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebLockProcessBlockStatisticsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
