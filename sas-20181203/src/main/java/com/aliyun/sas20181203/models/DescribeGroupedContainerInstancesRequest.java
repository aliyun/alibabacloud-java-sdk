// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedContainerInstancesRequest extends TeaModel {
    /**
     * <p>The search conditions for assets. Specify the value in the JSON format. Separate multiple search conditions with commas (,). Example: `[{"name":"riskStatus","value":"YES"},{"name":"riskLevel","value":"2"}]`.</p>
     * <br>
     * <p>>  Supported search conditions include the instance ID, instance name, virtual private cloud (VPC) ID, region, and public IP address. You can call the [DescribeCriteria](~~DescribeCriteria~~) operation to query the supported search conditions.</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The keyword that you want to use to query containers. This parameter depends on the value of the GroupField parameter.</p>
     * <br>
     * <p>*   If the **GroupField** parameter is set to **pod**, set this parameter to the name of the pod that you want to query.</p>
     * <p>*   If the **GroupField** parameter is set to **appName**, set this parameter to the name of the application that you want to query.</p>
     * <p>*   If the **GroupField** parameter is set to **namespace**, set this parameter to the namespace that you want to query.</p>
     * <p>*   If the **GroupField** parameter is set to **clusterId**, set this parameter to the ID of the cluster that you want to query.</p>
     * <p>*   If the **GroupField** parameter is set to **image**, set this parameter to the name of the image that you want to query.</p>
     * <br>
     * <p>>  Fuzzy match is supported.</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The group type that you want to use to query containers. Valid values:</p>
     * <br>
     * <p>*   **pod**</p>
     * <p>*   **appName**</p>
     * <p>*   **namespace**</p>
     * <p>*   **clusterId**</p>
     * <p>*   **image**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupField")
    public String groupField;

    /**
     * <p>The logical relationship that you want to use to evaluate multiple search conditions. Valid values:</p>
     * <br>
     * <p>*   **OR**: Search conditions are evaluated by using a logical **OR**.</p>
     * <p>*   **AND**: Search conditions are evaluated by using a logical **AND**.</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     * <br>
     * <p>>  We recommend that you do not leave this parameter empty.</p>
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
