// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoDetailListRequest extends TeaModel {
    /**
     * <p>The search conditions for assets. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **name**: the search condition.</p>
     * <br>
     * <p>*   **name**: the value of the search condition.</p>
     * <br>
     * <p>*   **logicalExp**: the logical relation for multiple search conditions. Valid values:</p>
     * <br>
     * <p>    *   **OR**: The search conditions use a logical **OR**.</p>
     * <p>    *   **AND**: The search conditions use a logical **AND**.</p>
     * <br>
     * <p>> You can call the [DescribeImageRepoCriteria](~~DescribeImageRepoCriteria~~) operation to query the supported search conditions.</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The logical relationship that you want to use to evaluate multiple search conditions. Valid values:</p>
     * <br>
     * <p>*   **OR**: Search conditions are evaluated by using a logical **OR**.</p>
     * <p>*   **AND**: Search conditions are evaluated by using a logical **AND**.</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>> We recommend that you do not leave this parameter empty.</p>
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
