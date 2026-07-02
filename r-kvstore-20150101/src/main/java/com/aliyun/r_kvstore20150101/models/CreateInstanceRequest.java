// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable AOF persistence for the new instance. Valid values:</p>
     * <ul>
     * <li><p><strong>yes</strong> (default): Enables AOF persistence.</p>
     * </li>
     * <li><p><strong>no</strong>: Disables AOF persistence.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only for classic edition instances. AOF persistence cannot be configured for cloud native edition instances at creation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("Appendonly")
    public String appendonly;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables auto-renewal.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Disables auto-renewal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The auto-renewal duration, in months. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>6</strong>, and <strong>12</strong>.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>AutoRenew</strong> is set to <strong>true</strong>.</p>
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
     * <li><p><strong>true</strong>: Uses a coupon.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Does not use a coupon.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The ID of the backup that you want to use to create the new instance. You can obtain backup IDs by calling the <a href="https://help.aliyun.com/document_detail/473823.html">DescribeBackups</a> operation. If the source instance has a cluster architecture, you must specify the backup IDs of all its shards, separated by commas (for example, &quot;10\<em>\</em>,11\<em>\</em>,15\<em>\</em>&quot;).</p>
     * <blockquote>
     * <p>If your source instance is a cloud native cluster instance, it is recommended to call <a href="https://help.aliyun.com/document_detail/2679168.html">DescribeClusterBackupList</a> to get a cluster backup ID (for example, &quot;cb-xx&quot;) and use the <code>ClusterBackupId</code> parameter instead. This avoids the need to specify the backup ID for each shard.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>111111111</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The campaign ID or business information.</p>
     * 
     * <strong>example:</strong>
     * <p>000000000</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The storage capacity of the instance, in MB.</p>
     * <blockquote>
     * <p>You must specify either the <strong>Capacity</strong> or the <strong>InstanceClass</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16384</p>
     */
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><p><strong>PrePaid</strong>: subscription.</p>
     * </li>
     * <li><p><strong>PostPaid</strong> (default): pay-as-you-go.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The ID of the cluster backup. You can get this ID by calling the <a href="https://help.aliyun.com/document_detail/2679168.html">DescribeClusterBackupList</a> operation. This parameter is available for some cloud native cluster instances.</p>
     * <ul>
     * <li><p>This parameter is mutually exclusive with <code>BackupId</code>.</p>
     * </li>
     * <li><p>If this parameter is not available for your instance, you must specify the backup ID of each shard in the <code>BackupId</code> parameter (for example, &quot;2158\<em>\</em>\<em>\<em>20,2158\</em>\</em>\*\*22&quot;).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cb-hyxdof5x9kqb****</p>
     */
    @NameInMap("ClusterBackupId")
    public String clusterBackupId;

    /**
     * <p>The prefix of the connection string. The prefix must be 8 to 40 characters long, start with a lowercase letter, and contain only lowercase letters and digits.</p>
     * <blockquote>
     * <p>The full connection string is in the format: \<prefix>.redis.rds.aliyuncs.com.</p>
     * </blockquote>
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
     * <p>The ID of the dedicated host group. This parameter is required when you create a Redis instance in a dedicated host group.</p>
     * 
     * <strong>example:</strong>
     * <p>dhg-uv4fnk6r7zff****</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Checks the request for validity without creating the instance. The system verifies required parameters, request format, and service limits. If the request is valid, the <code>DryRunOperation</code> error code is returned. If the request is invalid, an error message is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends the request. If the request is valid, the instance is created.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The Redis engine version. Valid values for <strong>classic edition</strong> instances:</p>
     * <ul>
     * <li><p><strong>2.8</strong> (Not recommended. <a href="https://help.aliyun.com/document_detail/2674657.html">Support for this version is scheduled to be discontinued</a>.)</p>
     * </li>
     * <li><p><strong>4.0</strong> (Not recommended.)</p>
     * </li>
     * <li><p><strong>5.0</strong></p>
     * </li>
     * </ul>
     * <p>Valid values for <strong>cloud native edition</strong> instances:</p>
     * <ul>
     * <li><p><strong>5.0</strong></p>
     * </li>
     * <li><p><strong>6.0</strong> (Recommended)</p>
     * </li>
     * <li><p><strong>7.0</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The default value is <strong>5.0</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>Specifies whether to create the new instance as the first child instance of a distributed instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Creates the instance as the first child instance.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Does not create the instance as the first child instance.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>If you set this parameter to <strong>true</strong>, the new instance must be a Tair memory-enhanced instance that runs Redis 5.0.</p>
     * </li>
     * <li><p>This parameter is available only in Chinese mainland.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GlobalInstance")
    public Boolean globalInstance;

    /**
     * <p>The ID of the distributed instance. This parameter is available only in Chinese mainland.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>This parameter is required to add the new instance as a child of a distributed instance. For more information and the console procedure, see <a href="https://help.aliyun.com/document_detail/106885.html">Add a child instance to a distributed instance</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>gr-bp14rkqrhac****</p>
     */
    @NameInMap("GlobalInstanceId")
    public String globalInstanceId;

    /**
     * <p>The IDs of the security groups to associate with the instance. You can specify multiple security group IDs, separated by commas (,). IDs cannot be repeated.</p>
     * <blockquote>
     * <p>Notice: This parameter is available only for cloud native edition instances. Security groups are not supported for classic edition instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>g-zsldxfiwjmti0kcm****</p>
     */
    @NameInMap("GlobalSecurityGroupIds")
    public String globalSecurityGroupIds;

    /**
     * <p>The instance type. For example, <code>redis.master.small.default</code> specifies a 1 GB Community Edition (classic edition) instance with a standard, dual-replica architecture. For more information, see <a href="https://help.aliyun.com/document_detail/26350.html">Instance specifications</a>.</p>
     * <blockquote>
     * <p>You must specify either the <strong>Capacity</strong> or the <strong>InstanceClass</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>redis.master.small.default</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The connection endpoint type. This parameter is applicable only when you create a dual-zone, read/write splitting instance of the cloud native edition. If this parameter is not specified, <code>AzIndependentEndpoint</code> is used. Valid values:</p>
     * <ul>
     * <li><p><strong>AzIndependentEndpoint</strong>: (<strong>Default</strong>) Zone-Independent Endpoint. The primary and secondary zones each provide an independent connection string for zone-local access.</p>
     * </li>
     * <li><p><strong>UnifiedEndpoint</strong>: Unified Endpoint. Provides a single connection string to access nodes in both zones, which may result in cross-zone access.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is applicable only to dual-zone, read/write splitting instances of the cloud native edition. For other instance types, only zone-independent endpoints are supported, and specifying <code>UnifiedEndpoint</code> has no effect.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The <code>UnifiedEndpoint</code> parameter is currently available only to allowlisted users. API calls will fail if you are not on the allowlist. To be added to the allowlist, submit a ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>AzIndependentEndpoint</p>
     */
    @NameInMap("InstanceEndpointType")
    public String instanceEndpointType;

    /**
     * <p>The name of the instance. The name must be 2 to 80 characters long, start with a letter (uppercase or lowercase) or a Chinese character, and not contain spaces or the characters <code>@/:=”&lt;&gt;{[]}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>apitest</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li><p><strong>Redis</strong> (default)</p>
     * </li>
     * <li><p><strong>Memcache</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Redis</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The end time of the maintenance window. Specify the time in the <em>HH:mm</em>Z format (UTC). For example, to set the end time to 02:00 (UTC+8), specify <code>18:00Z</code>.</p>
     * <blockquote>
     * <p>The duration of the maintenance window must be at least one hour.</p>
     * </blockquote>
     * <blockquote>
     * <p>If this parameter is not specified, the maintenance window ends at 06:00 (UTC+8), which is 22:00 (UTC).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>07:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>The start of the maintenance window. Specify the time in the <em>HH:mm</em>Z format (UTC). For example, to set the start time to 01:00 (UTC+8), specify <code>17:00Z</code>.</p>
     * <blockquote>
     * <p>If this parameter is not specified, the maintenance window starts at 02:00 (UTC+8), which is 18:00 (UTC).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>03:00Z</p>
     */
    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    /**
     * <p>The network type. Valid value:</p>
     * <ul>
     * <li><strong>VPC</strong>: Deploys the instance in a Virtual Private Cloud. This is the default value.</li>
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
     * <li><p><strong>MASTER_SLAVE</strong>: high-availability (primary-replica)</p>
     * </li>
     * <li><p><strong>STAND_ALONE</strong>: standalone (single-node)</p>
     * </li>
     * <li><p><strong>double</strong>: primary-replica</p>
     * </li>
     * <li><p><strong>single</strong>: standalone (single-node)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Set this parameter to <strong>MASTER_SLAVE</strong> or <strong>STAND_ALONE</strong> for cloud native edition instances. Set this parameter to <strong>double</strong> or <strong>single</strong> for classic edition instances.</p>
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
     * <p>The ID of the parameter group. This ID must be globally unique.&gt;Notice:  This parameter is available only for cloud native edition instances.</p>
     * 
     * <strong>example:</strong>
     * <p>rpg-test**</p>
     */
    @NameInMap("ParamGroupId")
    public String paramGroupId;

    /**
     * <p>The password for the instance. The password must be 8 to 32 characters long and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The allowed special characters are <code>!@#$%^&amp;*()_+-=</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Pass!123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The subscription duration, in months. Valid values: <strong>1</strong> to <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, <strong>36</strong>, and <strong>60</strong>.</p>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>ChargeType</strong> is set to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The service port of the instance. The port number must be between <strong>1</strong> and <strong>65535</strong>. The default value is <strong>6379</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>6379</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The private IP address of the new instance.</p>
     * <blockquote>
     * <p>The IP address must be within the CIDR block of the specified vSwitch.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.***</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The number of read-only replicas in the primary zone. This parameter is available only when creating a read/write splitting instance of the cloud native edition.</p>
     * <ul>
     * <li><p>For a standard-architecture instance, the value must be an integer from 1 to 9.</p>
     * </li>
     * <li><p>For a cluster-architecture instance, the value must be an integer from 1 to 4. This specifies the number of read-only replicas for each data shard.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a multi-zone instance, you can use this parameter and <code>SlaveReadOnlyCount</code> to customize the number of read-only replicas in the primary and secondary zones.</p>
     * <ul>
     * <li><p>The sum of this parameter and <code>SlaveReadOnlyCount</code> cannot exceed 9 for a standard-architecture instance.</p>
     * </li>
     * <li><p>The sum of this parameter and <code>SlaveReadOnlyCount</code> cannot exceed 4 for a cluster-architecture instance.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ReadOnlyCount")
    public Integer readOnlyCount;

    /**
     * <p>Specifies which configurations to restore from the backup when creating an instance. Valid values include <code>account</code>, <code>config</code>, and <code>whitelist</code>. For example, to restore account settings, specify <code>account</code>. To restore multiple configurations, separate them with commas.</p>
     * <p>By default, this parameter is empty, which means no configurations are restored.</p>
     * <blockquote>
     * <p>This parameter is applicable only to cloud native edition instances. The source backup must contain the specified configurations. You can call the <a href="https://help.aliyun.com/document_detail/473823.html">DescribeBackups</a> operation and check the <code>RecoverConfigMode</code> field in the response to determine which configurations a backup contains.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>whitelist,config,account</p>
     */
    @NameInMap("RecoverConfigMode")
    public String recoverConfigMode;

    /**
     * <p>The ID of the region in which to create the instance. Call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to get a list of region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of replicas in the primary zone. This parameter is available only for multi-replica cluster instances of the cloud native edition. You can specify a value from 1 to 4.</p>
     * <blockquote>
     * <p>When creating a multi-zone instance, you can use this parameter and <code>SlaveReplicaCount</code> to customize the number of replicas in the primary and secondary zones. The sum of <code>ReplicaCount</code> and <code>SlaveReplicaCount</code> cannot exceed 4.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ReplicaCount")
    public Integer replicaCount;

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
     * <p>The point in time to which you want to restore data, specified in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z (UTC) format.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-19T16:00:00Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The ID of the secondary zone. You can call the <a href="https://help.aliyun.com/document_detail/473764.html">DescribeZones</a> operation to query the latest list of zones.</p>
     * <blockquote>
     * <p>The value of this parameter cannot be the same as the value of the <code>ZoneId</code> parameter, and you cannot specify a multi-zone ID.</p>
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
     * <p>The number of shards. This parameter is available only for cloud native edition instances.</p>
     * <ul>
     * <li><p>A value of <strong>1</strong> creates an instance with a standard architecture.</p>
     * </li>
     * <li><p>A value greater than <strong>1</strong> creates an instance with a cluster architecture.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    /**
     * <p>The number of read-only replicas in the secondary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SlaveReadOnlyCount")
    public Integer slaveReadOnlyCount;

    /**
     * <p>The number of replicas in the secondary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SlaveReplicaCount")
    public Integer slaveReplicaCount;

    /**
     * <p>To create an instance from a backup, specify the ID of the source instance.</p>
     * <blockquote>
     * <p>This parameter must be used in conjunction with one of the following parameters: <strong>BackupId</strong>, <strong>ClusterBackupId</strong> (recommended for cloud native, cluster-architecture instances), or <strong>RestoreTime</strong>.</p>
     * </blockquote>
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
     * <p>A client-generated token to ensure the idempotence of the request. The token must be unique across requests, case-sensitive, and cannot exceed 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nme44gek34slfc****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the primary zone for the instance. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeZones</a> operation to query available zones.</p>
     * <blockquote>
     * <p>You can also specify a secondary zone by using the <code>SecondaryZoneId</code> parameter. The primary and replica nodes are then deployed in the specified primary and secondary zones to create a dual-zone architecture for in-city disaster recovery. For example, you can set the <code>ZoneId</code> parameter to &quot;cn-hangzhou-h&quot; and the <code>SecondaryZoneId</code> parameter to &quot;cn-hangzhou-g&quot;.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
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

    public CreateInstanceRequest setInstanceEndpointType(String instanceEndpointType) {
        this.instanceEndpointType = instanceEndpointType;
        return this;
    }
    public String getInstanceEndpointType() {
        return this.instanceEndpointType;
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

    public CreateInstanceRequest setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public CreateInstanceRequest setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
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

    public CreateInstanceRequest setReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
        return this;
    }
    public Integer getReplicaCount() {
        return this.replicaCount;
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

    public CreateInstanceRequest setSlaveReplicaCount(Integer slaveReplicaCount) {
        this.slaveReplicaCount = slaveReplicaCount;
        return this;
    }
    public Integer getSlaveReplicaCount() {
        return this.slaveReplicaCount;
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
         * <p>The key of the tag.</p>
         * <blockquote>
         * <ul>
         * <li><p><code>N</code> represents the sequence number of the tag, from 1 to 20. You can add a maximum of 20 tags to an instance.</p>
         * </li>
         * <li><p>If the tag key does not exist, it is automatically created.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testkey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value for tag <code>N</code>.</p>
         * <blockquote>
         * <p>The N in <strong>Tag.N.Value</strong> specifies the sequence number of the tag. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag, and <strong>Tag.2.Value</strong> specifies the value of the second tag.</p>
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
