// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The Append Only File (AOF) persistence parameter settings for the new instance. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong> (default): enables AOF persistence.</li>
     * <li><strong>no</strong>: disables AOF persistence.<blockquote>
     * <p>This parameter is applicable to classic instances. Cloud-native instances do not support specifying the AOF parameter.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("Appendonly")
    public String appendonly;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal.</li>
     * <li><strong>false</strong> (default): does not enable auto-renewal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The auto-renewal epoch. Unit: months. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>6</strong>, and <strong>12</strong>.</p>
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
     * <li><strong>true</strong>: uses a coupon.</li>
     * <li><strong>false</strong> (default): does not use a coupon.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The ID of the backup set of the source instance. The system uses the data stored in the backup set to create the instance. You can invoke <a href="https://help.aliyun.com/document_detail/473823.html">DescribeBackups</a> to query the BackupId. If the source instance is a cluster instance, specify the backup set IDs of all shards of the source instance, separated by commas (,). Example: &quot;10\<em>\</em>,11\<em>\</em>,15\<em>\</em>&quot;.</p>
     * <blockquote>
     * <p>If your instance is a cloud-native architecture cluster instance, use <a href="https://help.aliyun.com/document_detail/2679168.html">DescribeClusterBackupList</a> to query the cluster backup set ID, such as &quot;cb-xx&quot;, and specify it in the ClusterBackupId request parameter to clone the cluster instance. This eliminates the need to specify individual shard backup set IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>111111111</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The activity ID and business information.</p>
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
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription.</li>
     * <li><strong>PostPaid</strong> (default): pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The cluster backup set ID, which is supported by some new cluster architecture instances. You can call <a href="https://help.aliyun.com/document_detail/2679168.html">DescribeClusterBackupList</a> to obtain the ID.</p>
     * <ul>
     * <li>If supported, specify the cluster backup set ID. You do not need to specify the <strong>BackupId</strong> parameter.</li>
     * <li>If not supported, specify the backup set IDs of all shards of the source instance in the BackupId parameter, separated by commas (,). Example: &quot;2158\<em>\</em>\<em>\<em>20,2158\</em>\</em>\*\*22&quot;.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cb-hyxdof5x9kqb****</p>
     */
    @NameInMap("ClusterBackupId")
    public String clusterBackupId;

    /**
     * <p>The prefix of the endpoint. The prefix must consist of lowercase letters and digits, start with a lowercase letter, and be 8 to 40 characters in length.</p>
     * <blockquote>
     * <p>The endpoint is in the format of: <prefix>.redis.rds.aliyuncs.com.</p>
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
     * <p>The ID of the dedicated cluster. This parameter is required when you create an instance in a dedicated cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>dhg-uv4fnk6r7zff****</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>Specifies whether to perform a dry run for this instance creation request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without creating the instance. The system checks items such as the request parameters, request format, service limits, and available resources. If the check fails, the corresponding error is returned. If the check succeeds, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): sends the request. After the request passes the check, the instance is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Redis <strong>classic</strong> engine version. Valid values:</p>
     * <ul>
     * <li><strong>2.8</strong> (not recommended, <a href="https://help.aliyun.com/document_detail/2674657.html">planned for end of support</a>)</li>
     * <li><strong>4.0</strong> (not recommended)</li>
     * <li><strong>5.0</strong></li>
     * </ul>
     * <p>Redis <strong>cloud-native</strong> engine version. Valid values:</p>
     * <ul>
     * <li><strong>5.0</strong></li>
     * <li><strong>6.0</strong> (recommended)</li>
     * <li><strong>7.0</strong></li>
     * </ul>
     * <blockquote>
     * <p>Default value: <strong>5.0</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>Specifies whether to use the new instance as the first child instance of a distributed instance. This allows you to create a distributed instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: uses the instance as the first child instance.</li>
     * <li><strong>false</strong> (default): does not use the instance as the first child instance.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>To set this parameter to <strong>true</strong>, the new instance must be a Tair memory-optimized instance with a database DPI engine version of 5.0.</li>
     * <li>This parameter is applicable only to Chinese site (aliyun.com).</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GlobalInstance")
    public Boolean globalInstance;

    /**
     * <p>The instance ID of the distributed instance. This parameter is applicable only to Chinese site (aliyun.com).</p>
     * <p>&lt;props=&quot;china&quot;&gt; To append the new Redis instance as a child instance of a distributed instance, this parameter is active and required. For more information and console operations, see <a href="https://help.aliyun.com/document_detail/106885.html">Add a child instance to a distributed instance</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>gr-bp14rkqrhac****</p>
     */
    @NameInMap("GlobalInstanceId")
    public String globalInstanceId;

    /**
     * <p>The global IP whitelist templates for the instance. Separate multiple templates with commas (,). Duplicates are not allowed.</p>
     * <blockquote>
     * <p>Notice: This parameter is applicable only to cloud-native instances. Classic instances do not support the whitelist template feature.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>g-zsldxfiwjmti0kcm****</p>
     */
    @NameInMap("GlobalSecurityGroupIds")
    public String globalSecurityGroupIds;

    /**
     * <p>The instance type. For example, redis.master.small.default specifies a Community Edition (classic) standard architecture dual-replica 1 GB instance. For more information, see <a href="https://help.aliyun.com/document_detail/26350.html">Instance type overview</a>. </p>
     * <blockquote>
     * <p>You must specify at least one of the <strong>Capacity</strong> and <strong>InstanceClass</strong> parameters when you call this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>redis.master.small.default</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The endpoint type used when you create a cloud-native dual-zone deployment read/write splitting instance. If this parameter is not explicitly committed, the default value is AzIndependentEndpoint.</p>
     * <ul>
     * <li><strong>AzIndependentEndpoint</strong>: <strong>default value</strong>. Zone-independent endpoints. The primary and secondary zones provide independent endpoints, which allow nearest access through different endpoints.</li>
     * <li><strong>UnifiedEndpoint</strong>: unified endpoint. A unified endpoint is provided to access nodes in both the primary and secondary zones, but cross-zone access may occur.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: This parameter is applicable only to cloud-native dual-zone deployment read/write splitting instances. For other instance types, only zone-independent endpoints are supported. Even if UnifiedEndpoint is specified, it does not take effect.</notice></p>
     * </blockquote>
     * <blockquote>
     * <p>Notice: The UnifiedEndpoint option is available only to users on the whitelist. If you are not on the whitelist and specify this parameter, the invocation returns an error. To request access, submit a ticket.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AzIndependentEndpoint</p>
     */
    @NameInMap("InstanceEndpointType")
    public String instanceEndpointType;

    /**
     * <p>The name of the instance. The name must be 2 to 80 characters in length and must start with a letter or a Chinese character. The name cannot contain <code>@/:=&quot;&lt;&gt;{[]}</code> or spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>apitest</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li><strong>Redis</strong> (default)</li>
     * <li><strong>Memcache</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Redis</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The end time of the maintenance window. Specify the time in the <i>HH:mm</i>Z format in UTC. For example, to set the end time to 02:00 (UTC+8), specify <code>18:00Z</code>.</p>
     * <blockquote>
     * <p>The interval between the start time and end time must be at least 1 hour.</p>
     * </blockquote>
     * <blockquote>
     * <p>If this parameter is not specified, the default value is 06:00 (UTC+8), which is 22:00Z in UTC.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>07:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>The start time of the maintenance window. Specify the time in the <i>HH:mm</i>Z format in UTC. For example, to set the start time to 01:00 (UTC+8), specify <code>17:00Z</code>.</p>
     * <blockquote>
     * <p>If this parameter is not specified, the default value is 02:00 (UTC+8), which is 18:00Z in UTC.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>03:00Z</p>
     */
    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    /**
     * <p>The network type. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong>: Virtual Private Cloud (VPC). This is the default value.</li>
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
     * <li><strong>MASTER_SLAVE</strong>: high availability (dual-replica)</li>
     * <li><strong>STAND_ALONE</strong>: single replica</li>
     * <li><strong>double</strong>: dual-replica</li>
     * <li><strong>single</strong>: single replica<blockquote>
     * <p>For cloud-native instances, set this parameter to <strong>MASTER_SLAVE</strong> or <strong>STAND_ALONE</strong>. For classic instances, set this parameter to <strong>double</strong> or <strong>single</strong>.</p>
     * </blockquote>
     * </li>
     * </ul>
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
     * <p>The ID of the parameter template. The ID is globally unique.&gt;Notice: This parameter is applicable only to cloud-native instances.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>rpg-test**</p>
     */
    @NameInMap("ParamGroupId")
    public String paramGroupId;

    /**
     * <p>The password of the instance. The password must be 8 to 32 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, special characters, and digits. The following special characters are supported: <code>!@#$%^&amp;*()_+-=</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Pass!123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The subscription period. Unit: months. Valid values: <strong>1</strong> to <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, <strong>36</strong>, and <strong>60</strong>.</p>
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
     * <p>The service port of the instance. Valid values: <strong>1</strong> to <strong>65535</strong>. Default value: <strong>6379</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>6379</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The internal network IP address of the new instance.</p>
     * <blockquote>
     * <p>The internal network IP address must be within the vSwitch CIDR block to which the instance belongs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.***</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The number of read-only nodes in the primary zone. This parameter is applicable only to cloud-native read/write splitting instances.</p>
     * <ul>
     * <li>For standard architecture instances, valid values are 1 to 9.</li>
     * <li>For cluster architecture instances, valid values are 1 to 4, which specifies the number of read-only nodes per data shard.<blockquote>
     * <p>If you create a multi-zone instance, you can use this parameter together with the SlaveReadOnlyCount parameter to customize the number of read-only nodes in the primary and secondary zones.</p>
     * <ul>
     * <li>For standard architecture instances, the sum of this parameter and SlaveReadOnlyCount cannot exceed 9.</li>
     * <li>For cluster architecture instances, the sum of this parameter and SlaveReadOnlyCount cannot exceed 4.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ReadOnlyCount")
    public Integer readOnlyCount;

    /**
     * <p>Specifies whether to restore the account, kernel parameter (config), or whitelist information from the original backup set when you create an instance from a specified backup set. For example, to restore account information, set this parameter to <code>account</code>.</p>
     * <p>The default value is empty, which indicates that the account, kernel parameter, and whitelist information is not restored from the original backup set.</p>
     * <blockquote>
     * <p>This parameter is applicable only to cloud-native instances, and the original backup set must contain the account, kernel parameter, or whitelist information. You can call <a href="https://help.aliyun.com/document_detail/473823.html">DescribeBackups</a> to check whether the RecoverConfigMode parameter of the specified backup set contains the preceding information.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>whitelist,config,account</p>
     */
    @NameInMap("RecoverConfigMode")
    public String recoverConfigMode;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> to query available regions. Use this parameter to specify the region in which to create the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of replica nodes in the primary zone. This parameter is applicable only to cloud-native cluster multi-replica instances. You can use this parameter to customize the number of replica nodes. Valid values: 1 to 4.</p>
     * <blockquote>
     * <p>If you create a multi-zone instance, you can use this parameter together with the SlaveReplicaCount parameter to customize the number of replica nodes in the primary and secondary zones. The sum of this parameter and the SlaveReplicaCount parameter cannot exceed 4.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ReplicaCount")
    public Integer replicaCount;

    /**
     * <p>The resource group ID.</p>
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
     * <p>If flashback is enabled for the source instance, you can specify a point in time within the backup retention period. The system uses the backup data of the source instance at the specified point in time to create the instance. Specify the time in the ISO 8601 standard in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-19T16:00:00Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The secondary zone ID. You can call <a href="https://help.aliyun.com/document_detail/473764.html">DescribeZones</a> to query available zones.</p>
     * <blockquote>
     * <p>The value of this parameter must be different from the value of ZoneId. You cannot set this parameter to the ID of a multi-zone.</p>
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
     * <p>The number of shards. This parameter is applicable only to cloud-native instances. You can use this parameter to customize the number of shards.</p>
     * <ul>
     * <li>1: creates a non-cluster instance.</li>
     * <li>A value greater than 1: creates a cluster instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    /**
     * <p>The number of read-only nodes in the secondary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
     * <p>To create an instance from a backup set of an existing instance, specify the instance ID of the source instance in this parameter.</p>
     * <blockquote>
     * <p>Then use the <strong>BackupId</strong>, <strong>ClusterBackupId</strong> (recommended for cloud-native cluster instances), or <strong>RestoreTime</strong> parameter to specify the backup set or point in time. This parameter must be used together with one of the preceding three parameters. The value is a string, not an array.</p>
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
     * <p>The client token that is used to ensure the idempotence of the request. The token value is generated by the client and must be unique among different requests. The token is case-sensitive and cannot exceed 64 ASCII characters in length.</p>
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
     * <p>The primary zone ID. You can invoke <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> to query active zones. Use this parameter to specify the zone in which to create the instance.</p>
     * <blockquote>
     * <p>You can also specify the SecondaryZoneId parameter to set the secondary zone. The primary and secondary nodes are deployed in the specified primary and secondary zones respectively, which implements a dual-center primary/secondary architecture in the same city. For example, set ZoneId to &quot;cn-hangzhou-h&quot; and SecondaryZoneId to &quot;cn-hangzhou-g&quot;.</p>
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
         * <li><strong>N</strong> specifies the sequence number of the tag. A maximum of 20 tags can be attached to a single instance. For example, Tag.1.Key specifies the key of the first tag, and Tag.2.Key specifies the key of the second tag.</li>
         * <li>If the tag key does not exist, the tag is automatically created.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testkey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <blockquote>
         * <p><strong>N</strong> specifies the sequence number of the tag. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag, and <strong>Tag.2.Value</strong> specifies the value of the second tag.</p>
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
