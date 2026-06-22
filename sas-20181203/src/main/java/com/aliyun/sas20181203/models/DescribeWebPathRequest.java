// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebPathRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paged query. Paging is used to display results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The maximum number of entries per page in a paged query. Paging is used to display results.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The alert configuration type. Valid values:</p>
     * <ul>
     * <li><strong>web_path</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>web_path</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeWebPathRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebPathRequest self = new DescribeWebPathRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebPathRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebPathRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWebPathRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
