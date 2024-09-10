// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedContainerInstancesRequest extends TeaModel {
    /**
     * <p>The search conditions for assets. Specify the value in the JSON format. Separate multiple search conditions with commas (,). Example: <code>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;riskLevel&quot;,&quot;value&quot;:&quot;2&quot;}]</code>.</p>
     * <blockquote>
     * <p> Supported search conditions include the instance ID, instance name, virtual private cloud (VPC) ID, region, and public IP address. You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported search conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;riskLevel&quot;,&quot;value&quot;:&quot;2&quot;}]</p>
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
     * <p>The keyword that you want to use to query containers. This parameter depends on the value of the GroupField parameter.</p>
     * <ul>
     * <li>If the <strong>GroupField</strong> parameter is set to <strong>pod</strong>, set this parameter to the name of the pod that you want to query.</li>
     * <li>If the <strong>GroupField</strong> parameter is set to <strong>appName</strong>, set this parameter to the name of the application that you want to query.</li>
     * <li>If the <strong>GroupField</strong> parameter is set to <strong>namespace</strong>, set this parameter to the namespace that you want to query.</li>
     * <li>If the <strong>GroupField</strong> parameter is set to <strong>clusterId</strong>, set this parameter to the ID of the cluster that you want to query.</li>
     * <li>If the <strong>GroupField</strong> parameter is set to <strong>image</strong>, set this parameter to the name of the image that you want to query.</li>
     * </ul>
     * <blockquote>
     * <p> Fuzzy match is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cas-adad-qeqwe</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The group type that you want to use to query containers. Valid values:</p>
     * <ul>
     * <li><strong>pod</strong></li>
     * <li><strong>appName</strong></li>
     * <li><strong>namespace</strong></li>
     * <li><strong>clusterId</strong></li>
     * <li><strong>image</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pod</p>
     */
    @NameInMap("GroupField")
    public String groupField;

    /**
     * <p>The logical relationship that you want to use to evaluate multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: Search conditions are evaluated by using a logical <strong>OR</strong>.</li>
     * <li><strong>AND</strong>: Search conditions are evaluated by using a logical <strong>AND</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
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
