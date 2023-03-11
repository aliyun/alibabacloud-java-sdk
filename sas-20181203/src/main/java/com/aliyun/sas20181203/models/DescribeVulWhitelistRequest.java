// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulWhitelistRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeVulWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulWhitelistRequest self = new DescribeVulWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulWhitelistRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVulWhitelistRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
