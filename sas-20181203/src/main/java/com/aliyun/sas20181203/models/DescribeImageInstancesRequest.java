// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageInstancesRequest extends TeaModel {
    /**
     * <p>Sets the conditions for searching assets. This parameter is in JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>name</strong>: The search item.</li>
     * <li><strong>value</strong>: The value of the search item.</li>
     * <li><strong>logicalExp</strong>: The logical relationship between multiple search item values. Valid values:<ul>
     * <li><strong>OR</strong>: The multiple search item values are in an <strong>OR</strong> relationship.</li>
     * <li><strong>AND</strong>: The multiple search item values are in an <strong>AND</strong> relationship.<blockquote>
     * <p>You can call the <a href="~~DescribeImageRepoCriteria~~">DescribeImageRepoCriteria</a> operation to query supported search conditions.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;instanceId&quot;,&quot;value&quot;:&quot;390100182&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The page number of the returned results to start displaying. The starting value is <strong>1</strong>. Default value: <strong>1</strong>, which indicates that page 1 is displayed.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Sets the logical relationship between multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: The multiple search conditions are in an <strong>OR</strong> relationship.</li>
     * <li><strong>AND</strong>: The multiple search conditions are in an <strong>AND</strong> relationship.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The maximum number of entries to return on each page during a paged query. The default number of entries per page is 20. If the PageSize parameter is left empty, 20 entries are returned by default.</p>
     * <blockquote>
     * <p>We recommend that you do not leave the PageSize parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Indicates whether the image has been scanned. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: processed.</li>
     * <li><strong>false</strong>: not processed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Scanned")
    public Boolean scanned;

    public static DescribeImageInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageInstancesRequest self = new DescribeImageInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageInstancesRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public DescribeImageInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageInstancesRequest setLogicalExp(String logicalExp) {
        this.logicalExp = logicalExp;
        return this;
    }
    public String getLogicalExp() {
        return this.logicalExp;
    }

    public DescribeImageInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageInstancesRequest setScanned(Boolean scanned) {
        this.scanned = scanned;
        return this;
    }
    public Boolean getScanned() {
        return this.scanned;
    }

}
