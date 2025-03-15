// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    /**
     * <p>Start time for free AI activation</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-13T01:20:28Z</p>
     */
    @NameInMap("AiCreatingTime")
    public String aiCreatingTime;

    /**
     * <p>Types of AI nodes. Values include:</p>
     * <ul>
     * <li><strong>SearchNode</strong>: Search node.</li>
     * <li><strong>DLNode</strong>: AI node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DLNode</p>
     */
    @NameInMap("AiType")
    public String aiType;

    /**
     * <p>CPU architecture. Available options are:</p>
     * <ul>
     * <li><strong>X86</strong></li>
     * <li><strong>ARM</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>X86</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>Maximum number of blktags in the file system.</p>
     * 
     * <strong>example:</strong>
     * <p>7,864,320</p>
     */
    @NameInMap("BlktagTotal")
    public Long blktagTotal;

    /**
     * <p>Current blktag usage.</p>
     * 
     * <strong>example:</strong>
     * <p>5,242,880</p>
     */
    @NameInMap("BlktagUsed")
    public Long blktagUsed;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public String burstingEnabled;

    /**
     * <p><a href="https://help.aliyun.com/document_detail/183258.html">Product Series</a>, with values as follows:</p>
     * <ul>
     * <li><strong>Normal</strong>: Cluster Edition</li>
     * <li><strong>Basic</strong>: Single Node</li>
     * <li><strong>Archive</strong>: High Compression Engine (X-Engine)</li>
     * <li><strong>NormalMultimaster</strong>: Multi-Master Cluster Edition</li>
     * <li><strong>SENormal</strong>: Standard Edition</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>PolarDB PostgreSQL version 11 does not support single-node.</li>
     * <li>PolarDB MySQL versions 8.0 and 5.7, and PolarDB PostgreSQL version 14 support the Standard Edition.</li>
     * <li>PolarDB MySQL version 8.0 supports High Compression Engine (X-Engine) and Multi-Master Cluster Edition.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>Whether storage compression is enabled. Values are as follows:</p>
     * <ul>
     * <li>ON: Enabled</li>
     * <li>OFF: Disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("CompressStorageMode")
    public String compressStorageMode;

    /**
     * <p>Compressed storage data size.</p>
     * <blockquote>
     * <p>This parameter is supported only when the cluster\&quot;s storage compression feature is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15529410560</p>
     */
    @NameInMap("CompressStorageUsed")
    public Long compressStorageUsed;

    /**
     * <p>Cluster creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-08-14T05:58:42Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>Cluster description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>Cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Network type of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("DBClusterNetworkType")
    public String DBClusterNetworkType;

    /**
     * <p>Cluster status. For the full list of values, refer to <a href="https://help.aliyun.com/document_detail/99286.html">Cluster Status Table</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    /**
     * <p>The information about the nodes.</p>
     */
    @NameInMap("DBNodes")
    public java.util.List<DescribeDBClusterAttributeResponseBodyDBNodes> DBNodes;

    /**
     * <p>Database engine type.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>Database engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The status of the minor version. Valid values:</p>
     * <ul>
     * <li><strong>Stable</strong>: The minor version is stable.</li>
     * <li><strong>Old</strong>: The minor version is outdated. We recommend that you update it to the latest version.</li>
     * <li><strong>HighRisk</strong>: The minor version has critical defects. We recommend that you immediately update it to the latest version.</li>
     * <li><strong>Beta</strong>: The minor version is a Beta version.</li>
     * </ul>
     * <blockquote>
     * <p> For information about how to update the minor version, see <a href="https://help.aliyun.com/document_detail/158572.html">Minor version update</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Stable</p>
     */
    @NameInMap("DBVersionStatus")
    public String DBVersionStatus;

    /**
     * <p>Total size of Level 1 backups (snapshots), in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>74448896</p>
     */
    @NameInMap("DataLevel1BackupChainSize")
    public Long dataLevel1BackupChainSize;

    /**
     * <p>Data replication relationship mode. Values are as follows:</p>
     * <ul>
     * <li><strong>AsyncSync</strong>: Asynchronous</li>
     * <li><strong>SemiSync</strong>: Semi-synchronous</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AsyncSync</p>
     */
    @NameInMap("DataSyncMode")
    public String dataSyncMode;

    /**
     * <p>Lock status for cluster deletion, with values as follows:</p>
     * <ul>
     * <li><strong>0</strong>: Unlocked, cluster can be deleted.</li>
     * <li><strong>1</strong>: Locked, cluster cannot be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DeletionLock")
    public Integer deletionLock;

    /**
     * <p>Cluster engine.</p>
     * 
     * <strong>example:</strong>
     * <p>POLARDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>Cluster expiration time.</p>
     * <blockquote>
     * <p>Only clusters with <strong>Prepaid</strong> (subscription) payment methods return specific parameter values; <strong>Postpaid</strong> (pay-as-you-go) clusters return empty values.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-11-14T16:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Whether the cluster has expired.</p>
     * <blockquote>
     * <p>This parameter is only supported for clusters with <strong>Prepaid</strong> (Subscription) payment methods.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <p>Whether to replenish resources for the new primary after cross-AZ switch. Values are as follows:</p>
     * <ul>
     * <li><strong>true</strong>: Yes</li>
     * <li><strong>false</strong>: No</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasCompleteStandbyRes")
    public Boolean hasCompleteStandbyRes;

    /**
     * <p>Whether to enable storage hot backup cluster (and Standby compute nodes). Values are as follows:</p>
     * <ul>
     * <li><strong>StandbyClusterON</strong>: Enable storage hot backup/Enable storage hot backup and Standby compute nodes.</li>
     * <li><strong>StandbyClusterOFF</strong>: Disable storage hot backup/Disable storage hot backup and Standby compute nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>StandbyClusterON</p>
     */
    @NameInMap("HotStandbyCluster")
    public String hotStandbyCluster;

    /**
     * <p>Indicates whether the automatic IMCI-based query acceleration feature is enabled. Valid values:</p>
     * <ul>
     * <li><code>ON</code>: enabled</li>
     * <li><code>OFF</code>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("ImciAutoIndex")
    public String imciAutoIndex;

    /**
     * <p>Indicates whether failover with hot replica is enabled. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code> (default)</li>
     * </ul>
     */
    @NameInMap("ImperceptibleSwitch")
    public String imperceptibleSwitch;

    /**
     * <p>Maximum number of inodes in the file system.</p>
     * 
     * <strong>example:</strong>
     * <p>6,291,456</p>
     */
    @NameInMap("InodeTotal")
    public Long inodeTotal;

    /**
     * <p>Current inode usage.</p>
     * 
     * <strong>example:</strong>
     * <p>4,194,304</p>
     */
    @NameInMap("InodeUsed")
    public Long inodeUsed;

    /**
     * <p>Indicates whether it is the latest kernel version. Values are as follows:</p>
     * <ul>
     * <li><p><strong>true</strong>: Yes</p>
     * </li>
     * <li><p><strong>false</strong>: No</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsLatestVersion")
    public Boolean isLatestVersion;

    /**
     * <p>Indicates whether it is the latest version of the database proxy, with possible values as follows:</p>
     * <ul>
     * <li><strong>true</strong>: Yes</li>
     * <li><strong>false</strong>: No</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsProxyLatestVersion")
    public Boolean isProxyLatestVersion;

    /**
     * <p>Lock mode. Possible values are as follows:</p>
     * <ul>
     * <li><strong>Unlock</strong>: Unlocked.</li>
     * <li><strong>ManualLock</strong>: Manually triggered lock.</li>
     * <li><strong>LockByExpiration</strong>: Automatic cluster lock upon expiration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Unlock</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <p>The maintenance window for the cluster, formatted as <code>HH:mmZ-HH:mmZ</code> (UTC time). For example, <code>16:00Z-17:00Z</code> indicates that routine maintenance can be performed from 0:00 to 1:00 (UTC+08:00).</p>
     * 
     * <strong>example:</strong>
     * <p>18:00Z-19:00Z</p>
     */
    @NameInMap("MaintainTime")
    public String maintainTime;

    /**
     * <p>Orca function with possible values as follows:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enabled</p>
     * </li>
     * <li><p><strong>off</strong>: Disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("Orca")
    public String orca;

    /**
     * <p>Payment type. Possible values are:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: Pay-As-You-Go</li>
     * <li><strong>Prepaid</strong>: Prepaid (Subscription).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>Describes the preconfigured read and write IOPS for ESSD AutoPL cloud disks. Possible values: 0 to min{50,000, 1000<em>capacity - baseline performance}.<br>Baseline performance = min{1,800 + 50</em>capacity, 50000}.<br>Note: This parameter is supported only when StorageType is ESSDAUTOPL.</p>
     * 
     * <strong>example:</strong>
     * <p>2500</p>
     */
    @NameInMap("ProvisionedIops")
    public String provisionedIops;

    /**
     * <p>Number of CPU cores for the database proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ProxyCpuCores")
    public String proxyCpuCores;

    /**
     * <p>Serverless type for the database proxy. Currently, the value is fixed to AgileServerless.</p>
     * 
     * <strong>example:</strong>
     * <p>AgileServerless</p>
     */
    @NameInMap("ProxyServerlessType")
    public String proxyServerlessType;

    /**
     * <p>Standard configuration CPU cores for the database proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ProxyStandardCpuCores")
    public String proxyStandardCpuCores;

    /**
     * <p>Status of the database proxy. Possible values include:</p>
     * <ul>
     * <li><strong>Creating</strong>: Creating</li>
     * <li><strong>Running</strong>: Running</li>
     * <li><strong>Deleting</strong>: Releasing</li>
     * <li><strong>Rebooting</strong>: Restarting</li>
     * <li><strong>DBNodeCreating</strong>: Adding nodes</li>
     * <li><strong>DBNodeDeleting</strong>: Deleting nodes</li>
     * <li><strong>ClassChanging</strong>: Changing node specifications</li>
     * <li><strong>NetAddressCreating</strong>: Creating network connections</li>
     * <li><strong>NetAddressDeleting</strong>: Deleting network connections</li>
     * <li><strong>NetAddressModifying</strong>: Modifying network connections</li>
     * <li><strong>Deleted</strong>: Released</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("ProxyStatus")
    public String proxyStatus;

    /**
     * <p>Database proxy types, with the following values:</p>
     * <ul>
     * <li><strong>Exclusive</strong>: Enterprise Exclusive Edition</li>
     * <li><strong>General</strong>: Enterprise General Purpose Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Exclusive</p>
     */
    @NameInMap("ProxyType")
    public String proxyType;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>074467EF-86B9-4C23-ACBF-E9B81A******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-***************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>If RestoreType is <strong>RestoreByTime</strong> or <strong>RestoreByTimeOss</strong>, this value represents the recovery time point. If RestoreType is <strong>RestoreByBackupSet</strong> or <strong>RestoreByBackupSetOss</strong>, this value indicates the ID of the backup set on which the recovery is based.
     * <note>Only clusters restored from a backup set or time point after June 1, 2024, support this parameter.</note></p>
     * 
     * <strong>example:</strong>
     * <p>2179639137</p>
     */
    @NameInMap("RestoreDataPoint")
    public String restoreDataPoint;

    /**
     * <p>Cluster recovery method, with possible values:</p>
     * <ul>
     * <li><strong>RestoreByTime</strong>: Restore from a time point based on primary backup. * <strong>RestoreByBackupSet</strong>: Restore from a backup set based on primary backup. * <strong>RestoreByTimeOss</strong>: Restore from a time point based on secondary backup. * <strong>RestoreByBackupSetOss</strong>: Restore from a backup set based on secondary backup. * <strong>CloneFromSourceCluster</strong>: Clone from the source cluster.
     * <note>This parameter is only supported for clusters restored from a backup set or time point after June 1, 2024.</note></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RestoreByTime</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    @NameInMap("RowCompression")
    public String rowCompression;

    /**
     * <p>Storage amount of SQL, in bytes. If the value is -1, it indicates no data.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SQLSize")
    public Long SQLSize;

    /**
     * <p>Serverless type. Valid values are as follows:</p>
     * <ul>
     * <li>AgileServerless: Agile - SteadyServerless: Stable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AgileServerless</p>
     */
    @NameInMap("ServerlessType")
    public String serverlessType;

    /**
     * <p>Source cluster ID. <note>Clusters restored from backup sets or specific points in time after June 1, 2024, support this parameter.</note></p>
     * 
     * <strong>example:</strong>
     * <p>pc-pz51ziv48317b2880</p>
     */
    @NameInMap("SourceDBCluster")
    public String sourceDBCluster;

    /**
     * <p>The region ID of the source cluster.</p>
     * <blockquote>
     * <p> This parameter is returned only if the source cluster ID exists.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("SourceRegionId")
    public String sourceRegionId;

    /**
     * <p>Cross-AZ disaster recovery mode. Values are as follows:</p>
     * <ul>
     * <li><strong>ON</strong>: Enable cross-AZ disaster recovery mode.</li>
     * <li><strong>OFF</strong>: Disable cross-AZ disaster recovery mode.</li>
     * <li><strong>0</strong>: Customer drill mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("StandbyHAMode")
    public String standbyHAMode;

    /**
     * <p>The maximum storage capacity of the current cluster specification, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10995116277760</p>
     */
    @NameInMap("StorageMax")
    public Long storageMax;

    /**
     * <p>Storage billing type. Valid values are as follows:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: Pay-as-you-go (by capacity).</li>
     * <li><strong>Prepaid</strong>: Subscription (by space).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("StoragePayType")
    public String storagePayType;

    /**
     * <p>Storage space for pay-by-space (subscription) billing. Unit: Byte.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("StorageSpace")
    public Long storageSpace;

    /**
     * <p>Storage type, with a fixed value of <strong>HighPerformance</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>HighPerformance</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>Amount of used storage space, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>3012558848</p>
     */
    @NameInMap("StorageUsed")
    public Long storageUsed;

    /**
     * <p>Indicates whether multi-AZ data strong consistency is enabled for the cluster. The value ranges are as follows:</p>
     * <ul>
     * <li><strong>ON</strong>: Indicates that multi-AZ data strong consistency is enabled, applicable to the Standard 3AZ scenario.</li>
     * <li><strong>OFF</strong>: Indicates that multi-AZ data strong consistency is not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("StrictConsistency")
    public String strictConsistency;

    /**
     * <p>Specification type of compute nodes, with possible values as follows:</p>
     * <ul>
     * <li><strong>Exclusive</strong>: Dedicated specification</li>
     * <li><strong>General</strong>: General-purpose specification</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only for PolarDB MySQL Edition with the product series set to Cluster Edition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Exclusive</p>
     */
    @NameInMap("SubCategory")
    public String subCategory;

    /**
     * <p>Indicates whether queries based on In-Memory Column Indexes (IMCIs) are supported during and after a failover with hot replica.</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("SupportInstantSwitchWithImci")
    public String supportInstantSwitchWithImci;

    /**
     * <p>Details of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeDBClusterAttributeResponseBodyTags> tags;

    /**
     * <p>VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-*******************</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>VSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-*********************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>Availability Zone IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i,cn-hangzhou-g</p>
     */
    @NameInMap("ZoneIds")
    public String zoneIds;

    public static DescribeDBClusterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAttributeResponseBody self = new DescribeDBClusterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAttributeResponseBody setAiCreatingTime(String aiCreatingTime) {
        this.aiCreatingTime = aiCreatingTime;
        return this;
    }
    public String getAiCreatingTime() {
        return this.aiCreatingTime;
    }

    public DescribeDBClusterAttributeResponseBody setAiType(String aiType) {
        this.aiType = aiType;
        return this;
    }
    public String getAiType() {
        return this.aiType;
    }

    public DescribeDBClusterAttributeResponseBody setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public DescribeDBClusterAttributeResponseBody setBlktagTotal(Long blktagTotal) {
        this.blktagTotal = blktagTotal;
        return this;
    }
    public Long getBlktagTotal() {
        return this.blktagTotal;
    }

    public DescribeDBClusterAttributeResponseBody setBlktagUsed(Long blktagUsed) {
        this.blktagUsed = blktagUsed;
        return this;
    }
    public Long getBlktagUsed() {
        return this.blktagUsed;
    }

    public DescribeDBClusterAttributeResponseBody setBurstingEnabled(String burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public String getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public DescribeDBClusterAttributeResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeDBClusterAttributeResponseBody setCompressStorageMode(String compressStorageMode) {
        this.compressStorageMode = compressStorageMode;
        return this;
    }
    public String getCompressStorageMode() {
        return this.compressStorageMode;
    }

    public DescribeDBClusterAttributeResponseBody setCompressStorageUsed(Long compressStorageUsed) {
        this.compressStorageUsed = compressStorageUsed;
        return this;
    }
    public Long getCompressStorageUsed() {
        return this.compressStorageUsed;
    }

    public DescribeDBClusterAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeDBClusterAttributeResponseBody setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public DescribeDBClusterAttributeResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterAttributeResponseBody setDBClusterNetworkType(String DBClusterNetworkType) {
        this.DBClusterNetworkType = DBClusterNetworkType;
        return this;
    }
    public String getDBClusterNetworkType() {
        return this.DBClusterNetworkType;
    }

    public DescribeDBClusterAttributeResponseBody setDBClusterStatus(String DBClusterStatus) {
        this.DBClusterStatus = DBClusterStatus;
        return this;
    }
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    public DescribeDBClusterAttributeResponseBody setDBNodes(java.util.List<DescribeDBClusterAttributeResponseBodyDBNodes> DBNodes) {
        this.DBNodes = DBNodes;
        return this;
    }
    public java.util.List<DescribeDBClusterAttributeResponseBodyDBNodes> getDBNodes() {
        return this.DBNodes;
    }

    public DescribeDBClusterAttributeResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDBClusterAttributeResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBClusterAttributeResponseBody setDBVersionStatus(String DBVersionStatus) {
        this.DBVersionStatus = DBVersionStatus;
        return this;
    }
    public String getDBVersionStatus() {
        return this.DBVersionStatus;
    }

    public DescribeDBClusterAttributeResponseBody setDataLevel1BackupChainSize(Long dataLevel1BackupChainSize) {
        this.dataLevel1BackupChainSize = dataLevel1BackupChainSize;
        return this;
    }
    public Long getDataLevel1BackupChainSize() {
        return this.dataLevel1BackupChainSize;
    }

    public DescribeDBClusterAttributeResponseBody setDataSyncMode(String dataSyncMode) {
        this.dataSyncMode = dataSyncMode;
        return this;
    }
    public String getDataSyncMode() {
        return this.dataSyncMode;
    }

    public DescribeDBClusterAttributeResponseBody setDeletionLock(Integer deletionLock) {
        this.deletionLock = deletionLock;
        return this;
    }
    public Integer getDeletionLock() {
        return this.deletionLock;
    }

    public DescribeDBClusterAttributeResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDBClusterAttributeResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeDBClusterAttributeResponseBody setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

    public DescribeDBClusterAttributeResponseBody setHasCompleteStandbyRes(Boolean hasCompleteStandbyRes) {
        this.hasCompleteStandbyRes = hasCompleteStandbyRes;
        return this;
    }
    public Boolean getHasCompleteStandbyRes() {
        return this.hasCompleteStandbyRes;
    }

    public DescribeDBClusterAttributeResponseBody setHotStandbyCluster(String hotStandbyCluster) {
        this.hotStandbyCluster = hotStandbyCluster;
        return this;
    }
    public String getHotStandbyCluster() {
        return this.hotStandbyCluster;
    }

    public DescribeDBClusterAttributeResponseBody setImciAutoIndex(String imciAutoIndex) {
        this.imciAutoIndex = imciAutoIndex;
        return this;
    }
    public String getImciAutoIndex() {
        return this.imciAutoIndex;
    }

    public DescribeDBClusterAttributeResponseBody setImperceptibleSwitch(String imperceptibleSwitch) {
        this.imperceptibleSwitch = imperceptibleSwitch;
        return this;
    }
    public String getImperceptibleSwitch() {
        return this.imperceptibleSwitch;
    }

    public DescribeDBClusterAttributeResponseBody setInodeTotal(Long inodeTotal) {
        this.inodeTotal = inodeTotal;
        return this;
    }
    public Long getInodeTotal() {
        return this.inodeTotal;
    }

    public DescribeDBClusterAttributeResponseBody setInodeUsed(Long inodeUsed) {
        this.inodeUsed = inodeUsed;
        return this;
    }
    public Long getInodeUsed() {
        return this.inodeUsed;
    }

    public DescribeDBClusterAttributeResponseBody setIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    public DescribeDBClusterAttributeResponseBody setIsProxyLatestVersion(Boolean isProxyLatestVersion) {
        this.isProxyLatestVersion = isProxyLatestVersion;
        return this;
    }
    public Boolean getIsProxyLatestVersion() {
        return this.isProxyLatestVersion;
    }

    public DescribeDBClusterAttributeResponseBody setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

    public DescribeDBClusterAttributeResponseBody setMaintainTime(String maintainTime) {
        this.maintainTime = maintainTime;
        return this;
    }
    public String getMaintainTime() {
        return this.maintainTime;
    }

    public DescribeDBClusterAttributeResponseBody setOrca(String orca) {
        this.orca = orca;
        return this;
    }
    public String getOrca() {
        return this.orca;
    }

    public DescribeDBClusterAttributeResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeDBClusterAttributeResponseBody setProvisionedIops(String provisionedIops) {
        this.provisionedIops = provisionedIops;
        return this;
    }
    public String getProvisionedIops() {
        return this.provisionedIops;
    }

    public DescribeDBClusterAttributeResponseBody setProxyCpuCores(String proxyCpuCores) {
        this.proxyCpuCores = proxyCpuCores;
        return this;
    }
    public String getProxyCpuCores() {
        return this.proxyCpuCores;
    }

    public DescribeDBClusterAttributeResponseBody setProxyServerlessType(String proxyServerlessType) {
        this.proxyServerlessType = proxyServerlessType;
        return this;
    }
    public String getProxyServerlessType() {
        return this.proxyServerlessType;
    }

    public DescribeDBClusterAttributeResponseBody setProxyStandardCpuCores(String proxyStandardCpuCores) {
        this.proxyStandardCpuCores = proxyStandardCpuCores;
        return this;
    }
    public String getProxyStandardCpuCores() {
        return this.proxyStandardCpuCores;
    }

    public DescribeDBClusterAttributeResponseBody setProxyStatus(String proxyStatus) {
        this.proxyStatus = proxyStatus;
        return this;
    }
    public String getProxyStatus() {
        return this.proxyStatus;
    }

    public DescribeDBClusterAttributeResponseBody setProxyType(String proxyType) {
        this.proxyType = proxyType;
        return this;
    }
    public String getProxyType() {
        return this.proxyType;
    }

    public DescribeDBClusterAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBClusterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBClusterAttributeResponseBody setRestoreDataPoint(String restoreDataPoint) {
        this.restoreDataPoint = restoreDataPoint;
        return this;
    }
    public String getRestoreDataPoint() {
        return this.restoreDataPoint;
    }

    public DescribeDBClusterAttributeResponseBody setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public DescribeDBClusterAttributeResponseBody setRowCompression(String rowCompression) {
        this.rowCompression = rowCompression;
        return this;
    }
    public String getRowCompression() {
        return this.rowCompression;
    }

    public DescribeDBClusterAttributeResponseBody setSQLSize(Long SQLSize) {
        this.SQLSize = SQLSize;
        return this;
    }
    public Long getSQLSize() {
        return this.SQLSize;
    }

    public DescribeDBClusterAttributeResponseBody setServerlessType(String serverlessType) {
        this.serverlessType = serverlessType;
        return this;
    }
    public String getServerlessType() {
        return this.serverlessType;
    }

    public DescribeDBClusterAttributeResponseBody setSourceDBCluster(String sourceDBCluster) {
        this.sourceDBCluster = sourceDBCluster;
        return this;
    }
    public String getSourceDBCluster() {
        return this.sourceDBCluster;
    }

    public DescribeDBClusterAttributeResponseBody setSourceRegionId(String sourceRegionId) {
        this.sourceRegionId = sourceRegionId;
        return this;
    }
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public DescribeDBClusterAttributeResponseBody setStandbyHAMode(String standbyHAMode) {
        this.standbyHAMode = standbyHAMode;
        return this;
    }
    public String getStandbyHAMode() {
        return this.standbyHAMode;
    }

    public DescribeDBClusterAttributeResponseBody setStorageMax(Long storageMax) {
        this.storageMax = storageMax;
        return this;
    }
    public Long getStorageMax() {
        return this.storageMax;
    }

    public DescribeDBClusterAttributeResponseBody setStoragePayType(String storagePayType) {
        this.storagePayType = storagePayType;
        return this;
    }
    public String getStoragePayType() {
        return this.storagePayType;
    }

    public DescribeDBClusterAttributeResponseBody setStorageSpace(Long storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }
    public Long getStorageSpace() {
        return this.storageSpace;
    }

    public DescribeDBClusterAttributeResponseBody setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DescribeDBClusterAttributeResponseBody setStorageUsed(Long storageUsed) {
        this.storageUsed = storageUsed;
        return this;
    }
    public Long getStorageUsed() {
        return this.storageUsed;
    }

    public DescribeDBClusterAttributeResponseBody setStrictConsistency(String strictConsistency) {
        this.strictConsistency = strictConsistency;
        return this;
    }
    public String getStrictConsistency() {
        return this.strictConsistency;
    }

    public DescribeDBClusterAttributeResponseBody setSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }
    public String getSubCategory() {
        return this.subCategory;
    }

    public DescribeDBClusterAttributeResponseBody setSupportInstantSwitchWithImci(String supportInstantSwitchWithImci) {
        this.supportInstantSwitchWithImci = supportInstantSwitchWithImci;
        return this;
    }
    public String getSupportInstantSwitchWithImci() {
        return this.supportInstantSwitchWithImci;
    }

    public DescribeDBClusterAttributeResponseBody setTags(java.util.List<DescribeDBClusterAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeDBClusterAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public DescribeDBClusterAttributeResponseBody setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public DescribeDBClusterAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeDBClusterAttributeResponseBody setZoneIds(String zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public String getZoneIds() {
        return this.zoneIds;
    }

    public static class DescribeDBClusterAttributeResponseBodyDBNodes extends TeaModel {
        /**
         * <p>Number of CPU cores for second-level elastic scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("AddedCpuCores")
        public String addedCpuCores;

        /**
         * <p>Number of CPU cores for the node.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuCores")
        public String cpuCores;

        /**
         * <p>Node creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-23T21:35:43Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Node specification.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.large</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBNodeDescription")
        public String DBNodeDescription;

        /**
         * <p>Node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-****************</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>Node role, with possible values as follows:</p>
         * <ul>
         * <li><strong>Writer</strong>: Primary node.</li>
         * <li><strong>Reader</strong>: Read-only node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Reader</p>
         */
        @NameInMap("DBNodeRole")
        public String DBNodeRole;

        /**
         * <p>Node status, with possible values as follows:</p>
         * <ul>
         * <li><strong>Creating</strong>: Creating</li>
         * <li><strong>Running</strong>: Running</li>
         * <li><strong>Deleting</strong>: Deleting</li>
         * <li><strong>Rebooting</strong>: Rebooting</li>
         * <li><strong>DBNodeCreating</strong>: Adding node</li>
         * <li><strong>DBNodeDeleting</strong>: Removing node</li>
         * <li><strong>ClassChanging</strong>: Modifying node specification</li>
         * <li><strong>NetAddressCreating</strong>: Creating network connection</li>
         * <li><strong>NetAddressDeleting</strong>: Deleting network connection</li>
         * <li><strong>NetAddressModifying</strong>: Modifying network connection</li>
         * <li><strong>MinorVersionUpgrading</strong>: Upgrading minor version</li>
         * <li><strong>Maintaining</strong>: Instance maintenance</li>
         * <li><strong>Switching</strong>: Switching</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBNodeStatus")
        public String DBNodeStatus;

        /**
         * <p>Failover priority. Each node has a failover priority, determining the likelihood of being elected as the primary node during a failover. A higher value indicates a higher priority.
         * Range: 1 to 15.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailoverPriority")
        public Integer failoverPriority;

        /**
         * <p>Whether hot standby is enabled. Possible values are:</p>
         * <ul>
         * <li><strong>ON</strong>: Enabled</li>
         * <li><strong>OFF</strong>: Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("HotReplicaMode")
        public String hotReplicaMode;

        /**
         * <p>Whether columnar index is enabled. Possible values are:</p>
         * <ul>
         * <li><strong>ON</strong>: Enabled</li>
         * <li><strong>OFF</strong>: Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("ImciSwitch")
        public String imciSwitch;

        /**
         * <p>Primary node ID of the multi-master architecture cluster edition.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-bp18z52akld3*****</p>
         */
        @NameInMap("MasterId")
        public String masterId;

        /**
         * <p>Maximum concurrent connections of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>8000</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <p>Maximum number of I/O requests, that is, IOPS.</p>
         * 
         * <strong>example:</strong>
         * <p>32000</p>
         */
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        /**
         * <p>Node memory size, in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("MemorySize")
        public String memorySize;

        /**
         * <p>The name of the hot standby compute node corresponding to the node when the hot standby storage and compute clusters feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-bp18z52mirror*****</p>
         */
        @NameInMap("MirrorInsName")
        public String mirrorInsName;

        @NameInMap("MultiMasterLocalStandby")
        public String multiMasterLocalStandby;

        @NameInMap("MultiMasterPrimaryNode")
        public String multiMasterPrimaryNode;

        /**
         * <p>Orca feature, valid values are:</p>
         * <ul>
         * <li>on: enabled</li>
         * <li>off: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Orca")
        public String orca;

        /**
         * <p>Remote memory size, in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>3072</p>
         */
        @NameInMap("RemoteMemorySize")
        public String remoteMemorySize;

        /**
         * <p>Whether the node has the global consistency (high-performance mode) feature enabled. Possible values are:</p>
         * <ul>
         * <li><p><strong>ON</strong>: Enabled</p>
         * </li>
         * <li><p><strong>OFF</strong>: Disabled</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("SccMode")
        public String sccMode;

        /**
         * <p>Routing weight.
         * Range: 1~100. Default is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServerWeight")
        public String serverWeight;

        /**
         * <p>Serverless type. Possible values include:</p>
         * <ul>
         * <li><strong>AgileServerless</strong>: Agile</li>
         * <li><strong>SteadyServerless</strong>: Steady</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is only supported by Serverless clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AgileServerless</p>
         */
        @NameInMap("ServerlessType")
        public String serverlessType;

        /**
         * <p>Identifies whether the node is in the primary or standby availability zone, primarily used in resource mirroring scenarios.
         * Values include:</p>
         * <ul>
         * <li><strong>Primary</strong>: Primary Availability Zone</li>
         * <li><strong>Standby</strong>: Standby Availability Zone</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("SubCluster")
        public String subCluster;

        /**
         * <p>Availability zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBClusterAttributeResponseBodyDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyDBNodes self = new DescribeDBClusterAttributeResponseBodyDBNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setAddedCpuCores(String addedCpuCores) {
            this.addedCpuCores = addedCpuCores;
            return this;
        }
        public String getAddedCpuCores() {
            return this.addedCpuCores;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setCpuCores(String cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public String getCpuCores() {
            return this.cpuCores;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setDBNodeDescription(String DBNodeDescription) {
            this.DBNodeDescription = DBNodeDescription;
            return this;
        }
        public String getDBNodeDescription() {
            return this.DBNodeDescription;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setDBNodeRole(String DBNodeRole) {
            this.DBNodeRole = DBNodeRole;
            return this;
        }
        public String getDBNodeRole() {
            return this.DBNodeRole;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setDBNodeStatus(String DBNodeStatus) {
            this.DBNodeStatus = DBNodeStatus;
            return this;
        }
        public String getDBNodeStatus() {
            return this.DBNodeStatus;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setFailoverPriority(Integer failoverPriority) {
            this.failoverPriority = failoverPriority;
            return this;
        }
        public Integer getFailoverPriority() {
            return this.failoverPriority;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setHotReplicaMode(String hotReplicaMode) {
            this.hotReplicaMode = hotReplicaMode;
            return this;
        }
        public String getHotReplicaMode() {
            return this.hotReplicaMode;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setImciSwitch(String imciSwitch) {
            this.imciSwitch = imciSwitch;
            return this;
        }
        public String getImciSwitch() {
            return this.imciSwitch;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setMasterId(String masterId) {
            this.masterId = masterId;
            return this;
        }
        public String getMasterId() {
            return this.masterId;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setMemorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public String getMemorySize() {
            return this.memorySize;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setMirrorInsName(String mirrorInsName) {
            this.mirrorInsName = mirrorInsName;
            return this;
        }
        public String getMirrorInsName() {
            return this.mirrorInsName;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setMultiMasterLocalStandby(String multiMasterLocalStandby) {
            this.multiMasterLocalStandby = multiMasterLocalStandby;
            return this;
        }
        public String getMultiMasterLocalStandby() {
            return this.multiMasterLocalStandby;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setMultiMasterPrimaryNode(String multiMasterPrimaryNode) {
            this.multiMasterPrimaryNode = multiMasterPrimaryNode;
            return this;
        }
        public String getMultiMasterPrimaryNode() {
            return this.multiMasterPrimaryNode;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setOrca(String orca) {
            this.orca = orca;
            return this;
        }
        public String getOrca() {
            return this.orca;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setRemoteMemorySize(String remoteMemorySize) {
            this.remoteMemorySize = remoteMemorySize;
            return this;
        }
        public String getRemoteMemorySize() {
            return this.remoteMemorySize;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setSccMode(String sccMode) {
            this.sccMode = sccMode;
            return this;
        }
        public String getSccMode() {
            return this.sccMode;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setServerWeight(String serverWeight) {
            this.serverWeight = serverWeight;
            return this;
        }
        public String getServerWeight() {
            return this.serverWeight;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setServerlessType(String serverlessType) {
            this.serverlessType = serverlessType;
            return this;
        }
        public String getServerlessType() {
            return this.serverlessType;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setSubCluster(String subCluster) {
            this.subCluster = subCluster;
            return this;
        }
        public String getSubCluster() {
            return this.subCluster;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyTags extends TeaModel {
        /**
         * <p>Tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBClusterAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyTags self = new DescribeDBClusterAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClusterAttributeResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
