// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The number of ApsaraDB RDS for MySQL instances that you want to create. The parameter takes effect only when you create multiple ApsaraDB RDS for MySQL instances at a time by using a single request.</p>
     * <br>
     * <p>Valid values: **1** to **20**. Default value: **1**.</p>
     * <br>
     * <p>> *   If you want to create multiple ApsaraDB RDS for MySQL instances at a time by using a single request, you can add tags to all the instances by using the **Tag.Key** parameter and the **Tag.Value** parameter. After the instances are created, you can manage the instances based on the tags.</p>
     * <p>> *   After you submit a request to create multiple ApsaraDB RDS for MySQL instances, this operation returns **TaskId**, **RequestId**, and **Message**. You can call the [DescribeDBInstanceAttribute](~~610394~~) operation to query the details of an instance.</p>
     * <p>> *   If the value of the **Engine** parameter is not **MySQL** and the value of the Amount parameter is greater than **1**, this operation fails and returns an error code `InvalidParam.Engine`.</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to automatically complete the payment. Default value: true. Valid values:</p>
     * <br>
     * <p>*   **true**: automatically completes the payment. You must make sure that your account balance is sufficient.</p>
     * <p>*   **false**: does not automatically complete the payment. An unpaid order is generated.</p>
     * <br>
     * <p>>  Default value: true. If your account balance is insufficient, you can set AutoPay to false to generate an unpaid order. Then, you can pay for the order in the ApsaraDB RDS console.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. You must specify this parameter only if the instance uses the subscription billing method. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>> *   The auto-renewal cycle is one month for a monthly subscription.</p>
     * <p>> *   The auto-renewal cycle is one year for a yearly subscription.</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The configuration of the Babelfish feature for the instance that runs PostgreSQL.</p>
     * <br>
     * <p>Format:{"babelfishEnabled":"true","migrationMode":"xxxxxxx","masterUsername":"xxxxxxx","masterUserPassword":"xxxxxxxx"}</p>
     * <br>
     * <p>The following list describes the fields in the format:</p>
     * <br>
     * <p>*   **babelfishEnabled**: specifies whether to enable Babelfish for the instance. If you set this field to **true**, you enable Babelfish for the instance. If you leave this parameter empty, Babelfish is disabled for the instance.</p>
     * <p>*   **migrationMode**: The migration mode of the instance. Valid values: **single-db** and **multi-db**.</p>
     * <p>*   **masterUsername**: The username of the administrator account. The username can contain lowercase letters, digits, and underscores (\_). It must start with a letter and end with a letter or digit. It can be up to 63 characters in length and cannot start with pg.</p>
     * <p>*   **masterUserPassword**: The password of the administrator account. The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. It must be 8 to 32 characters in length. The password can contain any of the following characters: `! @ # $ % ^ & * ( ) _ + - =`.</p>
     * <br>
     * <p>> : This parameter applies only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see [Introduction to Babelfish](~~428613~~).</p>
     */
    @NameInMap("BabelfishConfig")
    public String babelfishConfig;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("BpeEnabled")
    public String bpeEnabled;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>The additional business information about the instance.</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <br>
     * <p>*   Regular RDS instance</p>
     * <br>
     * <p>    *   **Basic**: RDS Basic Edition.</p>
     * <p>    *   **HighAvailability**: RDS High-availability Edition.</p>
     * <p>    *   **cluster**: RDS Cluster Edition for ApsaraDB RDS for MySQL.</p>
     * <p>    *   **AlwaysOn**: RDS Cluster Edition for ApsaraDB RDS for SQL Server.</p>
     * <p>    *   **Finance**: RDS Enterprise Edition.</p>
     * <br>
     * <p>*   Serverless instance</p>
     * <br>
     * <p>    *   **serverless_basic**: RDS Basic Edition. This edition is available only for instances that run MySQL and PostgreSQL.</p>
     * <p>    *   **serverless_standard**: RDS High-availability Edition. This edition is available only for instances that run MySQL and PostgreSQL.</p>
     * <p>    *   **serverless_ha**: RDS High-availability Edition for ApsaraDB RDS for SQL Server.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note** This parameter is required when you create a serverless instance.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The connection mode of the instance. Valid values:</p>
     * <br>
     * <p>*   **Standard**: standard mode</p>
     * <p>*   **Safe**: database proxy mode</p>
     * <br>
     * <p>ApsaraDB RDS automatically assigns a connection mode to the instance.</p>
     * <br>
     * <p>> : SQL Server 2012, SQL Server 2016, and SQL Server 2017 support only the standard mode.</p>
     */
    @NameInMap("ConnectionMode")
    public String connectionMode;

    /**
     * <p>The internal endpoint that is used to connect to the instance.</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The policy based on which multiple instances are created. The parameter takes effect only when the value of the **Amount** parameter is greater than 1. Valid values:</p>
     * <br>
     * <p>*   **Atomicity** (default): atomicity. The instances are all created together. If one instance cannot be created, none of the instances are created.</p>
     * <p>*   **Partial**: non-atomicity. Each instance is independently created. The failure in creating an instance does not affect the creation of the other instances.</p>
     */
    @NameInMap("CreateStrategy")
    public String createStrategy;

    /**
     * <p>The instance type of the instance. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~).</p>
     * <br>
     * <p>To create a serverless instance, set this parameter to one of the following values:</p>
     * <br>
     * <p>*   If you want to create a serverless instance that runs MySQL on RDS Basic Edition, set this parameter to **mysql.n2.serverless.1c**.</p>
     * <p>*   If you want to create a serverless instance that runs MySQL on RDS High-availability Edition, set this parameter to **mysql.n2.serverless.2c**.</p>
     * <p>*   If you want to create a serverless instance that runs SQL Server, set this parameter to **mssql.mem2.serverless.s2**.</p>
     * <p>*   If you want to create a serverless instance that runs PostgreSQL on RDS Basic Edition, set this parameter to **pg.n2.serverless.1c**.</p>
     * <p>*   If you want to create a serverless instance that runs PostgreSQL on RDS High-availability Edition, set this parameter to **pg.n2.serverless.2c**.</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance name. The name must be 2 to 255 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.</p>
     * <br>
     * <p>> : The name cannot start with http:// or https://.</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The network connection type of the instance. The value of this parameter is fixed as **Intranet**, indicating an internal network connection.</p>
     */
    @NameInMap("DBInstanceNetType")
    public String DBInstanceNetType;

    /**
     * <p>The storage capacity of the instance. Unit: GB. The storage capacity increases in increments of 5 GB. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~).</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <br>
     * <p>*   **local_ssd**: local SSD. This is the recommended storage type.</p>
     * <p>*   **cloud_ssd**: standard SSD. This storage type is not recommended. Standard SSDs are no longer available for purchase in some Alibaba Cloud regions.</p>
     * <p>*   **cloud_essd**: enhanced SSD (ESSD) of performance level 1 (PL1).</p>
     * <p>*   **cloud_essd2**: ESSD of PL2.</p>
     * <p>*   **cloud_essd3**: ESSD of PL3.</p>
     * <br>
     * <p>The default value of this parameter is determined by the instance type specified by the **DBInstanceClass** parameter.</p>
     * <br>
     * <p>*   If the instance type specifies the local SSD storage type, the default value of this parameter is **local_ssd**.</p>
     * <p>*   If the instance type specifies the standard SSD or ESSD storage type, the default value of this parameter is **cloud_essd**.</p>
     * <br>
     * <p>>  Serverless instances use only ESSDs of PL1. If you create a serverless instance, you must set this parameter to **cloud_essd**.</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>Specifies whether the table name is case-sensitive. Valid values:</p>
     * <br>
     * <p>*   **true**: Table names are not case-sensitive. This is the default value.</p>
     * <p>*   **false**: Table names are case-sensitive.</p>
     */
    @NameInMap("DBIsIgnoreCase")
    public String DBIsIgnoreCase;

    /**
     * <p>The ID of the parameter template. You can call the [DescribeParameterGroups](~~610588~~) operation to query the ID of the parameter template.</p>
     * <br>
     * <p>> : This parameter is available if you want to create an instance that runs MySQL or PostgreSQL . If you do not configure this parameter, the default parameter template is used. If you want to use a custom parameter template, you can customize a parameter template and set this parameter to the ID of the custom template. For more information, see [Create a parameter template](~~610585~~).</p>
     */
    @NameInMap("DBParamGroupId")
    public String DBParamGroupId;

    /**
     * <p>The time zone of the instance. This parameter takes effect only when you set the **Engine** parameter to **MySQL** or **PostgreSQL**.</p>
     * <br>
     * <p>*   If you set **Engine** to **MySQL**:</p>
     * <br>
     * <p>    *   The time zone of the instance is in UTC. Valid values: \*\*-12:59\*\* to **+13:00**.</p>
     * <p>    *   If the instance uses local SSDs, you can specify the name of the time zone. Example: Asia/Hong_Kong. For more information, see [Time zones](~~297356~~).</p>
     * <br>
     * <p>*   If you set **Engine** to **PostgreSQL**:</p>
     * <br>
     * <p>    *   The time zone of the instance is not in UTC. For more information, see [Time zones](~~297356~~).</p>
     * <p>    *   You can specify this parameter only when the instance runs PostgreSQL with standard SSDs or ESSDs.</p>
     * <br>
     * <p>> *   You can specify the time zone when you create a primary instance. You cannot specify the time zone when you create a read-only instance. Read-only instances inherit the time zone of their primary instance.</p>
     * <p>> *   If you do not specify this parameter, the system automatically assigns the default time zone of the region in which the instance resides.</p>
     */
    @NameInMap("DBTimeZone")
    public String DBTimeZone;

    /**
     * <p>The ID of the dedicated cluster to which the instance belongs.</p>
     * <br>
     * <p>If you create the instance in a dedicated cluster, you must specify this parameter.</p>
     * <br>
     * <p>*   You can call the [DescribeDedicatedHostGroups](~~610640~~) operation to query the details of a dedicated cluster.</p>
     * <p>*   If no dedicated clusters are created, you can call the [CreateDedicatedHostGroup](~~209828~~) operation to create a dedicated cluster.</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>Specifies whether to enable the release protection feature for the instance. This feature is available only for pay-as-you-go instances. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run but does not perform the actual request. The system checks items such as the request parameters, request format, service limits, and available resources.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, the instance is created.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the key that is used to encrypt data on standard SSDs or ESSDs in the region of the instance. If you specify the EncryptionKey parameter, cloud disk encryption is automatically enabled. In this case, you must also specify the **RoleARN** parameter. Cloud disk encryption cannot be disabled after it is enabled.</p>
     * <br>
     * <p>You can obtain the ID of the key from the Key Management Service (KMS) console. You can also create a key. For more information, see [Create a CMK](~~181610~~).</p>
     * <br>
     * <p>>  This parameter is optional when you create an ApsaraDB RDS for PostgreSQL instance. You need to only specify the **RoleARN** parameter to create an instance that has cloud disk encryption enabled by using the obtained key ID.</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The database engine of the instance. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **SQLServer**</p>
     * <p>*   **PostgreSQL**</p>
     * <p>*   **MariaDB**</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance.</p>
     * <br>
     * <p>*   Regular RDS instance</p>
     * <br>
     * <p>    *   Valid values when you set Engine to MySQL: **5.5**, **5.6**, **5.7**, and **8.0**</p>
     * <p>    *   Valid values when you set Engine to SQLServer: **08r2\_ent_ha**(cloud disks, discontinued), **2008r2**(local disks, discontinued), **2012**(SQL Server EE Basic), **2012\_ent_ha**, **2012\_std_ha**, **2012\_web**, **2014\_ent_ha**, **2014\_std_ha**, **2016\_ent_ha**, **2016\_std_ha**, **2016\_web**, **2017\_ent**, **2017\_std_ha**, **2017\_web**, **2019\_ent**, **2019\_std_ha**, **2019\_web**, **2022\_ent**, **2022\_std_ha**, and **2022\_web**</p>
     * <p>    *   Valid values when you set Engine to PostgreSQL: **10.0**, **11.0**, **12.0**, **13.0**, **14.0**, and **15.0**</p>
     * <p>    *   Valid value when you set Engine to MariaDB: **10.3**</p>
     * <br>
     * <p>*   Serverless instance</p>
     * <br>
     * <p>    *   Valid values when you set Engine to MySQL: **5.7** and **8.0**</p>
     * <p>    *   Valid values when you set Engine to SQLServer: **2016\_std_sl**, **2017\_std_sl**, and **2019\_std_sl**</p>
     * <p>    *   Valid value when you set Engine to PostgreSQL: **14.0**</p>
     * <br>
     * <p><!----></p>
     * <br>
     * <p>*   ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     * <p>*   For ApsaraDB RDS for SQL Server instances, `_ent` indicates SQL Server EE on RDS Cluster Edition, `_ent_ha` indicates SQL Server EE, `_std_ha` indicates SQL Server SE, and `_web` indicates SQL Server Web.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     * <br>
     * <p>*   Valid value if you set Engine to SQL Server: `_ent` specifies SQL Server EE on RDS Cluster Edition, `_ent_ha` specifies SQL Server EE, `_std_ha` specifies SQL Server SE, and `_web` specifies SQL Server Web.</p>
     * <br>
     * <p>*   RDS instances that run SQL Server 2014 are not available for purchase on the international site.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <br>
     * <p>*   **VPC**: virtual private cloud (VPC).</p>
     * <p>*   **Classic**: the classic network</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If the instance runs MySQL and uses cloud disks, you must set this parameter to **VPC**.</p>
     * <br>
     * <p>*   If the instance runs PostgreSQL or MariaDB, you must set this parameter to **VPC**.</p>
     * <br>
     * <p>*   RDS instances that run SQL Server Basic and SQL Server Web can reside in the classic network and virtual private clouds (VPCs). If the instance runs other database engines, you must set this parameter to **VPC**.</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go.</p>
     * <p>*   **Prepaid**: subscription.</p>
     * <p>*   **Serverless**: serverless. This value is not supported for instances that run MariaDB. For more information, see [Overview of serverless ApsaraDB RDS for MySQL instances](~~411291~~), [Overview of serverless ApsaraDB RDS for SQL Server instances](~~604344~~), and [Overview of serverless ApsaraDB RDS for PostgreSQL instances](~~607742~~).</p>
     * <br>
     * <p>> : The system automatically generates a purchase order and completes the payment.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <br>
     * <p>*   **Year**</p>
     * <p>*   **Month**</p>
     * <br>
     * <p>>  If you set the PayType parameter to **Prepaid**, you must specify the UsedTime parameter.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The port. You can initialize the port when you create the instance.</p>
     * <br>
     * <p>*   Valid values if the instance runs MySQL: 1000 to 65534</p>
     * <p>*   Valid values if the instance runs PostgreSQL, SQL Server, or MariaDB: 1000 to 5999</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The private IP address of the instance. The private IP address must be within the CIDR block that is supported by the specified vSwitch. ApsaraDB RDS automatically assigns a private IP address to the instance based on the values of the **VPCId** and **vSwitchId** parameters.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~610399~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) that is provided by your Alibaba Cloud account for RAM users. RAM users can use the ARN to connect ApsaraDB RDS to KMS. You can call the [CheckCloudResourceAuthorized](~~610408~~) operation to query the ARN.</p>
     */
    @NameInMap("RoleARN")
    public String roleARN;

    /**
     * <p>The IP address whitelist of the instance. For more information, see [Use a database client or the CLI to connect to an ApsaraDB RDS for MySQL instance](~~43185~~). If the IP address whitelist contains more than one entry, separate the entries with commas (,). Each entry must be unique. The IP address whitelist can contain up to 1,000 entries. The entries in the IP address whitelist must be in one of the following formats:</p>
     * <br>
     * <p>*   IP addresses, such as 10.10.XX.XX.</p>
     * <p>*   CIDR blocks, such as 10.10.XX.XX/24. In this example, 24 indicates that the prefix of each IP address in the IP address whitelist is 24 bits in length. You can replace 24 with a value within the range of 1 to 32.</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The settings of the serverless instance. This parameter is required when you create a serverless instance.</p>
     * <br>
     * <p>>  ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     */
    @NameInMap("ServerlessConfig")
    public String serverlessConfigShrink;

    /**
     * <p>Specifies whether to enable the automatic storage expansion feature for the instance. This feature is supported if your RDS instance runs MySQL or PostgreSQL. Valid values:</p>
     * <br>
     * <p>*   **Enable**</p>
     * <p>*   **Disable** (default)</p>
     * <br>
     * <p>>  After the instance is created, you can call the [ModifyDasInstanceConfig](~~610391~~) operation to adjust the settings of automatic storage expansion for the instance. For more information, see [Configure automatic storage expansion for an ApsaraDB RDS for MySQL instance](~~173826~~).</p>
     */
    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    /**
     * <p>The threshold in percentage based on which automatic storage expansion is triggered.</p>
     * <br>
     * <p>*   **10**</p>
     * <p>*   **20**</p>
     * <p>*   **30**</p>
     * <p>*   **40**</p>
     * <p>*   **50**</p>
     * <br>
     * <p>>  If you set the **StorageAutoScale** parameter to **Enable**, you must specify this parameter.</p>
     */
    @NameInMap("StorageThreshold")
    public Integer storageThreshold;

    /**
     * <p>The maximum storage capacity that is allowed for automatic storage expansion. The storage capacity of the instance cannot exceed the maximum storage capacity. Unit: GB.</p>
     * <br>
     * <p>> *   Valid values: an integer greater than or equal to 0.</p>
     * <p>> *   If you set **StorageAutoScale** to **Enable**, you must specify this parameter.</p>
     */
    @NameInMap("StorageUpperBound")
    public Integer storageUpperBound;

    /**
     * <p>A deprecated parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("SystemDBCharset")
    public String systemDBCharset;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDBInstanceShrinkRequestTag> tag;

    /**
     * <p>The ID of the host to which the logger instance belongs in the specified dedicated cluster.</p>
     * <br>
     * <p>If you want to create an instance that runs RDS Enterprise Edition in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.</p>
     * <br>
     * <p>*   You can call the [DescribeDedicatedHosts](~~610641~~) operation to query the details of the hosts in a dedicated cluster.</p>
     * <p>*   If no hosts are created, you can call the [CreateDedicatedHost](~~210864~~) operation to create a host.</p>
     */
    @NameInMap("TargetDedicatedHostIdForLog")
    public String targetDedicatedHostIdForLog;

    /**
     * <p>The ID of the host to which the instance belongs in the specified dedicated cluster.</p>
     * <br>
     * <p>If you create the instance in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.</p>
     * <br>
     * <p>*   You can call the [DescribeDedicatedHost](~~610641~~) operation to query the details about the hosts in a dedicated cluster.</p>
     * <p>*   If no hosts are created, you can call the [CreateDedicatedHost](~~210864~~) operation to create a host.</p>
     */
    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    /**
     * <p>The ID of the host to which the secondary instance belongs in the specified dedicated cluster.</p>
     * <br>
     * <p>If you want to create an instance that runs RDS High-availability Edition or RDS Enterprise Edition in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.</p>
     * <br>
     * <p>*   You can call the [DescribeDedicatedHosts](~~610641~~) operation to query the details of the hosts in a dedicated cluster.</p>
     * <p>*   If no hosts are created, you can call the [CreateDedicatedHost](~~210864~~) operation to create a host.</p>
     */
    @NameInMap("TargetDedicatedHostIdForSlave")
    public String targetDedicatedHostIdForSlave;

    /**
     * <p>The minor engine version of the instance. This parameter is required only when you create an instance that runs MySQL or PostgreSQL. The value format varies based on the database engine of the instance.</p>
     * <br>
     * <p>*   If you create an instance that runs MySQL, the value is in the following format: `<RDS edition>_<Minor engine version>`. Examples: `rds_20200229`, `xcluster_20200229`, and `xcluster80_20200229`. The following list describes the fields in the example values:</p>
     * <br>
     * <p>    *   rds: The instance runs RDS Basic Edition or RDS High-availability Edition.</p>
     * <p>    *   xcluster: The instance runs MySQL 5.7 on RDS Enterprise Edition.</p>
     * <p>    *   xcluster80: The instance runs MySQL 8.0 on RDS Enterprise Edition.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note** You can call the [DescribeDBMiniEngineVersions](~~610643~~) operation to query the minor engine version. For more information about minor engine versions, see [Release notes of minor AliSQL versions](~~96060~~).</p>
     * <br>
     * <p>*   If you create an instance that runs PostgreSQL, the value is in the following format: `rds_postgres_<Major engine version>00_<Minor engine version>`. Example: `rds_postgres_1400_20220830`. The following list describes the fields in the example values:</p>
     * <br>
     * <p>    *   1400: The major engine version is PostgreSQL 14.</p>
     * <p>    *   20220830: the AliPG version. You can call the [DescribeDBMiniEngineVersions](~~610643~~) operation to query the AliPG version. For more information about minor engine versions, see [Release notes for AliPG](~~126002~~).</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note** If you configure the **BabelfishConfig** parameter for your instance that runs PostgreSQL and set the babelfishEnabled field to true, the value of this parameter is in the following format: `rds_postgres_Major engine version00_AliPG version_babelfish`.</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <p>The subscription duration of the instance.</p>
     * <br>
     * <p>*   If you set the **Period** parameter to **Year**, the value of the **UsedTime** parameter ranges from **1 to 5**.</p>
     * <p>*   If you set the **Period** parameter to **Month**, the value of the **UsedTime** parameter ranges from **1 to 11**.</p>
     * <br>
     * <p>>  If you set the PayType parameter to **Prepaid**, you must specify the UsedTime parameter.</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The ID of the backup file. You can call the [ListUserBackupFiles](~~610600~~) operation to query backup files. If you want to create an instance by using the data of a backup file, you must specify this parameter.</p>
     * <br>
     * <p>This parameter is supported only when the following requirements are met:</p>
     * <br>
     * <p>*   The **PayType** parameter is set to **Postpaid**.</p>
     * <p>*   The **Engine** parameter is set to **MySQL**.</p>
     * <p>*   The **EngineVersion** parameter is set to **5.7**.</p>
     * <p>*   The **Category** parameter is set to **Basic**.</p>
     */
    @NameInMap("UserBackupId")
    public String userBackupId;

    /**
     * <p>The ID of the VPC to which the instance belongs.</p>
     * <br>
     * <p>> : This parameter is available when you set the **InstanceNetworkType** parameter to **VPC**.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch. The vSwitch must belong to the zone that is specified by **ZoneId**.</p>
     * <br>
     * <p>*   If you set **InstanceNetworkType** to **VPC**, you must also specify this parameter.</p>
     * <p>*   If you specify the ZoneSlaveId1 parameter, you must specify the IDs of two vSwitches for this parameter and separate the IDs with a comma (,).</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the primary instance.</p>
     * <br>
     * <p>*   If you specify a virtual private cloud (VPC) and a vSwitch, you must specify the ID of the zone to which the specified vSwitch belongs. Otherwise, the instance cannot be created.</p>
     * <p>*   If the instance runs RDS High-availability Edition, you must specify the **ZoneIdSlave1** parameter. The ZoneIdSlave1 parameter specifies whether to use the single-zone deployment method or the multi-zone deployment method.</p>
     * <p>*   If the instance runs RDS Enterprise Edition, you must specify the **ZoneIdSlave1** and **ZoneIdSlave2** parameters. The ZoneIdSlave1 and ZoneIdSlave2 parameters specify whether to use the single-zone deployment method or the multi-zone deployment method.</p>
     * <p>*   If the instance runs MySQL on RDS Cluster Edition, you must specify the **ZoneIdSlave1** parameter for the RDS cluster that has two nodes and the **ZoneIdSlave1** and **ZoneIdSlave2** parameters for the RDS cluster that has three nodes.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The zone ID of the secondary instance.</p>
     * <br>
     * <p>*   If you set this parameter to **Auto**, the multi-zone deployment method is used and the zone of the secondary instance is automatically configured.</p>
     * <p>*   If you set this parameter to the same value as the **ZoneId** parameter, the single-zone deployment method is used.</p>
     * <p>*   If you set this parameter to a value that is different from the value of the **ZoneId** parameter, the multiple-zone deployment method is used.</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("ZoneIdSlave2")
    public String zoneIdSlave2;

    public static CreateDBInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceShrinkRequest self = new CreateDBInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceShrinkRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateDBInstanceShrinkRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateDBInstanceShrinkRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateDBInstanceShrinkRequest setBabelfishConfig(String babelfishConfig) {
        this.babelfishConfig = babelfishConfig;
        return this;
    }
    public String getBabelfishConfig() {
        return this.babelfishConfig;
    }

    public CreateDBInstanceShrinkRequest setBpeEnabled(String bpeEnabled) {
        this.bpeEnabled = bpeEnabled;
        return this;
    }
    public String getBpeEnabled() {
        return this.bpeEnabled;
    }

    public CreateDBInstanceShrinkRequest setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public CreateDBInstanceShrinkRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateDBInstanceShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateDBInstanceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceShrinkRequest setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
        return this;
    }
    public String getConnectionMode() {
        return this.connectionMode;
    }

    public CreateDBInstanceShrinkRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public CreateDBInstanceShrinkRequest setCreateStrategy(String createStrategy) {
        this.createStrategy = createStrategy;
        return this;
    }
    public String getCreateStrategy() {
        return this.createStrategy;
    }

    public CreateDBInstanceShrinkRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CreateDBInstanceShrinkRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateDBInstanceShrinkRequest setDBInstanceNetType(String DBInstanceNetType) {
        this.DBInstanceNetType = DBInstanceNetType;
        return this;
    }
    public String getDBInstanceNetType() {
        return this.DBInstanceNetType;
    }

    public CreateDBInstanceShrinkRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public CreateDBInstanceShrinkRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public CreateDBInstanceShrinkRequest setDBIsIgnoreCase(String DBIsIgnoreCase) {
        this.DBIsIgnoreCase = DBIsIgnoreCase;
        return this;
    }
    public String getDBIsIgnoreCase() {
        return this.DBIsIgnoreCase;
    }

    public CreateDBInstanceShrinkRequest setDBParamGroupId(String DBParamGroupId) {
        this.DBParamGroupId = DBParamGroupId;
        return this;
    }
    public String getDBParamGroupId() {
        return this.DBParamGroupId;
    }

    public CreateDBInstanceShrinkRequest setDBTimeZone(String DBTimeZone) {
        this.DBTimeZone = DBTimeZone;
        return this;
    }
    public String getDBTimeZone() {
        return this.DBTimeZone;
    }

    public CreateDBInstanceShrinkRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public CreateDBInstanceShrinkRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateDBInstanceShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateDBInstanceShrinkRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public CreateDBInstanceShrinkRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDBInstanceShrinkRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDBInstanceShrinkRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public CreateDBInstanceShrinkRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDBInstanceShrinkRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDBInstanceShrinkRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateDBInstanceShrinkRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateDBInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBInstanceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBInstanceShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBInstanceShrinkRequest setRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }
    public String getRoleARN() {
        return this.roleARN;
    }

    public CreateDBInstanceShrinkRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateDBInstanceShrinkRequest setServerlessConfigShrink(String serverlessConfigShrink) {
        this.serverlessConfigShrink = serverlessConfigShrink;
        return this;
    }
    public String getServerlessConfigShrink() {
        return this.serverlessConfigShrink;
    }

    public CreateDBInstanceShrinkRequest setStorageAutoScale(String storageAutoScale) {
        this.storageAutoScale = storageAutoScale;
        return this;
    }
    public String getStorageAutoScale() {
        return this.storageAutoScale;
    }

    public CreateDBInstanceShrinkRequest setStorageThreshold(Integer storageThreshold) {
        this.storageThreshold = storageThreshold;
        return this;
    }
    public Integer getStorageThreshold() {
        return this.storageThreshold;
    }

    public CreateDBInstanceShrinkRequest setStorageUpperBound(Integer storageUpperBound) {
        this.storageUpperBound = storageUpperBound;
        return this;
    }
    public Integer getStorageUpperBound() {
        return this.storageUpperBound;
    }

    public CreateDBInstanceShrinkRequest setSystemDBCharset(String systemDBCharset) {
        this.systemDBCharset = systemDBCharset;
        return this;
    }
    public String getSystemDBCharset() {
        return this.systemDBCharset;
    }

    public CreateDBInstanceShrinkRequest setTag(java.util.List<CreateDBInstanceShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDBInstanceShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateDBInstanceShrinkRequest setTargetDedicatedHostIdForLog(String targetDedicatedHostIdForLog) {
        this.targetDedicatedHostIdForLog = targetDedicatedHostIdForLog;
        return this;
    }
    public String getTargetDedicatedHostIdForLog() {
        return this.targetDedicatedHostIdForLog;
    }

    public CreateDBInstanceShrinkRequest setTargetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
        this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
        return this;
    }
    public String getTargetDedicatedHostIdForMaster() {
        return this.targetDedicatedHostIdForMaster;
    }

    public CreateDBInstanceShrinkRequest setTargetDedicatedHostIdForSlave(String targetDedicatedHostIdForSlave) {
        this.targetDedicatedHostIdForSlave = targetDedicatedHostIdForSlave;
        return this;
    }
    public String getTargetDedicatedHostIdForSlave() {
        return this.targetDedicatedHostIdForSlave;
    }

    public CreateDBInstanceShrinkRequest setTargetMinorVersion(String targetMinorVersion) {
        this.targetMinorVersion = targetMinorVersion;
        return this;
    }
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
    }

    public CreateDBInstanceShrinkRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateDBInstanceShrinkRequest setUserBackupId(String userBackupId) {
        this.userBackupId = userBackupId;
        return this;
    }
    public String getUserBackupId() {
        return this.userBackupId;
    }

    public CreateDBInstanceShrinkRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDBInstanceShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBInstanceShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateDBInstanceShrinkRequest setZoneIdSlave1(String zoneIdSlave1) {
        this.zoneIdSlave1 = zoneIdSlave1;
        return this;
    }
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    public CreateDBInstanceShrinkRequest setZoneIdSlave2(String zoneIdSlave2) {
        this.zoneIdSlave2 = zoneIdSlave2;
        return this;
    }
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

    public static class CreateDBInstanceShrinkRequestTag extends TeaModel {
        /**
         * <p>The key of the tag that you want to add to the instance. You can use this parameter to add tags to the instance.</p>
         * <br>
         * <p>*   If the specified tag key is an existing key, the system directly adds the tag key to the instance. You can call the [ListTagResources](~~610627~~) operation to query the details of the existing tags.</p>
         * <p>*   If the specified tag key is not an existing key, the system creates the tag key and adds the tag key to the instance.</p>
         * <p>*   A tag key cannot be an empty string.</p>
         * <p>*   This parameter must be used together with the **Tag.Value** parameter.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value that is associated with the specified tag key. You can use this parameter to add tags to the instance.</p>
         * <br>
         * <p>*   If the specified tag value is found in the specified tag key, the system directly adds the tag value to the instance. You can call the [ListTagResources](~~610627~~) operation to query the details of the existing tags.</p>
         * <p>*   If the specified tag value is not found in the specified tag key, the system creates the tag value and adds the tag value to the instance.</p>
         * <p>*   This parameter must be used together with the **Tag.Key** parameter.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDBInstanceShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDBInstanceShrinkRequestTag self = new CreateDBInstanceShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDBInstanceShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDBInstanceShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
