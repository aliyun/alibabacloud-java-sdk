// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedInstancesRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Criteria")
    public String criteria;

    @NameInMap("MachineTypes")
    public String machineTypes;

    @NameInMap("GroupField")
    public String groupField;

    @NameInMap("FieldValue")
    public String fieldValue;

    @NameInMap("NoPage")
    public Boolean noPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static DescribeGroupedInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedInstancesRequest self = new DescribeGroupedInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedInstancesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGroupedInstancesRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public DescribeGroupedInstancesRequest setMachineTypes(String machineTypes) {
        this.machineTypes = machineTypes;
        return this;
    }
    public String getMachineTypes() {
        return this.machineTypes;
    }

    public DescribeGroupedInstancesRequest setGroupField(String groupField) {
        this.groupField = groupField;
        return this;
    }
    public String getGroupField() {
        return this.groupField;
    }

    public DescribeGroupedInstancesRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public DescribeGroupedInstancesRequest setNoPage(Boolean noPage) {
        this.noPage = noPage;
        return this;
    }
    public Boolean getNoPage() {
        return this.noPage;
    }

    public DescribeGroupedInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupedInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
