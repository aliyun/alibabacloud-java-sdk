// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesForCloneRequest extends TeaModel {
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
     * <p>The ID of the current instance.</p>
     */
    @NameInMap("CurrentInstanceId")
    public String currentInstanceId;

    /**
     * <p>The instance type of the instance. For more information, see [Instance types](~~26312~~).</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The status of the instance. For more information, see [Instance state table](~~26315~~).</p>
     */
    @NameInMap("DBInstanceStatus")
    public String DBInstanceStatus;

    /**
     * <p>The role of the instance that you want to query. Valid values:</p>
     * <br>
     * <p>*   **Primary**: primary instance</p>
     * <p>*   **Readonly**: read-only instance</p>
     * <p>*   **Guard**: disaster recovery instance</p>
     * <p>*   **Temp**: temporary instance</p>
     * <br>
     * <p>By default, this operation queries the instances of all roles.</p>
     */
    @NameInMap("DBInstanceType")
    public String DBInstanceType;

    /**
     * <p>The database engine of the instance. Valid values:</p>
     * <br>
     * <p>*   MySQL</p>
     * <p>*   SQLServer</p>
     * <p>*   PostgreSQL</p>
     * <p>*   PPAS</p>
     * <p>*   MariaDB</p>
     * <br>
     * <p>By default, this operation queries the instances that run any of the supported database engine types.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version of the database engine.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>Specifies whether the instance expires. Valid values:</p>
     * <br>
     * <p>*   **True**: queries the instances that have expired.</p>
     * <p>*   **False**: does not query instances that have expired.</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <br>
     * <p>*   **Classic**</p>
     * <p>*   **VPC**</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The type of the database node. Valid values:</p>
     * <br>
     * <p>*   **Master**: the primary node</p>
     * <p>*   **Slave**: the secondary node</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: **1 to 100**.</p>
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
     * <br>
     * <p>By default, this operation queries the instances that use any of the supported billing methods.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region ID of the instance.</p>
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
     * <p>The keyword that is used for the search. The keyword can be part of an instance ID or an instance description.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The ID of the vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the instance.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The ID of the proxy mode.</p>
     */
    @NameInMap("proxyId")
    public String proxyId;

    public static DescribeDBInstancesForCloneRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesForCloneRequest self = new DescribeDBInstancesForCloneRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesForCloneRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeDBInstancesForCloneRequest setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
        return this;
    }
    public String getConnectionMode() {
        return this.connectionMode;
    }

    public DescribeDBInstancesForCloneRequest setCurrentInstanceId(String currentInstanceId) {
        this.currentInstanceId = currentInstanceId;
        return this;
    }
    public String getCurrentInstanceId() {
        return this.currentInstanceId;
    }

    public DescribeDBInstancesForCloneRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public DescribeDBInstancesForCloneRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstancesForCloneRequest setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
        return this;
    }
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    public DescribeDBInstancesForCloneRequest setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
        return this;
    }
    public String getDBInstanceType() {
        return this.DBInstanceType;
    }

    public DescribeDBInstancesForCloneRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDBInstancesForCloneRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeDBInstancesForCloneRequest setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

    public DescribeDBInstancesForCloneRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public DescribeDBInstancesForCloneRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public DescribeDBInstancesForCloneRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBInstancesForCloneRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstancesForCloneRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesForCloneRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstancesForCloneRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeDBInstancesForCloneRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstancesForCloneRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBInstancesForCloneRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBInstancesForCloneRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBInstancesForCloneRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeDBInstancesForCloneRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeDBInstancesForCloneRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeDBInstancesForCloneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeDBInstancesForCloneRequest setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
    }

}
