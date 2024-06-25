// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the no-activity suspension feature. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only for serverless clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowShutDown")
    public String allowShutDown;

    /**
     * <p>The CPU architecture. Valid values:</p>
     * <ul>
     * <li>X86</li>
     * <li>ARM</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>X86</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>Specifies whether to enable automatic renewal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * <blockquote>
     * <p>This parameter is valid only when the <strong>PayType</strong> parameter is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The retention policy for the backup sets when you delete the cluster. Valid values:</p>
     * <ul>
     * <li><strong>ALL</strong>: permanently retains all backups.</li>
     * <li><strong>LATEST</strong>: permanently retains the last backup. A backup is automatically created before you delete the cluster.</li>
     * <li><strong>NONE</strong>: No backup sets are retained after the cluster is deleted.</li>
     * </ul>
     * <p>The default value is <strong>NONE</strong> after you create a cluster.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is valid only when the <strong>DBType</strong> parameter is set to <strong>MySQL</strong>.</p>
     * </li>
     * <li><p>This parameter is invalid for serverless clusters.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public String backupRetentionPolicyOnClusterDeletion;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. The token is case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f5********************</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The point in time when you want to clone data. Valid values:</p>
     * <ul>
     * <li><strong>LATEST</strong>: The data of the latest point in time is cloned.</li>
     * <li><strong>BackupID</strong>: You can specify the ID of a backup set. In this case, data is cloned based on the specified backup set.</li>
     * <li><strong>Timestamp</strong>: You can specify a point in time in the past in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</li>
     * </ul>
     * <p>Default value: <strong>LATEST</strong>.</p>
     * <blockquote>
     * <p>If the <strong>CreationOption</strong> parameter is set to <strong>CloneFromRDS</strong>, the value of this parameter must be <strong>LATEST</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("CloneDataPoint")
    public String cloneDataPoint;

    /**
     * <p>The network type of the cluster. Only virtual private clouds (VPCs) are supported. Set the value to <strong>VPC</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("ClusterNetworkType")
    public String clusterNetworkType;

    /**
     * <p>The edition of the cluster. Default value: Normal. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: Cluster Edition</li>
     * <li><strong>Basic</strong>: Single Node Edition</li>
     * <li><strong>ArchiveNormal</strong>: X-Engine Edition</li>
     * <li><strong>NormalMultimaster</strong>: Multi-master Cluster Edition</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Only when the <strong>DBType</strong> parameter is set to <strong>MySQL</strong> and <strong>the DBVersion</strong> parameter is set to <strong>5.6</strong>, <strong>5.7</strong>, or <strong>8.0</strong>, you can set this parameter to <strong>Basic</strong>.</p>
     * </li>
     * <li><p>Only when the <strong>DBType</strong> parameter is set to <strong>MySQL</strong> and the <strong>DBVersion</strong> parameter is set to <strong>8.0</strong>, you can set this parameter to <strong>ArchiveNormal</strong> or <strong>NormalMultimaster</strong>.</p>
     * </li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/183258.html">Product editions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("CreationCategory")
    public String creationCategory;

    /**
     * <p>The method that is used to create a cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: creates a PolarDB cluster. For more information about how to perform this operation in the console, see the following topics:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/58769.html">Create a PolarDB for MySQL cluster</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/118063.html">Create a PolarDB for PostgreSQL cluster</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/118182.html">Create a PolarDB for Oracle cluster</a></li>
     * </ul>
     * </li>
     * <li><p><strong>CloneFromPolarDB</strong>: clones data from an existing PolarDB cluster to a new PolarDB cluster. For more information about how to perform this operation in the console, see the following topics:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/87966.html">Clone a PolarDB for MySQL cluster</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/118108.html">Clone a PolarDB for PostgreSQL cluster</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/118221.html">Clone a PolarDB for Oracle cluster</a></li>
     * </ul>
     * </li>
     * <li><p><strong>CloneFromRDS</strong>: clones data from an existing ApsaraDB RDS for MySQL instance to a new PolarDB for MySQL cluster. For more information about how to perform this operation in the console, see <a href="https://help.aliyun.com/document_detail/121812.html">Create a PolarDB for MySQL cluster by cloning an ApsaraDB RDS for MySQL instance</a>.</p>
     * </li>
     * <li><p><strong>MigrationFromRDS</strong>: migrates data from an existing ApsaraDB RDS for MySQL instance to a new PolarDB for MySQL cluster. By default, the created PolarDB cluster is in read-only mode, and the binary logging feature is enabled. For more information about how to perform this operation in the console, see <a href="https://help.aliyun.com/document_detail/121582.html">Create a PolarDB for MySQL cluster from an ApsaraDB RDS for MySQL instance</a>.</p>
     * </li>
     * <li><p><strong>CreateGdnStandby</strong>: creates a secondary cluster. For more information about how to perform this operation in the console, see <a href="https://help.aliyun.com/document_detail/160381.html">Add a secondary cluster</a>.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>Normal</strong>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If the <strong>DBType</strong> parameter is set to <strong>MySQL</strong> and the <strong>DBVersion</strong> parameter is set to <strong>5.6</strong> or <strong>5.7</strong>, this parameter can be set to <strong>CloneFromRDS</strong> or <strong>MigrationFromRDS</strong>.</p>
     * </li>
     * <li><p>If the <strong>DBType</strong> parameter is set to <strong>MySQL</strong> and the <strong>DBVersion</strong> parameter is set to <strong>8.0</strong>, this parameter can be set to <strong>CreateGdnStandby</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("CreationOption")
    public String creationOption;

    /**
     * <p>The name of the cluster. The name must meet the following requirements:</p>
     * <ul>
     * <li>It cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>It must be 2 to 256 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The minor version of the database engine. Valid values:</p>
     * <ul>
     * <li><strong>8.0.2</strong></li>
     * <li><strong>8.0.1</strong></li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only when the <strong>DBType</strong> parameter is set to <strong>MySQL</strong> and the <strong>DBVersion</strong> parameter is set to <strong>8.0</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8.0.1</p>
     */
    @NameInMap("DBMinorVersion")
    public String DBMinorVersion;

    /**
     * <p>The specifications of the node.</p>
     * <ul>
     * <li>For more information about specifications supported by PolarDB for MySQL, see <a href="https://help.aliyun.com/document_detail/102542.html">Specifications of compute nodes</a>.</li>
     * <li>For information about node specifications supported by the Oracle database engine, see <a href="https://help.aliyun.com/document_detail/207921.html">Specifications of compute nodes</a>.</li>
     * <li>For information about node specifications supported by the PostgreSQL database engine, see <a href="https://help.aliyun.com/document_detail/209380.html">Specifications of compute nodes</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polar.mysql.x2.medium</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DBNodeNum")
    public Integer DBNodeNum;

    /**
     * <p>The type of the database engine. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>Oracle</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the database engine.</p>
     * <ul>
     * <li><p>Valid values for the MySQL database engine:</p>
     * <ul>
     * <li><strong>5.6</strong></li>
     * <li><strong>5.7</strong></li>
     * <li><strong>8.0</strong></li>
     * </ul>
     * </li>
     * <li><p>Valid values for the PostgreSQL database engine:</p>
     * <ul>
     * <li><strong>11</strong></li>
     * <li><strong>14</strong></li>
     * </ul>
     * </li>
     * <li><p>Valid value for the Oracle database engine: <strong>11</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.6</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The time zone of the cluster. The time must be in UTC. You can set the parameter to a value that is on the hour from <strong>-12:00 to +13:00</strong>. Example: 00:00. Default value: <strong>SYSTEM</strong>, which means that the value is the same as the time zone of the region.</p>
     * <blockquote>
     * <p>This parameter is valid only when the <strong>DBType</strong> parameter is set to <strong>MySQL</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM</p>
     */
    @NameInMap("DefaultTimeZone")
    public String defaultTimeZone;

    /**
     * <p>The ID of the Global Database Network (GDN).</p>
     * <blockquote>
     * <p>This parameter is required only when the <strong>CreationOption</strong> parameter is set to <strong>CreateGdnStandby</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gdn-***********</p>
     */
    @NameInMap("GDNId")
    public String GDNId;

    /**
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("HotStandbyCluster")
    public String hotStandbyCluster;

    /**
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("LoosePolarLogBin")
    public String loosePolarLogBin;

    /**
     * <p>Specifies whether to enable X-Engine. Valid values:</p>
     * <ul>
     * <li><strong>ON</strong></li>
     * <li><strong>OFF</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only if you do not set <strong>CreationOption</strong> to <strong>CreateGdnStandby</strong> and you set <strong>DBType</strong> to <strong>MySQL</strong> and <strong>DBVersion</strong> to <strong>8.0</strong>. To enable X-Engine on a node, make sure that the memory of the node is greater than or equal to 8 GB in size.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("LooseXEngine")
    public String looseXEngine;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("LooseXEngineUseMemoryPct")
    public String looseXEngineUseMemoryPct;

    /**
     * <p>Specifies whether the table names are case-sensitive. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: The table names are case-insensitive.</li>
     * <li><strong>0</strong>: The table names are case-sensitive.</li>
     * </ul>
     * <p>Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <p>This parameter is valid only when the <strong>DBType</strong> parameter is set to <strong>MySQL</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LowerCaseTableNames")
    public String lowerCaseTableNames;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the parameter template.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/207178.html">DescribeParameterGroups</a> operation to query the details of all parameter templates of a specified region, such as the ID of a parameter template.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pcpg-**************</p>
     */
    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go</li>
     * <li><strong>Prepaid</strong>: subscription</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription type of the subscription cluster. This parameter is required only when the PayType parameter is set to <strong>Prepaid</strong>. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: annual subscription. Unit: years.</li>
     * <li><strong>Month</strong>: monthly subscription. Unit: months.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}</p>
     * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}</p>
     * <blockquote>
     * <p> This parameter is available only if the StorageType parameter is set to ESSDAUTOPL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    /**
     * <strong>example:</strong>
     * <p>polar.maxscale.g2.medium.c</p>
     */
    @NameInMap("ProxyClass")
    public String proxyClass;

    /**
     * <strong>example:</strong>
     * <p>Exclusive</p>
     */
    @NameInMap("ProxyType")
    public String proxyType;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query available regions.</p>
     * </blockquote>
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
     * <p>rg-************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The maximum number of PCUs per node for scaling. Valid values: 1 PCU to 32 PCUs.</p>
     * <blockquote>
     * <p>This parameter is valid only for serverless clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ScaleMax")
    public String scaleMax;

    /**
     * <p>The minimum number of PCUs per node for scaling. Valid values: 1 PCU to 31 PCUs.</p>
     * <blockquote>
     * <p>This parameter is valid only for serverless clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScaleMin")
    public String scaleMin;

    /**
     * <p>The maximum number of read-only nodes for scaling. Valid values: 0 to 15.</p>
     * <blockquote>
     * <p>This parameter is valid only for serverless clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ScaleRoNumMax")
    public String scaleRoNumMax;

    /**
     * <p>The minimum number of read-only nodes for scaling. Valid values: 0 to 15.</p>
     * <blockquote>
     * <p>This parameter is valid only for serverless clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ScaleRoNumMin")
    public String scaleRoNumMin;

    /**
     * <p>The IP whitelist of the cluster.</p>
     * <blockquote>
     * <p>The whitelist can contain multiple IP addresses. Separate multiple IP addresses with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.<em><strong>.</strong></em>.***</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The type of the serverless cluster. Set the value to <strong>AgileServerless</strong>.</p>
     * <blockquote>
     * <p>This parameter is valid only for serverless clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AgileServerless</p>
     */
    @NameInMap("ServerlessType")
    public String serverlessType;

    /**
     * <p>The ID of the source ApsaraDB RDS instance or PolarDB cluster. This parameter is required only when the <strong>CreationOption</strong> parameter is set to <strong>MigrationFromRDS</strong>, <strong>CloneFromRDS</strong>, or <strong>CloneFromPolarDB</strong>.</p>
     * <ul>
     * <li>If the <strong>CreationOption</strong> parameter is set to <strong>MigrationFromRDS</strong> or <strong>CloneFromRDS</strong>, you must set this parameter to the ID of the source ApsaraDB RDS instance. The source ApsaraDB RDS instance must use ApsaraDB RDS for MySQL 5.6, 5.7, or 8.0 High-availability Edition.</li>
     * <li>If the <strong>CreationOption</strong> parameter is set to <strong>CloneFromPolarDB</strong>, you must set this parameter to the ID of the source PolarDB cluster. By default, the value of DBType of the destination cluster must be the same as that of the source cluster. For example, if a MySQL 8.0 cluster is used as the source cluster, you must set the <strong>DBType</strong> parameter to <strong>MySQL</strong> and the <strong>DBVersion</strong> parameter to <strong>8.0</strong> for the destination cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rm-*************</p>
     */
    @NameInMap("SourceResourceId")
    public String sourceResourceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("StandbyAZ")
    public String standbyAZ;

    /**
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    /**
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("StoragePayType")
    public String storagePayType;

    /**
     * <p>The storage space that uses the subscription billing method. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("StorageSpace")
    public Long storageSpace;

    /**
     * <p>The storage type. Valid values for Enterprise Edition:</p>
     * <ul>
     * <li><strong>PSL5</strong></li>
     * <li><strong>PSL4</strong></li>
     * </ul>
     * <p>Valid values for Standard Edition:</p>
     * <ul>
     * <li><strong>ESSDPL0</strong></li>
     * <li><strong>ESSDPL1</strong></li>
     * <li><strong>ESSDPL2</strong></li>
     * <li><strong>ESSDPL3</strong></li>
     * <li><strong>ESSDAUTOPL</strong></li>
     * </ul>
     * <blockquote>
     * <p>This parameter is invalid for serverless clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PSL4</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("StorageUpperBound")
    public Long storageUpperBound;

    /**
     * <p>Specifies whether to enable multi-zone data consistency. Valid values:</p>
     * <ul>
     * <li><strong>ON</strong>: enables multi-zone data consistency. Set this parameter to ON for Standard Edition clusters of Multi-zone Edition.</li>
     * <li><strong>OFF</strong>: disables multi-zone data consistency.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("StrictConsistency")
    public String strictConsistency;

    /**
     * <p>Specifies whether to enable transparent data encryption (TDE). Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is valid only when the <strong>DBType</strong> parameter is set to <strong>PostgreSQL</strong> or <strong>Oracle</strong>.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/167982.html">ModifyDBClusterTDE</a> operation to enable TDE for a PolarDB for MySQL cluster.</p>
     * </li>
     * <li><p>TDE cannot be disabled after it is enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TDEStatus")
    public Boolean TDEStatus;

    /**
     * <p>1</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDBClusterRequestTag> tag;

    /**
     * <ul>
     * <li>If the <strong>Period</strong> parameter is set to <strong>Month</strong>, the <strong>UsedTime</strong> parameter can be set to <code>1, 2, 3, 4, 5, 6, 7, 8, or 9</code>.</li>
     * <li>If the <strong>Period</strong> parameter is set to <strong>Year</strong>, the <strong>UsedTime</strong> parameter can be set to <code>1, 2, or 3</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The virtual private cloud (VPC) ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-**********</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the cluster.</p>
     * <blockquote>
     * <p>If the VPCId parameter is specified, the VSwitchId parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-**********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query available zones.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterRequest self = new CreateDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterRequest setAllowShutDown(String allowShutDown) {
        this.allowShutDown = allowShutDown;
        return this;
    }
    public String getAllowShutDown() {
        return this.allowShutDown;
    }

    public CreateDBClusterRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public CreateDBClusterRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateDBClusterRequest setBackupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
        this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
        return this;
    }
    public String getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    public CreateDBClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBClusterRequest setCloneDataPoint(String cloneDataPoint) {
        this.cloneDataPoint = cloneDataPoint;
        return this;
    }
    public String getCloneDataPoint() {
        return this.cloneDataPoint;
    }

    public CreateDBClusterRequest setClusterNetworkType(String clusterNetworkType) {
        this.clusterNetworkType = clusterNetworkType;
        return this;
    }
    public String getClusterNetworkType() {
        return this.clusterNetworkType;
    }

    public CreateDBClusterRequest setCreationCategory(String creationCategory) {
        this.creationCategory = creationCategory;
        return this;
    }
    public String getCreationCategory() {
        return this.creationCategory;
    }

    public CreateDBClusterRequest setCreationOption(String creationOption) {
        this.creationOption = creationOption;
        return this;
    }
    public String getCreationOption() {
        return this.creationOption;
    }

    public CreateDBClusterRequest setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public CreateDBClusterRequest setDBMinorVersion(String DBMinorVersion) {
        this.DBMinorVersion = DBMinorVersion;
        return this;
    }
    public String getDBMinorVersion() {
        return this.DBMinorVersion;
    }

    public CreateDBClusterRequest setDBNodeClass(String DBNodeClass) {
        this.DBNodeClass = DBNodeClass;
        return this;
    }
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    public CreateDBClusterRequest setDBNodeNum(Integer DBNodeNum) {
        this.DBNodeNum = DBNodeNum;
        return this;
    }
    public Integer getDBNodeNum() {
        return this.DBNodeNum;
    }

    public CreateDBClusterRequest setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public CreateDBClusterRequest setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public CreateDBClusterRequest setDefaultTimeZone(String defaultTimeZone) {
        this.defaultTimeZone = defaultTimeZone;
        return this;
    }
    public String getDefaultTimeZone() {
        return this.defaultTimeZone;
    }

    public CreateDBClusterRequest setGDNId(String GDNId) {
        this.GDNId = GDNId;
        return this;
    }
    public String getGDNId() {
        return this.GDNId;
    }

    public CreateDBClusterRequest setHotStandbyCluster(String hotStandbyCluster) {
        this.hotStandbyCluster = hotStandbyCluster;
        return this;
    }
    public String getHotStandbyCluster() {
        return this.hotStandbyCluster;
    }

    public CreateDBClusterRequest setLoosePolarLogBin(String loosePolarLogBin) {
        this.loosePolarLogBin = loosePolarLogBin;
        return this;
    }
    public String getLoosePolarLogBin() {
        return this.loosePolarLogBin;
    }

    public CreateDBClusterRequest setLooseXEngine(String looseXEngine) {
        this.looseXEngine = looseXEngine;
        return this;
    }
    public String getLooseXEngine() {
        return this.looseXEngine;
    }

    public CreateDBClusterRequest setLooseXEngineUseMemoryPct(String looseXEngineUseMemoryPct) {
        this.looseXEngineUseMemoryPct = looseXEngineUseMemoryPct;
        return this;
    }
    public String getLooseXEngineUseMemoryPct() {
        return this.looseXEngineUseMemoryPct;
    }

    public CreateDBClusterRequest setLowerCaseTableNames(String lowerCaseTableNames) {
        this.lowerCaseTableNames = lowerCaseTableNames;
        return this;
    }
    public String getLowerCaseTableNames() {
        return this.lowerCaseTableNames;
    }

    public CreateDBClusterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDBClusterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBClusterRequest setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    public CreateDBClusterRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDBClusterRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDBClusterRequest setProvisionedIops(Long provisionedIops) {
        this.provisionedIops = provisionedIops;
        return this;
    }
    public Long getProvisionedIops() {
        return this.provisionedIops;
    }

    public CreateDBClusterRequest setProxyClass(String proxyClass) {
        this.proxyClass = proxyClass;
        return this;
    }
    public String getProxyClass() {
        return this.proxyClass;
    }

    public CreateDBClusterRequest setProxyType(String proxyType) {
        this.proxyType = proxyType;
        return this;
    }
    public String getProxyType() {
        return this.proxyType;
    }

    public CreateDBClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBClusterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDBClusterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBClusterRequest setScaleMax(String scaleMax) {
        this.scaleMax = scaleMax;
        return this;
    }
    public String getScaleMax() {
        return this.scaleMax;
    }

    public CreateDBClusterRequest setScaleMin(String scaleMin) {
        this.scaleMin = scaleMin;
        return this;
    }
    public String getScaleMin() {
        return this.scaleMin;
    }

    public CreateDBClusterRequest setScaleRoNumMax(String scaleRoNumMax) {
        this.scaleRoNumMax = scaleRoNumMax;
        return this;
    }
    public String getScaleRoNumMax() {
        return this.scaleRoNumMax;
    }

    public CreateDBClusterRequest setScaleRoNumMin(String scaleRoNumMin) {
        this.scaleRoNumMin = scaleRoNumMin;
        return this;
    }
    public String getScaleRoNumMin() {
        return this.scaleRoNumMin;
    }

    public CreateDBClusterRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateDBClusterRequest setServerlessType(String serverlessType) {
        this.serverlessType = serverlessType;
        return this;
    }
    public String getServerlessType() {
        return this.serverlessType;
    }

    public CreateDBClusterRequest setSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }
    public String getSourceResourceId() {
        return this.sourceResourceId;
    }

    public CreateDBClusterRequest setStandbyAZ(String standbyAZ) {
        this.standbyAZ = standbyAZ;
        return this;
    }
    public String getStandbyAZ() {
        return this.standbyAZ;
    }

    public CreateDBClusterRequest setStorageAutoScale(String storageAutoScale) {
        this.storageAutoScale = storageAutoScale;
        return this;
    }
    public String getStorageAutoScale() {
        return this.storageAutoScale;
    }

    public CreateDBClusterRequest setStoragePayType(String storagePayType) {
        this.storagePayType = storagePayType;
        return this;
    }
    public String getStoragePayType() {
        return this.storagePayType;
    }

    public CreateDBClusterRequest setStorageSpace(Long storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }
    public Long getStorageSpace() {
        return this.storageSpace;
    }

    public CreateDBClusterRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateDBClusterRequest setStorageUpperBound(Long storageUpperBound) {
        this.storageUpperBound = storageUpperBound;
        return this;
    }
    public Long getStorageUpperBound() {
        return this.storageUpperBound;
    }

    public CreateDBClusterRequest setStrictConsistency(String strictConsistency) {
        this.strictConsistency = strictConsistency;
        return this;
    }
    public String getStrictConsistency() {
        return this.strictConsistency;
    }

    public CreateDBClusterRequest setTDEStatus(Boolean TDEStatus) {
        this.TDEStatus = TDEStatus;
        return this;
    }
    public Boolean getTDEStatus() {
        return this.TDEStatus;
    }

    public CreateDBClusterRequest setTag(java.util.List<CreateDBClusterRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDBClusterRequestTag> getTag() {
        return this.tag;
    }

    public CreateDBClusterRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateDBClusterRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDBClusterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateDBClusterRequestTag extends TeaModel {
        /**
         * <p>The key of the tag that you want to create for the cluster. To create multiple tags for a cluster at a time, click the <strong>+</strong> icon.</p>
         * <blockquote>
         * <p>You can create up to 20 key-value pairs of tags at a time. Each value of the <code>Tag.N.Key</code> parameter is paired with a value of the <code>Tag.N.Value</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>type</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that you want to create for the cluster. To create multiple tags for a cluster at a time, click the <strong>+</strong> icon.</p>
         * <blockquote>
         * <p>You can create up to 20 key-value pairs of tags at a time. Each value of the <code>Tag.N.Value</code> parameter is paired with a value of the <code>Tag.N.Key</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDBClusterRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDBClusterRequestTag self = new CreateDBClusterRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDBClusterRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDBClusterRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
