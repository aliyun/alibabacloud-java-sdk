// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudCenterInstancesRequest extends TeaModel {
    // The search conditions that are used to filter assets. The value of this parameter is in the JSON format and is case-sensitive.
    // 
    // >  A search condition can be an instance ID, instance name, VPC ID, region, or public IP address. You can call the [DescribeCriteria](~~DescribeCriteria~~) operation to query the supported search conditions.
    @NameInMap("Criteria")
    public String criteria;

    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The importance of the asset. Valid values:
    // 
    // *   **2**: an important asset
    // *   **1**: a common asset
    // *   **0**: a test asset
    @NameInMap("Importance")
    public Integer importance;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The logical relationship among multiple search conditions. Valid values:
    // 
    // *   **OR**: The search conditions are evaluated by using a logical **OR**.
    // *   **AND**: The search conditions are evaluated by using a logical **AND**.
    @NameInMap("LogicalExp")
    public String logicalExp;

    // The type of the assets that you want to query. Valid values:
    // 
    // *   **ecs**: servers
    // *   **cloud_product**: Alibaba Cloud services
    @NameInMap("MachineTypes")
    public String machineTypes;

    // Specifies whether to internationalize the name of the default group. Default value: **false** . Valid values:
    // 
    // *   **true**: The system returns the Chinese name of the default group for the GroupTrace response parameter.************
    // *   **false**: The system returns default for the GroupTrace response parameter.
    @NameInMap("NoGroupTrace")
    public Boolean noGroupTrace;

    // The number of entries to return on each page. Default value: **20**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the region in which the asset resides.
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCloudCenterInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudCenterInstancesRequest self = new DescribeCloudCenterInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudCenterInstancesRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public DescribeCloudCenterInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCloudCenterInstancesRequest setImportance(Integer importance) {
        this.importance = importance;
        return this;
    }
    public Integer getImportance() {
        return this.importance;
    }

    public DescribeCloudCenterInstancesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCloudCenterInstancesRequest setLogicalExp(String logicalExp) {
        this.logicalExp = logicalExp;
        return this;
    }
    public String getLogicalExp() {
        return this.logicalExp;
    }

    public DescribeCloudCenterInstancesRequest setMachineTypes(String machineTypes) {
        this.machineTypes = machineTypes;
        return this;
    }
    public String getMachineTypes() {
        return this.machineTypes;
    }

    public DescribeCloudCenterInstancesRequest setNoGroupTrace(Boolean noGroupTrace) {
        this.noGroupTrace = noGroupTrace;
        return this;
    }
    public Boolean getNoGroupTrace() {
        return this.noGroupTrace;
    }

    public DescribeCloudCenterInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudCenterInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
