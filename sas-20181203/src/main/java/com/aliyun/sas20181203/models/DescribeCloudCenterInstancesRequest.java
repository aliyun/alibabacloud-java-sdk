// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudCenterInstancesRequest extends TeaModel {
    /**
     * <p>The version of the kernel.</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The name of the group to which the asset belongs.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("Importance")
    public Integer importance;

    /**
     * <p>You can search for assets by using search conditions, such as the instance ID, instance name, virtual private cloud (VPC) ID, region, and public IP address. You can also configure a logical relationship between multiple search conditions to search for the assets that meet the search conditions.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the SP for the asset.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **ALIYUN**: Alibaba Cloud</p>
     * <p>*   **OUT**: a third-party service provider</p>
     * <p>*   **IDC**: a data center</p>
     * <p>*   **TENCENT**: Tencent Cloud</p>
     * <p>*   **HUAWEICLOUD**: HUAWEI CLOUD</p>
     * <p>*   **Microsoft**: Microsoft Azure</p>
     * <p>*   **AWS**: Amazon Web Services (AWS)</p>
     * <p>*   **TRIPARTITE**: a lightweight server</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The UUID of the asset.</p>
     */
    @NameInMap("MachineTypes")
    public String machineTypes;

    /**
     * <p>Queries the information about assets that meet specified search conditions. For example, you can search for an asset by using the instance name or region of the asset.</p>
     */
    @NameInMap("NoGroupTrace")
    public Boolean noGroupTrace;

    /**
     * <p>The CPU information about the asset.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of entries returned per page. Default value: **20**.</p>
     */
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
