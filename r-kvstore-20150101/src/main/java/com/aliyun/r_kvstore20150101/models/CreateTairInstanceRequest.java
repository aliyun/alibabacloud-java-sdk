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
     * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enable auto-renewal.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Disable auto-renewal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The auto-renewal duration. Unit: month. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>6</strong>, and <strong>12</strong>.</p>
     * <blockquote>
     * <p>This parameter is required only when the <strong>AutoRenew</strong> parameter is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AutoRenewPeriod")
    public String autoRenewPeriod;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Use a coupon.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Do not use a coupon.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The ID of the backup set from the source instance. The system creates a new instance based on the data in this backup set. You can call the <a href="https://help.aliyun.com/document_detail/473823.html">DescribeBackups</a> operation to query the backup set ID. If the source instance is a cluster instance, you must specify the backup ID for each shard, separated by commas, for example, &quot;10\<em>\</em>,11\<em>\</em>,15\<em>\</em>&quot;.</p>
     * <blockquote>
     * <p>If your instance is a cloud-native cluster instance, we recommend that you call the <a href="https://help.aliyun.com/document_detail/2679168.html">DescribeClusterBackupList</a> operation to query the cluster backup ID, such as <code>cb-xx</code>. Then, specify the cluster backup ID for the <code>ClusterBackupId</code> parameter to clone the cluster instance. This avoids the need to specify the backup ID of each shard.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2158****20</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The business information. This can be the ID of a promotion or a business context.</p>
     * 
     * <strong>example:</strong>
     * <p>000000000</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>PrePaid</strong> (default): The subscription billing method.</p>
     * </li>
     * <li><p><strong>PostPaid</strong>: The pay-as-you-go billing method.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>A client-generated token that ensures the idempotence of the request. The token must be unique among different requests. It is case-sensitive and cannot exceed 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the cluster backup set. Some instances that use the cluster architecture support cluster backup sets. You can call the <a href="https://help.aliyun.com/document_detail/2679168.html">DescribeClusterBackupList</a> operation to query for cluster backup set IDs.</p>
     * <ul>
     * <li><p>If this feature is supported, you can specify this parameter and leave the <strong>BackupId</strong> parameter empty.</p>
     * </li>
     * <li><p>If this feature is not supported, you must specify the backup ID of each shard of the source instance for the <code>BackupId</code> parameter. Separate the backup IDs with commas, for example, &quot;2158\<em>\</em>\<em>\<em>20,2158\</em>\</em>\*\*22&quot;.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cb-hyxdof5x9kqb****</p>
     */
    @NameInMap("ClusterBackupId")
    public String clusterBackupId;

    /**
     * <p>The prefix of the connection string. It must start with a lowercase letter, consist of lowercase letters and digits, and be 8 to 40 characters in length.</p>
     * <blockquote>
     * <p>The full connection string is in the format of <code>&lt;prefix&gt;-&lt;instance ID&gt;.redis.rds.aliyuncs.com</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The coupon code.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>Specifies whether to perform a precheck for this request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Performs a precheck and does not create the instance. The system checks the request parameters, request format, service limits, and available inventory. If the request fails the precheck, an error message is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a normal request and creates the instance after the request passes the precheck.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The database version. Default value: <strong>1.0</strong>. The valid values depend on the Tair instance series:</p>
     * <ul>
     * <li><p><strong>tair_rdb</strong>: Tair memory-enhanced instances are compatible with Redis 5.0, Redis 6.0, and Redis 7.0. Set the value to <strong>5.0</strong>, <strong>6.0</strong>, or <strong>7.0</strong>.</p>
     * </li>
     * <li><p><strong>tair_scm</strong>: Tair persistent memory-optimized instances are compatible with Redis 6.0. Set the value to <strong>1.0</strong>.</p>
     * </li>
     * <li><p><strong>tair_essd</strong>: Tair disk-based instances (ESSD/SSD) are compatible with Redis 6.0. Set the value to <strong>1.0</strong> to create an ESSD-based instance or <strong>2.0</strong> to create an SSD-based instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>Specifies whether to create the instance as a child instance in a distributed instance. By using this parameter, you can create a distributed instance.</p>
     * <ul>
     * <li><p>To create the first child instance, set this parameter to <strong>true</strong>.</p>
     * </li>
     * <li><p>To create the second or third child instance, specify the ID of the distributed instance, such as <code>gr-bp14rkqrhac****</code>.</p>
     * </li>
     * <li><p>If you do not want to create a distributed instance, do not specify this parameter.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To be created as a child instance of a distributed instance, the new instance must be a Tair memory-enhanced instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gr-bp14rkqrhac****</p>
     */
    @NameInMap("GlobalInstanceId")
    public String globalInstanceId;

    /**
     * <p>The IDs of the global IP whitelist templates for the instance. To specify multiple template IDs, separate them with commas. The IDs cannot be repeated.</p>
     * 
     * <strong>example:</strong>
     * <p>g-zsldxfiwjmti0kcm****</p>
     */
    @NameInMap("GlobalSecurityGroupIds")
    public String globalSecurityGroupIds;

    /**
     * <p>The instance type. For more information, see the following topics:</p>
     * <ul>
     * <li><p><a href="https://help.aliyun.com/document_detail/2527112.html">Memory-enhanced instance types</a></p>
     * </li>
     * <li><p><a href="https://help.aliyun.com/document_detail/2527110.html">Persistent memory-optimized instance types</a></p>
     * </li>
     * <li><p><a href="https://help.aliyun.com/document_detail/2527111.html">Disk-based instance types</a></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tair.scm.standard.4m.32d</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The type of connection string to use when creating a cloud-native, dual-zone instance with the read/write splitting architecture. If you do not specify this parameter, the default value <code>AzIndependentEndpoint</code> is used.</p>
     * <ul>
     * <li><p><strong>AzIndependentEndpoint</strong> (<strong>default</strong>): Zone-specific connection string. The primary and secondary zones each provide an independent connection string, allowing clients to connect to the nearest zone.</p>
     * </li>
     * <li><p><strong>UnifiedEndpoint</strong>: Unified connection string. A single connection string is provided to access nodes in both the primary and secondary zones, but this may cause cross-zone access.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter applies only to cloud-native, dual-zone instances with the read/write splitting architecture. Other instance types support only zone-specific connection strings.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The <code>UnifiedEndpoint</code> option is available only to users on a whitelist. If a non-whitelisted user specifies this value, the request fails. To request access, submit a ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>AzIndependentEndpoint</p>
     */
    @NameInMap("InstanceEndpointType")
    public String instanceEndpointType;

    /**
     * <p>The name of the instance. The name must meet the following requirements:</p>
     * <ul>
     * <li><p>It must be 2 to 80 characters in length.</p>
     * </li>
     * <li><p>It must start with an uppercase or lowercase letter or a Chinese character. It cannot contain spaces or the following special characters: <code>@/:=”&lt;&gt;{[]}</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>apitest</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The Tair instance series, which determines the storage medium. Valid values:</p>
     * <ul>
     * <li><p><strong>tair_rdb</strong>: memory-enhanced</p>
     * </li>
     * <li><p><strong>tair_scm</strong>: persistent memory-optimized</p>
     * </li>
     * <li><p><strong>tair_essd</strong>: disk-based</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tair_scm</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The end time of the maintenance window. Specify the time in the <em>HH:mm</em>Z format (UTC). For example, to end the maintenance at 02:00 (UTC+8), set this parameter to <code>18:00Z</code>.</p>
     * <blockquote>
     * <p>The maintenance window must be at least one hour long.</p>
     * </blockquote>
     * <blockquote>
     * <p>If this parameter is not specified, the maintenance window ends at 22:00 UTC (06:00 UTC+8) by default.</p>
     * </blockquote>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>The start time of the maintenance window. Specify the time in the <em>HH:mm</em>Z format (UTC). For example, to start the maintenance at 01:00 (UTC+8), set this parameter to <code>17:00Z</code>.</p>
     * <blockquote>
     * <p>If this parameter is not specified, the maintenance window starts at 18:00 UTC (02:00 UTC+8) by default.</p>
     * </blockquote>
     */
    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the parameter template. The instance is created by using the parameters defined in this template.</p>
     * 
     * <strong>example:</strong>
     * <p>g-50npzjcqb1ua6q6j****</p>
     */
    @NameInMap("ParamGroupId")
    public String paramGroupId;

    /**
     * <p>The password of the instance. The password must meet the following requirements:</p>
     * <ul>
     * <li><p>It must be 8 to 32 characters in length.</p>
     * </li>
     * <li><p>It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The supported special characters are <code>!@#$%^&amp;*()_+-=</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pass!123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The subscription duration, in months. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>6</strong>, 7, 8, 9, 12, 24, 36, and 60.</p>
     * <blockquote>
     * <p>This parameter is required only when you set the <code>ChargeType</code> parameter to <code>PrePaid</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The service port of the instance. Valid values: 1 to 65535. Default value: 6379.</p>
     * 
     * <strong>example:</strong>
     * <p>6379</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The private IP address of the instance.</p>
     * <blockquote>
     * <p>The IP address must be within the CIDR block of the vSwitch to which the instance belongs. You can call the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation to query the CIDR block information.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.16.88.***</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The number of read-only nodes in the primary zone. This parameter is applicable only to cloud-native instances that use the read/write splitting architecture.</p>
     * <ul>
     * <li><p>If the instance uses the standard architecture, the valid values are 1 to 9.</p>
     * </li>
     * <li><p>If the instance uses the cluster architecture, specify the number of read-only nodes per shard. The valid values are 1 to 4.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a multi-zone instance, you can use this parameter and the <code>SlaveReadOnlyCount</code> parameter to customize the number of read-only nodes in the primary and secondary zones.</p>
     * <ul>
     * <li><p>If the instance uses the standard architecture, the sum of <code>ReadOnlyCount</code> and <code>SlaveReadOnlyCount</code> cannot exceed 9.</p>
     * </li>
     * <li><p>If the instance uses the cluster architecture, the sum of <code>ReadOnlyCount</code> and <code>SlaveReadOnlyCount</code> cannot exceed 4.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ReadOnlyCount")
    public Integer readOnlyCount;

    /**
     * <p>When creating an instance from a backup set, specifies whether to restore configurations such as account information (<code>account</code>), kernel parameters (<code>config</code>), and whitelists (<code>whitelist</code>) from the source backup set. To restore a specific configuration, specify its keyword. To restore multiple configurations, separate the keywords with commas.</p>
     * <p>If this parameter is not specified, no configurations are restored from the source backup set.</p>
     * <blockquote>
     * <p>This parameter applies only to cloud-native instances, and the source backup set must contain the specified configuration information. You can call the <a href="https://help.aliyun.com/document_detail/473823.html">DescribeBackups</a> operation and check the <code>RecoverConfigMode</code> parameter in the response to check if the backup set contains the information.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>whitelist,config,account</p>
     */
    @NameInMap("RecoverConfigMode")
    public String recoverConfigMode;

    /**
     * <p>The ID of the region where you want to create the instance. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query available regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of replica nodes in the primary zone. This parameter is applicable only to cloud-native, multi-replica cluster instances. You can use this parameter to customize the number of replica nodes. Valid values: 1 to 4.</p>
     * <blockquote>
     * <p>If you create a multi-zone instance, you can use this parameter and the <code>SlaveReplicaCount</code> parameter to customize the number of replica nodes in the primary and secondary zones. The sum of <code>ReplicaCount</code> and <code>SlaveReplicaCount</code> cannot exceed 4.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ReplicaCount")
    public Integer replicaCount;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * <blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation or use the Resource Management console to query the IDs of resource groups. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * </li>
     * <li><p>Before you change the resource group of an instance, you can call the <a href="https://help.aliyun.com/document_detail/158866.html">ListResources</a> operation to view the current resource group of the instance.</p>
     * </li>
     * </ul>
     * </blockquote>
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
     * <p>If point-in-time recovery (PITR) is enabled for the source instance, you can specify a point in time within the backup retention period. The system creates a new instance by using the backup data of the source instance at that point in time. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-06T07:25:57Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The ID of the secondary zone. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query available zones.</p>
     * <blockquote>
     * <p>The value of this parameter cannot be the same as the value of the <code>ZoneId</code> parameter. You cannot specify a multi-zone ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The number of shards in the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong> (default): Creates a standard architecture instance with a single shard.</p>
     * </li>
     * <li><p>From <strong>2</strong> to <strong>32</strong>: Creates a cluster architecture instance with the specified number of shards.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can specify a value from <strong>2</strong> to <strong>32</strong> for this parameter only when you set the <strong>InstanceType</strong> parameter to <code>tair_rdb</code> or <code>tair_scm</code>. Only memory-enhanced and persistent memory-optimized instances support the cluster architecture.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    /**
     * <p>The architecture type of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>MASTER_SLAVE</strong> (default): The primary/replica architecture, which provides high availability.</p>
     * </li>
     * <li><p><strong>STAND_ALONE</strong>: single-replica. This architecture uses a single node. If the node fails, data is lost, and the system automatically creates a new, empty instance. This architecture is supported only for <strong>single-zone</strong> deployments and does not support cluster or read/write splitting architectures.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MASTER_SLAVE</p>
     */
    @NameInMap("ShardType")
    public String shardType;

    /**
     * <p>The number of read-only nodes in the secondary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SlaveReadOnlyCount")
    public Integer slaveReadOnlyCount;

    /**
     * <p>The number of replica nodes in the secondary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SlaveReplicaCount")
    public Integer slaveReplicaCount;

    /**
     * <p>To create an instance from a backup set of an existing instance, specify the ID of the source instance.</p>
     * <blockquote>
     * <p>You must also specify the backup data by using one of the following parameters: <strong>BackupId</strong>, <strong>ClusterBackupId</strong>, or <strong>RestoreTime</strong>. We recommend that you use <code>ClusterBackupId</code> for cloud-native instances that use a cluster architecture.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("SrcDBInstanceId")
    public String srcDBInstanceId;

    /**
     * <p>The storage space of the disk-based instance. The valid values of this parameter vary based on the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/2527111.html">Disk-based instance types</a>.</p>
     * <blockquote>
     * <p>This parameter is required only when you set the <strong>InstanceType</strong> parameter to <code>tair_essd</code> to create a Tair instance that uses an ESSD. For Tair instances that use standard <code>SSD</code>s, the storage capacity is determined by the instance type and you do not need to specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Storage")
    public Integer storage;

    /**
     * <p>The storage type. Valid values: <strong>essd_pl1</strong>, <strong>essd_pl2</strong>, and <strong>essd_pl3</strong>.</p>
     * <blockquote>
     * <p>This parameter is required only when you set the <strong>InstanceType</strong> parameter to <code>tair_essd</code> to create a Tair instance that uses an Enhanced SSD (ESSD).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>essd_pl1</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The tags of the instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTairInstanceRequestTag> tag;

    /**
     * <p>The ID of the vSwitch in the specified VPC. You can call the VPC API operation <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVSwitches</a> to obtain the vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the Virtual Private Cloud (VPC) where you want to create the instance. You can call the <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> operation to query available VPCs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nme44gek34slfc****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the primary zone where you want to create the instance. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query available zones.</p>
     * <blockquote>
     * <p>You can also specify a secondary zone by using the <code>SecondaryZoneId</code> parameter. This deploys the primary and replica nodes in different zones within the same region for a high-availability primary/replica architecture. For example, you can set <code>ZoneId</code> to <code>cn-hangzhou-h</code> and <code>SecondaryZoneId</code> to <code>cn-hangzhou-g</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
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

    public CreateTairInstanceRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
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

    public CreateTairInstanceRequest setInstanceEndpointType(String instanceEndpointType) {
        this.instanceEndpointType = instanceEndpointType;
        return this;
    }
    public String getInstanceEndpointType() {
        return this.instanceEndpointType;
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

    public CreateTairInstanceRequest setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public CreateTairInstanceRequest setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
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

    public CreateTairInstanceRequest setReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
        return this;
    }
    public Integer getReplicaCount() {
        return this.replicaCount;
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

    public CreateTairInstanceRequest setSlaveReplicaCount(Integer slaveReplicaCount) {
        this.slaveReplicaCount = slaveReplicaCount;
        return this;
    }
    public Integer getSlaveReplicaCount() {
        return this.slaveReplicaCount;
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
         * <p>The key of the tag.</p>
         * <blockquote>
         * <p>A single request can contain up to five key-value pairs.</p>
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
         * <p><strong>N</strong> specifies the Nth tag in the request. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag, and <strong>Tag.2.Value</strong> specifies the value of the second tag.</p>
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
