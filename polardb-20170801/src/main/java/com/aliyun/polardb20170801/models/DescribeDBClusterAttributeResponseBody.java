// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    /**
     * <p>The start time of the free AI feature.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-13T01:20:28Z</p>
     */
    @NameInMap("AiCreatingTime")
    public String aiCreatingTime;

    /**
     * <p>The AI node type. Valid values:</p>
     * <ul>
     * <li><strong>SearchNode</strong>: search node.</li>
     * <li><strong>DLNode</strong>: AI node.</li>
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
     * <p>The minor version update method. Valid values:</p>
     * <ul>
     * <li>Auto: Automatic update.</li>
     * <li>Manual: Manual update.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("AutoUpgradeMinorVersion")
    public String autoUpgradeMinorVersion;

    /**
     * <p>The maximum number of blktags in the file system.</p>
     * 
     * <strong>example:</strong>
     * <p>7,864,320</p>
     */
    @NameInMap("BlktagTotal")
    public Long blktagTotal;

    /**
     * <p>The current blktag usage.</p>
     * 
     * <strong>example:</strong>
     * <p>5,242,880</p>
     */
    @NameInMap("BlktagUsed")
    public Long blktagUsed;

    @NameInMap("Branch")
    public DescribeDBClusterAttributeResponseBodyBranch branch;

    /**
     * <p>Indicates whether I/O performance burst is enabled for the ESSD AutoPL cloud disk. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public String burstingEnabled;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/183258.html">edition</a> of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: Cluster Edition</li>
     * <li><strong>Basic</strong>: Single Node Edition</li>
     * <li><strong>Archive</strong>: X-Engine Edition</li>
     * <li><strong>NormalMultimaster</strong>: Multi-master Cluster Edition</li>
     * <li><strong>SENormal</strong>: Standard Edition</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>PolarDB for PostgreSQL 11 does not support Single Node Edition.</li>
     * <li>PolarDB for MySQL 8.0, PolarDB for MySQL 5.7, and PolarDB for PostgreSQL 14 support Standard Edition.</li>
     * <li>PolarDB for MySQL 8.0 supports X-Engine Edition and Multi-master Cluster Edition.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>Indicates whether column store tables are enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("ColumnTable")
    public String columnTable;

    /**
     * <p>Indicates whether storage compression is enabled. Valid values:</p>
     * <ul>
     * <li>ON: Enabled.</li>
     * <li>OFF: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("CompressStorageMode")
    public String compressStorageMode;

    /**
     * <p>The compressed storage data size.</p>
     * <blockquote>
     * <p>This parameter is returned only when the storage compression feature is enabled for the cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15529410560</p>
     */
    @NameInMap("CompressStorageUsed")
    public Long compressStorageUsed;

    @NameInMap("ConnectionResourceQuota")
    public Long connectionResourceQuota;

    @NameInMap("ConnectionResourceUsed")
    public Long connectionResourceUsed;

    /**
     * <p>The time when the cluster was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-08-14T05:58:42Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

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
     * <p>pc-*****************</p>
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
     * <p>The cluster status. For more information, see <a href="https://help.aliyun.com/document_detail/99286.html">Cluster status table</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    /**
     * <p>The node information.</p>
     */
    @NameInMap("DBNodes")
    public java.util.List<DescribeDBClusterAttributeResponseBodyDBNodes> DBNodes;

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
     * <p>The status of the current minor database version. Valid values:</p>
     * <ul>
     * <li><strong>Stable</strong>: The current version is stable.</li>
     * <li><strong>Old</strong>: The current version is outdated. Upgrade to the latest version.</li>
     * <li><strong>HighRisk</strong>: The current version has critical defects. Upgrade to the latest version immediately.</li>
     * <li><strong>Beta</strong>: The current version is a beta version.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For information about how to upgrade the minor database version, see <a href="https://help.aliyun.com/document_detail/158572.html">Version upgrade</a>.</li>
     * <li>This parameter is returned only when the database engine type (<strong>DBType</strong>) is <strong>MySQL</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Stable</p>
     */
    @NameInMap("DBVersionStatus")
    public String DBVersionStatus;

    /**
     * <p>The total size of level-1 backups (snapshots), in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>74448896</p>
     */
    @NameInMap("DataLevel1BackupChainSize")
    public Long dataLevel1BackupChainSize;

    /**
     * <p>The data replication relationship mode. Valid values:</p>
     * <ul>
     * <li><strong>AsyncSync</strong>: asynchronous</li>
     * <li><strong>SemiSync</strong>: semi-synchronous</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AsyncSync</p>
     */
    @NameInMap("DataSyncMode")
    public String dataSyncMode;

    /**
     * <p>The lock status for cluster deletion. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Unlocked. The cluster can be deleted.</li>
     * <li><strong>1</strong>: Locked. The cluster cannot be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DeletionLock")
    public Integer deletionLock;

    /**
     * <p>The cluster engine.</p>
     * 
     * <strong>example:</strong>
     * <p>POLARDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The expiration time of the cluster.</p>
     * <blockquote>
     * <p>A specific value is returned only for clusters whose billing method is <strong>Prepaid</strong> (subscription). An empty value is returned for <strong>Postpaid</strong> (pay-as-you-go) clusters.</p>
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
     * <p>This parameter is returned only for clusters whose billing method is <strong>Prepaid</strong> (subscription).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <p>Indicates whether resources are replenished for the new primary node after a cross-zone failover. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Resources are replenished.</li>
     * <li><strong>false</strong>: Resources are not replenished.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasCompleteStandbyRes")
    public Boolean hasCompleteStandbyRes;

    /**
     * <p>Indicates whether the Hot Standby Cluster (and standby compute nodes) is enabled. Valid values:</p>
     * <ul>
     * <li><strong>StandbyClusterON</strong>: The Hot Standby Cluster or both the Hot Standby Cluster and standby compute nodes are enabled. </li>
     * <li><strong>StandbyClusterOFF</strong>: The Hot Standby Cluster or both the Hot Standby Cluster and standby compute nodes are disabled.</li>
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
     * <li><code>ON</code>: Enabled.</li>
     * <li><code>OFF</code>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("ImciAutoIndex")
    public String imciAutoIndex;

    /**
     * <p>The failover with hot replica feature. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enabled.</li>
     * <li><code>false</code>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ImperceptibleSwitch")
    public String imperceptibleSwitch;

    /**
     * <p>The maximum number of inodes in the file system.</p>
     * 
     * <strong>example:</strong>
     * <p>6,291,456</p>
     */
    @NameInMap("InodeTotal")
    public Long inodeTotal;

    /**
     * <p>The current inode usage.</p>
     * 
     * <strong>example:</strong>
     * <p>4,194,304</p>
     */
    @NameInMap("InodeUsed")
    public Long inodeUsed;

    /**
     * <p>Indicates whether the cluster runs the latest Milvus version. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The cluster runs the latest Milvus version.</p>
     * </li>
     * <li><p><strong>false</strong>: The cluster does not run the latest Milvus version.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsLatestVersion")
    public Boolean isLatestVersion;

    /**
     * <p>Indicates whether the database proxy is the latest version. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The database proxy is the latest version.</li>
     * <li><strong>false</strong>: The database proxy is not the latest version.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsProxyLatestVersion")
    public Boolean isProxyLatestVersion;

    /**
     * <p>The lock mode. Valid values: </p>
     * <ul>
     * <li><strong>Unlock</strong>: Not locked.</li>
     * <li><strong>ManualLock</strong>: Manually locked. </li>
     * <li><strong>LockByExpiration</strong>: Automatically locked due to cluster expiration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Unlock</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <p>The maintenance window of the cluster. The time is in the <code>HH:mmZ-HH:mmZ</code> format (UTC). For example, <code>16:00Z-17:00Z</code> indicates that routine maintenance can be performed from 00:00 to 01:00 (UTC+08:00).</p>
     * 
     * <strong>example:</strong>
     * <p>18:00Z-19:00Z</p>
     */
    @NameInMap("MaintainTime")
    public String maintainTime;

    /**
     * <p>The Orca feature. Valid values:</p>
     * <ul>
     * <li><p>on: Enabled.</p>
     * </li>
     * <li><p>off: Disabled.</p>
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
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p id="p_wyg_t4a_glm" props="china" icmsditafragmentmagic=1>The provisioned read/write IOPS of the ESSD AutoPL cloud disk. Valid values: 0 to min{50,000, 1000 × capacity - baseline performance}.</p>
     * <p id="p_6de_jxy_k2g" props="china" icmsditafragmentmagic=1>Baseline performance = min{1,800 + 50 × capacity, 50,000}.</p>
     * <note id="note_7kj_j0o_rgs" props="china" icmsditafragmentmagic=1>This parameter is supported only when StorageType is set to ESSDAUTOPL.</note>
     * 
     * <strong>example:</strong>
     * <p>2500</p>
     */
    @NameInMap("ProvisionedIops")
    public String provisionedIops;

    /**
     * <p>The number of CPU cores of the database proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ProxyCpuCores")
    public String proxyCpuCores;

    /**
     * <p>The serverless type of the database proxy. Valid values:</p>
     * <ul>
     * <li>AgileServerless: agile serverless cluster.</li>
     * <li>SteadyServerless: steady serverless, which is a cluster with defined specifications (billing method is subscription or pay-as-you-go).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SteadyServerless</p>
     */
    @NameInMap("ProxyServerlessType")
    public String proxyServerlessType;

    /**
     * <p>The number of CPU cores in the standard configuration of the database proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ProxyStandardCpuCores")
    public String proxyStandardCpuCores;

    /**
     * <p>The status of the database proxy. Valid values:</p>
     * <ul>
     * <li><strong>Creating</strong>: Being created.</li>
     * <li><strong>Running</strong>: Running.</li>
     * <li><strong>Deleting</strong>: Being released.</li>
     * <li><strong>Rebooting</strong>: Being restarted.</li>
     * <li><strong>DBNodeCreating</strong>: Increase node in progress.</li>
     * <li><strong>DBNodeDeleting</strong>: Deleting a node.</li>
     * <li><strong>ClassChanging</strong>: Changing node specifications.</li>
     * <li><strong>NetAddressCreating</strong>: Creating network connectivity.</li>
     * <li><strong>NetAddressDeleting</strong>: Deleting network connectivity.</li>
     * <li><strong>NetAddressModifying</strong>: Modifying network connectivity.</li>
     * <li><strong>Deleted</strong>: Released.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("ProxyStatus")
    public String proxyStatus;

    /**
     * <p>The database proxy type. Valid values:</p>
     * <ul>
     * <li><strong>Exclusive</strong>: Dedicated Enterprise Edition</li>
     * <li><strong>General</strong>: Standard Enterprise Edition</li>
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
     * <p>rg-***************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <ul>
     * <li>If RestoreType is <strong>RestoreByTime</strong> or <strong>RestoreByTimeOss</strong>, this value indicates the point in time to which the cluster was restored.</li>
     * <li>If RestoreType is <strong>RestoreByBackupSet</strong> or <strong>RestoreByBackupSetOss</strong>, this value indicates the backup set ID used for the restoration.</li>
     * </ul>
     * <p><note>This parameter is supported only for clusters restored from a backup set or point in time after June 1, 2024.</note></p>
     * 
     * <strong>example:</strong>
     * <p>2179639137</p>
     */
    @NameInMap("RestoreDataPoint")
    public String restoreDataPoint;

    /**
     * <p>The cluster restoration method. Valid values:</p>
     * <ul>
     * <li><strong>RestoreByTime</strong>: Restored from a point in time based on a level-1 backup.</li>
     * <li><strong>RestoreByBackupSet</strong>: Restored from a backup set based on a level-1 backup.</li>
     * <li><strong>RestoreByTimeOss</strong>: Restored from a point in time based on a level-2 backup.</li>
     * <li><strong>RestoreByBackupSetOss</strong>: Restored from a backup set based on a level-2 backup.</li>
     * <li><strong>CloneFromSourceCluster</strong>: Cloned from the source cluster.</li>
     * </ul>
     * <p><note>This parameter is supported only for clusters restored from a backup set or point in time after June 1, 2024.</note></p>
     * 
     * <strong>example:</strong>
     * <p>RestoreByTime</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>The row compression setting.</p>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("RowCompression")
    public String rowCompression;

    /**
     * <p>The storage size of SQL statements, in bytes. A value of -1 indicates that no data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SQLSize")
    public Long SQLSize;

    /**
     * <p>The running status of the search node.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("SearchClusterStatus")
    public String searchClusterStatus;

    /**
     * <p>The compressed storage data size of the search node.</p>
     * <blockquote>
     * <p>This parameter is returned only when the storage compression feature is enabled for the cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15529410560</p>
     */
    @NameInMap("SearchCompressStorageUsed")
    public Long searchCompressStorageUsed;

    /**
     * <p>The storage usage of the search node.</p>
     * 
     * <strong>example:</strong>
     * <p>3012558848</p>
     */
    @NameInMap("SearchStorageUsed")
    public Long searchStorageUsed;

    /**
     * <p>The serverless type of the cluster. Valid values:</p>
     * <ul>
     * <li>AgileServerless: agile serverless cluster.</li>
     * <li>SteadyServerless: steady serverless, which is a cluster with defined specifications that has the serverless feature enabled.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only for serverless clusters or clusters with defined specifications that have the serverless feature enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SteadyServerless</p>
     */
    @NameInMap("ServerlessType")
    public String serverlessType;

    /**
     * <p>The source cluster ID.
     * <note>This parameter is supported only for clusters restored from a backup set or point in time after June 1, 2024.</note></p>
     * 
     * <strong>example:</strong>
     * <p>pc-pz51ziv48317b2880</p>
     */
    @NameInMap("SourceDBCluster")
    public String sourceDBCluster;

    /**
     * <p>The region ID of the source cluster.
     * <note>This parameter is returned only when the source cluster ID exists.</note></p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("SourceRegionId")
    public String sourceRegionId;

    /**
     * <p>The cross-zone disaster recovery mode. Valid values:</p>
     * <ul>
     * <li><strong>ON</strong>: Cross-zone disaster recovery is enabled.</li>
     * <li><strong>OFF</strong>: Cross-zone disaster recovery is disabled.</li>
     * <li><strong>0</strong>: Customer drill mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("StandbyHAMode")
    public String standbyHAMode;

    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    /**
     * <p>The maximum storage capacity for the current cluster specifications, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10995116277760</p>
     */
    @NameInMap("StorageMax")
    public Long storageMax;

    /**
     * <p>The storage billing type. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-by-capacity (pay-as-you-go).</li>
     * <li><strong>Prepaid</strong>: pay-by-space (subscription).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("StoragePayType")
    public String storagePayType;

    /**
     * <p>The storage space for pay-by-space (subscription) billing. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("StorageSpace")
    public Long storageSpace;

    /**
     * <p>The storage type. The value is fixed as <strong>HighPerformance</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>HighPerformance</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("StorageUpperBound")
    public Integer storageUpperBound;

    /**
     * <p>The storage usage, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>3012558848</p>
     */
    @NameInMap("StorageUsed")
    public Long storageUsed;

    /**
     * <p>Indicates whether multi-zone data strong consistency is enabled for the cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>ON</strong>: Multi-zone data strong consistency is enabled. This applies to Standard Edition clusters deployed across three zones.</p>
     * </li>
     * <li><p><strong>OFF</strong>: Multi-zone data strong consistency is not enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("StrictConsistency")
    public String strictConsistency;

    /**
     * <p>The specification type of compute nodes. Valid values:</p>
     * <ul>
     * <li><strong>Exclusive</strong>: Dedicated</li>
     * <li><strong>General</strong>: General-purpose</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is returned only for PolarDB for MySQL clusters of the Cluster Edition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Exclusive</p>
     */
    @NameInMap("SubCategory")
    public String subCategory;

    /**
     * <p>Indicates whether the failover with hot replica feature that is compatible with IMCI is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("SupportInstantSwitchWithImci")
    public String supportInstantSwitchWithImci;

    /**
     * <p>The tag information.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeDBClusterAttributeResponseBodyTags> tags;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-*******************</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-*********************</p>
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

    public DescribeDBClusterAttributeResponseBody setAutoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }
    public String getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
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

    public DescribeDBClusterAttributeResponseBody setBranch(DescribeDBClusterAttributeResponseBodyBranch branch) {
        this.branch = branch;
        return this;
    }
    public DescribeDBClusterAttributeResponseBodyBranch getBranch() {
        return this.branch;
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

    public DescribeDBClusterAttributeResponseBody setColumnTable(String columnTable) {
        this.columnTable = columnTable;
        return this;
    }
    public String getColumnTable() {
        return this.columnTable;
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

    public DescribeDBClusterAttributeResponseBody setConnectionResourceQuota(Long connectionResourceQuota) {
        this.connectionResourceQuota = connectionResourceQuota;
        return this;
    }
    public Long getConnectionResourceQuota() {
        return this.connectionResourceQuota;
    }

    public DescribeDBClusterAttributeResponseBody setConnectionResourceUsed(Long connectionResourceUsed) {
        this.connectionResourceUsed = connectionResourceUsed;
        return this;
    }
    public Long getConnectionResourceUsed() {
        return this.connectionResourceUsed;
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

    public DescribeDBClusterAttributeResponseBody setSearchClusterStatus(String searchClusterStatus) {
        this.searchClusterStatus = searchClusterStatus;
        return this;
    }
    public String getSearchClusterStatus() {
        return this.searchClusterStatus;
    }

    public DescribeDBClusterAttributeResponseBody setSearchCompressStorageUsed(Long searchCompressStorageUsed) {
        this.searchCompressStorageUsed = searchCompressStorageUsed;
        return this;
    }
    public Long getSearchCompressStorageUsed() {
        return this.searchCompressStorageUsed;
    }

    public DescribeDBClusterAttributeResponseBody setSearchStorageUsed(Long searchStorageUsed) {
        this.searchStorageUsed = searchStorageUsed;
        return this;
    }
    public Long getSearchStorageUsed() {
        return this.searchStorageUsed;
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

    public DescribeDBClusterAttributeResponseBody setStorageAutoScale(String storageAutoScale) {
        this.storageAutoScale = storageAutoScale;
        return this;
    }
    public String getStorageAutoScale() {
        return this.storageAutoScale;
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

    public DescribeDBClusterAttributeResponseBody setStorageUpperBound(Integer storageUpperBound) {
        this.storageUpperBound = storageUpperBound;
        return this;
    }
    public Integer getStorageUpperBound() {
        return this.storageUpperBound;
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

    public static class DescribeDBClusterAttributeResponseBodyBranchChildBranch extends TeaModel {
        @NameInMap("BranchLsn")
        public String branchLsn;

        @NameInMap("BranchTime")
        public String branchTime;

        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        @NameInMap("HasChild")
        public Boolean hasChild;

        @NameInMap("InsName")
        public String insName;

        public static DescribeDBClusterAttributeResponseBodyBranchChildBranch build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyBranchChildBranch self = new DescribeDBClusterAttributeResponseBodyBranchChildBranch();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyBranchChildBranch setBranchLsn(String branchLsn) {
            this.branchLsn = branchLsn;
            return this;
        }
        public String getBranchLsn() {
            return this.branchLsn;
        }

        public DescribeDBClusterAttributeResponseBodyBranchChildBranch setBranchTime(String branchTime) {
            this.branchTime = branchTime;
            return this;
        }
        public String getBranchTime() {
            return this.branchTime;
        }

        public DescribeDBClusterAttributeResponseBodyBranchChildBranch setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeDBClusterAttributeResponseBodyBranchChildBranch setHasChild(Boolean hasChild) {
            this.hasChild = hasChild;
            return this;
        }
        public Boolean getHasChild() {
            return this.hasChild;
        }

        public DescribeDBClusterAttributeResponseBodyBranchChildBranch setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyBranch extends TeaModel {
        @NameInMap("BranchLsn")
        public String branchLsn;

        @NameInMap("BranchTime")
        public String branchTime;

        @NameInMap("ChildBranch")
        public java.util.List<DescribeDBClusterAttributeResponseBodyBranchChildBranch> childBranch;

        @NameInMap("ParentInsName")
        public String parentInsName;

        public static DescribeDBClusterAttributeResponseBodyBranch build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyBranch self = new DescribeDBClusterAttributeResponseBodyBranch();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyBranch setBranchLsn(String branchLsn) {
            this.branchLsn = branchLsn;
            return this;
        }
        public String getBranchLsn() {
            return this.branchLsn;
        }

        public DescribeDBClusterAttributeResponseBodyBranch setBranchTime(String branchTime) {
            this.branchTime = branchTime;
            return this;
        }
        public String getBranchTime() {
            return this.branchTime;
        }

        public DescribeDBClusterAttributeResponseBodyBranch setChildBranch(java.util.List<DescribeDBClusterAttributeResponseBodyBranchChildBranch> childBranch) {
            this.childBranch = childBranch;
            return this;
        }
        public java.util.List<DescribeDBClusterAttributeResponseBodyBranchChildBranch> getChildBranch() {
            return this.childBranch;
        }

        public DescribeDBClusterAttributeResponseBodyBranch setParentInsName(String parentInsName) {
            this.parentInsName = parentInsName;
            return this;
        }
        public String getParentInsName() {
            return this.parentInsName;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyDBNodes extends TeaModel {
        /**
         * <p>The number of CPU cores added by second-level rapid scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("AddedCpuCores")
        public String addedCpuCores;

        /**
         * <p>The number of CPU cores of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuCores")
        public String cpuCores;

        /**
         * <p>The time when the node was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-23T21:35:43Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The CXL remote memory configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>3072</p>
         */
        @NameInMap("DBNodeCXLRemoteMemory")
        public String DBNodeCXLRemoteMemory;

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
         * <p>The role of the node. Valid values: </p>
         * <ul>
         * <li><strong>Writer</strong>: primary node.</li>
         * <li><strong>Reader</strong>: read-only node.</li>
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
         * <li><strong>Creating</strong>: Being created. </li>
         * <li><strong>Running</strong>: Running. </li>
         * <li><strong>Deleting</strong>: Being deleted.  </li>
         * <li><strong>Rebooting</strong>: Being restarted.  </li>
         * <li><strong>DBNodeCreating</strong>: Increase node in progress.  </li>
         * <li><strong>DBNodeDeleting</strong>: Deleting a node. </li>
         * <li><strong>ClassChanging</strong>: Changing node specifications.  </li>
         * <li><strong>NetAddressCreating</strong>: Creating network connectivity.  </li>
         * <li><strong>NetAddressDeleting</strong>: Deleting network connectivity.  </li>
         * <li><strong>NetAddressModifying</strong>: Modifying network connectivity.</li>
         * <li><strong>MinorVersionUpgrading</strong>: Upgrade of the minor version in progress.</li>
         * <li><strong>Maintaining</strong>: Instance under maintenance.  </li>
         * <li><strong>Switching</strong>: Switching over.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBNodeStatus")
        public String DBNodeStatus;

        /**
         * <p>The failover priority. Each node has a failover priority that determines the probability of the node being elected as the primary node during a failover. A higher value indicates a higher priority.
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
         * <li><p><strong>ON</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>OFF</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("HotReplicaMode")
        public String hotReplicaMode;

        /**
         * <p>Indicates whether In-Memory Column Index (IMCI) is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>ON</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>OFF</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("ImciSwitch")
        public String imciSwitch;

        /**
         * <p>The primary node ID of the Multi-master Cluster Edition.</p>
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
         * <p>The maximum number of I/O requests per second (IOPS).</p>
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
         * <p>The name of the hot replica that corresponds to this node in the hot standby storage and compute architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-bp18z52mirror*****</p>
         */
        @NameInMap("MirrorInsName")
        public String mirrorInsName;

        /**
         * <p>The multi-master local standby node.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-****************</p>
         */
        @NameInMap("MultiMasterLocalStandby")
        public String multiMasterLocalStandby;

        /**
         * <p>The multi-master primary node.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-****************</p>
         */
        @NameInMap("MultiMasterPrimaryNode")
        public String multiMasterPrimaryNode;

        /**
         * <p>The Orca feature. Valid values:</p>
         * <ul>
         * <li><p>on: Enabled.</p>
         * </li>
         * <li><p>off: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Orca")
        public String orca;

        @NameInMap("RemoteMemoryMax")
        public Integer remoteMemoryMax;

        @NameInMap("RemoteMemoryMin")
        public Integer remoteMemoryMin;

        @NameInMap("RemoteMemoryRecommended")
        public Integer remoteMemoryRecommended;

        /**
         * <p>The remote memory size. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>3072</p>
         */
        @NameInMap("RemoteMemorySize")
        public String remoteMemorySize;

        /**
         * <p>Indicates whether the global consistency (high-performance mode) feature is enabled for the node. Valid values:</p>
         * <ul>
         * <li><p><strong>ON</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>OFF</strong>: Disabled.</p>
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
         * <p>The serverless type of the node. Valid values:</p>
         * <ul>
         * <li>AgileServerless: agile serverless node.</li>
         * <li>SteadyServerless: steady serverless node, which is a node in a cluster with defined specifications that has serverless capabilities enabled.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only for serverless clusters or clusters with defined specifications that have the serverless feature enabled. For more information, see <a href="https://help.aliyun.com/document_detail/452274.html">Serverless</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SteadyServerless</p>
         */
        @NameInMap("ServerlessType")
        public String serverlessType;

        /**
         * <p>Indicates whether the node is in the primary zone or secondary zone. This parameter is mainly used for resource-equivalent deployments.
         * Valid values:</p>
         * <ul>
         * <li>Primary: primary zone.</li>
         * <li>Standby: secondary zone.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("SubCluster")
        public String subCluster;

        /**
         * <p>The cluster subgroup description.</p>
         * 
         * <strong>example:</strong>
         * <p>test Description</p>
         */
        @NameInMap("SubGroupDescription")
        public String subGroupDescription;

        /**
         * <p>The zone ID.</p>
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

        public DescribeDBClusterAttributeResponseBodyDBNodes setDBNodeCXLRemoteMemory(String DBNodeCXLRemoteMemory) {
            this.DBNodeCXLRemoteMemory = DBNodeCXLRemoteMemory;
            return this;
        }
        public String getDBNodeCXLRemoteMemory() {
            return this.DBNodeCXLRemoteMemory;
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

        public DescribeDBClusterAttributeResponseBodyDBNodes setRemoteMemoryMax(Integer remoteMemoryMax) {
            this.remoteMemoryMax = remoteMemoryMax;
            return this;
        }
        public Integer getRemoteMemoryMax() {
            return this.remoteMemoryMax;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setRemoteMemoryMin(Integer remoteMemoryMin) {
            this.remoteMemoryMin = remoteMemoryMin;
            return this;
        }
        public Integer getRemoteMemoryMin() {
            return this.remoteMemoryMin;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setRemoteMemoryRecommended(Integer remoteMemoryRecommended) {
            this.remoteMemoryRecommended = remoteMemoryRecommended;
            return this;
        }
        public Integer getRemoteMemoryRecommended() {
            return this.remoteMemoryRecommended;
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

        public DescribeDBClusterAttributeResponseBodyDBNodes setSubGroupDescription(String subGroupDescription) {
            this.subGroupDescription = subGroupDescription;
            return this;
        }
        public String getSubGroupDescription() {
            return this.subGroupDescription;
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
