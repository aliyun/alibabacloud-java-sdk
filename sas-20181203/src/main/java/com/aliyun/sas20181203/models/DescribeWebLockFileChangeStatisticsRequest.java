// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockFileChangeStatisticsRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     */
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
