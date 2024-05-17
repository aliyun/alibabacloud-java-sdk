// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the no-activity suspension feature. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>> This parameter is valid only for serverless clusters.</p>
     */
    @NameInMap("AllowShutDown")
    public String allowShutDown;

    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>Specifies whether to enable automatic renewal. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>Default value: **false**.</p>
     * <br>
     * <p>> This parameter is valid only when the **PayType** parameter is set to **Prepaid**.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The retention policy for the backup sets when you delete the cluster. Valid values:</p>
     * <br>
     * <p>*   **ALL**: permanently retains all backups.</p>
     * <p>*   **LATEST**: permanently retains the last backup. A backup is automatically created before you delete the cluster.</p>
     * <p>*   **NONE**: No backup sets are retained after the cluster is deleted.</p>
     * <br>
     * <p>The default value is **NONE** after you create a cluster.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is valid only when the **DBType** parameter is set to **MySQL**.</p>
     * <br>
     * <p>*   This parameter is invalid for serverless clusters.</p>
     */
    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public String backupRetentionPolicyOnClusterDeletion;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. The token is case-sensitive.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The point in time when you want to clone data. Valid values:</p>
     * <br>
     * <p>*   **LATEST**: The data of the latest point in time is cloned.</p>
     * <p>*   **BackupID**: You can specify the ID of a backup set. In this case, data is cloned based on the specified backup set.</p>
     * <p>*   **Timestamp**: You can specify a point in time in the past in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.</p>
     * <br>
     * <p>Default value: **LATEST**.</p>
     * <br>
     * <p>> If the **CreationOption** parameter is set to **CloneFromRDS**, the value of this parameter must be **LATEST**.</p>
     */
    @NameInMap("CloneDataPoint")
    public String cloneDataPoint;

    /**
     * <p>The network type of the cluster. Only virtual private clouds (VPCs) are supported. Set the value to **VPC**.</p>
     */
    @NameInMap("ClusterNetworkType")
    public String clusterNetworkType;

    /**
     * <p>The edition of the cluster. Default value: Normal. Valid values:</p>
     * <br>
     * <p>*   **Normal**: Cluster Edition</p>
     * <p>*   **Basic**: Single Node Edition</p>
     * <p>*   **ArchiveNormal**: X-Engine Edition</p>
     * <p>*   **NormalMultimaster**: Multi-master Cluster Edition</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   Only when the **DBType** parameter is set to **MySQL** and **the DBVersion** parameter is set to **5.6**, **5.7**, or **8.0**, you can set this parameter to **Basic**.</p>
     * <br>
     * <p>*   Only when the **DBType** parameter is set to **MySQL** and the **DBVersion** parameter is set to **8.0**, you can set this parameter to **ArchiveNormal** or **NormalMultimaster**.</p>
     * <br>
     * <p>For more information, see [Product editions](https://help.aliyun.com/document_detail/183258.html).</p>
     */
    @NameInMap("CreationCategory")
    public String creationCategory;

    /**
     * <p>The method that is used to create a cluster. Valid values:</p>
     * <br>
     * <p>*   **Normal**: creates a PolarDB cluster. For more information about how to perform this operation in the console, see the following topics:</p>
     * <br>
     * <p>    *   [Create a PolarDB for MySQL cluster](https://help.aliyun.com/document_detail/58769.html)</p>
     * <p>    *   [Create a PolarDB for PostgreSQL cluster](https://help.aliyun.com/document_detail/118063.html)</p>
     * <p>    *   [Create a PolarDB for Oracle cluster](https://help.aliyun.com/document_detail/118182.html)</p>
     * <br>
     * <p>*   **CloneFromPolarDB**: clones data from an existing PolarDB cluster to a new PolarDB cluster. For more information about how to perform this operation in the console, see the following topics:</p>
     * <br>
     * <p>    *   [Clone a PolarDB for MySQL cluster](https://help.aliyun.com/document_detail/87966.html)</p>
     * <p>    *   [Clone a PolarDB for PostgreSQL cluster](https://help.aliyun.com/document_detail/118108.html)</p>
     * <p>    *   [Clone a PolarDB for Oracle cluster](https://help.aliyun.com/document_detail/118221.html)</p>
     * <br>
     * <p>*   **CloneFromRDS**: clones data from an existing ApsaraDB RDS for MySQL instance to a new PolarDB for MySQL cluster. For more information about how to perform this operation in the console, see [Create a PolarDB for MySQL cluster by cloning an ApsaraDB RDS for MySQL instance](https://help.aliyun.com/document_detail/121812.html).</p>
     * <br>
     * <p>*   **MigrationFromRDS**: migrates data from an existing ApsaraDB RDS for MySQL instance to a new PolarDB for MySQL cluster. By default, the created PolarDB cluster is in read-only mode, and the binary logging feature is enabled. For more information about how to perform this operation in the console, see [Create a PolarDB for MySQL cluster from an ApsaraDB RDS for MySQL instance](https://help.aliyun.com/document_detail/121582.html).</p>
     * <br>
     * <p>*   **CreateGdnStandby**: creates a secondary cluster. For more information about how to perform this operation in the console, see [Add a secondary cluster](https://help.aliyun.com/document_detail/160381.html).</p>
     * <br>
     * <p>Default value: **Normal**.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If the **DBType** parameter is set to **MySQL** and the **DBVersion** parameter is set to **5.6** or **5.7**, this parameter can be set to **CloneFromRDS** or **MigrationFromRDS**.</p>
     * <br>
     * <p>*   If the **DBType** parameter is set to **MySQL** and the **DBVersion** parameter is set to **8.0**, this parameter can be set to **CreateGdnStandby**.</p>
     */
    @NameInMap("CreationOption")
    public String creationOption;

    /**
     * <p>The name of the cluster. The name must meet the following requirements:</p>
     * <br>
     * <p>*   It cannot start with `http://` or `https://`.</p>
     * <p>*   It must be 2 to 256 characters in length.</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The minor version of the database engine. Valid values:</p>
     * <br>
     * <p>*   **8.0.2**</p>
     * <p>*   **8.0.1**</p>
     * <br>
     * <p>> This parameter is valid only when the **DBType** parameter is set to **MySQL** and the **DBVersion** parameter is set to **8.0**.</p>
     */
    @NameInMap("DBMinorVersion")
    public String DBMinorVersion;

    /**
     * <p>The specifications of the node.</p>
     * <br>
     * <p>*   For more information about specifications supported by PolarDB for MySQL, see [Specifications of compute nodes](https://help.aliyun.com/document_detail/102542.html).</p>
     * <p>*   For information about node specifications supported by the Oracle database engine, see [Specifications of compute nodes](https://help.aliyun.com/document_detail/207921.html).</p>
     * <p>*   For information about node specifications supported by the PostgreSQL database engine, see [Specifications of compute nodes](https://help.aliyun.com/document_detail/209380.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <p>标准版节点个数。</p>
     */
    @NameInMap("DBNodeNum")
    public Integer DBNodeNum;

    /**
     * <p>The type of the database engine. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **PostgreSQL**</p>
     * <p>*   **Oracle**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the database engine.</p>
     * <br>
     * <p>*   Valid values for the MySQL database engine:</p>
     * <br>
     * <p>    *   **5.6**</p>
     * <p>    *   **5.7**</p>
     * <p>    *   **8.0**</p>
     * <br>
     * <p>*   Valid values for the PostgreSQL database engine:</p>
     * <br>
     * <p>    *   **11**</p>
     * <p>    *   **14**</p>
     * <br>
     * <p>*   Valid value for the Oracle database engine: **11**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The time zone of the cluster. The time must be in UTC. You can set the parameter to a value that is on the hour from **-12:00 to +13:00**. Example: 00:00. Default value: **SYSTEM**, which means that the value is the same as the time zone of the region.</p>
     * <br>
     * <p>> This parameter is valid only when the **DBType** parameter is set to **MySQL**.</p>
     */
    @NameInMap("DefaultTimeZone")
    public String defaultTimeZone;

    /**
     * <p>The ID of the Global Database Network (GDN).</p>
     * <br>
     * <p>> This parameter is required only when the **CreationOption** parameter is set to **CreateGdnStandby**.</p>
     */
    @NameInMap("GDNId")
    public String GDNId;

    @NameInMap("HotStandbyCluster")
    public String hotStandbyCluster;

    /**
     * <p>开启Binlog功能，取值范围如下：</p>
     * <br>
     * <p>- **ON**：集群开启Binlog功能</p>
     * <p>- **OFF**：集群关闭Binlog功能</p>
     * <p>> 当参数**DBType**为**MySQL**时，该参数才生效。</p>
     */
    @NameInMap("LoosePolarLogBin")
    public String loosePolarLogBin;

    /**
     * <p>开启X-Engine存储引擎功能，取值范围如下：</p>
     * <br>
     * <p>- **ON**：集群开启X-Engine引擎</p>
     * <p>- **OFF**：集群关闭X-Engine引擎</p>
     * <p>> 当参数**CreationOption**不等于**CreateGdnStandby**，**DBType**为**MySQL**且**DBVersion**为**8.0**时，该参数才生效。开启X-Engine引擎的节点内存规格必须大于等于16 GB。</p>
     */
    @NameInMap("LooseXEngine")
    public String looseXEngine;

    /**
     * <p>设置开启X-Engine存储引擎比例，取值范围10~90的整数。</p>
     * <p>> 当参数**LooseXEngine**为**ON**时，该参数才生效。</p>
     */
    @NameInMap("LooseXEngineUseMemoryPct")
    public String looseXEngineUseMemoryPct;

    /**
     * <p>Specifies whether the table names are case-sensitive. Valid values:</p>
     * <br>
     * <p>*   **1**: The table names are case-insensitive.</p>
     * <p>*   **0**: The table names are case-sensitive.</p>
     * <br>
     * <p>Default value: **1**.</p>
     * <br>
     * <p>> This parameter is valid only when the **DBType** parameter is set to **MySQL**.</p>
     */
    @NameInMap("LowerCaseTableNames")
    public String lowerCaseTableNames;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the parameter template.</p>
     * <br>
     * <p>> You can call the [DescribeParameterGroups](https://help.aliyun.com/document_detail/207178.html) operation to query the details of all parameter templates of a specified region, such as the ID of a parameter template.</p>
     */
    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go</p>
     * <p>*   **Prepaid**: subscription</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription type of the subscription cluster. This parameter is required only when the PayType parameter is set to **Prepaid**. Valid values:</p>
     * <br>
     * <p>*   **Year**: annual subscription. Unit: years.</p>
     * <p>*   **Month**: monthly subscription. Unit: months.</p>
     */
    @NameInMap("Period")
    public String period;

    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    /**
     * <p>标准版数据库代理规格。</p>
     */
    @NameInMap("ProxyClass")
    public String proxyClass;

    /**
     * <p>数据库代理类型，取值范围如下：</p>
     * <br>
     * <p>- **Exclusive**：企业独享版</p>
     * <p>- **General**：企业通用版</p>
     */
    @NameInMap("ProxyType")
    public String proxyType;

    /**
     * <p>The region ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](https://help.aliyun.com/document_detail/98041.html) operation to query available regions.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The maximum number of PCUs per node for scaling. Valid values: 1 PCU to 32 PCUs.</p>
     * <br>
     * <p>> This parameter is valid only for serverless clusters.</p>
     */
    @NameInMap("ScaleMax")
    public String scaleMax;

    /**
     * <p>The minimum number of PCUs per node for scaling. Valid values: 1 PCU to 31 PCUs.</p>
     * <br>
     * <p>> This parameter is valid only for serverless clusters.</p>
     */
    @NameInMap("ScaleMin")
    public String scaleMin;

    /**
     * <p>The maximum number of read-only nodes for scaling. Valid values: 0 to 15.</p>
     * <br>
     * <p>> This parameter is valid only for serverless clusters.</p>
     */
    @NameInMap("ScaleRoNumMax")
    public String scaleRoNumMax;

    /**
     * <p>The minimum number of read-only nodes for scaling. Valid values: 0 to 15.</p>
     * <br>
     * <p>> This parameter is valid only for serverless clusters.</p>
     */
    @NameInMap("ScaleRoNumMin")
    public String scaleRoNumMin;

    /**
     * <p>The IP whitelist of the cluster.</p>
     * <br>
     * <p>> The whitelist can contain multiple IP addresses. Separate multiple IP addresses with commas (,).</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The type of the serverless cluster. Set the value to **AgileServerless**.</p>
     * <br>
     * <p>> This parameter is valid only for serverless clusters.</p>
     */
    @NameInMap("ServerlessType")
    public String serverlessType;

    /**
     * <p>The ID of the source ApsaraDB RDS instance or PolarDB cluster. This parameter is required only when the **CreationOption** parameter is set to **MigrationFromRDS**, **CloneFromRDS**, or **CloneFromPolarDB**.</p>
     * <br>
     * <p>*   If the **CreationOption** parameter is set to **MigrationFromRDS** or **CloneFromRDS**, you must set this parameter to the ID of the source ApsaraDB RDS instance. The source ApsaraDB RDS instance must use ApsaraDB RDS for MySQL 5.6, 5.7, or 8.0 High-availability Edition.</p>
     * <p>*   If the **CreationOption** parameter is set to **CloneFromPolarDB**, you must set this parameter to the ID of the source PolarDB cluster. By default, the value of DBType of the destination cluster must be the same as that of the source cluster. For example, if a MySQL 8.0 cluster is used as the source cluster, you must set the **DBType** parameter to **MySQL** and the **DBVersion** parameter to **8.0** for the destination cluster.</p>
     */
    @NameInMap("SourceResourceId")
    public String sourceResourceId;

    /**
     * <p>存储热备集群的可用区。适用于标准版3AZ场景。</p>
     * <br>
     * <p>> 开启了多可用区数据强一致，该参数才生效。</p>
     */
    @NameInMap("StandbyAZ")
    public String standbyAZ;

    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    @NameInMap("StoragePayType")
    public String storagePayType;

    /**
     * <p>The storage space that uses the subscription billing method. Unit: GB.</p>
     */
    @NameInMap("StorageSpace")
    public Long storageSpace;

    /**
     * <p>The storage type. Valid values for Enterprise Edition:</p>
     * <br>
     * <p>*   **PSL5**</p>
     * <p>*   **PSL4**</p>
     * <br>
     * <p>Valid values for Standard Edition:</p>
     * <br>
     * <p>*   **ESSDPL1**</p>
     * <p>*   **ESSDPL2**</p>
     * <p>*   **ESSDPL3**</p>
     * <br>
     * <p>> This parameter is invalid for serverless clusters.</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("StorageUpperBound")
    public Long storageUpperBound;

    /**
     * <p>集群是否开启了多可用区数据强一致。取值范围：</p>
     * <br>
     * <p>- **ON**：表示开启了多可用区数据强一致，适用于标准版3AZ场景。</p>
     * <br>
     * <p>- **OFF**：表示未开启多可用区数据强一致。</p>
     */
    @NameInMap("StrictConsistency")
    public String strictConsistency;

    /**
     * <p>Specifies whether to enable transparent data encryption (TDE). Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is valid only when the **DBType** parameter is set to **PostgreSQL** or **Oracle**.</p>
     * <br>
     * <p>*   You can call the [ModifyDBClusterTDE](https://help.aliyun.com/document_detail/167982.html) operation to enable TDE for a PolarDB for MySQL cluster.</p>
     * <p>*   TDE cannot be disabled after it is enabled.</p>
     */
    @NameInMap("TDEStatus")
    public Boolean TDEStatus;

    /**
     * <p>1</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDBClusterRequestTag> tag;

    /**
     * <p>*   If the **Period** parameter is set to **Month**, the **UsedTime** parameter can be set to `1, 2, 3, 4, 5, 6, 7, 8, or 9`.</p>
     * <p>*   If the **Period** parameter is set to **Year**, the **UsedTime** parameter can be set to `1, 2, or 3`.</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The virtual private cloud (VPC) ID of the cluster.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the cluster.</p>
     * <br>
     * <p>> If the VPCId parameter is specified, the VSwitchId parameter is required.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](https://help.aliyun.com/document_detail/98041.html) operation to query available zones.</p>
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
         * <p>The key of the tag that you want to create for the cluster. To create multiple tags for a cluster at a time, click the **+** icon.</p>
         * <br>
         * <p>> You can create up to 20 key-value pairs of tags at a time. Each value of the `Tag.N.Key` parameter is paired with a value of the `Tag.N.Value` parameter.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that you want to create for the cluster. To create multiple tags for a cluster at a time, click the **+** icon.</p>
         * <br>
         * <p>> You can create up to 20 key-value pairs of tags at a time. Each value of the `Tag.N.Value` parameter is paired with a value of the `Tag.N.Key` parameter.</p>
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
