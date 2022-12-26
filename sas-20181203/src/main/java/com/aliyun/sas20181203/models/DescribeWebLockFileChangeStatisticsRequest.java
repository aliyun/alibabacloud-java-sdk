// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockFileChangeStatisticsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeWebLockFileChangeStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockFileChangeStatisticsRequest self = new DescribeWebLockFileChangeStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockFileChangeStatisticsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebLockFileChangeStatisticsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
