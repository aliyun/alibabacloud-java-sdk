// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoDetailListRequest extends TeaModel {
    /**
     * <p>The search conditions for assets. This parameter is in JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>name</strong>: the search item.</li>
     * <li><strong>value</strong>: the value of the search item.</li>
     * <li><strong>logicalExp</strong>: the logical relationship among multiple search item values. Valid values:<ul>
     * <li><strong>OR</strong>: The search item values are evaluated by using a logical OR.</li>
     * <li><strong>AND</strong>: The search item values are evaluated by using a logical AND.<blockquote>
     * <p>Call the <a href="~~DescribeImageRepoCriteria~~">DescribeImageRepoCriteria</a> operation to query the supported search conditions.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;vulStatus&quot;,&quot;value&quot;:&quot;YES&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The page number of the first page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The logical relationship among multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: The conditions are evaluated by using a logical OR.</li>
     * <li><strong>AND</strong>: The conditions are evaluated by using a logical AND.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The maximum number of entries per page when using paging. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
