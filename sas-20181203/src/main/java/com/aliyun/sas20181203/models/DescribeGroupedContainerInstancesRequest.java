// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedContainerInstancesRequest extends TeaModel {
    /**
     * <p>The conditions for searching assets. This parameter is in JSON format. Separate multiple conditions with commas (,). Example: <code>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;riskLevel&quot;,&quot;value&quot;:&quot;2&quot;}]</code>.</p>
     * <blockquote>
     * <p>You can search for assets by instance ID, instance name, VPC ID, region, public IP address, and other conditions. Call <a href="~~DescribeCriteria~~">DescribeCriteria</a> to query the supported search conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;riskLevel&quot;,&quot;value&quot;:&quot;2&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The page number of the page to return. Default value: <strong>1</strong>, which indicates that the first page is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The search condition for the specified group type. Set the search condition based on the type specified by GroupField:</p>
     * <ul>
     * <li>If <strong>GroupField</strong> is set to <strong>pod</strong>: specify the pod name to query.</li>
     * <li>If <strong>GroupField</strong> is set to <strong>appName</strong>: specify the application name to query.</li>
     * <li>If <strong>GroupField</strong> is set to <strong>namespace</strong>: specify the namespace to query.</li>
     * <li>If <strong>GroupField</strong> is set to <strong>clusterId</strong>: specify the cluster ID to query.</li>
     * <li>If <strong>GroupField</strong> is set to <strong>image</strong>: specify the image name to query.<blockquote>
     * <p>All the preceding search conditions support fuzzy match.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cas-adad-qeqwe</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The group type to query. Valid values:</p>
     * <ul>
     * <li><strong>pod</strong>: pod</li>
     * <li><strong>appName</strong>: application name</li>
     * <li><strong>namespace</strong>: namespace</li>
     * <li><strong>clusterId</strong>: cluster ID</li>
     * <li><strong>image</strong>: image.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pod</p>
     */
    @NameInMap("GroupField")
    public String groupField;

    /**
     * <p>The logical relationship among multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: The search conditions are evaluated with a logical OR.</li>
     * <li><strong>AND</strong>: The search conditions are evaluated with a logical AND.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The number of container assets to display on each page when paging is used. Default value: <strong>20</strong>, which indicates that 20 container assets are displayed on each page.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeGroupedContainerInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedContainerInstancesRequest self = new DescribeGroupedContainerInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedContainerInstancesRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public DescribeGroupedContainerInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupedContainerInstancesRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public DescribeGroupedContainerInstancesRequest setGroupField(String groupField) {
        this.groupField = groupField;
        return this;
    }
    public String getGroupField() {
        return this.groupField;
    }

    public DescribeGroupedContainerInstancesRequest setLogicalExp(String logicalExp) {
        this.logicalExp = logicalExp;
        return this;
    }
    public String getLogicalExp() {
        return this.logicalExp;
    }

    public DescribeGroupedContainerInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
