// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeModelingProjectListRequest extends TeaModel {
    /**
     * <p>Current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Pagination parameter: number of items per page, with a default value of 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Project status.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPARING</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeModelingProjectListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelingProjectListRequest self = new DescribeModelingProjectListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModelingProjectListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeModelingProjectListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeModelingProjectListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
