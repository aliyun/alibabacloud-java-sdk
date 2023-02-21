// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>The number of ApsaraDB RDS for MySQL instances that you want to create. The parameter takes effect only when you create multiple ApsaraDB RDS for MySQL instances at a time by using a single request.</p>
     * <br>
     * <p>Valid values: **1** to **20**. Default value: **1**.</p>
     * <br>
     * <p>> *   If you want to create multiple ApsaraDB RDS for MySQL instances at a time by using a single request, you can add tags to all the instances by using the **Tag.N.Key** parameter and the **Tag.N.Value** parameter. After the instances are created, you can manage the instances based on the tags.</p>
     * <p>> *   After you submit a request to create multiple ApsaraDB RDS for MySQL instances, this operation returns the **TaskId**, **RequestId**, and **Message** parameters. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the details of an instance.</p>
     * <p>> *   If the value of the **Engine** parameter is not **MySQL** and the value of the Amount parameter is greater than **1**, this operation fails and returns the `InvalidParam.Engine` error message.</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. You must specify this parameter only when the instance uses the subscription billing method. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>> *   If you set the Period parameter to Month, the auto-renewal cycle is one month.</p>
     * <p>> *   If you set the Period parameter to Year, the auto-renewal cycle is one year.</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The configuration of an ApsaraDB RDS for PostgreSQL instance for which Babelfish is enabled.</p>
     * <br>
     * <p>Format:{"babelfishEnabled":"true","migrationMode":"xxxxxxx","masterUsername":"xxxxxxx","masterUserPassword":"xxxxxxxx"}</p>
     * <br>
     * <p>The following list describes the fields in the format:</p>
     * <br>
     * <p>*   **babelfishEnabled**: specifies whether to enable Babelfish for the instance. If you set this field to **true**, you enable Babelfish for the instance. If you leave this parameter empty, you disable Babelfish for the instance.</p>
     * <p>*   **migrationMode**: The migration mode of the instance. Valid values: **single-db** and **multi-db**.</p>
     * <p>*   **masterUsername**: The username of the administrator account. The name can contain lowercase letters, digits, and underscores (\_). It must start with a letter and end with a letter or digit. It can be up to 63 characters in length and cannot start with pg.</p>
     * <p>*   **masterUserPassword**: The password of the administrator account. The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. It must be 8 to 32 characters in length. The password can contain any of the following characters: `! @ # $ % ^ & * ( ) _ + - =`.</p>
     * <br>
     * <p>>  This parameter takes effect only when you create an ApsaraDB RDS for PostgreSQL instance. For more information, see [Introduction to Babelfish](~~428613~~).</p>
     */
    @NameInMap("BabelfishConfig")
    public String babelfishConfig;

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
     * <p>*   **AlwaysOn**: RDS Cluster Edition</p>
     * <p>*   **Finance**: RDS Enterprise Edition</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The connection mode of the instance. Valid values:</p>
     * <br>
     * <p>*   **Standard**: standard mode</p>
     * <p>*   **Safe**: database proxy mode</p>
     * <br>
     * <p>The system automatically assigns a connection mode to the instance.</p>
     * <br>
     * <p>>  SQL Server 2012, SQL Server 2016, and SQL Server 2017 support only the standard mode.</p>
     */
    @NameInMap("ConnectionMode")
    public String connectionMode;

    /**
     * <p>The endpoint of the database.</p>
     * <br>
     * <p>>  The **DBInstanceNetType** parameter specifies whether the endpoint is an internal endpoint or a public endpoint.</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The policy based on which multiple instances are created. The parameter takes effect only when the value of the **Amount** parameter is greater than 1.</p>
     * <br>
     * <p>*   **Atomicity**: atomicity. The instances are all created. If one instance cannot be created, none of the instances is created.</p>
     * <p>*   **Partial**: non-atomicity. Each instance is independently created. The failure in creating one instance does not affect the creation of the other instances.</p>
     * <br>
     * <p>>  Default value: **Atomicity**.</p>
     */
    @NameInMap("CreateStrategy")
    public String createStrategy;

    /**
     * <p>The instance type of the instance. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~). You can also call the [DescribeAvailableResource](~~134039~~) operation to query the available instance types in a region.</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The name of the instance. The name must be 2 to 255 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.</p>
     * <br>
     * <p>>  The name cannot start with http:// or https://.</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The type of the network connection to the instance. Valid values:</p>
     * <br>
     * <p>*   **Internet**: Internet</p>
     * <p>*   **Intranet**: internal network</p>
     */
    @NameInMap("DBInstanceNetType")
    public String DBInstanceNetType;

    /**
     * <p>The storage capacity of the instance. Unit: GB. The storage capacity increases in increments of 5 GB. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~). You can also call the [DescribeAvailableResource](~~134039~~) operation to query the storage capacity range that is supported for a specified instance type in a region.</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <br>
     * <p>*   **local_ssd**: local SSD. This is the recommended storage type.</p>
     * <p>*   **cloud_ssd**: standard SSD. This storage type is not recommended. Standard SSDs are no longer available for purchase in some Alibaba Cloud regions.</p>
     * <p>*   **cloud_essd**: ESSDs of performance level 1 (PL1).</p>
     * <p>*   **cloud_essd2**: ESSDs of PL2.</p>
     * <p>*   **cloud_essd3**: ESSDs of PL3.</p>
     * <br>
     * <p>>  The default value of this parameter is determined by the instance type that is specified by the **DBInstanceClass** parameter.</p>
     * <p>> *   If the instance type specifies the local SSD storage type, the default value of this parameter is **local_ssd**.</p>
     * <p>> *   If the instance type specifies the standard SSD or ESSD storage type, the default value of this parameter is **cloud_essd**.</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>Specifies whether table names are case-sensitive. Valid values:</p>
     * <br>
     * <p>*   **true**: Table names are not case-sensitive. This is the default value.</p>
     * <p>*   **false**: Table names are case-sensitive.</p>
     */
    @NameInMap("DBIsIgnoreCase")
    public String DBIsIgnoreCase;

    /**
     * <p>The ID of the parameter template. You can call the [DescribeParameterGroups](~~144491~~) operation to query ID of the parameter template.</p>
     * <br>
     * <p>> *   If you want to create an instance that runs RDS Basic Edition and uses the X-Engine storage engine, you must call the preceding operation, locate the **mysql_xengine\_8.0\_basic_normal_safe** field in the response, find the ID of the required system parameter template, and then use the ID as the value for this parameter.</p>
     * <p>> *   If you want to create an instance that runs RDS High-availability Edition and uses the X-Engine storage engine, you must call the preceding operation, locate the **mysql_xengine\_8.0\_standard_normal_safe** field in the response, find the ID of the required system parameter template, and then use the ID as the value for this parameter.</p>
     */
    @NameInMap("DBParamGroupId")
    public String DBParamGroupId;

    /**
     * <p>The time zone of the instance. This parameter takes effect only when you set the **Engine** parameter to **MySQL** or **PostgreSQL**.</p>
     * <br>
     * <p>*   If you set the **Engine** parameter to **MySQL**:</p>
     * <br>
     * <p>    *   The time zone of the instance is in UTC. Valid values: **-12:59** to **+13:00**.</p>
     * <p>    *   If the instance uses local SSDs, you can specify the name of the time zone. Example: Asia/Hong_Kong. For more information, see [Time zones](~~297356~~).</p>
     * <br>
     * <p>*   If you set the **Engine** parameter to **PostgreSQL**:</p>
     * <br>
     * <p>    *   The time zone of the instance is not in UTC. For more information, see [Time zones](~~297356~~).</p>
     * <p>    *   You can specify this parameter only when the instance runs PostgreSQL with standard SSDs or ESSDs.</p>
     * <br>
     * <p>> *   If the instance is a primary instance, you can specify this parameter. If the instance is a read-only instance, you cannot specify this parameter. A read-only instance inherits the time zone of its primary instance.</p>
     * <p>> *   If you do not specify this parameter, the system automatically assigns the default time zone of the region in which the instance resides.</p>
     */
    @NameInMap("DBTimeZone")
    public String DBTimeZone;

    /**
     * <p>The ID of the dedicated cluster to which the instance belongs.</p>
     * <br>
     * <p>If you create the instance in a dedicated cluster, you must specify this parameter.</p>
     * <br>
     * <p>> *   You can call the [DescribeDedicatedHostGroups](~~141946~~) operation to query the details of a dedicated cluster.</p>
     * <p>> *   If no dedicated clusters are created, you can call the [CreateDedicatedHostGroup](~~209828~~) operation to create a dedicated cluster.</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>Specifies whether to enable the release protection feature for the instance.</p>
     * <br>
     * <p>*   **true**: enables the release protection feature.</p>
     * <p>*   **false**: disables the release protection feature. This is the default value.</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to perform a precheck before the system creates the instance. Valid values:</p>
     * <br>
     * <p>*   **true**: The system prechecks the request and does not create the instance. The system prechecks items such as the request parameters, request format, service limits, and available resources.</p>
     * <p>*   **false**: The system sends the request. If the request passes the precheck, the system creates the instance. This is the default value.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the key that is used for disk encryption in the region in which the instance resides. You can obtain the ID of the key from the Key Management Service (KMS) console. You can also create a key. For more information, see [Create a CMK](~~181610~~).</p>
     * <br>
     * <p>>  If you specify the EncryptionKey parameter, disk encryption is automatically enabled. In this case, you must also specify the **RoleARN** parameter. Disk encryption cannot be disabled after it is enabled.</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The database engine that is run by the instance. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **SQLServer**</p>
     * <p>*   **PostgreSQL**</p>
     * <p>*   **MariaDB**</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version that is run on the instance.</p>
     * <br>
     * <p>*   Valid values when you set the Engine parameter to MySQL: **5.5**, **5.6**, **5.7**, and **8.0**</p>
     * <p>*   Valid values when you set the Engine parameter to SQLServer: **2008r2**, **08r2\_ent\_ha**, **2012**, **2012\_ent\_ha**, **2012\_std\_ha**, **2012\_web**, **2014\_std\_ha**, **2016\_ent\_ha**, **2016\_std\_ha**, **2016\_web**, **2017\_std\_ha**, **2017\_ent**, **2019\_std_ha**, and **2019\_ent**</p>
     * <p>*   Valid values when you set the Engine parameter to PostgreSQL: **10.0**, **11.0**, **12.0**, **13.0**, and **14.0**</p>
     * <p>*   Valid value when you set the Engine parameter to MariaDB: **10.3**</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <br>
     * <p>*   **VPC**.</p>
     * <p>*   **Classic**: classic network. This is the default value.</p>
     * <br>
     * <p>> *   If the instance runs MySQL and uses standard SSDs or enhanced SSDs (ESSDs), you must set this parameter to **VPC**.</p>
     * <p>> *   If the instance runs PostgreSQL or MariaDB TX, you must set this parameter to **VPC**.</p>
     * <p>> *   If the instance runs SQL Server Basic or SQL Server Web, you can set this parameter to VPC or Classic. If the instance runs other database engines, you must set this parameter to **VPC**.</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go</p>
     * <p>*   **Prepaid**: subscription</p>
     * <br>
     * <p>>  The system automatically generates a purchase order and completes the payment.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>Specifies whether to use yearly subscription or monthly subscription for the instance. Valid values:</p>
     * <br>
     * <p>*   **Year**</p>
     * <p>*   **Month**</p>
     * <br>
     * <p>>  If you set the PayType parameter to **Prepaid**, you must also specify this parameter.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The private IP address of the instance. The private IP address must be within the CIDR block that is supported by the specified vSwitch. ApsaraDB RDS automatically assigns a private IP address to the instance based on the values of the **VPCId** and **VSwitchId** parameters.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) that is provided by your Alibaba Cloud account for RAM users. RAM users can use the ARN to connect ApsaraDB RDS to KMS. You can copy the ARN from the [RAM console](https://ram.console.aliyun.com/roles/AliyunRDSInstanceEncryptionDefaultRole).</p>
     * <br>
     * <p>>  For more information about how to grant permissions to RAM users in the RAM console, see [Authorize an ApsaraDB RDS for MySQL instance to access KMS](~~142412~~).</p>
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
     * <p>Related settings of the RDS Serverless instance. Required when creating a Serverless instance.</p>
     * <br>
     * <p>> Serverless related configurations are only applicable to RDS MySQL instances.</p>
     */
    @NameInMap("ServerlessConfig")
    public CreateDBInstanceRequestServerlessConfig serverlessConfig;

    /**
     * <p>Specifies whether to enable automatic storage expansion for the instance. Valid values:</p>
     * <br>
     * <p>*   **Enable**.</p>
     * <p>*   **Disable**. This is the default value.</p>
     * <br>
     * <p>>  After the instance is created, you can call the [ModifyDasInstanceConfig](~~199281~~) operation to modify the settings of the automatic storage expansion feature for the instance. For more information, see [Configure automatic storage expansion for an ApsaraDB RDS for MySQL instance](~~173826~~).</p>
     */
    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    /**
     * <p>The threshold in percentage based on which automatic storage expansion is triggered. Valid values:</p>
     * <br>
     * <p>*   **10**</p>
     * <p>*   **20**</p>
     * <p>*   **30**</p>
     * <p>*   **40**</p>
     * <p>*   **50**</p>
     * <br>
     * <p>>  If you set the **StorageAutoScale** parameter to **Enable**, you must also specify this parameter.</p>
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
     * <p>The character set that is used by the instance. This parameter has been deprecated.</p>
     */
    @NameInMap("SystemDBCharset")
    public String systemDBCharset;

    /**
     * <p>The tags that you want to add to the instance. you can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDBInstanceRequestTag> tag;

    /**
     * <p>The ID of the host to which the logger instance belongs in the specified dedicated cluster.</p>
     * <br>
     * <p>If you create an instance that runs RDS Enterprise Edition in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.</p>
     * <br>
     * <p>> *   You can call the [DescribeDedicatedHosts](~~141948~~) operation to query the details of the hosts in a dedicated cluster.</p>
     * <p>> *   If no hosts are created, you can call the [CreateDedicatedHost](~~210864~~) operation to create a host.</p>
     */
    @NameInMap("TargetDedicatedHostIdForLog")
    public String targetDedicatedHostIdForLog;

    /**
     * <p>The ID of the host to which the instance belongs in the specified dedicated cluster.</p>
     * <br>
     * <p>If you create the instance in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.</p>
     * <br>
     * <p>> *   You can call the [DescribeDedicatedHosts](~~141948~~) operation to query the details of the hosts in a dedicated cluster.</p>
     * <p>> *   If no hosts are created, you can call the [CreateDedicatedHost](~~210864~~) operation to create a host.</p>
     */
    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    /**
     * <p>The ID of the host to which the secondary instance belongs in the specified dedicated cluster.</p>
     * <br>
     * <p>If you create an instance that runs RDS High-availability Edition or RDS Enterprise Edition in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.</p>
     * <br>
     * <p>> *   You can call the [DescribeDedicatedHosts](~~141948~~) operation to query the details of the hosts in a dedicated cluster.</p>
     * <p>> *   If no hosts are created, you can call the [CreateDedicatedHost](~~210864~~) operation to create a host.</p>
     */
    @NameInMap("TargetDedicatedHostIdForSlave")
    public String targetDedicatedHostIdForSlave;

    /**
     * <p>The minor engine version of the instance. This parameter is required only when you create an ApsaraDB RDS for MySQL or ApsaraDB RDS for PostgreSQL instance.</p>
     * <br>
     * <p>The value format varies based on the database engine of the instance.</p>
     * <br>
     * <p>*   If you create an ApsaraDB RDS for MySQL instance, the value is in the following format: `<RDS edition>_<Minor engine version>`. Examples: `rds_20200229`, `xcluster_20200229`, and `xcluster80_20200229`. The following list describes the fields in the example values:</p>
     * <br>
     * <p>    *   rds: The instance runs RDS Basic Edition or RDS High-availability Edition.</p>
     * <br>
     * <p>    *   xcluster: The instance runs MySQL 5.7 on RDS Enterprise Edition.</p>
     * <br>
     * <p>    *   xcluster80: The instance runs MySQL 8.0 on RDS Enterprise Edition.</p>
     * <br>
     * <p>>  You can call the [DescribeDBMiniEngineVersions](~~445835~~) operation to query the minor engine version. For more information about minor engine versions, see [Release notes for AliSQL](~~96060~~).</p>
     * <br>
     * <p>*   If you create an ApsaraDB RDS for PostgreSQL instance, the value is in the following format: `rds_postgres_<Major engine version>00_<Minor engine version>`. Example: `rds_postgres_1400_20220830`. The following list describes the fields in the example value:</p>
     * <br>
     * <p>    *   1400: The major engine version is PostgreSQL 14.</p>
     * <br>
     * <p>    <!----></p>
     * <br>
     * <p>    *   20220830: the AliPG version. You can call the [DescribeDBMiniEngineVersions](~~445835~~) operation to query the AliPG version. For more information about minor engine versions, see [Release notes for AliPG](~~126002~~).</p>
     * <br>
     * <p>> If Enable Babelfish is selected for the ApsaraDB RDS for PostgreSQL instance in the Basic Configuration step, the value of this parameter is in the following format: `rds_postgres_Major engine version00_AliPG version_babelfish`.</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <p>The subscription duration of the instance. Valid values:</p>
     * <br>
     * <p>*   If you set the **Period** parameter to **Year**, the value of the **UsedTime** parameter ranges from **1 to 5**.</p>
     * <p>*   If you set the **Period** parameter to **Month**, the value of the **UsedTime** parameter ranges from **1 to 11**.</p>
     * <br>
     * <p>>  If you set the PayType parameter to **Prepaid**, you must also specify this parameter.</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The ID of the backup file. You can call the [ListUserBackupFiles](~~257821~~) operation to query backup files. If you want to create an instance by using the data of a backup file, you must specify this parameter.</p>
     * <br>
     * <p>>  This parameter is supported only when the following requirements are met:</p>
     * <p>> *   The **PayType** parameter is set to **Postpaid**.</p>
     * <p>> *   The **Engine** parameter is set to **MySQL**.</p>
     * <p>> *   The **EngineVersion** parameter is set to **5.7**.</p>
     * <p>> *   The **Category** parameter is set to **Basic**.</p>
     */
    @NameInMap("UserBackupId")
    public String userBackupId;

    /**
     * <p>The ID of the VPC.</p>
     * <br>
     * <p>>  If you set the **InstanceNetworkType** parameter to **VPC**, you must also specify the VPCId parameter.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch. The vSwitch must belong to the zone that is specified by the **ZoneId** parameter.</p>
     * <br>
     * <p>>  If you set the **InstanceNetworkType** parameter to **VPC**, you must also specify the VSwitchId parameter.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the zone in which the primary instance resides.</p>
     * <br>
     * <p>> *   If you specify a virtual private cloud (VPC) and a vSwitch, you must specify the ID of the zone to which the specified vSwitch belongs. Otherwise, the instance cannot be created.</p>
     * <p>> *   If the instance runs RDS High-availability Edition, you must specify the **ZoneIdSlave1** parameter, which specifies whether to use the single-zone deployment method or the multi-zone deployment method.</p>
     * <p>> *   If the instance runs RDS Enterprise Edition, you must specify the **ZoneIdSlave1** and **ZoneIdSlave2** parameters, which specify whether to use the single-zone deployment method or the multi-zone deployment method.</p>
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
        @NameInMap("AutoPause")
        public Boolean autoPause;

        @NameInMap("MaxCapacity")
        public Double maxCapacity;

        @NameInMap("MinCapacity")
        public Double minCapacity;

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
         * <p>The key of the tag that you want to add to the instance.</p>
         * <br>
         * <p>> * If the specified tag key is an existing key, the system directly adds the tag key to the instance. You can call the [ListTagResources](~~141258~~) operation to query the details of the existing tags.</p>
         * <p>> *   If the specified tag key is not an existing key, the system creates the tag key and adds the tag key to the instance.</p>
         * <p>> *   The value of this parameter cannot be an empty string.</p>
         * <p>> *   This parameter must be used together with the **Tag.N.Value** parameter.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value that is associated with the specified tag key.</p>
         * <br>
         * <p>> *   If the specified tag value is found in the specified tag key, the system directly adds the tag value to the instance. You can call the [ListTagResources](~~141258~~) operation to query the details of the existing tags.</p>
         * <p>> *   If the specified tag value is not found in the specified tag key, the system creates the tag value and adds the tag value to the instance.</p>
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
