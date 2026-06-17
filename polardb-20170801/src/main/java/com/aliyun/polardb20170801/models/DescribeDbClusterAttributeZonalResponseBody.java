// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDbClusterAttributeZonalResponseBody extends TeaModel {
    /**
     * <p>The start time of the free trial for the AI feature</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-13T01:20:28Z</p>
     */
    @NameInMap("AiCreatingTime")
    public String aiCreatingTime;

    /**
     * <p>The AI node type. Valid values:</p>
     * <ul>
     * <li><p><strong>SearchNode</strong>: Search node.</p>
     * </li>
     * <li><p><strong>DLNode</strong>: AI node.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DLNode</p>
     */
    @NameInMap("AiType")
    public String aiType;

    /**
     * <p>The CPU architecture. Valid values:</p>
     * <ul>
     * <li><p><strong>X86</strong></p>
     * </li>
     * <li><p><strong>ARM</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>x86</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>The upgrade method for the minor version</p>
     * <ul>
     * <li><p>Auto: Automatic upgrade</p>
     * </li>
     * <li><p>Manual: Manual upgrade</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("AutoUpgradeMinorVersion")
    public String autoUpgradeMinorVersion;

    /**
     * <p>The maximum number of blktags for the file system.</p>
     * 
     * <strong>example:</strong>
     * <p>7,864,320</p>
     */
    @NameInMap("BlktagTotal")
    public Long blktagTotal;

    /**
     * <p>The number of used blktags.</p>
     * 
     * <strong>example:</strong>
     * <p>5,242,880</p>
     */
    @NameInMap("BlktagUsed")
    public Long blktagUsed;

    /**
     * <p>Indicates whether the I/O performance burst feature is enabled for the ESSD AutoPL disk. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public String burstingEnabled;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/183258.html">product edition</a>. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: Cluster Edition</p>
     * </li>
     * <li><p><strong>Basic</strong>: Single Node</p>
     * </li>
     * <li><p><strong>Archive</strong>: X-Engine</p>
     * </li>
     * <li><p><strong>NormalMultimaster</strong>: Multi-master Cluster Edition</p>
     * </li>
     * <li><p><strong>SENormal</strong>: Standard Edition</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>PolarDB for PostgreSQL clusters of PostgreSQL 11 do not support the single node edition.</p>
     * </li>
     * <li><p>PolarDB for MySQL clusters of 8.0 and 5.7, and PolarDB for PostgreSQL clusters of PostgreSQL 14 support the Standard Edition.</p>
     * </li>
     * <li><p>PolarDB for MySQL clusters of 8.0 support X-Engine and the Multi-master Cluster Edition.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>Indicates whether storage compression is enabled. Valid values:</p>
     * <ul>
     * <li><p>ON: Enabled</p>
     * </li>
     * <li><p>OFF: Disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("CompressStorageMode")
    public String compressStorageMode;

    /**
     * <p>The size of the compressed data in storage.</p>
     * <blockquote>
     * <p>This parameter is returned only when storage compression is enabled for the cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15529410560</p>
     */
    @NameInMap("CompressStorageUsed")
    public Long compressStorageUsed;

    /**
     * <p>The time when the cluster was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-08-14T05:58:42Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The cluster specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>polar.mysql.x8.medium.c</p>
     */
    @NameInMap("DBClusterClass")
    public String DBClusterClass;

    /**
     * <p>The cluster description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The network type of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("DBClusterNetworkType")
    public String DBClusterNetworkType;

    /**
     * <p>The cluster status. Valid values:</p>
     * <ul>
     * <li><p><strong>Creating</strong>: The cluster is being created.</p>
     * </li>
     * <li><p><strong>Running</strong>: The cluster is running.</p>
     * </li>
     * <li><p><strong>Deleting</strong>: The cluster is being released.</p>
     * </li>
     * <li><p><strong>Rebooting</strong>: The cluster is being restarted.</p>
     * </li>
     * <li><p><strong>DBNodeCreating</strong>: A node is being added.</p>
     * </li>
     * <li><p><strong>DBNodeDeleting</strong>: A node is being deleted.</p>
     * </li>
     * <li><p><strong>ClassChanging</strong>: The node specifications are being changed.</p>
     * </li>
     * <li><p><strong>NetAddressCreating</strong>: A network connection is being created.</p>
     * </li>
     * <li><p><strong>NetAddressDeleting</strong>: A network connection is being deleted.</p>
     * </li>
     * <li><p><strong>NetAddressModifying</strong>: A network connection is being modified.</p>
     * </li>
     * <li><p><strong>Deleted</strong>: The cluster is released.</p>
     * </li>
     * <li><p><strong>ClassChanged</strong>: Resources are being reclaimed after an upgrade or downgrade.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    /**
     * <p>The details of the node information.</p>
     */
    @NameInMap("DBNodes")
    public java.util.List<DescribeDbClusterAttributeZonalResponseBodyDBNodes> DBNodes;

    /**
     * <p>The database engine type.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The database engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The status of the current minor version of the database. Valid values:</p>
     * <ul>
     * <li><p><strong>Stable</strong>: The current version is stable.</p>
     * </li>
     * <li><p><strong>Old</strong>: The current version is old. We recommend that you upgrade the cluster to the latest version.</p>
     * </li>
     * <li><p><strong>HighRisk</strong>: The current version has critical bugs. Upgrade the cluster to the latest version immediately.</p>
     * </li>
     * <li><p><strong>Beta</strong>: The current version is a beta version.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>For more information about how to upgrade the minor engine version, see <a href="https://help.aliyun.com/document_detail/158572.html">Upgrade versions</a>.</p>
     * </li>
     * <li><p>This parameter is returned only when the <strong>DBType</strong> parameter is set to <strong>MySQL</strong>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Stable</p>
     */
    @NameInMap("DBVersionStatus")
    public String DBVersionStatus;

    /**
     * <p>The total size of level-1 backups (snapshots). Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>74448896</p>
     */
    @NameInMap("DataLevel1BackupChainSize")
    public Long dataLevel1BackupChainSize;

    /**
     * <p>The data replication relationship mode. Valid values:</p>
     * <ul>
     * <li><p><strong>AsyncSync</strong>: Asynchronous</p>
     * </li>
     * <li><p><strong>SemiSync</strong>: Semi-synchronous</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AsyncSync</p>
     */
    @NameInMap("DataSyncMode")
    public String dataSyncMode;

    /**
     * <p>The lock state of the cluster for deletion. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: The cluster is not locked and can be deleted.</p>
     * </li>
     * <li><p><strong>1</strong>: The cluster is locked and cannot be deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DeletionLock")
    public Integer deletionLock;

    /**
     * <p>The database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>POLARDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The expiration time of the cluster.</p>
     * <blockquote>
     * <p>This parameter is returned only for <strong>Prepaid</strong> (subscription) clusters. An empty value is returned for <strong>Postpaid</strong> (pay-as-you-go) clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-11-14T16:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Indicates whether the cluster has expired.</p>
     * <blockquote>
     * <p>This parameter is returned only for subscription clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <p>Indicates whether resources of the new primary database are supplemented after a cross-zone failover. Valid values:</p>
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
    @NameInMap("HasCompleteStandbyRes")
    public Boolean hasCompleteStandbyRes;

    /**
     * <p>Indicates whether the hot standby storage cluster (and standby compute nodes) feature is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>StandbyClusterON</strong>: The hot standby storage cluster feature or both the hot standby storage cluster and standby compute node features are enabled.</p>
     * </li>
     * <li><p><strong>StandbyClusterOFF</strong>: The hot standby storage cluster feature or both the hot standby storage cluster and standby compute node features are disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>StandbyClusterON</p>
     */
    @NameInMap("HotStandbyCluster")
    public String hotStandbyCluster;

    /**
     * <p>The automatic IMCI-based query acceleration feature. Valid values:</p>
     * <ul>
     * <li><p><code>ON</code>: Enabled.</p>
     * </li>
     * <li><p><code>OFF</code>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("ImciAutoIndex")
    public String imciAutoIndex;

    /**
     * <p>Failover with hot replica. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enabled.</p>
     * </li>
     * <li><p><code>false</code>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("ImperceptibleSwitch")
    public String imperceptibleSwitch;

    /**
     * <p>The maximum number of inodes for the file system.</p>
     * 
     * <strong>example:</strong>
     * <p>6,291,456</p>
     */
    @NameInMap("InodeTotal")
    public Long inodeTotal;

    /**
     * <p>The number of used inodes.</p>
     * 
     * <strong>example:</strong>
     * <p>4,194,304</p>
     */
    @NameInMap("InodeUsed")
    public Long inodeUsed;

    /**
     * <p>Indicates whether the cluster uses the latest kernel version. Valid values:</p>
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
     * <p>Indicates whether the database proxy uses the latest version. Valid values:</p>
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
    @NameInMap("IsProxyLatestVersion")
    public Boolean isProxyLatestVersion;

    /**
     * <p>The lock mode. Valid values:</p>
     * <ul>
     * <li><p><strong>Unlock</strong>: The cluster is not locked.</p>
     * </li>
     * <li><p><strong>ManualLock</strong>: The cluster is manually locked.</p>
     * </li>
     * <li><p><strong>LockByExpiration</strong>: The cluster is automatically locked upon expiration.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Unlock</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <p>The maintenance window of the cluster. The time is in the <code>HH:mmZ-HH:mmZ</code> format and is displayed in UTC. For example, <code>16:00Z-17:00Z</code> indicates that routine maintenance can be performed from 00:00 to 01:00 (UTC+8).</p>
     * 
     * <strong>example:</strong>
     * <p>18:00Z-19:00Z</p>
     */
    @NameInMap("MaintainTime")
    public String maintainTime;

    /**
     * <p>The Orca feature. Valid values:</p>
     * <ul>
     * <li><p>on: Enabled</p>
     * </li>
     * <li><p>off: Disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("Orca")
    public String orca;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><p><strong>Postpaid</strong>: Pay-as-you-go.</p>
     * </li>
     * <li><p><strong>Prepaid</strong>: Subscription.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The read and write IOPS that are preconfigured for the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is supported only when StorageType is set to ESSDAUTOPL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProvisionedIops")
    public String provisionedIops;

    /**
     * <p>The number of CPU cores for the database proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ProxyCpuCores")
    public String proxyCpuCores;

    /**
     * <p>The Serverless type of the database proxy. Valid values:</p>
     * <ul>
     * <li><p>AgileServerless: Agile. This indicates a Serverless cluster.</p>
     * </li>
     * <li><p>SteadyServerless: Steady. This indicates a cluster with defined specifications (a subscription or pay-as-you-go cluster).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SteadyServerless</p>
     */
    @NameInMap("ProxyServerlessType")
    public String proxyServerlessType;

    /**
     * <p>The number of CPU cores for the database proxy with standard specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ProxyStandardCpuCores")
    public String proxyStandardCpuCores;

    /**
     * <p>The status of the database proxy. Valid values:</p>
     * <ul>
     * <li><p><strong>Creating</strong>: The proxy is being created.</p>
     * </li>
     * <li><p><strong>Running</strong>: The proxy is running.</p>
     * </li>
     * <li><p><strong>Deleting</strong>: The proxy is being released.</p>
     * </li>
     * <li><p><strong>Rebooting</strong>: The proxy is being restarted.</p>
     * </li>
     * <li><p><strong>DBNodeCreating</strong>: A node is being added.</p>
     * </li>
     * <li><p><strong>DBNodeDeleting</strong>: A node is being deleted.</p>
     * </li>
     * <li><p><strong>ClassChanging</strong>: The node specifications are being changed.</p>
     * </li>
     * <li><p><strong>NetAddressCreating</strong>: A network connection is being created.</p>
     * </li>
     * <li><p><strong>NetAddressDeleting</strong>: A network connection is being deleted.</p>
     * </li>
     * <li><p><strong>NetAddressModifying</strong>: A network connection is being modified.</p>
     * </li>
     * <li><p><strong>Deleted</strong>: The proxy is released.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("ProxyStatus")
    public String proxyStatus;

    /**
     * <p>The type of the database proxy. Valid values:</p>
     * <ul>
     * <li><p><strong>Exclusive</strong>: Dedicated Enterprise Edition</p>
     * </li>
     * <li><p><strong>General</strong>: Standard Enterprise Edition</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Exclusive</p>
     */
    @NameInMap("ProxyType")
    public String proxyType;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>074467EF-86B9-4C23-ACBF-E9B81A******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <ul>
     * <li><p>If RestoreType is set to <strong>RestoreByTime</strong> or <strong>RestoreByTimeOss</strong>, this parameter indicates the point in time for the restoration.</p>
     * </li>
     * <li><p>If RestoreType is set to <strong>RestoreByBackupSet</strong> or <strong>RestoreByBackupSetOss</strong>, this parameter indicates the ID of the backup set that is used for the restoration.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only for clusters that are restored from a backup set or a point in time after June 1, 2024.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2179639137</p>
     */
    @NameInMap("RestoreDataPoint")
    public String restoreDataPoint;

    /**
     * <p>The method used to restore the cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>RestoreByTime</strong>: The cluster is restored from a point in time based on a level-1 backup.</p>
     * </li>
     * <li><p><strong>RestoreByBackupSet</strong>: The cluster is restored from a backup set based on a level-1 backup.</p>
     * </li>
     * <li><p><strong>RestoreByTimeOss</strong>: The cluster is restored from a point in time based on a level-2 backup.</p>
     * </li>
     * <li><p><strong>RestoreByBackupSetOss</strong>: The cluster is restored from a backup set based on a level-2 backup.</p>
     * </li>
     * <li><p><strong>CloneFromSourceCluster</strong>: The cluster is cloned from a source cluster.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only for clusters that are restored from a backup set or a point in time after June 1, 2024.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RestoreByTime</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>RowCompression</p>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("RowCompression")
    public String rowCompression;

    /**
     * <p>The storage usage for SQL. Unit: bytes. A value of -1 indicates that no data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SQLSize")
    public Long SQLSize;

    /**
     * <p>The Serverless type. Valid values:</p>
     * <ul>
     * <li><p>AgileServerless: Agile</p>
     * </li>
     * <li><p>SteadyServerless: Steady</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AgileServerless</p>
     */
    @NameInMap("ServerlessType")
    public String serverlessType;

    /**
     * <p>The source cluster ID.</p>
     * <blockquote>
     * <p>This parameter is supported only for clusters that are restored from a backup set or a point in time after June 1, 2024.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pc-pz51ziv48317b2880</p>
     */
    @NameInMap("SourceDBCluster")
    public String sourceDBCluster;

    /**
     * <p>The ID of the region where the source cluster resides.</p>
     * <blockquote>
     * <p>This parameter is returned only if a source cluster ID exists.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("SourceRegionId")
    public String sourceRegionId;

    /**
     * <p>The cross-zone disaster recovery mode. Valid values:</p>
     * <ul>
     * <li><p><strong>ON</strong>: The cross-zone disaster recovery mode is enabled.</p>
     * </li>
     * <li><p><strong>OFF</strong>: The cross-zone disaster recovery mode is disabled.</p>
     * </li>
     * <li><p><strong>0</strong>: Customer drill mode.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("StandbyHAMode")
    public String standbyHAMode;

    /**
     * <p>The maximum storage capacity of the current cluster specifications. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10995116277760</p>
     */
    @NameInMap("StorageMax")
    public Long storageMax;

    /**
     * <p>The billing method for storage. Valid values:</p>
     * <ul>
     * <li><p><strong>Postpaid</strong>: Pay-as-you-go.</p>
     * </li>
     * <li><p><strong>Prepaid</strong>: Subscription.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("StoragePayType")
    public String storagePayType;

    /**
     * <p>The storage capacity. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("StorageSpace")
    public Long storageSpace;

    /**
     * <p>The storage class of the Enterprise Edition. Valid values:</p>
     * <ul>
     * <li><p><strong>PSL5</strong></p>
     * </li>
     * <li><p><strong>PSL4</strong></p>
     * </li>
     * </ul>
     * <p>The storage class of the Standard Edition. Valid values:</p>
     * <ul>
     * <li><p><strong>ESSDPL0</strong></p>
     * </li>
     * <li><p><strong>ESSDPL1</strong></p>
     * </li>
     * <li><p><strong>ESSDPL2</strong></p>
     * </li>
     * <li><p><strong>ESSDPL3</strong></p>
     * </li>
     * <li><p><strong>ESSDAUTOPL</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ESSDPL0</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The used storage space. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>3012558848</p>
     */
    @NameInMap("StorageUsed")
    public Long storageUsed;

    /**
     * <p>Indicates whether strong consistency is enabled for the multi-zone cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>ON</strong>: Strong consistency is enabled for the multi-zone cluster. This applies to Standard Edition clusters that are deployed in three zones.</p>
     * </li>
     * <li><p><strong>OFF</strong>: Strong consistency is not enabled for the multi-zone cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("StrictConsistency")
    public String strictConsistency;

    /**
     * <p>The specification type of the compute node. Valid values:</p>
     * <ul>
     * <li><p><strong>Exclusive</strong>: Dedicated</p>
     * </li>
     * <li><p><strong>General</strong>: General-purpose</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is returned only for PolarDB for MySQL Cluster Edition clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Exclusive</p>
     */
    @NameInMap("SubCategory")
    public String subCategory;

    /**
     * <p>Indicates whether the failover with hot replica feature that is compatible with the IMCI feature is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("SupportInstantSwitchWithImci")
    public String supportInstantSwitchWithImci;

    /**
     * <p>The details of the tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeDbClusterAttributeZonalResponseBodyTags> tags;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-**********</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The virtual switch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-**********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i,cn-hangzhou-g</p>
     */
    @NameInMap("ZoneIds")
    public String zoneIds;

    public static DescribeDbClusterAttributeZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbClusterAttributeZonalResponseBody self = new DescribeDbClusterAttributeZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDbClusterAttributeZonalResponseBody setAiCreatingTime(String aiCreatingTime) {
        this.aiCreatingTime = aiCreatingTime;
        return this;
    }
    public String getAiCreatingTime() {
        return this.aiCreatingTime;
    }

    public DescribeDbClusterAttributeZonalResponseBody setAiType(String aiType) {
        this.aiType = aiType;
        return this;
    }
    public String getAiType() {
        return this.aiType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public DescribeDbClusterAttributeZonalResponseBody setAutoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }
    public String getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    public DescribeDbClusterAttributeZonalResponseBody setBlktagTotal(Long blktagTotal) {
        this.blktagTotal = blktagTotal;
        return this;
    }
    public Long getBlktagTotal() {
        return this.blktagTotal;
    }

    public DescribeDbClusterAttributeZonalResponseBody setBlktagUsed(Long blktagUsed) {
        this.blktagUsed = blktagUsed;
        return this;
    }
    public Long getBlktagUsed() {
        return this.blktagUsed;
    }

    public DescribeDbClusterAttributeZonalResponseBody setBurstingEnabled(String burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public String getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public DescribeDbClusterAttributeZonalResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeDbClusterAttributeZonalResponseBody setCompressStorageMode(String compressStorageMode) {
        this.compressStorageMode = compressStorageMode;
        return this;
    }
    public String getCompressStorageMode() {
        return this.compressStorageMode;
    }

    public DescribeDbClusterAttributeZonalResponseBody setCompressStorageUsed(Long compressStorageUsed) {
        this.compressStorageUsed = compressStorageUsed;
        return this;
    }
    public Long getCompressStorageUsed() {
        return this.compressStorageUsed;
    }

    public DescribeDbClusterAttributeZonalResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBClusterClass(String DBClusterClass) {
        this.DBClusterClass = DBClusterClass;
        return this;
    }
    public String getDBClusterClass() {
        return this.DBClusterClass;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBClusterNetworkType(String DBClusterNetworkType) {
        this.DBClusterNetworkType = DBClusterNetworkType;
        return this;
    }
    public String getDBClusterNetworkType() {
        return this.DBClusterNetworkType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBClusterStatus(String DBClusterStatus) {
        this.DBClusterStatus = DBClusterStatus;
        return this;
    }
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBNodes(java.util.List<DescribeDbClusterAttributeZonalResponseBodyDBNodes> DBNodes) {
        this.DBNodes = DBNodes;
        return this;
    }
    public java.util.List<DescribeDbClusterAttributeZonalResponseBodyDBNodes> getDBNodes() {
        return this.DBNodes;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBVersionStatus(String DBVersionStatus) {
        this.DBVersionStatus = DBVersionStatus;
        return this;
    }
    public String getDBVersionStatus() {
        return this.DBVersionStatus;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDataLevel1BackupChainSize(Long dataLevel1BackupChainSize) {
        this.dataLevel1BackupChainSize = dataLevel1BackupChainSize;
        return this;
    }
    public Long getDataLevel1BackupChainSize() {
        return this.dataLevel1BackupChainSize;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDataSyncMode(String dataSyncMode) {
        this.dataSyncMode = dataSyncMode;
        return this;
    }
    public String getDataSyncMode() {
        return this.dataSyncMode;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDeletionLock(Integer deletionLock) {
        this.deletionLock = deletionLock;
        return this;
    }
    public Integer getDeletionLock() {
        return this.deletionLock;
    }

    public DescribeDbClusterAttributeZonalResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDbClusterAttributeZonalResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeDbClusterAttributeZonalResponseBody setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

    public DescribeDbClusterAttributeZonalResponseBody setHasCompleteStandbyRes(Boolean hasCompleteStandbyRes) {
        this.hasCompleteStandbyRes = hasCompleteStandbyRes;
        return this;
    }
    public Boolean getHasCompleteStandbyRes() {
        return this.hasCompleteStandbyRes;
    }

    public DescribeDbClusterAttributeZonalResponseBody setHotStandbyCluster(String hotStandbyCluster) {
        this.hotStandbyCluster = hotStandbyCluster;
        return this;
    }
    public String getHotStandbyCluster() {
        return this.hotStandbyCluster;
    }

    public DescribeDbClusterAttributeZonalResponseBody setImciAutoIndex(String imciAutoIndex) {
        this.imciAutoIndex = imciAutoIndex;
        return this;
    }
    public String getImciAutoIndex() {
        return this.imciAutoIndex;
    }

    public DescribeDbClusterAttributeZonalResponseBody setImperceptibleSwitch(String imperceptibleSwitch) {
        this.imperceptibleSwitch = imperceptibleSwitch;
        return this;
    }
    public String getImperceptibleSwitch() {
        return this.imperceptibleSwitch;
    }

    public DescribeDbClusterAttributeZonalResponseBody setInodeTotal(Long inodeTotal) {
        this.inodeTotal = inodeTotal;
        return this;
    }
    public Long getInodeTotal() {
        return this.inodeTotal;
    }

    public DescribeDbClusterAttributeZonalResponseBody setInodeUsed(Long inodeUsed) {
        this.inodeUsed = inodeUsed;
        return this;
    }
    public Long getInodeUsed() {
        return this.inodeUsed;
    }

    public DescribeDbClusterAttributeZonalResponseBody setIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    public DescribeDbClusterAttributeZonalResponseBody setIsProxyLatestVersion(Boolean isProxyLatestVersion) {
        this.isProxyLatestVersion = isProxyLatestVersion;
        return this;
    }
    public Boolean getIsProxyLatestVersion() {
        return this.isProxyLatestVersion;
    }

    public DescribeDbClusterAttributeZonalResponseBody setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

    public DescribeDbClusterAttributeZonalResponseBody setMaintainTime(String maintainTime) {
        this.maintainTime = maintainTime;
        return this;
    }
    public String getMaintainTime() {
        return this.maintainTime;
    }

    public DescribeDbClusterAttributeZonalResponseBody setOrca(String orca) {
        this.orca = orca;
        return this;
    }
    public String getOrca() {
        return this.orca;
    }

    public DescribeDbClusterAttributeZonalResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setProvisionedIops(String provisionedIops) {
        this.provisionedIops = provisionedIops;
        return this;
    }
    public String getProvisionedIops() {
        return this.provisionedIops;
    }

    public DescribeDbClusterAttributeZonalResponseBody setProxyCpuCores(String proxyCpuCores) {
        this.proxyCpuCores = proxyCpuCores;
        return this;
    }
    public String getProxyCpuCores() {
        return this.proxyCpuCores;
    }

    public DescribeDbClusterAttributeZonalResponseBody setProxyServerlessType(String proxyServerlessType) {
        this.proxyServerlessType = proxyServerlessType;
        return this;
    }
    public String getProxyServerlessType() {
        return this.proxyServerlessType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setProxyStandardCpuCores(String proxyStandardCpuCores) {
        this.proxyStandardCpuCores = proxyStandardCpuCores;
        return this;
    }
    public String getProxyStandardCpuCores() {
        return this.proxyStandardCpuCores;
    }

    public DescribeDbClusterAttributeZonalResponseBody setProxyStatus(String proxyStatus) {
        this.proxyStatus = proxyStatus;
        return this;
    }
    public String getProxyStatus() {
        return this.proxyStatus;
    }

    public DescribeDbClusterAttributeZonalResponseBody setProxyType(String proxyType) {
        this.proxyType = proxyType;
        return this;
    }
    public String getProxyType() {
        return this.proxyType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDbClusterAttributeZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDbClusterAttributeZonalResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDbClusterAttributeZonalResponseBody setRestoreDataPoint(String restoreDataPoint) {
        this.restoreDataPoint = restoreDataPoint;
        return this;
    }
    public String getRestoreDataPoint() {
        return this.restoreDataPoint;
    }

    public DescribeDbClusterAttributeZonalResponseBody setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setRowCompression(String rowCompression) {
        this.rowCompression = rowCompression;
        return this;
    }
    public String getRowCompression() {
        return this.rowCompression;
    }

    public DescribeDbClusterAttributeZonalResponseBody setSQLSize(Long SQLSize) {
        this.SQLSize = SQLSize;
        return this;
    }
    public Long getSQLSize() {
        return this.SQLSize;
    }

    public DescribeDbClusterAttributeZonalResponseBody setServerlessType(String serverlessType) {
        this.serverlessType = serverlessType;
        return this;
    }
    public String getServerlessType() {
        return this.serverlessType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setSourceDBCluster(String sourceDBCluster) {
        this.sourceDBCluster = sourceDBCluster;
        return this;
    }
    public String getSourceDBCluster() {
        return this.sourceDBCluster;
    }

    public DescribeDbClusterAttributeZonalResponseBody setSourceRegionId(String sourceRegionId) {
        this.sourceRegionId = sourceRegionId;
        return this;
    }
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public DescribeDbClusterAttributeZonalResponseBody setStandbyHAMode(String standbyHAMode) {
        this.standbyHAMode = standbyHAMode;
        return this;
    }
    public String getStandbyHAMode() {
        return this.standbyHAMode;
    }

    public DescribeDbClusterAttributeZonalResponseBody setStorageMax(Long storageMax) {
        this.storageMax = storageMax;
        return this;
    }
    public Long getStorageMax() {
        return this.storageMax;
    }

    public DescribeDbClusterAttributeZonalResponseBody setStoragePayType(String storagePayType) {
        this.storagePayType = storagePayType;
        return this;
    }
    public String getStoragePayType() {
        return this.storagePayType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setStorageSpace(Long storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }
    public Long getStorageSpace() {
        return this.storageSpace;
    }

    public DescribeDbClusterAttributeZonalResponseBody setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setStorageUsed(Long storageUsed) {
        this.storageUsed = storageUsed;
        return this;
    }
    public Long getStorageUsed() {
        return this.storageUsed;
    }

    public DescribeDbClusterAttributeZonalResponseBody setStrictConsistency(String strictConsistency) {
        this.strictConsistency = strictConsistency;
        return this;
    }
    public String getStrictConsistency() {
        return this.strictConsistency;
    }

    public DescribeDbClusterAttributeZonalResponseBody setSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }
    public String getSubCategory() {
        return this.subCategory;
    }

    public DescribeDbClusterAttributeZonalResponseBody setSupportInstantSwitchWithImci(String supportInstantSwitchWithImci) {
        this.supportInstantSwitchWithImci = supportInstantSwitchWithImci;
        return this;
    }
    public String getSupportInstantSwitchWithImci() {
        return this.supportInstantSwitchWithImci;
    }

    public DescribeDbClusterAttributeZonalResponseBody setTags(java.util.List<DescribeDbClusterAttributeZonalResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeDbClusterAttributeZonalResponseBodyTags> getTags() {
        return this.tags;
    }

    public DescribeDbClusterAttributeZonalResponseBody setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public DescribeDbClusterAttributeZonalResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeDbClusterAttributeZonalResponseBody setZoneIds(String zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public String getZoneIds() {
        return this.zoneIds;
    }

    public static class DescribeDbClusterAttributeZonalResponseBodyDBNodes extends TeaModel {
        /**
         * <p>The number of CPU cores for bursting.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("AddedCpuCores")
        public String addedCpuCores;

        /**
         * <p>The number of CPU cores in the node.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuCores")
        public String cpuCores;

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-14T05:58:42Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.large</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The node description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBNodeDescription")
        public String DBNodeDescription;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-****************</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>The node role. Valid values:</p>
         * <ul>
         * <li><p><strong>Writer</strong>: The primary node.</p>
         * </li>
         * <li><p><strong>Reader</strong>: The read-only node.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Reader</p>
         */
        @NameInMap("DBNodeRole")
        public String DBNodeRole;

        /**
         * <p>The node status. Valid values:</p>
         * <ul>
         * <li><p><strong>Creating</strong>: The node is being created.</p>
         * </li>
         * <li><p><strong>Running</strong>: The node is running.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: The node is being deleted.</p>
         * </li>
         * <li><p><strong>Rebooting</strong>: The node is being restarted.</p>
         * </li>
         * <li><p><strong>DBNodeCreating</strong>: A node is being added.</p>
         * </li>
         * <li><p><strong>DBNodeDeleting</strong>: A node is being deleted.</p>
         * </li>
         * <li><p><strong>ClassChanging</strong>: The node specifications are being changed.</p>
         * </li>
         * <li><p><strong>NetAddressCreating</strong>: A network connection is being created.</p>
         * </li>
         * <li><p><strong>NetAddressDeleting</strong>: A network connection is being deleted.</p>
         * </li>
         * <li><p><strong>NetAddressModifying</strong>: A network connection is being modified.</p>
         * </li>
         * <li><p><strong>MinorVersionUpgrading</strong>: The minor version is being updated.</p>
         * </li>
         * <li><p><strong>Maintaining</strong>: The instance is under maintenance.</p>
         * </li>
         * <li><p><strong>Switching</strong>: A failover is in progress.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBNodeStatus")
        public String DBNodeStatus;

        /**
         * <p>The failover priority. Each node has a failover priority. A higher priority value indicates a higher probability that the node is elected as the primary node during a failover.
         * Valid values: 1 to 15.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailoverPriority")
        public Integer failoverPriority;

        /**
         * <p>Indicates whether hot standby is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>ON</strong>: Enabled</p>
         * </li>
         * <li><p><strong>OFF</strong>: Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("HotReplicaMode")
        public String hotReplicaMode;

        /**
         * <p>Indicates whether the In-Memory Column Index (IMCI) feature is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>ON</strong>: Enabled</p>
         * </li>
         * <li><p><strong>OFF</strong>: Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("ImciSwitch")
        public String imciSwitch;

        /**
         * <p>The ID of the primary node in a Multi-master Cluster Edition cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-bp18z52akld3*****</p>
         */
        @NameInMap("MasterId")
        public String masterId;

        /**
         * <p>The maximum number of concurrent connections to the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>8000</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <p>The maximum number of input/output operations per second (IOPS).</p>
         * 
         * <strong>example:</strong>
         * <p>32000</p>
         */
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        /**
         * <p>The memory size of the node. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("MemorySize")
        public String memorySize;

        /**
         * <p>The name of the hot replica compute node that corresponds to the node in an architecture where hot standby storage and hot standby compute are enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-bp18z52mirror*****</p>
         */
        @NameInMap("MirrorInsName")
        public String mirrorInsName;

        /**
         * <p>MultiMasterLocalStandby</p>
         * 
         * <strong>example:</strong>
         * <p>MultiMasterLocalStandby</p>
         */
        @NameInMap("MultiMasterLocalStandby")
        public String multiMasterLocalStandby;

        /**
         * <p>MultiMasterPrimaryNode</p>
         * 
         * <strong>example:</strong>
         * <p>MultiMasterPrimaryNode</p>
         */
        @NameInMap("MultiMasterPrimaryNode")
        public String multiMasterPrimaryNode;

        /**
         * <p>The Orca feature. Valid values:</p>
         * <ul>
         * <li><p>on: Enabled</p>
         * </li>
         * <li><p>off: Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Orca")
        public String orca;

        /**
         * <p>The size of the remote memory. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>3072</p>
         */
        @NameInMap("RemoteMemorySize")
        public String remoteMemorySize;

        /**
         * <p>Indicates whether the global consistency (high-performance mode) feature is enabled for the node. Valid values:</p>
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
         * <p>The routing weight.
         * Valid values: 1 to 100. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServerWeight")
        public String serverWeight;

        /**
         * <p>The Serverless type. Valid values:</p>
         * <ul>
         * <li><p>AgileServerless: Agile</p>
         * </li>
         * <li><p>SteadyServerless: Steady</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AgileServerless</p>
         */
        @NameInMap("ServerlessType")
        public String serverlessType;

        /**
         * <p>Indicates whether the node is in the primary or secondary zone. This parameter is mainly used for resource peering.
         * Valid values:</p>
         * <ul>
         * <li><p>Primary: The primary zone</p>
         * </li>
         * <li><p>Standby: The secondary zone</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("SubCluster")
        public String subCluster;

        /**
         * <p>SubGroupDescription</p>
         * 
         * <strong>example:</strong>
         * <p>SubGroupDescription</p>
         */
        @NameInMap("SubGroupDescription")
        public String subGroupDescription;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-d</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDbClusterAttributeZonalResponseBodyDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterAttributeZonalResponseBodyDBNodes self = new DescribeDbClusterAttributeZonalResponseBodyDBNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setAddedCpuCores(String addedCpuCores) {
            this.addedCpuCores = addedCpuCores;
            return this;
        }
        public String getAddedCpuCores() {
            return this.addedCpuCores;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setCpuCores(String cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public String getCpuCores() {
            return this.cpuCores;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setDBNodeDescription(String DBNodeDescription) {
            this.DBNodeDescription = DBNodeDescription;
            return this;
        }
        public String getDBNodeDescription() {
            return this.DBNodeDescription;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setDBNodeRole(String DBNodeRole) {
            this.DBNodeRole = DBNodeRole;
            return this;
        }
        public String getDBNodeRole() {
            return this.DBNodeRole;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setDBNodeStatus(String DBNodeStatus) {
            this.DBNodeStatus = DBNodeStatus;
            return this;
        }
        public String getDBNodeStatus() {
            return this.DBNodeStatus;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setFailoverPriority(Integer failoverPriority) {
            this.failoverPriority = failoverPriority;
            return this;
        }
        public Integer getFailoverPriority() {
            return this.failoverPriority;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setHotReplicaMode(String hotReplicaMode) {
            this.hotReplicaMode = hotReplicaMode;
            return this;
        }
        public String getHotReplicaMode() {
            return this.hotReplicaMode;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setImciSwitch(String imciSwitch) {
            this.imciSwitch = imciSwitch;
            return this;
        }
        public String getImciSwitch() {
            return this.imciSwitch;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setMasterId(String masterId) {
            this.masterId = masterId;
            return this;
        }
        public String getMasterId() {
            return this.masterId;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setMemorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public String getMemorySize() {
            return this.memorySize;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setMirrorInsName(String mirrorInsName) {
            this.mirrorInsName = mirrorInsName;
            return this;
        }
        public String getMirrorInsName() {
            return this.mirrorInsName;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setMultiMasterLocalStandby(String multiMasterLocalStandby) {
            this.multiMasterLocalStandby = multiMasterLocalStandby;
            return this;
        }
        public String getMultiMasterLocalStandby() {
            return this.multiMasterLocalStandby;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setMultiMasterPrimaryNode(String multiMasterPrimaryNode) {
            this.multiMasterPrimaryNode = multiMasterPrimaryNode;
            return this;
        }
        public String getMultiMasterPrimaryNode() {
            return this.multiMasterPrimaryNode;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setOrca(String orca) {
            this.orca = orca;
            return this;
        }
        public String getOrca() {
            return this.orca;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setRemoteMemorySize(String remoteMemorySize) {
            this.remoteMemorySize = remoteMemorySize;
            return this;
        }
        public String getRemoteMemorySize() {
            return this.remoteMemorySize;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setSccMode(String sccMode) {
            this.sccMode = sccMode;
            return this;
        }
        public String getSccMode() {
            return this.sccMode;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setServerWeight(String serverWeight) {
            this.serverWeight = serverWeight;
            return this;
        }
        public String getServerWeight() {
            return this.serverWeight;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setServerlessType(String serverlessType) {
            this.serverlessType = serverlessType;
            return this;
        }
        public String getServerlessType() {
            return this.serverlessType;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setSubCluster(String subCluster) {
            this.subCluster = subCluster;
            return this;
        }
        public String getSubCluster() {
            return this.subCluster;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setSubGroupDescription(String subGroupDescription) {
            this.subGroupDescription = subGroupDescription;
            return this;
        }
        public String getSubGroupDescription() {
            return this.subGroupDescription;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDbClusterAttributeZonalResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDbClusterAttributeZonalResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterAttributeZonalResponseBodyTags self = new DescribeDbClusterAttributeZonalResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterAttributeZonalResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDbClusterAttributeZonalResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
