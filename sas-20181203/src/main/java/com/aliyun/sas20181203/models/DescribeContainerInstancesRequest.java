// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerInstancesRequest extends TeaModel {
    /**
     * <p>The search conditions for assets. This parameter is in JSON format. Note that field names are case-sensitive. The following fields are included:</p>
     * <ul>
     * <li><strong>name</strong>: the search item.</li>
     * <li><strong>value</strong>: the value of the search item.</li>
     * <li><strong>logicalExp</strong>: the logical relationship between multiple conditions. Valid values:<ul>
     * <li><strong>OR</strong>: The conditions are in an OR relationship.</li>
     * <li><strong>AND</strong>: The conditions are in an AND relationship.<blockquote>
     * <p>You can search for assets by container ID, cluster ID, cluster name, cluster type, risk level, region, and other conditions. Call the <a href="~~DescribeContainerCriteria~~">DescribeContainerCriteria</a> operation to query the supported search conditions.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;flag&quot;,&quot;value&quot;:&quot;0|8&quot;,&quot;logicalExp&quot;:&quot;AND&quot;},{&quot;name&quot;:&quot;ecsType&quot;,&quot;value&quot;:&quot;!8&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}][{&quot;name&quot;:&quot;clusterType&quot;,&quot;value&quot;:&quot;NotManagedKubernetes&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The page number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The logical relationship between multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: The conditions are in an OR relationship.</li>
     * <li><strong>AND</strong>: The conditions are in an AND relationship.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The maximum number of entries per page in a paging query. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
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
