// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoDetailListRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeImageRepoDetailListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageRepoDetailListRequest self = new DescribeImageRepoDetailListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageRepoDetailListRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public DescribeImageRepoDetailListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageRepoDetailListRequest setLogicalExp(String logicalExp) {
        this.logicalExp = logicalExp;
        return this;
    }
    public String getLogicalExp() {
        return this.logicalExp;
    }

    public DescribeImageRepoDetailListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
