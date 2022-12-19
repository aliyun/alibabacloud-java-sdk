// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedContainerInstancesRequest extends TeaModel {
    // The search conditions for assets. Specify the value in the JSON format. Separate multiple search conditions with commas (,). Example: `[{"name":"riskStatus","value":"YES"},{"name":"riskLevel","value":"2"}]`.
    // 
    // >  Supported search conditions include the instance ID, instance name, virtual private cloud (VPC) ID, region, and public IP address. You can call the [DescribeCriteria](~~DescribeCriteria~~) operation to query the supported search conditions.
    @NameInMap("Criteria")
    public String criteria;

    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The keyword that you want to use to query containers. You must specify this parameter based on the value of the GroupField parameter.
    // 
    // *   If the **GroupField** parameter is set to **pod**, set this parameter to the name of the pod that you want to query.
    // *   If the **GroupField** parameter is set to **appName**, set this parameter to the name of the application that you want to query.
    // *   If the **GroupField** parameter is set to **namespace**, set this parameter to the namespace that you want to query.
    // *   If the **GroupField** parameter is set to **clusterId**, set this parameter to the ID of the cluster that you want to query.
    // 
    // >  Fuzzy match is supported.
    @NameInMap("FieldValue")
    public String fieldValue;

    // The group type that you want to use to query containers. Valid values:
    // 
    // *   **pod**
    // *   **appName**
    // *   **namespace**
    // *   **clusterId**
    @NameInMap("GroupField")
    public String groupField;

    // The logical relationship that you want to use to evaluate multiple search conditions. Valid values:
    // 
    // *   **OR**: Search conditions are evaluated by using a logical **OR**.
    // *   **AND**: Search conditions are evaluated by using a logical **AND**.
    @NameInMap("LogicalExp")
    public String logicalExp;

    // The number of entries to return on each page. Default value: **20**.
    // 
    // >  We recommend that you do not leave this parameter empty.
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
