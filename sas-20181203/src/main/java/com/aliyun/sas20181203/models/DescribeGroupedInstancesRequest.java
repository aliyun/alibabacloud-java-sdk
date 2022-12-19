// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedInstancesRequest extends TeaModel {
    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The name of the group to which the assets belong. Fuzzy search is supported.
    @NameInMap("FieldValue")
    public String fieldValue;

    // The filter condition that you want to use to query the assets. Valid values:
    // 
    // *   **groupId**: the group to which the assets belong
    // *   **regionId**: the region in which the assets reside
    // *   **vpcInstanceId**: the virtual private cloud (VPC) in which the assets reside
    @NameInMap("GroupField")
    public String groupField;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The type of the assets that you want to query. Set the value to **ecs**, which indicates Elastic Compute Service (ECS) instances.
    @NameInMap("MachineTypes")
    public String machineTypes;

    // Specifies whether to enable paged query. Default value: **true**. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("NoPage")
    public Boolean noPage;

    // The number of entries to return on each page. Default value: **20**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The source of the server. Valid values:
    // 
    // *   **0**: an asset provided by Alibaba Cloud.
    // *   **1**: a third-party cloud server
    // *   **2**: a server in a data center
    // *   **3**, **4**, **5**, and **7**: other cloud asset
    // *   **8**: a lightweight asset
    @NameInMap("Vendor")
    public Integer vendor;

    public static DescribeGroupedInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedInstancesRequest self = new DescribeGroupedInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupedInstancesRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public DescribeGroupedInstancesRequest setGroupField(String groupField) {
        this.groupField = groupField;
        return this;
    }
    public String getGroupField() {
        return this.groupField;
    }

    public DescribeGroupedInstancesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGroupedInstancesRequest setMachineTypes(String machineTypes) {
        this.machineTypes = machineTypes;
        return this;
    }
    public String getMachineTypes() {
        return this.machineTypes;
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

    public DescribeGroupedInstancesRequest setVendor(Integer vendor) {
        this.vendor = vendor;
        return this;
    }
    public Integer getVendor() {
        return this.vendor;
    }

}
