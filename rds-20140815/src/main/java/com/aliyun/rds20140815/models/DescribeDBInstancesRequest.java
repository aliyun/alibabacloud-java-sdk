// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesRequest extends TeaModel {
    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <br>
     * <p>*   **Basic**: RDS Basic Edition</p>
     * <p>*   **HighAvailability**: RDS High-availability Edition</p>
     * <p>*   **cluster**: RDS Cluster Edition</p>
     * <p>*   **serverless_basic**: RDS Serverless Basic Edition</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The connection mode of the instance. Valid values:</p>
     * <br>
     * <p>*   **Standard**: standard mode</p>
     * <p>*   **Safe**: database proxy mode</p>
     * <br>
     * <p>By default, this operation queries the instances that use any of the supported connection modes.</p>
     */
    @NameInMap("ConnectionMode")
    public String connectionMode;

    /**
     * <p>The endpoint of the instance. You must specify this parameter only when you want to query a single instance.</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The instance type of the instance. For information, see [Primary ApsaraDB RDS instance types](~~26312~~).</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The status of the instance. For more information, see [Instance states](~~26315~~).</p>
     */
    @NameInMap("DBInstanceStatus")
    public String DBInstanceStatus;

    /**
     * <p>The role of the instance. Valid values:</p>
     * <br>
     * <p>*   **Primary**: primary instance</p>
     * <p>*   **Readonly**: read-only instance</p>
     * <p>*   **Guard**: disaster recovery instance</p>
     * <p>*   **Temp**: temporary instance</p>
     * <br>
     * <p>By default, this operation returns the instances that assume any of the supported roles.</p>
     */
    @NameInMap("DBInstanceType")
    public String DBInstanceType;

    /**
     * <p>The dedicated cluster ID.</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>The host ID of the instance in the dedicated cluster.</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The database engine of the instance. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **SQLServer**</p>
     * <p>*   **PostgreSQL**</p>
     * <p>*   **MariaDB**</p>
     * <br>
     * <p>By default, this operation returns the instances that run any of the supported database engines.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>Specifies whether to query instances that have expired. Valid values:</p>
     * <br>
     * <p>*   **True**: queries instances that have expired.</p>
     * <p>*   **False**: does not query instances that have expired.</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <p>The JSON string that consists of filter condition parameters and their values.</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>Specifies whether to return the RDS edition of the instance by using the Category parameter. Valid values:</p>
     * <br>
     * <p>*   **0**: returns the RDS edition of the instance.</p>
     * <p>*   **1**: does not return the RDS edition of the instance.</p>
     */
    @NameInMap("InstanceLevel")
    public Integer instanceLevel;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <br>
     * <p>*   **VPC**</p>
     * <p>*   **Classic**</p>
     * <br>
     * <p>By default, this operation returns the instances that reside in any of the supported network types.</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The number of entries to return per page. Valid values: **1 to 100**.</p>
     * <br>
     * <p>Default value: **30**.</p>
     * <br>
     * <p>> If you specify this parameter, **PageSize** and **PageNumber** are unavailable.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to display the next page. You must set this parameter to the value that is returned from the most recent call of the **DescribeDBInstances** operation for **NextToken**. If the returned entries are displayed on multiple pages, the next page can be displayed when you call this operation again with this parameter specified.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Valid values: any non-zero positive integer.</p>
     * <br>
     * <p>Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **100**.</p>
     * <br>
     * <p>Default value: **30**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go</p>
     * <p>*   **Prepaid**: subscription</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The keyword that is used for fuzzy search. The keyword can be part of an instance ID or an instance description.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The tag that is added to the instance. Each tag is a key-value pair that consists of two fields: TagKey and TagValue. You can specify a maximum of five tags in the following format for each request: {"key1":"value1","key2":"value2"...}.</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The vSwitch ID.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the instance.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>A deprecated parameter. You do not need to configure this parameter.</p>
     */
    @NameInMap("proxyId")
    public String proxyId;

    public static DescribeDBInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesRequest self = new DescribeDBInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeDBInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeDBInstancesRequest setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
        return this;
    }
    public String getConnectionMode() {
        return this.connectionMode;
    }

    public DescribeDBInstancesRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public DescribeDBInstancesRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public DescribeDBInstancesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstancesRequest setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
        return this;
    }
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    public DescribeDBInstancesRequest setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
        return this;
    }
    public String getDBInstanceType() {
        return this.DBInstanceType;
    }

    public DescribeDBInstancesRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeDBInstancesRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public DescribeDBInstancesRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDBInstancesRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeDBInstancesRequest setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

    public DescribeDBInstancesRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public DescribeDBInstancesRequest setInstanceLevel(Integer instanceLevel) {
        this.instanceLevel = instanceLevel;
        return this;
    }
    public Integer getInstanceLevel() {
        return this.instanceLevel;
    }

    public DescribeDBInstancesRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public DescribeDBInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDBInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDBInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstancesRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeDBInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBInstancesRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeDBInstancesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DescribeDBInstancesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeDBInstancesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeDBInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeDBInstancesRequest setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
    }

}
