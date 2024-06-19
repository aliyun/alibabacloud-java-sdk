// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Set the value to <strong>true</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

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
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The ID of the backup set of the source instance. The system uses the data stored in the backup set to create an instance. You can call the <a href="https://help.aliyun.com/document_detail/61081.html">DescribeBackups</a> operation to query the backup set ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11111111</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The ID of the promotion event or the business information.</p>
     * 
     * <strong>example:</strong>
     * <p>000000000</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The billing method of the instance. Default value: PrePaid. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the token is unique among different requests. The token is case-sensitive. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is supported for specific new cluster instances. You can query the backup set ID by calling the <a href="https://help.aliyun.com/document_detail/2679158.html">DescribeClusterBackupList</a> operation.</p>
     * <ul>
     * <li>If this parameter is supported, you can specify the backup set ID. In this case, you do not need to specify the <strong>BackupId</strong> parameter.</li>
     * <li>If this parameter is not supported, set the BackupId parameter to the IDs of backup sets in all shards of the source instance, separated by commas (,). Example: &quot;2158\<em>\</em>\<em>\<em>20,2158\</em>\</em>\*\*22&quot;.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cb-hyxdof5x9kqb****</p>
     */
    @NameInMap("ClusterBackupId")
    public String clusterBackupId;

    /**
     * <p>The coupon code.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>Specifies whether to perform a dry run. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run and does not create the instance. The system prechecks the request parameters, request format, service limits, and available resources. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>: performs a dry run and sends the request. If the request passes the dry run, the instance is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The engine version. Default value: <strong>1.0</strong>. The parameter value varies with the Tair instance type.</p>
     * <ul>
     * <li>For Tair DRAM-based instances (tair_rdb) that are compatible with Redis 5.0 or 6.0, set this parameter to 5.0 or 6.0.</li>
     * <li>For Tair persistent memory-optimized instances (tair_scm) that are compatible with Redis 6.0, set this parameter to 1.0.</li>
     * <li>For Tair ESSD-based instances (tair_essd) that are compatible with Redis 4.0 or 6.0, set this parameter to 1.0 or 2.0.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>Specifies whether to use the created instance as a child instance of a distributed instance.</p>
     * <ul>
     * <li>If you want the created instance to be used as the first child instance, enter <strong>true</strong>.</li>
     * <li>If you want the created instance to be used as the second or third child instance, enter the ID of the distributed instance, such as gr-bp14rkqrhac\<em>\</em>\<em>\</em>.</li>
     * <li>If you do not want the created instance to be used as a distributed instance, leave the parameter empty.</li>
     * </ul>
     * <blockquote>
     * <p> If you want the created instance to be used as a distributed instance, the created instance must be a Tair DRAM-based instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gr-bp14rkqrhac****</p>
     */
    @NameInMap("GlobalInstanceId")
    public String globalInstanceId;

    /**
     * <p>The global IP whitelist template of the instance. Separate multiple IP whitelist templates with commas (,) and make sure that each IP whitelist template is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>g-zsldxfiwjmti0kcm****</p>
     */
    @NameInMap("GlobalSecurityGroupIds")
    public String globalSecurityGroupIds;

    /**
     * <p>The instance type. For more information, see the following topics:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/443844.html">DRAM-based instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/443845.html">Persistent memory-optimized instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/443846.html">ESSD-based instances</a></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tair.scm.standard.4m.32d</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The name of the instance. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name is 2 to 80 characters in length.</li>
     * <li>The name starts with a letter and does not contain spaces or special characters. Special characters include <code>@ / : = &quot; &lt; &gt; { [ ] }</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>apitest</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>tair_rdb</strong>: ApsaraDB for Redis Enhanced Edition (Tair) DRAM-based instance</li>
     * <li><strong>tair_scm</strong>: ApsaraDB for Redis Enhanced Edition (Tair) persistent memory-optimized instance</li>
     * <li><strong>tair_essd</strong>: ApsaraDB for Redis Enhanced Edition (Tair) ESSD-based instance</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tair_scm</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the parameter template. The instance is created based on the parameters in the parameter template. The ID must be unique.</p>
     * 
     * <strong>example:</strong>
     * <p>g-50npzjcqb1ua6q6j****</p>
     */
    @NameInMap("ParamGroupId")
    public String paramGroupId;

    /**
     * <p>The password that is used to connect to the instance. The password must meet the following requirements:</p>
     * <ul>
     * <li>The password is 8 to 32 characters in length.</li>
     * <li>The password contains at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include <code>! @ # $ % ^ &amp; * ( ) _ + - =</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pass!123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The subscription duration. Valid values: <strong>1</strong>, 2, 3, 4, 5, 6, 7, 8, <strong>9</strong>, <strong>12</strong>, <strong>24</strong>,<strong>36</strong>, and <strong>60</strong>. Unit: months.</p>
     * <blockquote>
     * <p>This parameter is required only if you set the <strong>ChargeType</strong> parameter to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The port number of the instance. Valid values: <strong>1024</strong> to <strong>65535</strong>. Default value: <strong>6379</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>6379</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The private IP address of the instance.</p>
     * <blockquote>
     * <p>The IP address must be within the CIDR block of the vSwitch to which you want the instance to connect. You can call the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation of the VPC API to query the CIDR block information.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.16.88.***</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The number of read replicas in the primary zone. This parameter applies only to read/write splitting instances that use cloud disks. You can use this parameter to customize the number of read replicas. Valid values: 1 to 9.</p>
     * <blockquote>
     * <p> The sum of the values of this parameter and SlaveReadOnlyCount cannot be greater than 9.</p>
     * </blockquote>
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
     * <p>The ID of the resource group to which you want to assign the instance.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can query resource group IDs by using the ApsaraDB for Redis console or by calling the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * </li>
     * <li><p>Before you modify the resource group to which an instance belongs, you can call the <a href="https://help.aliyun.com/document_detail/158866.html">ListResources</a> operation to view the current resource group of the instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyiu4ekp****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>If data flashback is enabled for the source instance, you can use this parameter to specify a point in time within the backup retention period of the source instance. The system uses the backup data of the source instance at the point in time to create an instance. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-06T07:25:57Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The ID of the secondary zone. You can call the <a href="https://help.aliyun.com/document_detail/61012.html">DescribeRegions</a> operation to query the ID of the secondary zone.</p>
     * <blockquote>
     * <p>You cannot specify multiple zone IDs or set this parameter to a value that is the same as that of the ZoneId parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The number of data nodes in the instance. Valid values:</p>
     * <ul>
     * <li><strong>1</strong> (default): You can create a <a href="https://help.aliyun.com/document_detail/52228.html">standard instance</a> that contains only a single data node.</li>
     * <li><strong>2</strong> to <strong>32</strong>: You can create a <a href="https://help.aliyun.com/document_detail/52228.html">cluster instance</a> that contains the specified number of data nodes.</li>
     * </ul>
     * <blockquote>
     * <p> When the <strong>InstanceType</strong> parameter is set to <strong>tair_rdb</strong> or <strong>tair_scm</strong>, this parameter can be set to <strong>2</strong> to <strong>32</strong>. Only DRAM-based and persistent memory-optimized instances support the cluster architecture.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    /**
     * <p>The data shard type of the instance. Default value: MASTER_SLAVE. Valid values:</p>
     * <ul>
     * <li><strong>MASTER_SLAVE</strong>: runs in a master-replica architecture that provides high availability.</li>
     * <li><strong>STAND_ALONE</strong>: runs in a standalone architecture. If the only node fails, the system creates a new instance and switches the workloads to the new instance. This may cause data loss. You can set this parameter to this value only if the instance uses the <strong>single-zone</strong> deployment type. If you set this parameter to this value, you cannot create cluster or read/write splitting instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MASTER_SLAVE</p>
     */
    @NameInMap("ShardType")
    public String shardType;

    /**
     * <p>The number of read replicas in the secondary zone when you create a multi-zone read/write splitting instance. The sum of the values of this parameter and ReadOnlyCount cannot be greater than 9.</p>
     * <blockquote>
     * <p>When you create a multi-zone read/write splitting instance, you must specify both SlaveReadOnlyCount and SecondaryZoneId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SlaveReadOnlyCount")
    public Integer slaveReadOnlyCount;

    /**
     * <p>If you want to create an instance based on the backup set of an existing instance, set this parameter to the ID of the source instance.</p>
     * <blockquote>
     * <p> Then, you can use the <strong>BackupId</strong>, <strong>ClusterBackupId</strong>, or <strong>RestoreTime</strong> parameter to specify the backup set that you want to use or the point in time. This parameter must be used in combination with one of the preceding three parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("SrcDBInstanceId")
    public String srcDBInstanceId;

    /**
     * <p>The storage space of cloud disks. Valid values vary based on the instance specifications. For more information, see <a href="https://help.aliyun.com/document_detail/443846.html">ESSD-based instances</a>.</p>
     * <blockquote>
     * <p>This parameter is available and required only if the <strong>InstanceType</strong> parameter is set to <strong>tair_essd</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Storage")
    public Integer storage;

    /**
     * <p>The storage type of the instance. Set the value to <strong>essd_pl1</strong>.</p>
     * <blockquote>
     * <p>This parameter is available only if the <strong>InstanceType</strong> parameter is set to <strong>tair_essd</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>essd_pl1</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The tags to add to the instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTairInstanceRequestTag> tag;

    /**
     * <p>The ID of the vSwitch that belongs to the VPC. You can call the <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> operation to query the ID of the vSwitch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC). You can call the <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> operation to query the ID of the VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nme44gek34slfc****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The primary zone ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61012.html">DescribeRegions</a> operation to query the IDs of available zones.</p>
     * <blockquote>
     * <p> You can also set the SecondaryZoneId parameter to specify the secondary zone. The primary and secondary nodes will then be deployed in the specified primary and secondary zones to implement the master-replica zone-disaster recovery architecture. For example, you can set the ZoneId parameter to cn-hangzhou-h and the SecondaryZoneId parameter to cn-hangzhou-g.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateTairInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTairInstanceRequest self = new CreateTairInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateTairInstanceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateTairInstanceRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateTairInstanceRequest setAutoRenewPeriod(String autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public String getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateTairInstanceRequest setAutoUseCoupon(String autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public String getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateTairInstanceRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CreateTairInstanceRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateTairInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateTairInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTairInstanceRequest setClusterBackupId(String clusterBackupId) {
        this.clusterBackupId = clusterBackupId;
        return this;
    }
    public String getClusterBackupId() {
        return this.clusterBackupId;
    }

    public CreateTairInstanceRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public CreateTairInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTairInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateTairInstanceRequest setGlobalInstanceId(String globalInstanceId) {
        this.globalInstanceId = globalInstanceId;
        return this;
    }
    public String getGlobalInstanceId() {
        return this.globalInstanceId;
    }

    public CreateTairInstanceRequest setGlobalSecurityGroupIds(String globalSecurityGroupIds) {
        this.globalSecurityGroupIds = globalSecurityGroupIds;
        return this;
    }
    public String getGlobalSecurityGroupIds() {
        return this.globalSecurityGroupIds;
    }

    public CreateTairInstanceRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public CreateTairInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateTairInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateTairInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTairInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTairInstanceRequest setParamGroupId(String paramGroupId) {
        this.paramGroupId = paramGroupId;
        return this;
    }
    public String getParamGroupId() {
        return this.paramGroupId;
    }

    public CreateTairInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateTairInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateTairInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateTairInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateTairInstanceRequest setReadOnlyCount(Integer readOnlyCount) {
        this.readOnlyCount = readOnlyCount;
        return this;
    }
    public Integer getReadOnlyCount() {
        return this.readOnlyCount;
    }

    public CreateTairInstanceRequest setRecoverConfigMode(String recoverConfigMode) {
        this.recoverConfigMode = recoverConfigMode;
        return this;
    }
    public String getRecoverConfigMode() {
        return this.recoverConfigMode;
    }

    public CreateTairInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTairInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateTairInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTairInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTairInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CreateTairInstanceRequest setSecondaryZoneId(String secondaryZoneId) {
        this.secondaryZoneId = secondaryZoneId;
        return this;
    }
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
    }

    public CreateTairInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateTairInstanceRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public CreateTairInstanceRequest setShardType(String shardType) {
        this.shardType = shardType;
        return this;
    }
    public String getShardType() {
        return this.shardType;
    }

    public CreateTairInstanceRequest setSlaveReadOnlyCount(Integer slaveReadOnlyCount) {
        this.slaveReadOnlyCount = slaveReadOnlyCount;
        return this;
    }
    public Integer getSlaveReadOnlyCount() {
        return this.slaveReadOnlyCount;
    }

    public CreateTairInstanceRequest setSrcDBInstanceId(String srcDBInstanceId) {
        this.srcDBInstanceId = srcDBInstanceId;
        return this;
    }
    public String getSrcDBInstanceId() {
        return this.srcDBInstanceId;
    }

    public CreateTairInstanceRequest setStorage(Integer storage) {
        this.storage = storage;
        return this;
    }
    public Integer getStorage() {
        return this.storage;
    }

    public CreateTairInstanceRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateTairInstanceRequest setTag(java.util.List<CreateTairInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTairInstanceRequestTag> getTag() {
        return this.tag;
    }

    public CreateTairInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateTairInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateTairInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateTairInstanceRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. A tag is a key-value pair.</p>
         * <blockquote>
         * <p>A maximum of five key-value pairs can be specified at a time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>key1_test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <blockquote>
         * <p><strong>N</strong> specifies the serial number of the tag. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag, and <strong>Tag.2.Value</strong> specifies the value of the second tag.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>value1_test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTairInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTairInstanceRequestTag self = new CreateTairInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTairInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTairInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
