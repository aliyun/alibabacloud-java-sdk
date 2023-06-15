// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>The number of ApsaraDB RDS for MySQL instances that you want to create. The parameter takes effect only when you create multiple ApsaraDB RDS for MySQL instances at a time by using a single request.</p>
     * <br>
     * <p>Valid values: **1** to **20**. Default value: **1**.</p>
     * <br>
     * <p>*   If you want to create multiple ApsaraDB RDS for MySQL instances at a time by using a single request, you can add tags to all instances by using **Tag.N.Key** and **Tag.N.Value**. After the instances are created, you can manage the instances based on the tags.</p>
     * <p>*   After you submit a request to create multiple ApsaraDB RDS for MySQL instances, this operation returns **TaskId**, **RequestId**, and **Message**. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the details of an instance.</p>
     * <p>*   If the value of **Engine** is not **MySQL** and the value of Amount is greater than **1**, this operation fails and returns an error code `InvalidParam.Engine`.</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. You must specify this parameter only when the instance uses the subscription billing method. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** </p>
     * <br>
     * <p>*   The auto-renewal cycle is one month for monthly subscription.</p>
     * <p>*   The auto-renewal cycle is one year for yearly subscription.</p>
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
     * <p>> This parameter applies only to instances that run PostgreSQL. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see [Introduction to Babelfish](~~428613~~).</p>
     */
    @NameInMap("BabelfishConfig")
    public String babelfishConfig;

    @NameInMap("BpeEnabled")
    public String bpeEnabled;

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
     * <p>*   **Basic**: RDS Basic Edition</p>
     * <p>*   **HighAvailability**: RDS High-availability Edition</p>
     * <p>*   **AlwaysOn**: RDS Cluster Edition for SQL Server</p>
     * <p>*   **Finance**: RDS Enterprise Edition</p>
     * <br>
     * <p>**Serverless instances**</p>
     * <br>
     * <p>*   **serverless_basic**: RDS Serverless Basic Edition. This edition is available only for instances that run MySQL and PostgreSQL.</p>
     * <p>*   **serverless_standard**: RDS Serverless High-availability Edition for MySQL</p>
     * <p>*   **serverless_ha**: RDS Serverless High-availability Edition for SQL Server.</p>
     * <br>
     * <p>> If you want to create a serverless instance, you must specify this parameter.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
     * <p>> If the RDS instance runs SQL Server 2012, SQL Server 2016, or SQL Server 2017, you must set this parameter to Standard.</p>
     */
    @NameInMap("ConnectionMode")
    public String connectionMode;

    /**
     * <p>The endpoint of the instance.</p>
     * <br>
     * <p>> The **DBInstanceNetType** parameter specifies whether the endpoint is internal or public.</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The policy based on which multiple instances are created. The parameter takes effect only when the value of the **Amount** parameter is greater than 1.</p>
     * <br>
     * <p>*   **Atomicity**: atomicity. The instances are all created. If one instance cannot be created, none of the instances is created.</p>
     * <p>*   **Partial**: non-atomicity. Each instance is independently created. The failure in creating an instance does not affect the creation of the other instances.</p>
     * <br>
     * <p>> The default value of this parameter is **Atomicity**.</p>
     */
    @NameInMap("CreateStrategy")
    public String createStrategy;

    /**
     * <p>The instance type of the instance. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~). You can also call the [DescribeAvailableResource](~~134039~~) operation to query the available instance types in a region.</p>
     * <br>
     * <p>To create a serverless instance, set this parameter to one of the following values:</p>
     * <br>
     * <p>*  Basic Edition for MySQL: Set this parameter to **mysql.n2.serverless.1c**.</p>
     * <p>*  High-availability Edition for MySQL: Set this parameter to **mysql.n2.serverless.2c**.</p>
     * <p>*   SQL Server: Set this parameter to **mssql.mem2.serverless.s2**.</p>
     * <p>*   PostgreSQL: Set this parameter to **pg.n2.serverless.1c**.</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The name of the instance. The name must be 2 to 255 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.</p>
     * <br>
     * <p>> The value cannot start with http:// or https://.</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The network connection type of the instance. Set the value to **Intranet**.</p>
     */
    @NameInMap("DBInstanceNetType")
    public String DBInstanceNetType;

    /**
     * <p>The storage capacity of the instance. Unit: GB. The storage capacity increases in increments of 5 GB. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~). You can also call the [DescribeAvailableResource](~~134039~~) operation to query the storage capacity range that is supported for a specified instance type in a region.</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type that is used by the instance. Valid values:</p>
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
     * <p>> Serverless instances support only ESSDs of PL 1. For a serverless instance, you must set this parameter to **cloud_essd**.</p>
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
     * <p>The ID of the parameter template that is used for the instance. You can call the [DescribeParameterGroups](~~144491~~) operation to query the ID of the parameter template.</p>
     * <br>
     * <p>*   If you want to create an instance that runs RDS Basic Edition and uses the X-Engine storage engine, you must call the preceding operation, locate the **mysql_xengine\_8.0\_basic_normal_safe** field in the response, find the ID of the required system parameter template, and then use the ID as the value for this parameter.</p>
     * <p>*   If you want to create an instance that runs RDS High-availability Edition and uses the X-Engine storage engine, you must call the preceding operation, locate the **mysql_xengine\_8.0\_standard_normal_safe** field in the response, find the ID of the required system parameter template, and then use the ID as the value for this parameter.</p>
     */
    @NameInMap("DBParamGroupId")
    public String DBParamGroupId;

    /**
     * <p>The time zone of the instance. This parameter takes effect only when you set **Engine** to **MySQL** or **PostgreSQL**.</p>
     * <br>
     * <p>*   If you set **Engine** to **MySQL**:</p>
     * <br>
     * <p>    *   The time zone of the instance is in UTC. Valid values: \*\*-12:59\*\* to **+13:00**.</p>
     * <p>    *   If the instance uses local SSDs, you can specify the name of the time zone. Example: Asia/Hong_Kong. For more information, see [Time zones](~~297356~~).</p>
     * <br>
     * <p>*   If you set **Engine** to **PostgreSQL**:</p>
     * <br>
     * <p>    *   The time zone of the instance is not in UTC. For more information, see [Time zones](~~297356~~).</p>
     * <p>    *   You can specify this parameter only when the instance runs PostgreSQL with cloud disks.</p>
     * <br>
     * <p>**Note**</p>
     * <br>
     * <p>*   You can specify the time zone when you create a primary instance. You cannot specify the time zone when you create a read-only instance. Read-only instances inherit the time zone of their primary instance.</p>
     * <p>*   If you do not specify this parameter, the system automatically assigns the default time zone of the region in which the instance resides.</p>
     */
    @NameInMap("DBTimeZone")
    public String DBTimeZone;

    /**
     * <p>The ID of the dedicated cluster to which the instance belongs.</p>
     * <br>
     * <p>If you create the instance in a dedicated cluster, you must specify this parameter.</p>
     * <br>
     * <p>*   You can call the [DescribeDedicatedHostGroups](~~141946~~) operation to query the details of a dedicated cluster.</p>
     * <p>*   If no dedicated clusters are created, you can call the [CreateDedicatedHostGroup](~~209828~~) operation to create a dedicated cluster.</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>Specifies whether to enable the release protection feature for the instance.</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **true**: The system prechecks the request and does not create the instance. The system prechecks items such as the request parameters, request format, service limits, and available resources.</p>
     * <p>*   **false**: The system sends the request without a precheck. If the request passes verification, the system creates the instance.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the key that is used for disk encryption in the region in which the instance resides. If you specify the EncryptionKey parameter, disk encryption is automatically enabled. In this case, you must also specify the **RoleARN** parameter. Disk encryption cannot be disabled after it is enabled.</p>
     * <br>
     * <p>You can obtain the ID of the key from the Key Management Service (KMS) console. You can also create a key. For more information, see [Create a CMK](~~181610~~).</p>
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
     * <p>*   Valid values if you set Engine to MySQL: **5.5**, **5.6**, **5.7**, and **8.0**</p>
     * <p>*   Valid values if you set Engine to SQLServer: **2008r2**, **08r2\_ent_ha**, **2012**, **2012\_ent_ha**, **2012\_std_ha**, **2012\_web**, **2014\_std_ha**, **2016\_ent_ha**, **2016\_std_ha**, **2016\_web**, **2017\_std_ha**, **2017\_ent**, **2019\_std_ha**, and **2019\_ent**</p>
     * <p>*   Valid values if you set Engine to PostgreSQL: **10.0**, **11.0**, **12.0**, **13.0**, **14.0**, and **15.0**</p>
     * <p>*   Valid value if you set Engine to MariaDB: **10.3**</p>
     * <br>
     * <p>**Serverless instances**</p>
     * <br>
     * <p>*   Valid values if you set Engine to MySQL: **5.7** and **8.0**</p>
     * <p>*   Valid values if you set Engine to SQLServer: **2016\_std_sl**, **2017\_std_sl**, and **2019\_std_sl**</p>
     * <p>*   Valid value if you set Engine to PostgreSQL: **14.0**</p>
     * <br>
     * <p>> ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <br>
     * <p>*   **VPC**.</p>
     * <p>*   **Classic** (default)</p>
     * <br>
     * <p>**Note**</p>
     * <br>
     * <p>*   If the instance runs MySQL and uses cloud disks, you must set this parameter to **VPC**.</p>
     * <p>*   If the instance runs PostgreSQL or MariaDB, you must set this parameter to **VPC**.</p>
     * <p>*   If the instance runs SQL Server Basic or SQL Server Web, you can set this parameter to VPC or Classic. If the instance runs other database engines, you must set this parameter to **VPC**.</p>
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
     * <p>> ApsaraDB RDS automatically generates a purchase order and completes the payment.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>Specifies whether to use yearly subscription or monthly subscription for the instance. Valid values:</p>
     * <br>
     * <p>*   **Year**</p>
     * <p>*   **Month**</p>
     * <br>
     * <p>> If you set PayType to **Prepaid**, you must specify this parameter.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The port. You can initialize the port when you create the instance. Valid values: 1000 to 5999.</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The private IP address of the instance. The private IP address must be within the CIDR block that is supported by the specified vSwitch. ApsaraDB RDS automatically assigns a private IP address to the instance based on the values of the **VPCId** and **vSwitchId** parameters.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
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
     * <p>The Alibaba Cloud Resource Name (ARN) that is provided by your Alibaba Cloud account for RAM users. RAM users can use the ARN to connect ApsaraDB RDS to KMS. You can call the [CheckCloudResourceAuthorized](~~446261~~) operation to query the ARN.</p>
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
     * <p>> ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     */
    @NameInMap("ServerlessConfig")
    public CreateDBInstanceRequestServerlessConfig serverlessConfig;

    /**
     * <p>Specifies whether to enable automatic storage expansion for the instance. Valid values:</p>
     * <br>
     * <p>*   **Enable**</p>
     * <p>*   **Disable** (default)</p>
     * <br>
     * <p>> After the instance is created, you can call the [ModifyDasInstanceConfig](~~199281~~) operation to adjust the settings of automatic storage expansion for the instance. For more information, see [Configure automatic storage expansion for an ApsaraDB RDS for MySQL instance](~~173826~~).</p>
     */
    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    /**
     * <p>The threshold based on which automatic storage expansion is triggered. Unit: percent. Valid values:</p>
     * <br>
     * <p>*   **10**</p>
     * <p>*   **20**</p>
     * <p>*   **30**</p>
     * <p>*   **40**</p>
     * <p>*   **50**</p>
     * <br>
     * <p>> If you set **StorageAutoScale** to **Enable**, you must specify this parameter.</p>
     */
    @NameInMap("StorageThreshold")
    public Integer storageThreshold;

    /**
     * <p>The maximum storage capacity that is allowed for automatic storage expansion. The storage capacity of the instance cannot exceed the maximum storage capacity. Unit: GB.</p>
     * <br>
     * <p>*   Valid values: an integer greater than or equal to 0.</p>
     * <p>*   If you set the **StorageAutoScale** parameter to **Enable**, you must also specify this parameter.</p>
     */
    @NameInMap("StorageUpperBound")
    public Integer storageUpperBound;

    /**
     * <p>The character set that is used by the instance. This parameter is no longer used.</p>
     */
    @NameInMap("SystemDBCharset")
    public String systemDBCharset;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDBInstanceRequestTag> tag;

    /**
     * <p>The ID of the host to which the logger instance belongs in the specified dedicated cluster.</p>
     * <br>
     * <p>If the instance runs RDS Enterprise Edition and you create the instance in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.</p>
     * <br>
     * <p>*   You can call the [DescribeDedicatedHosts](~~141948~~) operation to query the details of the hosts in a dedicated cluster.</p>
     * <p>*   If no hosts are created, you can call the [CreateDedicatedHost](~~210864~~) operation to create a host.</p>
     */
    @NameInMap("TargetDedicatedHostIdForLog")
    public String targetDedicatedHostIdForLog;

    /**
     * <p>The ID of the host to which the instance belongs in the specified dedicated cluster.</p>
     * <br>
     * <p>If you create the instance in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.</p>
     * <br>
     * <p>*   You can call the [DescribeDedicatedHost](~~141948~~) operation to query the details about the hosts in a dedicated cluster.</p>
     * <p>*   If no hosts are created, you can call the [CreateDedicatedHost](~~210864~~) operation to create a host.</p>
     */
    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    /**
     * <p>The ID of the host to which the secondary instance belongs in the specified dedicated cluster.</p>
     * <br>
     * <p>If the instance runs RDS High-availability Edition or RDS Enterprise Edition and you create the instance in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.</p>
     * <br>
     * <p>*   You can call the [DescribeDedicatedHosts](~~141948~~) operation to query the details of the hosts in a dedicated cluster.</p>
     * <p>*   If no hosts are created, you can call the [CreateDedicatedHost](~~210864~~) operation to create a host.</p>
     */
    @NameInMap("TargetDedicatedHostIdForSlave")
    public String targetDedicatedHostIdForSlave;

    /**
     * <p>The minor engine version of the instance. This parameter is required only when you create an instance that runs MySQL or PostgreSQL. The value format varies based on the database engine of the instance.</p>
     * <br>
     * <p>*   If you create an instance that runs MySQL, the value is in the following format: `<RDS edition>_<Minor engine version>`. Examples: `rds_20200229`, `xcluster_20200229`, and `xcluster80_20200229`. The following list describes the fields in the example values:</p>
     * <br>
     * <p>    *   rds: The instance runs RDS Basic Edition or High-availability Edition.</p>
     * <p>    *   xcluster: The instance runs MySQL 5.7 on RDS Enterprise Edition.</p>
     * <p>    *   xcluster80: The instance runs MySQL 8.0 on RDS Enterprise Edition.</p>
     * <br>
     * <p>> You can call the [DescribeDBMiniEngineVersions](~~445835~~) operation to query the minor engine version. For more information about minor engine versions, see [Release notes of minor AliSQL versions](~~96060~~).</p>
     * <br>
     * <p>*   If you create an instance that runs PostgreSQL, the value is in the following format: `rds_postgres_<Major engine version>00_<Minor engine version>`. Example: `rds_postgres_1400_20220830`. The following list describes the fields in the example value:</p>
     * <br>
     * <p>    *   1400: The major engine version is PostgreSQL 14.</p>
     * <p>    *   20220830: the AliPG version. You can call the [DescribeDBMiniEngineVersions](~~445835~~) operation to query the AliPG version. For more information about minor engine versions, see [Release notes for AliPG](~~126002~~).</p>
     * <br>
     * <p>> If you configure the **BabelfishConfig** parameter for your instance that runs PostgreSQL and set the babelfishEnabled field to true, the value of this parameter is in the following format: `rds_postgres_Major engine version00_AliPG version_babelfish`.</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <p>The subscription duration of the instance.</p>
     * <br>
     * <p>*   If you set the **Period** parameter to **Year**, the value of the **UsedTime** parameter ranges from **1 to 5**.</p>
     * <p>*   If you set the **Period** parameter to **Month**, the value of the **UsedTime** parameter ranges from **1 to 11**.</p>
     * <br>
     * <p>> If you set the PayType parameter to **Prepaid**, you must specify the UsedTime parameter.</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The ID of the backup file. You can call the [ListUserBackupFiles](~~257821~~) operation to query backup files. If you want to create an instance by using the data of a backup file, you must specify this parameter.</p>
     * <br>
     * <p>This parameter is supported only when the following requirements are met:</p>
     * <br>
     * <p>*   **PayType** is set to **Postpaid**.</p>
     * <p>*   **Engine** is set to **MySQL**.</p>
     * <p>*   **EngineVersion** is set to **5.7**.</p>
     * <p>*   **Category** is set to **Basic**.</p>
     */
    @NameInMap("UserBackupId")
    public String userBackupId;

    /**
     * <p>The ID of the VPC to which the instance belongs.</p>
     * <br>
     * <p>> This parameter is available when you set the **InstanceNetworkType** parameter to **VPC**.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch. The vSwitch must belong to the zone that is specified by **ZoneId**.</p>
     * <br>
     * <p>*   If you set **InstanceNetworkType** to **VPC**, you must also specify this parameter.</p>
     * <p>*   If you specify ZoneSlaveId1, you must specify the IDs of two vSwitches for this parameter and separate the IDs with a comma (,).</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the primary instance.</p>
     * <br>
     * <p>*   If you specify a virtual private cloud (VPC) and a vSwitch, you must specify the ID of the zone to which the specified vSwitch belongs. Otherwise, the instance cannot be created.</p>
     * <p>*   If the instance runs RDS High-availability Edition, you must specify **ZoneIdSlave1**, which specifies whether to use the single-zone deployment method or the multi-zone deployment method.</p>
     * <p>*   If the instance runs RDS Enterprise Edition, you must specify **ZoneIdSlave1** and **ZoneIdSlave2**, which specify whether to use the single-zone deployment method or the multi-zone deployment method.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The ID of the zone in which the secondary instance resides. If you set the ZoneIdSlave1 parameter and the **ZoneId** parameter to the same value, the single-zone deployment method is used. If you set the ZoneIdSlave1 parameter and the **ZoneId** parameter to different values, the multi-zone deployment method is used.</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>The ID of the zone in which the logger instance resides. If you set the ZoneIdSlave2 parameter and the **ZoneId** parameter to the same value, the single-zone deployment method is used. If you set the ZoneIdSlave2 parameter and the **ZoneId** parameter to different values, the multi-zone deployment method is used.</p>
     */
    @NameInMap("ZoneIdSlave2")
    public String zoneIdSlave2;

    public static CreateDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceRequest self = new CreateDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateDBInstanceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateDBInstanceRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateDBInstanceRequest setBabelfishConfig(String babelfishConfig) {
        this.babelfishConfig = babelfishConfig;
        return this;
    }
    public String getBabelfishConfig() {
        return this.babelfishConfig;
    }

    public CreateDBInstanceRequest setBpeEnabled(String bpeEnabled) {
        this.bpeEnabled = bpeEnabled;
        return this;
    }
    public String getBpeEnabled() {
        return this.bpeEnabled;
    }

    public CreateDBInstanceRequest setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public CreateDBInstanceRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateDBInstanceRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceRequest setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
        return this;
    }
    public String getConnectionMode() {
        return this.connectionMode;
    }

    public CreateDBInstanceRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public CreateDBInstanceRequest setCreateStrategy(String createStrategy) {
        this.createStrategy = createStrategy;
        return this;
    }
    public String getCreateStrategy() {
        return this.createStrategy;
    }

    public CreateDBInstanceRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CreateDBInstanceRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateDBInstanceRequest setDBInstanceNetType(String DBInstanceNetType) {
        this.DBInstanceNetType = DBInstanceNetType;
        return this;
    }
    public String getDBInstanceNetType() {
        return this.DBInstanceNetType;
    }

    public CreateDBInstanceRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public CreateDBInstanceRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public CreateDBInstanceRequest setDBIsIgnoreCase(String DBIsIgnoreCase) {
        this.DBIsIgnoreCase = DBIsIgnoreCase;
        return this;
    }
    public String getDBIsIgnoreCase() {
        return this.DBIsIgnoreCase;
    }

    public CreateDBInstanceRequest setDBParamGroupId(String DBParamGroupId) {
        this.DBParamGroupId = DBParamGroupId;
        return this;
    }
    public String getDBParamGroupId() {
        return this.DBParamGroupId;
    }

    public CreateDBInstanceRequest setDBTimeZone(String DBTimeZone) {
        this.DBTimeZone = DBTimeZone;
        return this;
    }
    public String getDBTimeZone() {
        return this.DBTimeZone;
    }

    public CreateDBInstanceRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public CreateDBInstanceRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateDBInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateDBInstanceRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public CreateDBInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDBInstanceRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public CreateDBInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDBInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDBInstanceRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateDBInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBInstanceRequest setRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }
    public String getRoleARN() {
        return this.roleARN;
    }

    public CreateDBInstanceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateDBInstanceRequest setServerlessConfig(CreateDBInstanceRequestServerlessConfig serverlessConfig) {
        this.serverlessConfig = serverlessConfig;
        return this;
    }
    public CreateDBInstanceRequestServerlessConfig getServerlessConfig() {
        return this.serverlessConfig;
    }

    public CreateDBInstanceRequest setStorageAutoScale(String storageAutoScale) {
        this.storageAutoScale = storageAutoScale;
        return this;
    }
    public String getStorageAutoScale() {
        return this.storageAutoScale;
    }

    public CreateDBInstanceRequest setStorageThreshold(Integer storageThreshold) {
        this.storageThreshold = storageThreshold;
        return this;
    }
    public Integer getStorageThreshold() {
        return this.storageThreshold;
    }

    public CreateDBInstanceRequest setStorageUpperBound(Integer storageUpperBound) {
        this.storageUpperBound = storageUpperBound;
        return this;
    }
    public Integer getStorageUpperBound() {
        return this.storageUpperBound;
    }

    public CreateDBInstanceRequest setSystemDBCharset(String systemDBCharset) {
        this.systemDBCharset = systemDBCharset;
        return this;
    }
    public String getSystemDBCharset() {
        return this.systemDBCharset;
    }

    public CreateDBInstanceRequest setTag(java.util.List<CreateDBInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDBInstanceRequestTag> getTag() {
        return this.tag;
    }

    public CreateDBInstanceRequest setTargetDedicatedHostIdForLog(String targetDedicatedHostIdForLog) {
        this.targetDedicatedHostIdForLog = targetDedicatedHostIdForLog;
        return this;
    }
    public String getTargetDedicatedHostIdForLog() {
        return this.targetDedicatedHostIdForLog;
    }

    public CreateDBInstanceRequest setTargetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
        this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
        return this;
    }
    public String getTargetDedicatedHostIdForMaster() {
        return this.targetDedicatedHostIdForMaster;
    }

    public CreateDBInstanceRequest setTargetDedicatedHostIdForSlave(String targetDedicatedHostIdForSlave) {
        this.targetDedicatedHostIdForSlave = targetDedicatedHostIdForSlave;
        return this;
    }
    public String getTargetDedicatedHostIdForSlave() {
        return this.targetDedicatedHostIdForSlave;
    }

    public CreateDBInstanceRequest setTargetMinorVersion(String targetMinorVersion) {
        this.targetMinorVersion = targetMinorVersion;
        return this;
    }
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
    }

    public CreateDBInstanceRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateDBInstanceRequest setUserBackupId(String userBackupId) {
        this.userBackupId = userBackupId;
        return this;
    }
    public String getUserBackupId() {
        return this.userBackupId;
    }

    public CreateDBInstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateDBInstanceRequest setZoneIdSlave1(String zoneIdSlave1) {
        this.zoneIdSlave1 = zoneIdSlave1;
        return this;
    }
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    public CreateDBInstanceRequest setZoneIdSlave2(String zoneIdSlave2) {
        this.zoneIdSlave2 = zoneIdSlave2;
        return this;
    }
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

    public static class CreateDBInstanceRequestServerlessConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable the automatic start and stop feature for the serverless instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>> This parameter is required only for serverless ApsaraDB RDS for MySQL instances. After the automatic start and stop feature is enabled, if no connections to the instance are established within 10 minutes, the instance is suspended. After a connection to the instance is established, the instance is resumed.</p>
         */
        @NameInMap("AutoPause")
        public Boolean autoPause;

        /**
         * <p>The maximum number of RDS Capacity Units (RCUs). Valid values:</p>
         * <br>
         * <p>*   Serverless ApsaraDB RDS for MySQL instances: **1 to 8**</p>
         * <p>*   Serverless ApsaraDB RDS for SQL Server instances: **2 to 8**</p>
         * <p>*   Serverless ApsaraDB RDS for PostgreSQL instances: **1 to 12**</p>
         * <br>
         * <p>> The value of this parameter must be greater than or equal to the value of **MinCapacity** and can be specified only to an **integer**.</p>
         */
        @NameInMap("MaxCapacity")
        public Double maxCapacity;

        /**
         * <p>The minimum number of RCUs. Valid values:</p>
         * <br>
         * <p>*   Serverless ApsaraDB RDS for MySQL instances: **0.5 to 8**.</p>
         * <p>*   Serverless ApsaraDB RDS for SQL Server instances: **2 to 8**. Only integers are supported.</p>
         * <p>*   Serverless ApsaraDB RDS for PostgreSQL instances: **0.5 to 12**.</p>
         * <br>
         * <p>> The value of this parameter must be less than or equal to the value of **MaxCapacity**.</p>
         */
        @NameInMap("MinCapacity")
        public Double minCapacity;

        /**
         * <p>Specifies whether to enable the forced scaling feature for the serverless instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>**Note**</p>
         * <br>
         * <p>*   This parameter is required only for serverless ApsaraDB RDS for MySQL instances. If you set this parameter to true, a transient connection that lasts approximately 1 minute occurs during forced scaling. Process with caution.</p>
         * <p>*   The RCU scaling for a serverless instance immediately takes effect. In some cases, such as the execution of large transactions, the scaling does not immediately take effect. In this case, you can enable this feature to forcefully scale the RCUs of the instance.</p>
         */
        @NameInMap("SwitchForce")
        public Boolean switchForce;

        public static CreateDBInstanceRequestServerlessConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDBInstanceRequestServerlessConfig self = new CreateDBInstanceRequestServerlessConfig();
            return TeaModel.build(map, self);
        }

        public CreateDBInstanceRequestServerlessConfig setAutoPause(Boolean autoPause) {
            this.autoPause = autoPause;
            return this;
        }
        public Boolean getAutoPause() {
            return this.autoPause;
        }

        public CreateDBInstanceRequestServerlessConfig setMaxCapacity(Double maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Double getMaxCapacity() {
            return this.maxCapacity;
        }

        public CreateDBInstanceRequestServerlessConfig setMinCapacity(Double minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public Double getMinCapacity() {
            return this.minCapacity;
        }

        public CreateDBInstanceRequestServerlessConfig setSwitchForce(Boolean switchForce) {
            this.switchForce = switchForce;
            return this;
        }
        public Boolean getSwitchForce() {
            return this.switchForce;
        }

    }

    public static class CreateDBInstanceRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. You can use this parameter to add tags to the instance.</p>
         * <br>
         * <p>*   If the specified tag key is an existing key, the system directly adds the tag key to the instance. You can call the [ListTagResources](~~141258~~) operation to query the details of the existing tags.</p>
         * <p>*   If the specified tag key is not an existing key, the system creates the tag key and adds the tag key to the instance.</p>
         * <p>*   A tag key cannot be an empty string.</p>
         * <p>*   This parameter must be used together with **Tag.Value**.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value that is associated with the specified tag key. You can use this parameter to add tags to the instance.</p>
         * <br>
         * <p>*   If the specified tag value is found in the specified tag key, the system directly adds the tag value to the instance. You can call the [ListTagResources](~~141258~~) operation to query the details of the existing tags.</p>
         * <p>*   If the specified tag value is not found in the specified tag key, the system creates the tag value and adds the tag value to the instance.</p>
         * <p>*   This parameter must be used together with **Tag.Key**.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDBInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDBInstanceRequestTag self = new CreateDBInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDBInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDBInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
