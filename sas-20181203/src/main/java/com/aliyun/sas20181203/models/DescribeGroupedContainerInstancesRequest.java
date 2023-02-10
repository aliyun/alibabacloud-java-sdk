// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedContainerInstancesRequest extends TeaModel {
    @NameInMap("Criteria")
    public String criteria;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("FieldValue")
    public String fieldValue;

    @NameInMap("GroupField")
    public String groupField;

    @NameInMap("LogicalExp")
    public String logicalExp;

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
