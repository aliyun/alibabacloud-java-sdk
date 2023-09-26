// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudCenterInstancesRequest extends TeaModel {
    /**
     * <p>The search conditions. The value of this parameter is in the JSON format and is case-sensitive.</p>
     * <br>
     * <p>>  You can search for an asset by using the search conditions, such as the instance ID, instance name, VPC ID, region, or public IP address. You can call the [DescribeCriteria](~~149773~~) operation to query the supported search conditions.</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The importance of the asset. Valid values:</p>
     * <br>
     * <p>*   **2**: an important asset</p>
     * <p>*   **1**: a common asset</p>
     * <p>*   **0**: a test asset</p>
     */
    @NameInMap("Importance")
    public Integer importance;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The logical relationship among multiple search conditions. Valid values:</p>
     * <br>
     * <p>*   **OR**: The logical relationship among search conditions is **OR**.</p>
     * <p>*   **AND**: The logical relationship among search conditions is **AND**.</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The type of the assets that you want to query. Valid values:</p>
     * <br>
     * <p>*   **ecs**: servers</p>
     * <p>*   **cloud_product**: Alibaba Cloud service</p>
     */
    @NameInMap("MachineTypes")
    public String machineTypes;

    /**
     * <p>使用NextToken方式下返回的NextToken值。第一次拉取传空。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Specifies whether to internationalize the name of the default group. Valid values:</p>
     * <br>
     * <p>*   **true**: The system returns the Chinese name of the default group for the GroupTrace response parameter.</p>
     * <p>*   **false**: The system returns default for the GroupTrace response parameter.</p>
     */
    @NameInMap("NoGroupTrace")
    public Boolean noGroupTrace;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region in which the asset resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>资源目录成员账号主账号ID。</p>
     * <p>>调用[DescribeMonitorAccounts](~~DescribeMonitorAccounts~~)接口可以获取该参数。</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>是否使用NextToken方式拉取资产列表数据。如果使用此参数TotalCount不再返回。取值：</p>
     * <br>
     * <p>- **true**：使用NextToken方式</p>
     * <p>- **false**：不使用NextToken方式</p>
     */
    @NameInMap("UseNextToken")
    public Boolean useNextToken;

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

    public DescribeCloudCenterInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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

    public DescribeCloudCenterInstancesRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeCloudCenterInstancesRequest setUseNextToken(Boolean useNextToken) {
        this.useNextToken = useNextToken;
        return this;
    }
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

}
