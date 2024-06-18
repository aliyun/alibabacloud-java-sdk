// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>The number of ApsaraDB RDS for MySQL instances that you want to create. The parameter takes effect only when you create multiple ApsaraDB RDS for MySQL instances at a time by using a single request.</p>
     * <p>Valid values: <strong>1</strong> to <strong>20</strong>. Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>If you want to create multiple ApsaraDB RDS for MySQL instances at a time by using a single request, you can add tags to all the instances by using the <strong>Tag.Key</strong> parameter and the <strong>Tag.Value</strong> parameter. After the instances are created, you can manage the instances based on the tags.</li>
     * <li>After you submit a request to create multiple ApsaraDB RDS for MySQL instances, this operation returns <strong>TaskId</strong>, <strong>RequestId</strong>, and <strong>Message</strong>. You can call the DescribeDBInstanceAttribute operation to query the information about an instance.</li>
     * <li>If the value of the <strong>Engine</strong> parameter is not <strong>MySQL</strong> and the value of the Amount parameter is greater than <strong>1</strong>, this operation fails and returns an error code <code>InvalidParam.Engine</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable the automatic payment feature. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: automatically completes the payment. You must make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong>: does not automatically complete the payment. An unpaid order is generated.</li>
     * </ul>
     * <blockquote>
     * <p> The default value is true. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to complete the payment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. You must specify this parameter only if the instance uses the subscription billing method. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The auto-renewal cycle is one month for a monthly subscription.</li>
     * <li>The auto-renewal cycle is one year for a yearly subscription.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The configuration of the Babelfish feature for the instance that runs PostgreSQL.</p>
     * <p>Format:{&quot;babelfishEnabled&quot;:&quot;true&quot;,&quot;migrationMode&quot;:&quot;xxxxxxx&quot;,&quot;masterUsername&quot;:&quot;xxxxxxx&quot;,&quot;masterUserPassword&quot;:&quot;xxxxxxxx&quot;}</p>
     * <p>The following list describes the fields in the format:</p>
     * <ul>
     * <li><strong>babelfishEnabled</strong>: specifies whether to enable Babelfish for the instance. If you set this field to <strong>true</strong>, you enable Babelfish for the instance. If you leave this parameter empty, Babelfish is disabled for the instance.</li>
     * <li><strong>migrationMode</strong>: The migration mode of the instance. Valid values: <strong>single-db</strong> and <strong>multi-db</strong>.</li>
     * <li><strong>masterUsername</strong>: The username of the administrator account. The username can contain lowercase letters, digits, and underscores (_). It must start with a letter and end with a letter or digit. It can be up to 63 characters in length and cannot start with pg.</li>
     * <li><strong>masterUserPassword</strong>: The password of the administrator account. The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. It must be 8 to 32 characters in length. The password can contain any of the following characters: <code>! @ # $ % ^ &amp; * ( ) _ + - =</code>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter applies only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see <a href="https://help.aliyun.com/document_detail/428613.html">Introduction to Babelfish</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;babelfishEnabled&quot;:&quot;true&quot;,&quot;migrationMode&quot;:&quot;single-db&quot;,&quot;masterUsername&quot;:&quot;babelfish_user&quot;,&quot;masterUserPassword&quot;:&quot;Babelfish123!&quot;}</p>
     */
    @NameInMap("BabelfishConfig")
    public String babelfishConfig;

    /**
     * <p>A deprecated parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BpeEnabled")
    public String bpeEnabled;

    /**
     * <p>An invalid parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>The additional business information about the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>121436975448952</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <ul>
     * <li><p>Regular RDS instance</p>
     * <ul>
     * <li><strong>Basic</strong>: RDS Basic Edition.</li>
     * <li><strong>HighAvailability</strong>: RDS High-availability Edition.</li>
     * <li><strong>cluster</strong>: RDS Cluster Edition for ApsaraDB RDS for MySQL.</li>
     * <li><strong>AlwaysOn</strong>: RDS Cluster Edition for ApsaraDB RDS for SQL Server.</li>
     * <li><strong>Finance</strong>: RDS Enterprise Edition.</li>
     * </ul>
     * </li>
     * <li><p>Serverless instance</p>
     * <ul>
     * <li><strong>serverless_basic</strong>: RDS Basic Edition. This edition is available only for instances that run MySQL and PostgreSQL.</li>
     * <li><strong>serverless_standard</strong>: RDS High-availability Edition. This edition is available only for instances that run MySQL and PostgreSQL.</li>
     * <li><strong>serverless_ha</strong>: RDS High-availability Edition for ApsaraDB RDS for SQL Server.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when you create a serverless instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz*****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ColdDataEnabled")
    public Boolean coldDataEnabled;

    /**
     * <p>The connection mode of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Standard</strong>: standard mode</li>
     * <li><strong>Safe</strong>: database proxy mode</li>
     * </ul>
     * <p>ApsaraDB RDS automatically assigns a connection mode to the instance.</p>
     * <blockquote>
     * <p>SQL Server 2012, SQL Server 2016, and SQL Server 2017 support only the standard mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ConnectionMode")
    public String connectionMode;

    /**
     * <p>The internal endpoint that is used to connect to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The policy based on which multiple instances are created. The parameter takes effect only when the value of the <strong>Amount</strong> parameter is greater than 1. Valid values:</p>
     * <ul>
     * <li><strong>Atomicity</strong> (default): atomicity. The instances are all created together. If one instance cannot be created, none of the instances are created.</li>
     * <li><strong>Partial</strong>: non-atomicity. Each instance is independently created. The failure in creating an instance does not affect the creation of the other instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Atomicity</p>
     */
    @NameInMap("CreateStrategy")
    public String createStrategy;

    /**
     * <p>The instance type of the instance. You can specify a standard instance type or an economy instance type. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
     * <p>To create a serverless instance, set this parameter to one of the following values:</p>
     * <ul>
     * <li>If you want to create a serverless instance that runs MySQL on RDS Basic Edition, set this parameter to <strong>mysql.n2.serverless.1c</strong>.</li>
     * <li>If you want to create a serverless instance that runs MySQL on RDS High-availability Edition, set this parameter to <strong>mysql.n2.serverless.2c</strong>.</li>
     * <li>If you want to create a serverless instance that runs SQL Server, set this parameter to <strong>mssql.mem2.serverless.s2</strong>.</li>
     * <li>If you want to create a serverless instance that runs PostgreSQL on RDS Basic Edition, set this parameter to <strong>pg.n2.serverless.1c</strong>.</li>
     * <li>If you want to create a serverless instance that runs PostgreSQL on RDS High-availability Edition, set this parameter to <strong>pg.n2.serverless.2c</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds.mysql.s1.small</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance name. The name must be 2 to 255 characters in length and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
     * <blockquote>
     * <p>The name cannot start with http:// or https://.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Test database</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The network connection type of the instance. The value of this parameter is fixed as <strong>Intranet</strong>, indicating an internal network connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("DBInstanceNetType")
    public String DBInstanceNetType;

    /**
     * <p>The storage capacity of the instance. Unit: GB. The storage capacity increases in increments of 5 GB. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>local_ssd</strong>: local SSD. This is the recommended storage type.</li>
     * <li><strong>cloud_ssd</strong>: standard SSD. This storage type is not recommended. Standard SSDs are no longer available for purchase in some Alibaba Cloud regions.</li>
     * <li><strong>cloud_essd</strong>: enhanced SSD (ESSD) of performance level 1 (PL1).</li>
     * <li><strong>cloud_essd2</strong>: ESSD of PL2.</li>
     * <li><strong>cloud_essd3</strong>: ESSD of PL3.</li>
     * </ul>
     * <p>The default value of this parameter is determined by the instance type specified by the <strong>DBInstanceClass</strong> parameter.</p>
     * <ul>
     * <li>If the instance type specifies the local SSD storage type, the default value of this parameter is <strong>local_ssd</strong>.</li>
     * <li>If the instance type specifies the standard SSD or ESSD storage type, the default value of this parameter is <strong>cloud_essd</strong>.</li>
     * </ul>
     * <blockquote>
     * <p> Serverless instances use only ESSDs of PL1. If you create a serverless instance, you must set this parameter to <strong>cloud_essd</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>Specifies whether the table name is case-sensitive. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Table names are not case-sensitive. This is the default value.</li>
     * <li><strong>false</strong>: Table names are case-sensitive.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DBIsIgnoreCase")
    public String DBIsIgnoreCase;

    /**
     * <p>The parameter template ID. You can call the DescribeParameterGroups operation to query the parameter template ID.</p>
     * <blockquote>
     * <p> This parameter is available if you want to create an instance that runs MySQL or PostgreSQL. If you do not configure this parameter, the default parameter template is used. If you want to use a custom parameter template, you can customize a parameter template and set this parameter to the ID of the custom template.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rpg-sys-*****</p>
     */
    @NameInMap("DBParamGroupId")
    public String DBParamGroupId;

    /**
     * <p>The time zone of the instance. This parameter takes effect only when you set the <strong>Engine</strong> parameter to <strong>MySQL</strong> or <strong>PostgreSQL</strong>.</p>
     * <ul>
     * <li><p>If you set <strong>Engine</strong> to <strong>MySQL</strong>:</p>
     * <ul>
     * <li>The time zone of the instance is in UTC. Valid values: <strong>-12:59</strong> to <strong>+13:00</strong>.</li>
     * <li>If the instance uses local SSDs, you can specify the name of the time zone. Example: Asia/Hong_Kong. For more information, see <a href="https://help.aliyun.com/document_detail/297356.html">Time zones</a>.</li>
     * </ul>
     * </li>
     * <li><p>If you set <strong>Engine</strong> to <strong>PostgreSQL</strong>:</p>
     * <ul>
     * <li>The time zone of the instance is not in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/297356.html">Time zones</a>.</li>
     * <li>You can specify this parameter only when the instance runs PostgreSQL with standard SSDs or ESSDs.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can specify the time zone when you create a primary instance. You cannot specify the time zone when you create a read-only instance. Read-only instances inherit the time zone of their primary instance.</li>
     * <li>If you do not specify this parameter, the system automatically assigns the default time zone of the region in which the instance resides.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>+08:00</p>
     */
    @NameInMap("DBTimeZone")
    public String DBTimeZone;

    /**
     * <p>The ID of the dedicated cluster to which the instance belongs.</p>
     * <p>If you create the instance in a dedicated cluster, you must specify this parameter.</p>
     * <ul>
     * <li>You can call the DescribeDedicatedHostGroups operation to query the information about the dedicated cluster.</li>
     * <li>If no dedicated clusters are created, you can call the CreateDedicatedHostGroup operation to create a dedicated cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dhg-4n*****</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>Specifies whether to enable the release protection feature for the instance. This feature is available only for pay-as-you-go instances. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run but does not create the instance. The system checks items such as the request parameters, request format, service limits, and available resources.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, the instance is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the key that is used for cloud disk encryption in the region in which the instance is deployed. If this parameter is specified, cloud disk encryption is enabled and you must also specify the <strong>RoleARN</strong> parameter. Cloud disk encryption cannot be disabled after it is enabled.</p>
     * <p>You can obtain the ID of the key in the Key Management Service (KMS) console or create a key. For more information, see <a href="https://help.aliyun.com/document_detail/181610.html">Create a key</a>.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is not required when you create an instance that runs MySQL, PostgreSQL, or SQL Server. You need to only specify the <strong>RoleARN</strong> parameter to create an instance that has cloud disk encryption enabled by using the obtained key ID.</li>
     * <li>You can configure RAM authorization to require a RAM user to enable cloud disk encryption when the RAM user is used to create an instance. If cloud disk encryption is disabled during the instance creation, the creation operation fails. To complete the configuration, you can attach the following policy to the RAM user: <code>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Deny&quot;,&quot;Action&quot;:&quot;rds:CreateDBInstance&quot;,&quot;Resource&quot;:&quot;*&quot;,&quot;Condition&quot;:{&quot;StringEquals&quot;:{&quot;rds:DiskEncryptionRequired&quot;:&quot;false&quot;}}}]}</code></li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <p>Warning: The configuration also affects the CreateOrder operation that is called to create instances in the console.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0d24*****-da7b-4786-b981-9a164dxxxxxx</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The database engine of the instance. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>SQLServer</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>MariaDB</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance. Valid values:</p>
     * <ul>
     * <li><p>Regular instance</p>
     * <ul>
     * <li>Valid values when you set Engine to MySQL: <strong>5.5</strong>, <strong>5.6</strong>, <strong>5.7</strong>, and <strong>8.0</strong></li>
     * <li>Valid values when you set Engine to SQLServer: <strong>08r2_ent_ha</strong> (cloud disks, discontinued), <strong>2008r2</strong> (local disks, discontinued), <strong>2012</strong> (SQL Server EE Basic), <strong>2012_ent_ha</strong>, <strong>2012_std_ha</strong>, <strong>2012_web</strong>, <strong>2014_ent_ha</strong>, <strong>2014_std_ha</strong>, <strong>2016_ent_ha</strong>, <strong>2016_std_ha</strong>, <strong>2016_web</strong>, <strong>2017_ent</strong>, <strong>2017_std_ha</strong>, <strong>2017_web</strong>, <strong>2019_ent</strong>, <strong>2019_std_ha</strong>, <strong>2019_web</strong>, <strong>2022_ent</strong>, <strong>2022_std_ha</strong>, and <strong>2022_web</strong></li>
     * <li>Valid values when you set Engine to PostgreSQL: <strong>10.0</strong>, <strong>11.0</strong>, <strong>12.0</strong>, <strong>13.0</strong>, <strong>14.0</strong>, <strong>15.0</strong>, and <strong>16.0</strong></li>
     * <li>Valid value if you set Engine to MariaDB: <strong>10.3</strong></li>
     * </ul>
     * </li>
     * <li><p>Serverless instance</p>
     * <ul>
     * <li>Valid values when you set Engine to MySQL: <strong>5.7</strong> and <strong>8.0</strong></li>
     * <li>Valid values when you set Engine to SQLServer: <strong>2016_std_sl</strong>, <strong>2017_std_sl</strong>, and <strong>2019_std_sl</strong></li>
     * <li>Valid values when you set Engine to PostgreSQL: <strong>14.0</strong>, <strong>15.0</strong>, and <strong>16.0</strong></li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     * </li>
     * <li><p>RDS instances that run SQL Server: <code>_ent</code> specifies SQL Server EE (Always On), <code>_ent_ha</code> specifies SQL Server EE, <code>_std_ha</code> specifies SQL Server SE, and <code>_web</code> specifies SQL Server Web.</p>
     * </li>
     * <li><p>RDS instances that run SQL Server 2014 are not available for purchase on the international site (alibabacloud.com).</p>
     * </li>
     * <li><p>Babelfish is supported only for RDS instances that run PostgreSQL 15.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.6</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong>: virtual private cloud (VPC)</li>
     * <li><strong>Classic</strong>: the classic network</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If the instance runs MySQL and uses cloud disks, you must set this parameter to <strong>VPC</strong>.</p>
     * </li>
     * <li><p>If the instance runs PostgreSQL or MariaDB, you must set this parameter to <strong>VPC</strong>.</p>
     * </li>
     * <li><p>If the instance runs SQL Server Basic or SQL Server Web, you can set this parameter to VPC or Classic. If the instance runs other database engine, you must set this parameter to <strong>VPC</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Classic</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IoAccelerationEnabled")
    public String ioAccelerationEnabled;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * <li><strong>Serverless</strong>: serverless. This value is not supported for instances that run MariaDB. For more information, see <a href="https://help.aliyun.com/document_detail/411291.html">Overview of serverless ApsaraDB RDS for MySQL instances</a>, <a href="https://help.aliyun.com/document_detail/604344.html">Overview of serverless ApsaraDB RDS for SQL Server instances</a>, and <a href="https://help.aliyun.com/document_detail/607742.html">Overview of serverless ApsaraDB RDS for PostgreSQL instances</a>.</li>
     * </ul>
     * <blockquote>
     * <p>The system automatically generates a purchase order and completes the payment.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong></li>
     * <li><strong>Month</strong></li>
     * </ul>
     * <blockquote>
     * <p> If you set the PayType parameter to <strong>Prepaid</strong>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The port. You can initialize the port when you create the instance.</p>
     * <ul>
     * <li>Valid values if the instance runs MySQL: 1000 to 65534</li>
     * <li>Valid values if the instance runs PostgreSQL, SQL Server, or MariaDB: 1000 to 5999</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The private IP address of the instance. The private IP address must be within the CIDR block that is supported by the specified vSwitch. ApsaraDB RDS automatically assigns a private IP address to the instance based on the values of the <strong>VPCId</strong> and <strong>vSwitchId</strong> parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) that is provided by your Alibaba Cloud account for RAM users. RAM users can use the ARN to connect ApsaraDB RDS to KMS. You can call the CheckCloudResourceAuthorized operation to query the ARN.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1406xxxxxx:role/aliyunrdsinstanceencryptiondefaultrole</p>
     */
    @NameInMap("RoleARN")
    public String roleARN;

    /**
     * <p>The IP address whitelist of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/43185.html">Use a database client or the CLI to connect to an ApsaraDB RDS for MySQL instance</a>. If the IP address whitelist contains more than one entry, separate the entries with commas (,). Each entry must be unique. The IP address whitelist can contain up to 1,000 entries. The entries in the IP address whitelist must be in one of the following formats:</p>
     * <ul>
     * <li>IP addresses, such as 10.10.XX.XX.</li>
     * <li>CIDR blocks, such as 10.10.XX.XX/24. In this example, 24 indicates that the prefix of each IP address in the IP address whitelist is 24 bits in length. You can replace 24 with a value within the range of 1 to 32.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.XX.XX/24</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The settings of the serverless instance. This parameter is required when you create a serverless instance.</p>
     * <blockquote>
     * <p> ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     * </blockquote>
     */
    @NameInMap("ServerlessConfig")
    public CreateDBInstanceRequestServerlessConfig serverlessConfig;

    /**
     * <p>Specifies whether to enable the automatic storage expansion feature for the instance. This feature is supported if the instance runs MySQL or PostgreSQL. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong></li>
     * <li><strong>Disable</strong> (default)</li>
     * </ul>
     * <blockquote>
     * <p> After the instance is created, you can call the ModifyDasInstanceConfig operation to adjust the settings. For more information, see <a href="https://help.aliyun.com/document_detail/173826.html">Configure automatic storage expansion</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    /**
     * <p>The threshold in percentage based on which automatic storage expansion is triggered. Valid values:</p>
     * <ul>
     * <li><strong>10</strong></li>
     * <li><strong>20</strong></li>
     * <li><strong>30</strong></li>
     * <li><strong>40</strong></li>
     * <li><strong>50</strong></li>
     * </ul>
     * <blockquote>
     * <p> If you set the <strong>StorageAutoScale</strong> parameter to <strong>Enable</strong>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("StorageThreshold")
    public Integer storageThreshold;

    /**
     * <p>The maximum storage capacity that is allowed for automatic storage expansion. The storage capacity of the instance cannot exceed the maximum storage capacity. Unit: GB.</p>
     * <blockquote>
     * <ul>
     * <li>Valid values: an integer greater than or equal to 0.</li>
     * <li>If you set <strong>StorageAutoScale</strong> to <strong>Enable</strong>, you must specify this parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("StorageUpperBound")
    public Integer storageUpperBound;

    /**
     * <p>A deprecated parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>gbk</p>
     */
    @NameInMap("SystemDBCharset")
    public String systemDBCharset;

    /**
     * <p>The tags that are added to instances.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDBInstanceRequestTag> tag;

    /**
     * <p>The ID of the host to which the logger instance belongs in the specified dedicated cluster.</p>
     * <p>If you want to create an instance that runs RDS Enterprise Edition in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.</p>
     * <ul>
     * <li>You can call the DescribeDedicatedHosts operation to query the host in the dedicated cluster.</li>
     * <li>If no hosts are created, you can call the CreateDedicatedHost operation to create a host.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>i-bp*****3</p>
     */
    @NameInMap("TargetDedicatedHostIdForLog")
    public String targetDedicatedHostIdForLog;

    /**
     * <p>The ID of the host to which the instance belongs in the specified dedicated cluster.</p>
     * <p>If you create the instance in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.</p>
     * <ul>
     * <li>You can call the DescribeDedicatedHosts operation to query the host in the dedicated cluster.</li>
     * <li>If no hosts are created, you can call the CreateDedicatedHost operation to create a host.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>i-bp*****1</p>
     */
    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    /**
     * <p>The ID of the host to which the secondary instance belongs in the specified dedicated cluster.</p>
     * <p>If you want to create an instance that runs RDS High-availability Edition or RDS Enterprise Edition in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.</p>
     * <ul>
     * <li>You can call the DescribeDedicatedHosts operation to query the host in the dedicated cluster.</li>
     * <li>If no hosts are created, you can call the CreateDedicatedHost operation to create a host.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>i-bp*****2</p>
     */
    @NameInMap("TargetDedicatedHostIdForSlave")
    public String targetDedicatedHostIdForSlave;

    /**
     * <p>The minor engine version of the instance. This parameter is required only when you create an instance that runs MySQL or PostgreSQL. The value format varies based on the database engine of the instance.</p>
     * <ul>
     * <li><p>If you create an instance that runs MySQL, the value is in the following format: <code>&lt;RDS edition&gt;_&lt;Minor engine version&gt;</code>. Examples: <code>rds_20200229</code>, <code>xcluster_20200229</code>, and <code>xcluster80_20200229</code>.</p>
     * <ul>
     * <li>rds: The instance runs RDS Basic Edition or RDS High-availability Edition.</li>
     * <li>xcluster: The instance runs MySQL 5.7 on RDS Enterprise Edition.</li>
     * <li>xcluster80: The instance runs MySQL 8.0 on RDS Enterprise Edition.</li>
     * </ul>
     * <blockquote>
     * <p>You can call the DescribeDBMiniEngineVersions operation to query the minor engine version. For more information about the differences between minor engine versions of AliSQL, see <a href="https://help.aliyun.com/document_detail/96060.html">Release notes</a>.</p>
     * </blockquote>
     * </li>
     * <li><p>If you create an instance that runs PostgreSQL, the value is in the following format: <code>rds_postgres_&lt;Major engine version&gt;00_&lt;Minor engine version&gt;</code>. Example: <code>rds_postgres_1400_20220830</code>.</p>
     * <ul>
     * <li>1400: The major engine version is PostgreSQL 14.</li>
     * <li>20220830: the AliPG version. You can call the DescribeDBMiniEngineVersions operation to query the AliPG version. For more information about minor engine versions, see <a href="https://help.aliyun.com/document_detail/126002.html">Release notes for AliPG</a>.</li>
     * </ul>
     * <blockquote>
     * <p>If you configure the <strong>BabelfishConfig</strong> parameter for your instance that runs PostgreSQL and set the babelfishEnabled field to true, the value of this parameter is in the following format: <code>rds_postgres_Major engine version00_AliPG version_babelfish</code>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rds_20200229</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <p>The subscription duration of the instance.</p>
     * <ul>
     * <li>If you set the <strong>Period</strong> parameter to <strong>Year</strong>, the value of the <strong>UsedTime</strong> parameter ranges from <strong>1 to 5</strong>.</li>
     * <li>If you set the <strong>Period</strong> parameter to <strong>Month</strong>, the value of the <strong>UsedTime</strong> parameter ranges from <strong>1 to 11</strong>.</li>
     * </ul>
     * <blockquote>
     * <p> If you set the PayType parameter to <strong>Prepaid</strong>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The ID of the full backup file. You can call the ListUserBackupFiles operation to query the ID of the full backup file. If you want to create an instance by using the data of a backup file, you must specify this parameter.</p>
     * <p>This parameter is supported only when the following requirements are met:</p>
     * <ul>
     * <li>The <strong>PayType</strong> parameter is set to <strong>Postpaid</strong>.</li>
     * <li>The <strong>Engine</strong> parameter is set to <strong>MySQL</strong>.</li>
     * <li>The <strong>EngineVersion</strong> parameter is set to <strong>5.7</strong>.</li>
     * <li>The <strong>Category</strong> parameter is set to <strong>Basic</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>67798*****</p>
     */
    @NameInMap("UserBackupId")
    public String userBackupId;

    /**
     * <p>The ID of the VPC to which the instance belongs.</p>
     * <blockquote>
     * <p>This parameter is available when you set the <strong>InstanceNetworkType</strong> parameter to <strong>VPC</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-*****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch. The vSwitch must belong to the zone that is specified by <strong>ZoneId</strong>.</p>
     * <ul>
     * <li>If you set <strong>InstanceNetworkType</strong> to <strong>VPC</strong>, you must also specify this parameter.</li>
     * <li>If you specify the ZoneSlaveId1 parameter, you must specify the IDs of two vSwitches for this parameter and separate the IDs with a comma (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-*****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The entries in the whitelist. If you enter multiple IP addresses or CIDR blocks, you must separate the IP addresses or CIDR blocks with commas (,). Do not add spaces preceding or following the commas. Example: <code>192.168.0.1,172.16.213.9</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XXX.XX.1,172.XXX.XX.9</p>
     */
    @NameInMap("WhitelistTemplateList")
    public String whitelistTemplateList;

    /**
     * <p>The zone ID of the primary instance.</p>
     * <ul>
     * <li>If you specify a virtual private cloud (VPC) and a vSwitch, you must specify the ID of the zone to which the specified vSwitch belongs. Otherwise, the instance cannot be created.</li>
     * <li>If the instance runs RDS High-availability Edition, you must specify the <strong>ZoneIdSlave1</strong> parameter. The ZoneIdSlave1 parameter specifies whether to use the single-zone deployment method or the multi-zone deployment method.</li>
     * <li>If the instance runs RDS Enterprise Edition, you must specify the <strong>ZoneIdSlave1</strong> and <strong>ZoneIdSlave2</strong> parameters. The ZoneIdSlave1 and ZoneIdSlave2 parameters specify whether to use the single-zone deployment method or the multi-zone deployment method.</li>
     * <li>If the instance runs MySQL on RDS Cluster Edition, you must specify the <strong>ZoneIdSlave1</strong> parameter for the RDS cluster that has two nodes and the <strong>ZoneIdSlave1</strong> and <strong>ZoneIdSlave2</strong> parameters for the RDS cluster that has three nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The zone ID of the secondary instance.</p>
     * <ul>
     * <li>If you set this parameter to <strong>Auto</strong>, the multi-zone deployment method is used and the zone of the secondary instance is automatically configured.</li>
     * <li>If you set this parameter to the same value as the <strong>ZoneId</strong> parameter, the single-zone deployment method is used.</li>
     * <li>If you set this parameter to a value that is different from the value of the <strong>ZoneId</strong> parameter, the multiple-zone deployment method is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-c</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-d</p>
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

    public CreateDBInstanceRequest setColdDataEnabled(Boolean coldDataEnabled) {
        this.coldDataEnabled = coldDataEnabled;
        return this;
    }
    public Boolean getColdDataEnabled() {
        return this.coldDataEnabled;
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

    public CreateDBInstanceRequest setIoAccelerationEnabled(String ioAccelerationEnabled) {
        this.ioAccelerationEnabled = ioAccelerationEnabled;
        return this;
    }
    public String getIoAccelerationEnabled() {
        return this.ioAccelerationEnabled;
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

    public CreateDBInstanceRequest setWhitelistTemplateList(String whitelistTemplateList) {
        this.whitelistTemplateList = whitelistTemplateList;
        return this;
    }
    public String getWhitelistTemplateList() {
        return this.whitelistTemplateList;
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
         * <p>Specifies whether to enable the automatic startup and stop feature for the serverless instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required only for serverless instances that run MySQL and PostgreSQL. After the automatic start and stop feature is enabled, if no connections to the instance are established within 10 minutes, the instance is suspended. After a connection to the instance is established, the instance is resumed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoPause")
        public Boolean autoPause;

        /**
         * <p>The maximum number of RDS Capacity Units (RCUs). Valid values:</p>
         * <ul>
         * <li>Serverless ApsaraDB RDS for MySQL instances: <strong>1 to 32</strong></li>
         * <li>Serverless ApsaraDB RDS for SQL Server instances: <strong>2 to 8</strong></li>
         * <li>Serverless ApsaraDB RDS for PostgreSQL instances: <strong>1 to 14</strong></li>
         * </ul>
         * <blockquote>
         * <p> The value of this parameter must be greater than or equal to the value of <strong>MinCapacity</strong> and can be set only to an <strong>integer</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MaxCapacity")
        public Double maxCapacity;

        /**
         * <p>The minimum value of RCUs. Valid values:</p>
         * <ul>
         * <li>Serverless ApsaraDB RDS for MySQL instances: <strong>0.5 to 32</strong>.</li>
         * <li>Serverless ApsaraDB RDS for SQL Server instances: <strong>2 to 8</strong>. Only integers are supported.</li>
         * <li>Serverless ApsaraDB RDS for PostgreSQL instances: <strong>0.5 to 14</strong></li>
         * </ul>
         * <blockquote>
         * <p> The value of this parameter must be less than or equal to the value of <strong>MaxCapacity</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("MinCapacity")
        public Double minCapacity;

        /**
         * <p>Specifies whether to enable the forced scaling feature for the serverless instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required only for serverless instances that run MySQL and PostgreSQL. If you set this parameter to true, a service interruption that lasts approximately 30 to 120 seconds occurs during forced scaling. Process with caution.</p>
         * </li>
         * <li><p>The RCU scaling for a serverless instance immediately takes effect. In some cases, such as the execution of large transactions, the scaling does not immediately take effect. In this case, you can enable this feature to forcefully scale the RCUs of the instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The tag key. You can use this parameter to add tags to the instance.</p>
         * <ul>
         * <li>If the specified tag key is an existing key, the system directly adds the tag key to the instance. You can call the ListTagResources to query the existing tag.</li>
         * <li>If the specified tag key does not exist, the system creates the tag key and adds the tag key to the instance.</li>
         * <li>The value cannot be an empty string.</li>
         * <li>This parameter must be used together with the <strong>Tag.Value</strong> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can use this parameter to add tags to the instance.</p>
         * <ul>
         * <li>If the specified tag value is found in the specified tag key, the system directly adds the tag value to the instance. You can call the ListTagResources to query the existing tag.</li>
         * <li>If the specified tag value is not found in the specified tag key, the system creates the tag value and adds the tag value to the instance.</li>
         * <li>This parameter must be used together with the <strong>Tag.Key</strong> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testvalue1</p>
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
