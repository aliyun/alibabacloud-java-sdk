// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable append-only file (AOF) persistence for the instance. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong> (default): enables AOF persistence.</li>
     * <li><strong>no</strong>: disables AOF persistence.</li>
     * </ul>
     * <p>**</p>
     * <p><strong>Description</strong> This parameter is applicable to classic instances, and is unavailable for cloud-native instances.</p>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("Appendonly")
    public String appendonly;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal.</li>
     * <li><strong>false</strong>: disables auto-renewal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The subscription duration that is supported by auto-renewal. Unit: months. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>6</strong>, and <strong>12</strong>.</p>
     * <blockquote>
     * <p>This parameter is required only if the <strong>AutoRenew</strong> parameter is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AutoRenewPeriod")
    public String autoRenewPeriod;

    /**
     * <p>Specifies whether to use a coupon. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: uses a coupon.</li>
     * <li><strong>false</strong>: does not use a coupon.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The ID of the backup file of the original instance. If you want to create an instance based on a backup file of a specified instance, you can specify this parameter after you specify the <strong>SrcDBInstanceId</strong> parameter. Then, the system creates an instance based on the backup file that is specified by this parameter. You can call the <a href="https://help.aliyun.com/document_detail/61081.html">DescribeBackups</a> operation to query the IDs of backup files.</p>
     * <blockquote>
     * <p>After you specify the <strong>SrcDBInstanceId</strong> parameter, you must use the <strong>BackupId</strong> or <strong>RestoreTime</strong> parameter to specify the backup file.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>111111111</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The ID of the promotional event or business information.</p>
     * 
     * <strong>example:</strong>
     * <p>000000000</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The storage capacity of the instance. Unit: MB.</p>
     * <blockquote>
     * <p>You must specify at least one of the <strong>Capacity</strong> and <strong>InstanceClass</strong> parameters when you call this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16384</p>
     */
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>The billing method of the instance. Default value: PrePaid. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The backup set ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cb-hyxdof5x9kqbtust</p>
     */
    @NameInMap("ClusterBackupId")
    public String clusterBackupId;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>AllocateInstancePublicConnection</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The coupon code. Default value: <code>default</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The ID of the dedicated cluster. This parameter is required if you create an instance in a dedicated cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>dhg-uv4fnk6r7zff****</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>Specifies whether to perform a dry run. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run and does not create the instance. The system prechecks the request parameters, request format, service limits, and available resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>: performs a dry run and sends the request. If the request passes the dry run, the instance is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The database engine version of the instance. Valid values: <strong>4.0</strong>, <strong>5.0</strong>, <strong>6.0</strong>, and <strong>7.0</strong>.</p>
     * <blockquote>
     * <p>The default value is <strong>5.0</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>Specifies whether to use the new instance as the first child instance of the distributed instance. Default value: false. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: uses the new instance as the first child instance.</p>
     * </li>
     * <li><p><strong>false</strong>: does not use the new instance as the first child instance.</p>
     * </li>
     * <li><p>If you want to create an ApsaraDB for Redis Enhanced Edition (Tair) DRAM-based instance that runs Redis 5.0, you must set this parameter to <strong>true</strong>.</p>
     * </li>
     * <li><p>This parameter is available only on the China site (aliyun.com).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GlobalInstance")
    public Boolean globalInstance;

    /**
     * <p>The ID of the distributed instance. This parameter is available only on the China site (aliyun.com).</p>
     * 
     * <strong>example:</strong>
     * <p>gr-bp14rkqrhac****</p>
     */
    @NameInMap("GlobalInstanceId")
    public String globalInstanceId;

    /**
     * <p>The global IP whitelist template for the instance. Multiple IP whitelist templates should be separated by English commas (,) and cannot be duplicated.</p>
     * 
     * <strong>example:</strong>
     * <p>g-zsldxfiwjmti0kcm****</p>
     */
    @NameInMap("GlobalSecurityGroupIds")
    public String globalSecurityGroupIds;

    /**
     * <p>The instance type. For example, redis.master.small.default indicates a Community Edition standard master-replica instance that has 1 GB of memory. For more information, see <a href="https://help.aliyun.com/document_detail/26350.html">Overview</a>.</p>
     * <p>**</p>
     * <p><strong>Description</strong> You must specify at least one of the <strong>Capacity</strong> and <strong>InstanceClass</strong> parameters when you call the CreateInstance operation.</p>
     * 
     * <strong>example:</strong>
     * <p>redis.master.small.default</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The name of the instance. The name must be 2 to 80 characters in length and must start with a letter. It cannot contain spaces or specific special characters. These special characters include <code>@ / : = &quot; &lt; &gt; { [ ] }</code></p>
     * 
     * <strong>example:</strong>
     * <p>apitest</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The category of the instance. Default value: Redis. Valid values:</p>
     * <ul>
     * <li><strong>Redis</strong></li>
     * <li><strong>Memcache</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Redis</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The network type of the instance. Default value: VPC. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li><strong>MASTER_SLAVE</strong>: high availability (master-replica)</li>
     * <li><strong>STAND_ALONE</strong>: standalone</li>
     * <li><strong>double</strong>: master-replica</li>
     * <li><strong>single</strong>: standalone</li>
     * </ul>
     * <blockquote>
     * <p> To create a cloud-native instance, set this parameter to <strong>MASTER_SLAVE</strong> or <strong>STAND_ALONE</strong>. To create a classic instance, set this parameter to <strong>double</strong> or <strong>single</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>STAND_ALONE</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The parameter template ID, which must be globally unique.</p>
     * 
     * <strong>example:</strong>
     * <p>rpg-test**</p>
     */
    @NameInMap("ParamGroupId")
    public String paramGroupId;

    /**
     * <p>The password that is used to connect to the instance. The password must be 8 to 32 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and specific special characters. These special characters include <code>! @ # $ % ^ &amp; * ( ) _ + - =</code></p>
     * 
     * <strong>example:</strong>
     * <p>Pass!123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The subscription duration. Valid values: <strong>1</strong>, 2, 3, 4, 5, 6, 7, 8, <strong>9</strong>, <strong>12</strong>, <strong>24</strong>,<strong>36</strong>, and <strong>60</strong>. Unit: months.</p>
     * <blockquote>
     * <p>This parameter is available and required only if the <strong>ChargeType</strong> parameter is set to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The port number that is used to connect to the instance. Valid values: <strong>1024</strong> to <strong>65535</strong>. Default value: <strong>6379</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>6379</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The private IP address of the instance.</p>
     * <blockquote>
     * <p>The private IP address must be available within the CIDR block of the vSwitch to which to connect the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.***</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The number of read-only nodes in the instance. This parameter is available only if you create a read/write splitting instance that uses cloud disks. Valid values: 1 to 5.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ReadOnlyCount")
    public Integer readOnlyCount;

    @NameInMap("RecoverConfigMode")
    public String recoverConfigMode;

    /**
     * <p>The ID of the region where you want to create the instance. You can call the <a href="https://help.aliyun.com/document_detail/61012.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>rg-resourcegroupid1</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time at which the specified original instance is backed up. The point in time must be within the retention period of backup files of the original instance. If you want to create an instance based on a backup file of a specified instance, you can set this parameter to specify a point in time after you set the <strong>SrcDBInstanceId</strong> parameter. Then, the system creates an instance based on the backup file that was created at the specified point in time for the original instance. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>After you specify the <strong>SrcDBInstanceId</strong> parameter, you must use the <strong>BackupId</strong> or <strong>RestoreTime</strong> parameter to specify the backup file.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-06-19T16:00:00Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The secondary zone ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/472448.html">DescribeZones</a> operation to query the most recent zone list.</p>
     * <blockquote>
     * <p>If you specify this parameter, the master node and replica node of the instance can be deployed in different zones and disaster recovery is implemented across zones. The instance can withstand failures in data centers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    /**
     * <p>系统自动生成的安全 Token，无需传入</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The number of data shards. This parameter is available only if you create a cluster instance that uses cloud disks.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    @NameInMap("SlaveReadOnlyCount")
    public Integer slaveReadOnlyCount;

    /**
     * <p>The ID of the original instance. If you want to create an instance based on a backup file of a specified instance, you can specify this parameter and use the <strong>BackupId</strong> or <strong>RestoreTime</strong> parameter to specify the backup file.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("SrcDBInstanceId")
    public String srcDBInstanceId;

    /**
     * <p>The tags of the instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateInstanceRequestTag> tag;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the token is unique among different requests. The token is case-sensitive. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The ID of the vSwitch to which you want the instance to connect.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nme44gek34slfc****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The primary zone ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61012.html">DescribeRegions</a> operation to query the most recent zone list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setAppendonly(String appendonly) {
        this.appendonly = appendonly;
        return this;
    }
    public String getAppendonly() {
        return this.appendonly;
    }

    public CreateInstanceRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstanceRequest setAutoRenewPeriod(String autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public String getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateInstanceRequest setAutoUseCoupon(String autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public String getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateInstanceRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CreateInstanceRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateInstanceRequest setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    public CreateInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateInstanceRequest setClusterBackupId(String clusterBackupId) {
        this.clusterBackupId = clusterBackupId;
        return this;
    }
    public String getClusterBackupId() {
        return this.clusterBackupId;
    }

    public CreateInstanceRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public CreateInstanceRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public CreateInstanceRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public CreateInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateInstanceRequest setGlobalInstance(Boolean globalInstance) {
        this.globalInstance = globalInstance;
        return this;
    }
    public Boolean getGlobalInstance() {
        return this.globalInstance;
    }

    public CreateInstanceRequest setGlobalInstanceId(String globalInstanceId) {
        this.globalInstanceId = globalInstanceId;
        return this;
    }
    public String getGlobalInstanceId() {
        return this.globalInstanceId;
    }

    public CreateInstanceRequest setGlobalSecurityGroupIds(String globalSecurityGroupIds) {
        this.globalSecurityGroupIds = globalSecurityGroupIds;
        return this;
    }
    public String getGlobalSecurityGroupIds() {
        return this.globalSecurityGroupIds;
    }

    public CreateInstanceRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateInstanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateInstanceRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public CreateInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateInstanceRequest setParamGroupId(String paramGroupId) {
        this.paramGroupId = paramGroupId;
        return this;
    }
    public String getParamGroupId() {
        return this.paramGroupId;
    }

    public CreateInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateInstanceRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateInstanceRequest setReadOnlyCount(Integer readOnlyCount) {
        this.readOnlyCount = readOnlyCount;
        return this;
    }
    public Integer getReadOnlyCount() {
        return this.readOnlyCount;
    }

    public CreateInstanceRequest setRecoverConfigMode(String recoverConfigMode) {
        this.recoverConfigMode = recoverConfigMode;
        return this;
    }
    public String getRecoverConfigMode() {
        return this.recoverConfigMode;
    }

    public CreateInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CreateInstanceRequest setSecondaryZoneId(String secondaryZoneId) {
        this.secondaryZoneId = secondaryZoneId;
        return this;
    }
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
    }

    public CreateInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateInstanceRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public CreateInstanceRequest setSlaveReadOnlyCount(Integer slaveReadOnlyCount) {
        this.slaveReadOnlyCount = slaveReadOnlyCount;
        return this;
    }
    public Integer getSlaveReadOnlyCount() {
        return this.slaveReadOnlyCount;
    }

    public CreateInstanceRequest setSrcDBInstanceId(String srcDBInstanceId) {
        this.srcDBInstanceId = srcDBInstanceId;
        return this;
    }
    public String getSrcDBInstanceId() {
        return this.srcDBInstanceId;
    }

    public CreateInstanceRequest setTag(java.util.List<CreateInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateInstanceRequestTag> getTag() {
        return this.tag;
    }

    public CreateInstanceRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateInstanceRequestTag extends TeaModel {
        /**
         * <p>The keys of the tags that are added to the instance.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p><strong>N</strong> specifies the serial number of the tag. Up to 20 tags can be added to a single instance. For example, Tag.1.Key specifies the key of the first tag and Tag.2.Key specifies the key of the second tag.</p>
         * </li>
         * <li><p>If the key of the tag does not exist, the tag is automatically created.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testkey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values of the tags that are added to the instance.</p>
         * <blockquote>
         * <p><strong>N</strong> specifies the serial number of the tag. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag and <strong>Tag.2.Value</strong> specifies the value of the second tag.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testvalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestTag self = new CreateInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
