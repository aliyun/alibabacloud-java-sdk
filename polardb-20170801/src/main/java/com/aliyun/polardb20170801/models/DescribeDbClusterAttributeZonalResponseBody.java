// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDbClusterAttributeZonalResponseBody extends TeaModel {
    /**
     * <p>The start time of the free AI feature. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-13T01:20:28Z</p>
     */
    @NameInMap("AiCreatingTime")
    public String aiCreatingTime;

    /**
     * <p>The AI node type. Valid values:</p>
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
     * <p>The CPU architecture. Valid values:</p>
     * <ul>
     * <li><strong>X86</strong></li>
     * <li><strong>ARM</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>x86</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>The minor version update policy. Valid values:</p>
     * <ul>
     * <li>Auto: Automatic update.</li>
     * <li>Manual: Manual update.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
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
     * <p>The number of used blktags.</p>
     * 
     * <strong>example:</strong>
     * <p>5,242,880</p>
     */
    @NameInMap("BlktagUsed")
    public Long blktagUsed;

    /**
     * <p>Specifies whether I/O performance burst is enabled for ESSD AutoPL cloud disks. Valid values:</p>
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
     * <p>The <a href="https://help.aliyun.com/document_detail/183258.html">edition</a>. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: Cluster Edition</li>
     * <li><strong>Basic</strong>: Single Node Edition</li>
     * <li><strong>Archive</strong>: X-Engine</li>
     * <li><strong>NormalMultimaster</strong>: Multi-master Cluster Edition</li>
     * <li><strong>SENormal</strong>: Standard Edition</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>PolarDB for PostgreSQL 11 does not support the Single Node Edition.</li>
     * <li>PolarDB for MySQL 8.0 and 5.7, and PolarDB for PostgreSQL 14 support the Standard Edition.</li>
     * <li>PolarDB for MySQL 8.0 supports X-Engine and the Multi-master Cluster Edition.</li>
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
     * <p>The size of the compressed storage data.</p>
     * <blockquote>
     * <p>This parameter is returned only when the storage compression feature is enabled for the cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15529410560</p>
     */
    @NameInMap("CompressStorageUsed")
    public Long compressStorageUsed;

    /**
     * <p>The time when the cluster was created. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. The time is displayed in UTC.</p>
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
     * <li><strong>Creating</strong>: The cluster is being created.</li>
     * <li><strong>Running</strong>: The cluster is running.</li>
     * <li><strong>Deleting</strong>: The cluster is being released.</li>
     * <li><strong>Rebooting</strong>: The cluster is restarting.</li>
     * <li><strong>DBNodeCreating</strong>: Nodes are being increased.</li>
     * <li><strong>DBNodeDeleting</strong>: A node is being deleted.</li>
     * <li><strong>ClassChanging</strong>: The node specifications are being changed.</li>
     * <li><strong>NetAddressCreating</strong>: Network connectivity is being created.</li>
     * <li><strong>NetAddressDeleting</strong>: Network connectivity is being deleted.</li>
     * <li><strong>NetAddressModifying</strong>: Network connectivity is being modified. </li>
     * <li><strong>Deleted</strong>: The cluster is released.</li>
     * </ul>
     * <ul>
     * <li><strong>ClassChanged</strong>: The upgrade or decrease the quota is completed and resources are being revoked.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    /**
     * <p>The details of the nodes.</p>
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
     * <p>The status of the current minor engine version. Valid values:</p>
     * <ul>
     * <li><strong>Stable</strong>: The current version is stable.</li>
     * <li><strong>Old</strong>: The current version is outdated. Upgrade to the latest version.</li>
     * <li><strong>HighRisk</strong>: The current version has critical defects. Upgrade to the latest version immediately.</li>
     * <li><strong>Beta</strong>: The current version is a beta version.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For more information about how to upgrade the minor engine version, see <a href="https://help.aliyun.com/document_detail/158572.html">Upgrade minor engine versions</a>.</li>
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
     * <p>The total size of level-1 backups (snapshots). Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>74448896</p>
     */
    @NameInMap("DataLevel1BackupChainSize")
    public Long dataLevel1BackupChainSize;

    /**
     * <p>The data replication relationship pattern. Valid values:</p>
     * <ul>
     * <li><strong>AsyncSync</strong>: Asynchronous synchronization.</li>
     * <li><strong>SemiSync</strong>: Semi-synchronous synchronization.</li>
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
     * <p>A specific value is returned only for clusters whose billing method is <strong>Prepaid</strong> (subscription). An empty value is returned for clusters whose billing method is <strong>Postpaid</strong> (pay-as-you-go). The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. The time is displayed in UTC.</p>
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
     * <p>Indicates whether to replenish the resources of the new primary database after a cross-zone switch. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
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
     * <li><strong>StandbyClusterON</strong>: Enables the Hot Standby Cluster, or enables both the Hot Standby Cluster and standby compute nodes. </li>
     * <li><strong>StandbyClusterOFF</strong>: shutdown the Hot Standby Cluster, or shutdown both the Hot Standby Cluster and standby compute nodes.</li>
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
     * <p>The seamless switchover feature. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enabled.</li>
     * <li><code>false</code>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
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
     * <p>The number of used inodes.</p>
     * 
     * <strong>example:</strong>
     * <p>4,194,304</p>
     */
    @NameInMap("InodeUsed")
    public Long inodeUsed;

    /**
     * <p>Indicates whether the kernel version is the latest. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Yes.</p>
     * </li>
     * <li><p><strong>false</strong>: No.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsLatestVersion")
    public Boolean isLatestVersion;

    /**
     * <p>Indicates whether the database proxy is of the latest version. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
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
     * <li><strong>Unlock</strong>: The cluster is not locked.</li>
     * <li><strong>ManualLock</strong>: The cluster is manually locked. </li>
     * <li><strong>LockByExpiration</strong>: The cluster is automatically locked due to expiration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Unlock</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <p>The maintenance window of the cluster. The time follows the ISO 8601 standard in the <code>HH:mmZ-HH:mmZ</code> format. The time is displayed in UTC. For example, <code>16:00Z-17:00Z</code> indicates that routine maintenance can be performed from 00:00 to 01:00 (UTC+8).</p>
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
     * <li><strong>Postpaid</strong>: Pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: Subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p id="p_wyg_t4a_glm" props="china" icmsditafragmentmagic=1>The provisioned read and write IOPS of the ESSD AutoPL cloud disk. Valid values: 0 to min{50,000, 1000 × Capacity - Baseline performance}.</p>
     * <p id="p_6de_jxy_k2g" props="china" icmsditafragmentmagic=1>Baseline performance = min{1,800 + 50 × Capacity, 50,000}.</p>
     * <note id="note_7kj_j0o_rgs" props="china" icmsditafragmentmagic=1>This parameter is supported only when StorageType is set to ESSDAUTOPL.</note>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
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
     * <li>AgileServerless: Agile mode, which indicates a serverless cluster.</li>
     * <li>SteadyServerless: Steady mode, which indicates a cluster with defined specifications (a cluster whose billing is subscription or pay-as-you-go).</li>
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
     * <li><strong>Creating</strong>: The database proxy is being created.</li>
     * <li><strong>Running</strong>: The database proxy is running.</li>
     * <li><strong>Deleting</strong>: The database proxy is being released.</li>
     * <li><strong>Rebooting</strong>: The database proxy is restarting.</li>
     * <li><strong>DBNodeCreating</strong>: Nodes are being increased.</li>
     * <li><strong>DBNodeDeleting</strong>: A node is being deleted.</li>
     * <li><strong>ClassChanging</strong>: The node specifications are being changed.</li>
     * <li><strong>NetAddressCreating</strong>: Network connectivity is being created.</li>
     * <li><strong>NetAddressDeleting</strong>: Network connectivity is being deleted.</li>
     * <li><strong>NetAddressModifying</strong>: Network connectivity is being modified.</li>
     * <li><strong>Deleted</strong>: The database proxy is released.</li>
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
     * <li><strong>Exclusive</strong>: Dedicated Enterprise Edition.</li>
     * <li><strong>General</strong>: Standard Enterprise Edition.</li>
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
     * <li>If RestoreType is set to <strong>RestoreByTime</strong> or <strong>RestoreByTimeOss</strong>, this value indicates the point in time to which the cluster is restored.</li>
     * <li>If RestoreType is set to <strong>RestoreByBackupSet</strong> or <strong>RestoreByBackupSetOss</strong>, this value indicates the ID of the backup set from which the cluster is restored.</li>
     * </ul>
     * <p><note>This parameter is supported only for clusters restored from a backup set or a point in time after June 1, 2024.</note></p>
     * 
     * <strong>example:</strong>
     * <p>2179639137</p>
     */
    @NameInMap("RestoreDataPoint")
    public String restoreDataPoint;

    /**
     * <p>The cluster restoration method. Valid values:</p>
     * <ul>
     * <li><strong>RestoreByTime</strong>: Restores the cluster from a level-1 backup to a specific point in time.</li>
     * <li><strong>RestoreByBackupSet</strong>: Restores the cluster from a level-1 backup set.</li>
     * <li><strong>RestoreByTimeOss</strong>: Restores the cluster from a level-2 backup to a specific point in time.</li>
     * <li><strong>RestoreByBackupSetOss</strong>: Restores the cluster from a level-2 backup set.</li>
     * <li><strong>CloneFromSourceCluster</strong>: Clones the cluster from the source cluster.</li>
     * </ul>
     * <p><note>This parameter is supported only for clusters restored from a backup set or a point in time after June 1, 2024.</note></p>
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
     * <p>The storage usage of SQL statements. Unit: bytes. A value of -1 indicates that no data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SQLSize")
    public Long SQLSize;

    /**
     * <p>The serverless type. Valid values:</p>
     * <ul>
     * <li>AgileServerless: Agile.</li>
     * <li>SteadyServerless: Steady.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AgileServerless</p>
     */
    @NameInMap("ServerlessType")
    public String serverlessType;

    /**
     * <p>The ID of the source cluster.
     * <note>This parameter is supported only for clusters restored from a backup set or a point in time after June 1, 2024.</note></p>
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

    /**
     * <p>The maximum storage capacity for the current cluster specifications. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10995116277760</p>
     */
    @NameInMap("StorageMax")
    public Long storageMax;

    /**
     * <p>The storage billing method. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: Pay-as-you-go based on capacity.</li>
     * <li><strong>Prepaid</strong>: Subscription based on storage space.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("StoragePayType")
    public String storagePayType;

    /**
     * <p>The storage space. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("StorageSpace")
    public Long storageSpace;

    /**
     * <p>The storage type of the Enterprise Edition. Valid values:</p>
     * <ul>
     * <li><strong>PSL5</strong></li>
     * <li><strong>PSL4</strong></li>
     * </ul>
     * <p>The storage type of the Standard Edition. Valid values:</p>
     * <ul>
     * <li><strong>ESSDPL0</strong></li>
     * <li><strong>ESSDPL1</strong></li>
     * <li><strong>ESSDPL2</strong></li>
     * <li><strong>ESSDPL3</strong></li>
     * <li><strong>ESSDAUTOPL</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ESSDPL0</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The amount of used storage space. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>3012558848</p>
     */
    @NameInMap("StorageUsed")
    public Long storageUsed;

    /**
     * <p>Indicates whether strict data consistency across multiple zones is enabled for the cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>ON</strong>: Strict data consistency across multiple zones is enabled. This applies to the three-zone deployment scenario of the Standard Edition.</p>
     * </li>
     * <li><p><strong>OFF</strong>: Strict data consistency across multiple zones is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("StrictConsistency")
    public String strictConsistency;

    /**
     * <p>The specification type of the compute nodes. Valid values:</p>
     * <ul>
     * <li><strong>Exclusive</strong>: Dedicated</li>
     * <li><strong>General</strong>: General-purpose</li>
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
     * <p>Indicates whether the failover with hot replica feature compatible with IMCI is supported.</p>
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
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-**********</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
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
         * <p>The number of CPU cores added by the automatic scaling of local resources.</p>
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
         * <p>The time when the cluster was created. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. The time is displayed in UTC.</p>
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
         * <p>The node role. Valid values: </p>
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
         * <p>The node status. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The node is being created. </li>
         * <li><strong>Running</strong>: The node is running. </li>
         * <li><strong>Deleting</strong>: The node is being deleted.  </li>
         * <li><strong>Rebooting</strong>: The node is restarting.  </li>
         * <li><strong>DBNodeCreating</strong>: Nodes are being increased.  </li>
         * <li><strong>DBNodeDeleting</strong>: A node is being deleted. </li>
         * <li><strong>ClassChanging</strong>: The node specifications are being changed.  </li>
         * <li><strong>NetAddressCreating</strong>: Network connectivity is being created.  </li>
         * <li><strong>NetAddressDeleting</strong>: Network connectivity is being deleted.  </li>
         * <li><strong>NetAddressModifying</strong>: Network connectivity is being modified.</li>
         * <li><strong>MinorVersionUpgrading</strong>: The minor version is being upgraded.</li>
         * <li><strong>Maintaining</strong>: The instance is under maintenance.  </li>
         * <li><strong>Switching</strong>: A switchover is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBNodeStatus")
        public String DBNodeStatus;

        /**
         * <p>The failover priority. Each node has a failover priority, which determines the probability of the node being elected as the primary node during a failover. A higher value indicates a higher priority.
         * Valid values: 1 to 15.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailoverPriority")
        public Integer failoverPriority;

        /**
         * <p>Indicates whether the hot standby feature is enabled. Valid values:</p>
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
         * <p>Indicates whether the In-Memory Column Index (IMCI) feature is enabled. Valid values:</p>
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
         * <p>The maximum number of I/O requests per second, namely IOPS.</p>
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
         * <p>The name of the hot replica corresponding to the node in the hot standby storage and compute architecture.</p>
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
         * <p>The Orca feature status. Valid values:</p>
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
         * <p>The serverless type. Valid values:</p>
         * <ul>
         * <li>AgileServerless: Agile.</li>
         * <li>SteadyServerless: Steady.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AgileServerless</p>
         */
        @NameInMap("ServerlessType")
        public String serverlessType;

        /**
         * <p>The zone where the node is deployed. This parameter is mainly used for resource symmetry.
         * Valid values:</p>
         * <ul>
         * <li>Primary: The primary zone.</li>
         * <li>Standby: The secondary zone.</li>
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
