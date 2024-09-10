// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerInstancesRequest extends TeaModel {
    /**
     * <p>The search conditions that are used to filter containers. The value of this parameter is in the JSON format and is case-sensitive. The value contains the following fields:</p>
     * <ul>
     * <li><p><strong>name</strong>: the search condition.</p>
     * </li>
     * <li><p><strong>name</strong>: the value of the search condition.</p>
     * </li>
     * <li><p><strong>logicalExp</strong>: the logical relationship among multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: Search conditions are evaluated by using a logical <strong>OR</strong>.</li>
     * <li><strong>AND</strong>: Search conditions are evaluated by using a logical <strong>AND</strong>.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can use search conditions such as the container ID, cluster ID, cluster name, cluster type, risk level, and region. You can call the <a href="~~DescribeContainerCriteria~~">DescribeContainerCriteria</a> operation to query the supported search conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;flag&quot;,&quot;value&quot;:&quot;0|8&quot;,&quot;logicalExp&quot;:&quot;AND&quot;},{&quot;name&quot;:&quot;ecsType&quot;,&quot;value&quot;:&quot;!8&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}][{&quot;name&quot;:&quot;clusterType&quot;,&quot;value&quot;:&quot;NotManagedKubernetes&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The logical operator that you want to use to evaluate multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: Search conditions are evaluated by using a logical <strong>OR</strong>.</li>
     * <li><strong>AND</strong>: Search conditions are evaluated by using a logical <strong>AND</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p>We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeContainerInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerInstancesRequest self = new DescribeContainerInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerInstancesRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public DescribeContainerInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeContainerInstancesRequest setLogicalExp(String logicalExp) {
        this.logicalExp = logicalExp;
        return this;
    }
    public String getLogicalExp() {
        return this.logicalExp;
    }

    public DescribeContainerInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
