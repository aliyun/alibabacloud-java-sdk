// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageInstancesRequest extends TeaModel {
    /**
     * <p>The search condition that is used to filter the server. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><p><strong>name</strong>: the search condition</p>
     * </li>
     * <li><p><strong>name</strong>: the value of the search condition</p>
     * </li>
     * <li><p><strong>logicalExp</strong>: the logical relation for multiple search conditions Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: The search conditions use a logical <strong>OR</strong>.</li>
     * <li><strong>AND</strong>: The search conditions use a logical <strong>AND</strong>.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/471822.html">DescribeImageCriteria</a> operation to query the supported search conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;instanceId&quot;,&quot;value&quot;:&quot;390100182&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The number of the page to return. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The logical relationship that you want to use to evaluate multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: The search conditions are evaluated by using a logical <strong>OR</strong>.</li>
     * <li><strong>AND</strong>: The search conditions are evaluated by using a logical <strong>AND</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p>: We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether the image is scanned. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
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
