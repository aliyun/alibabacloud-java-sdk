// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable pause on inactivity. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables pause on inactivity.</p>
     * </li>
     * <li><p><strong>false</strong> (default): disables pause on inactivity.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only for serverless clusters.</p>
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
     * <li><p>X86</p>
     * </li>
     * <li><p>ARM</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>X86</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables auto-renewal.</p>
     * </li>
     * <li><p><strong>false</strong>: disables auto-renewal.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Specifies whether to automatically use a coupon. Valid values:</p>
     * <ul>
     * <li><p>true (default): Automatically uses a coupon.</p>
     * </li>
     * <li><p>false: does not use a coupon.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The backup retention policy to apply when the cluster is deleted. Valid values:</p>
     * <ul>
     * <li><p><strong>ALL</strong>: retains all backup sets.</p>
     * </li>
     * <li><p><strong>LATEST</strong>: retains only the last backup set. An automatic backup is performed before the cluster is deleted.</p>
     * </li>
     * <li><p><strong>NONE</strong>: does not retain backup sets.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>NONE</strong>.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is valid only if <strong>DBType</strong> is set to <strong>MySQL</strong>.</p>
     * </li>
     * <li><p>Serverless clusters do not support this parameter.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public String backupRetentionPolicyOnClusterDeletion;

    /**
     * <p>Specifies whether to enable the performance burst feature for the ESSD AutoPL cloud disk. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables the performance burst feature.</p>
     * </li>
     * <li><p><strong>false</strong> (default): disables the performance burst feature.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only when <strong>StorageType</strong> is set to ESSDAUTOPL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public String burstingEnabled;

    /**
     * <p>A client-generated token that ensures the idempotence of the request. This token must be unique across all requests and is case-sensitive. It can contain up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f5********************</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The point in time for the clone. Valid values:</p>
     * <ul>
     * <li><p><strong>LATEST</strong>: The latest point in time.</p>
     * </li>
     * <li><p><strong>BackupID</strong>: The ID of a historical backup set.</p>
     * </li>
     * <li><p><strong>Timestamp</strong>: A specific point in time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>LATEST</strong>.</p>
     * <blockquote>
     * <p>If you set <strong>CreationOption</strong> to <strong>CloneFromRDS</strong>, you can set this parameter only to <strong>LATEST</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("CloneDataPoint")
    public String cloneDataPoint;

    /**
     * <p>The cloud service provider of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ENS</p>
     */
    @NameInMap("CloudProvider")
    public String cloudProvider;

    /**
     * <p>The network type of the cluster. Only <strong>VPC</strong> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("ClusterNetworkType")
    public String clusterNetworkType;

    /**
     * <p>The edition of the cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: Cluster Edition (default)</p>
     * </li>
     * <li><p><strong>Basic</strong>: Single-node Edition</p>
     * </li>
     * <li><p><strong>ArchiveNormal</strong>: X-Engine Edition</p>
     * </li>
     * <li><p><strong>NormalMultimaster</strong>: Multi-master Cluster Edition</p>
     * </li>
     * <li><p><strong>SENormal</strong>: Standard Edition</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>The <strong>Basic</strong> edition is supported for PolarDB for MySQL <strong>5.6</strong>, <strong>5.7</strong>, and <strong>8.0</strong>; PolarDB for PostgreSQL <strong>14</strong>; and PolarDB for PostgreSQL (compatible with Oracle) <strong>2.0</strong>.</p>
     * </li>
     * <li><p>The <strong>ArchiveNormal</strong> and <strong>NormalMultimaster</strong> editions are supported for PolarDB for MySQL <strong>8.0</strong>.</p>
     * </li>
     * <li><p>The <strong>SENormal</strong> edition is supported for PolarDB for MySQL <strong>5.6</strong>, <strong>5.7</strong>, and <strong>8.0</strong> and PolarDB for PostgreSQL <strong>14</strong>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>For more information about product editions, see <a href="https://help.aliyun.com/document_detail/183258.html">Editions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("CreationCategory")
    public String creationCategory;

    /**
     * <p>The method to create the cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: Creates a new PolarDB cluster. For more information, see the following topics:</p>
     * <ul>
     * <li><p><a href="https://help.aliyun.com/document_detail/58769.html">Create a PolarDB for MySQL cluster</a></p>
     * </li>
     * <li><p><a href="https://help.aliyun.com/document_detail/118063.html">Create a PolarDB for PostgreSQL cluster</a></p>
     * </li>
     * <li><p><a href="https://help.aliyun.com/document_detail/118182.html">Create a PolarDB for PostgreSQL (compatible with Oracle) cluster</a></p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>CloneFromPolarDB</strong>: Clones data from an existing PolarDB cluster. For more information, see the following topics:</p>
     * <ul>
     * <li><p><a href="https://help.aliyun.com/document_detail/87966.html">Clone a PolarDB for MySQL cluster</a></p>
     * </li>
     * <li><p><a href="https://help.aliyun.com/document_detail/118108.html">Clone a PolarDB for PostgreSQL cluster</a></p>
     * </li>
     * <li><p><a href="https://help.aliyun.com/document_detail/118221.html">Clone a PolarDB for PostgreSQL (compatible with Oracle) cluster</a></p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>RecoverFromRecyclebin</strong>: Restores a PolarDB cluster from the recycle bin. For more information, see the following topics:</p>
     * <ul>
     * <li><p><a href="https://help.aliyun.com/document_detail/164880.html">Restore a released PolarDB for MySQL cluster</a></p>
     * </li>
     * <li><p><a href="https://help.aliyun.com/document_detail/432844.html">Restore a released PolarDB for PostgreSQL cluster</a></p>
     * </li>
     * <li><p><a href="https://help.aliyun.com/document_detail/424632.html">Restore a released PolarDB for PostgreSQL (compatible with Oracle) cluster</a></p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>CloneFromRDS</strong>: Clones data from an existing ApsaraDB RDS instance to a new PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/121812.html">One-click cloning from ApsaraDB RDS for MySQL to PolarDB for MySQL</a>.</p>
     * </li>
     * <li><p><strong>MigrationFromRDS</strong>: Migrates data from an existing ApsaraDB RDS instance. The created PolarDB cluster is in read-only mode and has binary logging enabled by default. For more information, see <a href="https://help.aliyun.com/document_detail/121582.html">One-click upgrade from ApsaraDB RDS for MySQL to PolarDB for MySQL</a>.</p>
     * </li>
     * <li><p><strong>CreateGdnStandby</strong>: Creates a secondary cluster in a Global Database Network (GDN). For more information, see <a href="https://help.aliyun.com/document_detail/160381.html">Add a secondary cluster</a>.</p>
     * </li>
     * <li><p><strong>UpgradeFromPolarDB</strong>: Upgrades the major version of a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/459712.html">Perform a major version upgrade</a>.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>Normal</strong>.</p>
     * <blockquote>
     * <p>If <strong>DBType</strong> is set to <strong>MySQL</strong> and <strong>DBVersion</strong> is set to <strong>8.0</strong>, you can set this parameter to <strong>CreateGdnStandby</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("CreationOption")
    public String creationOption;

    /**
     * <p>The description of the cluster. The description must meet the following requirements:</p>
     * <ul>
     * <li><p>It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * </li>
     * <li><p>It must be 2 to 256 characters in length.</p>
     * </li>
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
     * <li><p><strong>8.0.2</strong></p>
     * </li>
     * <li><p><strong>8.0.1</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only if <strong>DBType</strong> is set to <strong>MySQL</strong> and <strong>DBVersion</strong> is set to <strong>8.0</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8.0.1</p>
     */
    @NameInMap("DBMinorVersion")
    public String DBMinorVersion;

    /**
     * <p>The node specification. For more information, see the following topics:</p>
     * <ul>
     * <li><p>PolarDB for MySQL: <a href="https://help.aliyun.com/document_detail/102542.html">Compute node specifications</a></p>
     * </li>
     * <li><p>PolarDB for PostgreSQL (compatible with Oracle): <a href="https://help.aliyun.com/document_detail/207921.html">Compute node specifications</a></p>
     * </li>
     * <li><p>PolarDB for PostgreSQL: <a href="https://help.aliyun.com/document_detail/209380.html">Compute node specifications</a></p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>To create a PolarDB for MySQL Cluster Edition serverless cluster, set this parameter to <strong>polar.mysql.sl.small</strong>.</p>
     * </li>
     * <li><p>To create a PolarDB for MySQL Standard Edition serverless cluster, set this parameter to <strong>polar.mysql.sl.small.c</strong>.</p>
     * </li>
     * <li><p>To create a PolarDB for PostgreSQL Cluster Edition serverless cluster, set this parameter to <strong>polar.pg.sl.small</strong>.</p>
     * </li>
     * <li><p>To create a PolarDB for PostgreSQL Standard Edition serverless cluster, set this parameter to <strong>polar.pg.sl.small.c</strong>.</p>
     * </li>
     * <li><p>To create a PolarDB for PostgreSQL (compatible with Oracle) serverless cluster, set this parameter to <strong>polar.o.sl.small</strong>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>polar.mysql.x4.medium</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <p>The number of nodes for a Standard Edition or Enterprise Edition cluster. Valid values:</p>
     * <ul>
     * <li><p>Standard Edition: 1 to 8. A cluster of this edition includes one read/write node and up to seven read-only nodes.</p>
     * </li>
     * <li><p>Enterprise Edition: 1 to 16. A cluster of this edition includes one read/write node and up to 15 read-only nodes.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>By default, an Enterprise Edition cluster has two nodes and a Standard Edition cluster has one node.</p>
     * </li>
     * <li><p>This parameter is supported only for PolarDB for MySQL.</p>
     * </li>
     * <li><p>You cannot change the number of nodes in a Multi-master Cluster Edition cluster.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DBNodeNum")
    public Integer DBNodeNum;

    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><p><strong>MySQL</strong></p>
     * </li>
     * <li><p><strong>PostgreSQL</strong></p>
     * </li>
     * <li><p><strong>Oracle</strong></p>
     * </li>
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
     * <li><p>Valid values for MySQL:</p>
     * <ul>
     * <li><p><strong>5.6</strong></p>
     * </li>
     * <li><p><strong>5.7</strong></p>
     * </li>
     * <li><p><strong>8.0</strong></p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Valid values for PostgreSQL:</p>
     * <ul>
     * <li><p><strong>11</strong></p>
     * </li>
     * <li><p><strong>14</strong></p>
     * </li>
     * <li><p><strong>15</strong>&lt;props=&quot;china&quot;&gt;</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a serverless cluster for PolarDB for PostgreSQL, you must set this parameter to <code>14</code>.</p>
     * </blockquote>
     * <p>\* Valid values for Oracle:
     * \* <strong>11</strong>
     * \* <strong>14</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.6</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>Cluster time zone (UTC). The value can be any full-hour offset from <strong>-12:00 to +13:00</strong>, such as <strong>00:00</strong>. The default value is <strong>SYSTEM</strong>, which uses the region\&quot;s time zone.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>DBType</strong> is <strong>MySQL</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM</p>
     */
    @NameInMap("DefaultTimeZone")
    public String defaultTimeZone;

    /**
     * <p>The ID of the Edge Node Service (ENS) node. This parameter is required if you want to create an ENS database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vn-hanoi-3</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The ID of the Global Database Network (GDN).</p>
     * <blockquote>
     * <p>This parameter is required if <strong>CreationOption</strong> is set to <strong>CreateGdnStandby</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gdn-***********</p>
     */
    @NameInMap("GDNId")
    public String GDNId;

    /**
     * <p>Specifies whether to enable the hot standby cluster feature. Valid values:</p>
     * <ul>
     * <li><p><strong>ON</strong> (default): enables a hot standby storage cluster.</p>
     * </li>
     * <li><p><strong>OFF</strong>: disables the hot standby cluster feature.</p>
     * </li>
     * <li><p><strong>STANDBY</strong>: enables a hot standby cluster.</p>
     * </li>
     * <li><p><strong>EQUAL</strong>: enables hot standby for both storage and computing resources.</p>
     * </li>
     * <li><p><strong>3AZ</strong>: enables multi-AZ strong consistency.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The value <strong>STANDBY</strong> is valid only for PolarDB for PostgreSQL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("HotStandbyCluster")
    public String hotStandbyCluster;

    /**
     * <p>Specifies whether to enable binary logging. Valid values:</p>
     * <ul>
     * <li><p><strong>ON</strong>: enables binary logging.</p>
     * </li>
     * <li><p><strong>OFF</strong>: disables binary logging.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only if <strong>DBType</strong> is set to <strong>MySQL</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("LoosePolarLogBin")
    public String loosePolarLogBin;

    /**
     * <p>Specifies whether to enable the X-Engine storage engine. Valid values:</p>
     * <ul>
     * <li><p><strong>ON</strong>: enables the X-Engine storage engine.</p>
     * </li>
     * <li><p><strong>OFF</strong>: disables the X-Engine storage engine.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only if the <strong>CreationOption</strong> parameter is not set to <strong>CreateGdnStandby</strong>, <strong>DBType</strong> is set to <strong>MySQL</strong>, and <strong>DBVersion</strong> is set to <strong>8.0</strong>. To enable the X-Engine storage engine, the node must have at least 8 GB of memory.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("LooseXEngine")
    public String looseXEngine;

    /**
     * <p>The percentage of memory allocated to the X-Engine storage engine. Valid values: integers from 10 to 90.</p>
     * <blockquote>
     * <p>This parameter is valid only if <strong>LooseXEngine</strong> is set to <strong>ON</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("LooseXEngineUseMemoryPct")
    public String looseXEngineUseMemoryPct;

    /**
     * <p>The time zone of the cluster. The value must be a UTC offset in the <code>±HH:mm</code> format. Valid values: from <strong>-12:00</strong> to <strong>+13:00</strong> on the hour. For example, <strong>00:00</strong>. The default value <strong>SYSTEM</strong> indicates that the cluster uses the time zone of its region.</p>
     * <ul>
     * <li><p><strong>1</strong>: Case-insensitive</p>
     * </li>
     * <li><p><strong>0</strong>: Case-sensitive</p>
     * </li>
     * </ul>
     * <p>The default value is <strong>1</strong>.</p>
     * <blockquote>
     * <p>This parameter is valid only if <strong>DBType</strong> is set to <strong>MySQL</strong>.</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/207178.html">DescribeParameterGroups</a> operation to query the parameter templates in a specific region, including the IDs of the parameter templates.</p>
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
     * <li><p><strong>Postpaid</strong>: pay-as-you-go.</p>
     * </li>
     * <li><p><strong>Prepaid</strong>: subscription.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the subscription duration. This parameter is required if you set the <strong>PayType</strong> parameter to <strong>Prepaid</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>Year</strong>: The subscription duration is measured in years.</p>
     * </li>
     * <li><p><strong>Month</strong>: The subscription duration is measured in months.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The promotion code. If you do not specify this parameter, the default coupon is used.</p>
     * 
     * <strong>example:</strong>
     * <p>727xxxxxx934</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The provisioned read/write IOPS of the ESSD AutoPL cloud disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is supported only when <strong>StorageType</strong> is set to ESSDAUTOPL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    /**
     * <p>The specification of the database proxy for a Standard Edition cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>polar.maxscale.g2.medium.c</strong>: 2 cores</p>
     * </li>
     * <li><p><strong>polar.maxscale.g2.large.c</strong>: 4 cores</p>
     * </li>
     * <li><p><strong>polar.maxscale.g2.xlarge.c</strong>: 8 cores</p>
     * </li>
     * <li><p><strong>polar.maxscale.g2.2xlarge.c</strong>: 16 cores</p>
     * </li>
     * <li><p><strong>polar.maxscale.g2.3xlarge.c</strong>: 24 cores</p>
     * </li>
     * <li><p><strong>polar.maxscale.g2.4xlarge.c</strong>: 32 cores</p>
     * </li>
     * <li><p><strong>polar.maxscale.g2.8xlarge.c</strong>: 64 cores</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>polar.maxscale.g2.medium.c</p>
     */
    @NameInMap("ProxyClass")
    public String proxyClass;

    /**
     * <p>The type of the database proxy. Valid values:</p>
     * <ul>
     * <li><p><strong>EXCLUSIVE</strong>: Enterprise Dedicated</p>
     * </li>
     * <li><p><strong>GENERAL</strong>: Enterprise General-purpose</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The proxy type must be consistent with the type that corresponds to the node specification of the cluster:</p>
     * <ul>
     * <li><p>If the node specification is general-purpose, the proxy type must be Enterprise General-purpose.</p>
     * </li>
     * <li><p>If the node specification is dedicated, the proxy type must be Enterprise Dedicated.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Exclusive</p>
     */
    @NameInMap("ProxyType")
    public String proxyType;

    /**
     * <p>The region ID.</p>
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
     * <p>The maximum number of PCUs for a single-node serverless cluster to scale up to. Valid values: 1 to 32.</p>
     * <blockquote>
     * <p>This parameter is supported only for serverless clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ScaleMax")
    public String scaleMax;

    /**
     * <p>The minimum number of PolarDB compute units (PCUs) for a single-node serverless cluster to scale down to. Valid values: 1 to 31.</p>
     * <blockquote>
     * <p>This parameter is supported only for serverless clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScaleMin")
    public String scaleMin;

    /**
     * <p>The maximum number of read-only nodes that the serverless cluster scales up to. Valid values: 0 to 15.</p>
     * <blockquote>
     * <p>This parameter is supported only for serverless clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ScaleRoNumMax")
    public String scaleRoNumMax;

    /**
     * <p>The minimum number of read-only nodes that the serverless cluster scales down to. Valid values: 0 to 15.</p>
     * <blockquote>
     * <p>This parameter is supported only for serverless clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ScaleRoNumMin")
    public String scaleRoNumMin;

    /**
     * <p>The IP whitelist of the PolarDB cluster.</p>
     * <blockquote>
     * <p>You can specify multiple IP addresses in the IP whitelist. Separate the IP addresses with commas (,).</p>
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
     * <p>This parameter is supported only for serverless clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AgileServerless</p>
     */
    @NameInMap("ServerlessType")
    public String serverlessType;

    /**
     * <p>The ID of the source ApsaraDB RDS instance or source PolarDB cluster. This parameter is required only if <strong>CreationOption</strong> is set to <strong>MigrationFromRDS</strong>, <strong>CloneFromRDS</strong>, <strong>CloneFromPolarDB</strong>, or <strong>RecoverFromRecyclebin</strong>.</p>
     * <ul>
     * <li><p>If <strong>CreationOption</strong> is set to <strong>MigrationFromRDS</strong> or <strong>CloneFromRDS</strong>, specify the ID of the source ApsaraDB RDS instance. The source ApsaraDB RDS instance must be ApsaraDB RDS for MySQL 5.6, 5.7, or 8.0 High-availability Edition.</p>
     * </li>
     * <li><p>If <strong>CreationOption</strong> is set to <strong>CloneFromPolarDB</strong>, specify the ID of the source PolarDB cluster. The new cluster must use the same database engine as the source cluster. For example, if the source cluster runs MySQL 8.0, you must set <strong>DBType</strong> to <strong>MySQL</strong> and <strong>DBVersion</strong> to <strong>8.0</strong> for the new cluster.</p>
     * </li>
     * <li><p>If <strong>CreationOption</strong> is set to <strong>RecoverFromRecyclebin</strong>, specify the ID of the released source PolarDB cluster. The restored cluster must use the same database engine as the source cluster. For example, if the source cluster runs MySQL 8.0, you must set <strong>DBType</strong> to <strong>MySQL</strong> and <strong>DBVersion</strong> to <strong>8.0</strong> for the restored cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rm-*************</p>
     */
    @NameInMap("SourceResourceId")
    public String sourceResourceId;

    /**
     * <p>The UID of the source backup set owner in cross-account backup and restoration scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>1022xxxxxxxx</p>
     */
    @NameInMap("SourceUid")
    public Long sourceUid;

    /**
     * <p>The zone for the hot standby cluster.</p>
     * <blockquote>
     * <p>This parameter is valid only when the hot standby cluster feature or multi-AZ strong consistency is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("StandbyAZ")
    public String standbyAZ;

    /**
     * <p>Specifies whether to enable automatic storage scaling for a Standard Edition cluster. Valid values:</p>
     * <ul>
     * <li><p>Enable: enables automatic storage scaling.</p>
     * </li>
     * <li><p>Disable: disables automatic storage scaling.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    /**
     * <p>Specifies whether to enable cloud disk encryption. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables cloud disk encryption.</p>
     * </li>
     * <li><p><strong>false</strong> (default): disables cloud disk encryption.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only if <strong>DBType</strong> is set to <strong>MySQL</strong>.</p>
     * </blockquote>
     * <blockquote>
     * <p>This parameter is valid only if <strong>StorageType</strong> is set to a Standard Edition storage type.</p>
     * </blockquote>
     */
    @NameInMap("StorageEncryption")
    public Boolean storageEncryption;

    /**
     * <p>The ID of a custom key from Key Management Service (KMS) for cloud disk encryption. The key must be in the same region as the cluster. If you specify this parameter, cloud disk encryption is automatically enabled and cannot be disabled. If this parameter is empty, the default service key is used.</p>
     * <p>You can view the key ID or create a new key in the Key Management Service (KMS) console.</p>
     * <blockquote>
     * <p>This parameter is valid only if <strong>DBType</strong> is set to <strong>MySQL</strong>.</p>
     * </blockquote>
     * <blockquote>
     * <p>This parameter is valid only if <strong>StorageType</strong> is set to a Standard Edition storage type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1022xxxxxxxx</p>
     */
    @NameInMap("StorageEncryptionKey")
    public String storageEncryptionKey;

    /**
     * <p>The billing method for storage. Valid values:</p>
     * <ul>
     * <li><p>Postpaid: pay-by-capacity (a pay-as-you-go method).</p>
     * </li>
     * <li><p>Prepaid: pay-by-space (a subscription method).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("StoragePayType")
    public String storagePayType;

    /**
     * <p>The storage space for a pay-by-space (subscription) cluster. Unit: GB.</p>
     * <blockquote>
     * <ul>
     * <li><p>Valid values for a PolarDB for MySQL Enterprise Edition cluster: 10 to 50000.</p>
     * </li>
     * <li><p>Valid values for a PolarDB for MySQL Standard Edition cluster: 20 to 64000.</p>
     * </li>
     * <li><p>If the storage type of a Standard Edition cluster is ESSD AutoPL, the storage space must be a multiple of 10 between 40 and 64000.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("StorageSpace")
    public Long storageSpace;

    /**
     * <p>Valid values for Enterprise Edition:</p>
     * <ul>
     * <li><p><strong>PSL5</strong></p>
     * </li>
     * <li><p><strong>PSL4</strong></p>
     * </li>
     * </ul>
     * <p>Valid values for Standard Edition:</p>
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
     * <p>PSL4</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The maximum storage capacity for a Standard Edition cluster when automatic storage scaling is enabled. Unit: GB.</p>
     * <blockquote>
     * <p>The maximum value is 32000.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("StorageUpperBound")
    public Long storageUpperBound;

    /**
     * <p>Specifies whether to enable multi-AZ strong consistency for the cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>ON</strong>: enables multi-AZ strong consistency. This feature is applicable to Standard Edition clusters that are deployed across three zones.</p>
     * </li>
     * <li><p><strong>OFF</strong>: disables multi-AZ strong consistency.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("StrictConsistency")
    public String strictConsistency;

    /**
     * <p>Specifies whether to enable transparent data encryption (TDE). Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables TDE.</p>
     * </li>
     * <li><p><strong>false</strong> (default): disables TDE.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is valid only when <strong>DBType</strong> is set to <strong>PostgreSQL</strong> or <strong>Oracle</strong>.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/167982.html">ModifyDBClusterTDE</a> operation to enable TDE for a PolarDB for MySQL cluster.</p>
     * </li>
     * <li><p>TDE cannot be disabled after it is enabled.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TDEStatus")
    public Boolean TDEStatus;

    /**
     * <p>The tags to add to the cluster.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDBClusterRequestTag> tag;

    /**
     * <p>The target minor engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0.1.1.54</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <p>The subscription duration. This parameter is required if you set the <strong>PayType</strong> parameter to <strong>Prepaid</strong>.</p>
     * <ul>
     * <li><p>If <strong>Period</strong> is set to <strong>Month</strong>, <strong>UsedTime</strong> must be an integer from <code>[1-9]</code>.</p>
     * </li>
     * <li><p>If <strong>Period</strong> is set to <strong>Year</strong>, <strong>UsedTime</strong> must be an integer from <code>[1-3]</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-**********</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the VSwitch.</p>
     * <blockquote>
     * <p>If you specify the VPCId parameter, you must also specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-**********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query available zones.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
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

    public CreateDBClusterRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateDBClusterRequest setBackupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
        this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
        return this;
    }
    public String getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    public CreateDBClusterRequest setBurstingEnabled(String burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public String getBurstingEnabled() {
        return this.burstingEnabled;
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

    public CreateDBClusterRequest setCloudProvider(String cloudProvider) {
        this.cloudProvider = cloudProvider;
        return this;
    }
    public String getCloudProvider() {
        return this.cloudProvider;
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

    public CreateDBClusterRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
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

    public CreateDBClusterRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
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

    public CreateDBClusterRequest setSourceUid(Long sourceUid) {
        this.sourceUid = sourceUid;
        return this;
    }
    public Long getSourceUid() {
        return this.sourceUid;
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

    public CreateDBClusterRequest setStorageEncryption(Boolean storageEncryption) {
        this.storageEncryption = storageEncryption;
        return this;
    }
    public Boolean getStorageEncryption() {
        return this.storageEncryption;
    }

    public CreateDBClusterRequest setStorageEncryptionKey(String storageEncryptionKey) {
        this.storageEncryptionKey = storageEncryptionKey;
        return this;
    }
    public String getStorageEncryptionKey() {
        return this.storageEncryptionKey;
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

    public CreateDBClusterRequest setTargetMinorVersion(String targetMinorVersion) {
        this.targetMinorVersion = targetMinorVersion;
        return this;
    }
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
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
         * <p>The key of the tag.</p>
         * <blockquote>
         * <p>You can add up to 20 tags at a time. The Nth tag is a key-value pair, where <code>Tag.N.Key</code> is the key and <code>Tag.N.Value</code> is the value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>type</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <blockquote>
         * <p>You can add up to 20 tags at a time. The Nth tag is a key-value pair, where <code>Tag.N.Key</code> is the key and <code>Tag.N.Value</code> is the value.</p>
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
