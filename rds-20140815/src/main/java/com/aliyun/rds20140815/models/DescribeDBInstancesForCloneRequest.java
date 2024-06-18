// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesForCloneRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The connection mode of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Standard</strong>: standard mode</li>
     * <li><strong>Safe</strong>: database proxy mode</li>
     * </ul>
     * <p>By default, this operation queries the instances that use any of the supported connection modes.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ConnectionMode")
    public String connectionMode;

    /**
     * <p>The ID of the current instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("CurrentInstanceId")
    public String currentInstanceId;

    /**
     * <p>The instance type of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Instance types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.n1.micro.1</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The status of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/26315.html">Instance state table</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DBInstanceStatus")
    public String DBInstanceStatus;

    /**
     * <p>The role of the instance that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>Primary</strong>: primary instance</li>
     * <li><strong>Readonly</strong>: read-only instance</li>
     * <li><strong>Guard</strong>: disaster recovery instance</li>
     * <li><strong>Temp</strong>: temporary instance</li>
     * </ul>
     * <p>By default, this operation queries the instances of all roles.</p>
     * 
     * <strong>example:</strong>
     * <p>Primary</p>
     */
    @NameInMap("DBInstanceType")
    public String DBInstanceType;

    /**
     * <p>The database engine of the instance. Valid values:</p>
     * <ul>
     * <li>MySQL</li>
     * <li>SQLServer</li>
     * <li>PostgreSQL</li>
     * <li>PPAS</li>
     * <li>MariaDB</li>
     * </ul>
     * <p>By default, this operation queries the instances that run any of the supported database engine types.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version of the database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>5.7</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>Specifies whether the instance expires. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: queries the instances that have expired.</li>
     * <li><strong>False</strong>: does not query instances that have expired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Classic</strong></li>
     * <li><strong>VPC</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Classic</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The type of the database node. Valid values:</p>
     * <ul>
     * <li><strong>Master</strong>: the primary node</li>
     * <li><strong>Slave</strong>: the secondary node</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Master</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1 to 100</strong>.</p>
     * <p>Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go</li>
     * <li><strong>Prepaid</strong>: subscription</li>
     * </ul>
     * <p>By default, this operation queries the instances that use any of the supported billing methods.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The keyword that is used for the search. The keyword can be part of an instance ID or an instance description.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6w</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-j6csw46bgrgkxxxxxxxxxx</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-j6cjvqms29yxxxxxxxxxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The ID of the proxy mode.</p>
     * 
     * <strong>example:</strong>
     * <p>API</p>
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
