// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>The number of ApsaraDB RDS for MySQL instances to create. This parameter is applicable only when you create multiple ApsaraDB RDS for MySQL instances at a time.</p>
     * <p>Valid values: <strong>1</strong> to <strong>20</strong>. Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>When you create multiple ApsaraDB RDS for MySQL instances, you can use the <strong>Tag.Key</strong> and <strong>Tag.Value</strong> parameters to add tags to the instances in the same batch. This facilitates instance management by tag after creation.</li>
     * <li>After multiple instances are created, the API operation returns only the <strong>TaskId</strong>, <strong>RequestId</strong>, and <strong>Message</strong> parameters. Other detail parameters are not returned. To query the details of a specific instance, call the DescribeDBInstanceAttribute operation.</li>
     * <li>If <strong>Engine</strong> is not set to <strong>MySQL</strong> and the value of this parameter is greater than <strong>1</strong>, the API operation fails and returns the error code <code>InvalidParam.Engine</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to automatically create a proxy. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables automatic creation. By default, a general-purpose proxy is created.</li>
     * <li><strong>false</strong>: disables automatic creation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoCreateProxy")
    public Boolean autoCreateProxy;

    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables automatic payment. Make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong>: generates an order without deducting fees.</li>
     * </ul>
     * <blockquote>
     * <p>The default value is true. If your payment method has an insufficient balance, you can set AutoPay to false. In this case, an unpaid order is generated, and you can log on to the ApsaraDB RDS console to complete the payment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. This parameter is valid only when you create a subscription instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you purchase the instance on a monthly basis, the auto-renewal epoch is one month.</li>
     * <li>If you purchase the instance on a yearly basis, the auto-renewal epoch is one year.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>Specifies whether to use a voucher. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: uses a voucher.</li>
     * <li><strong>false</strong>: does not use a voucher. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <p>If you use a voucher and later need to downgrade the instance configuration, the amount deducted by the voucher will not be refunded.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The configuration information for Babelfish for ApsaraDB RDS for PostgreSQL.</p>
     * <p>Configuration format: {&quot;babelfishEnabled&quot;:&quot;true&quot;,&quot;migrationMode&quot;:&quot;xxxxxxx&quot;,&quot;masterUsername&quot;:&quot;xxxxxxx&quot;,&quot;masterUserPassword&quot;:&quot;xxxxxxxx&quot;}</p>
     * <p>Parameter description:</p>
     * <ul>
     * <li><strong>babelfishEnabled</strong>: specifies whether to enable Babelfish. Set the value to <strong>true</strong> to enable Babelfish. By default, Babelfish is disabled.</li>
     * <li><strong>migrationMode</strong>: the database mode. Set the value to <strong>single-db</strong> for the single-database mode or <strong>multi-db</strong> for the multi-database mode.</li>
     * <li><strong>masterUsername</strong>: the initial administrator account. The username must be 1 to 63 characters in length and can contain lowercase letters, digits, and underscores (_). It must start with a letter and end with a letter or digit. It cannot start with pg.</li>
     * <li><strong>masterUserPassword</strong>: the password of the administrator account. The password must be 8 to 32 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include <code>! @ # $ % ^ &amp; * () _ + - =</code>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is applicable only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see <a href="https://help.aliyun.com/document_detail/428613.html">Babelfish overview</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;babelfishEnabled&quot;:&quot;true&quot;,&quot;migrationMode&quot;:&quot;single-db&quot;,&quot;masterUsername&quot;:&quot;babelfish_user&quot;,&quot;masterUserPassword&quot;:&quot;Babelfish123!&quot;}</p>
     */
    @NameInMap("BabelfishConfig")
    public String babelfishConfig;

    @NameInMap("BpeEnabled")
    public String bpeEnabled;

    /**
     * <p>Specifies whether to enable the I/O performance burst feature for Premium ESSD cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the feature.</li>
     * <li><strong>false</strong>: disables the feature.<blockquote>
     * <p>For more information about the I/O performance burst feature for Premium ESSD cloud disks, see <a href="https://help.aliyun.com/document_detail/2340501.html">What is a Premium ESSD cloud disk?</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>The extended business parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>121436975448952</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The instance edition. Valid values:</p>
     * <ul>
     * <li><p>Regular instances</p>
     * <ul>
     * <li><strong>Basic</strong>: Basic Edition.</li>
     * <li><strong>HighAvailability</strong>: high-availability series.</li>
     * <li><strong>cluster</strong>: Cluster Edition for MySQL or PostgreSQL.</li>
     * <li><strong>AlwaysOn</strong>: Cluster Edition for SQL Server.</li>
     * <li><strong>Finance</strong>: RDS Enterprise Edition.<blockquote>
     * <p>This parameter is required when you create a SQL Server Enterprise Edition Cluster&lt;props=&quot;china&quot;&gt;, Basic Edition Standard, or Basic Edition Enterprise instance. For example, when you create a Basic Edition 2022 Enterprise Edition Cluster (2022_ent) instance, you must set this parameter to Basic.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li><p>Serverless instances</p>
     * <ul>
     * <li><strong>serverless_basic</strong>: Serverless Basic Edition. This value is applicable only to MySQL and PostgreSQL.</li>
     * <li><strong>serverless_standard</strong>: Serverless high-availability series. This value is applicable only to MySQL and PostgreSQL.</li>
     * <li><strong>serverless_ha</strong>: Serverless high-availability series for SQL Server.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when PayType is set to Serverless.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2701832.html">data archiving</a> feature for Premium ESSD cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the feature.</li>
     * <li><strong>false</strong>: disables the feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ColdDataEnabled")
    public Boolean coldDataEnabled;

    /**
     * <p>The access mode of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Standard</strong>: standard access mode.</li>
     * <li><strong>Safe</strong>: database proxy mode.</li>
     * </ul>
     * <p>The default value is allocated by the RDS system.</p>
     * <blockquote>
     * <p>SQL Server 2012, 2016, and 2017 instances support only the standard access mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ConnectionMode")
    public String connectionMode;

    /**
     * <p>The internal endpoint of the database.</p>
     * <p>Endpoint format: <code>xxx.mysql.rds.aliyuncs.com</code>, where <code>xxx</code> is the prefix of the instance ID, such as rm-uf6wjk5***.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The strategy for creating multiple instances at a time. This parameter takes effect only when <strong>Amount</strong> is greater than 1. Valid values:</p>
     * <ul>
     * <li><strong>Atomicity</strong>: atomicity. All instances in the same batch are created successfully, or none of them are created if one fails. This is the default value.</li>
     * <li><strong>Partial</strong>: non-atomicity. The creation of an instance is not affected by other instances in the same batch.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Atomicity</p>
     */
    @NameInMap("CreateStrategy")
    public String createStrategy;

    @NameInMap("CustomExtraInfo")
    public String customExtraInfo;

    /**
     * <p>The instance type. You can specify a standard or Yitian instance type. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
     * <p>To create a Serverless instance, specify one of the following values:</p>
     * <ul>
     * <li>MySQL Basic Edition: <strong>mysql.n2.serverless.1c</strong></li>
     * <li>MySQL high-availability series: <strong>mysql.n2.serverless.2c</strong></li>
     * <li>SQL Server: <strong>mssql.mem2.serverless.s2</strong></li>
     * <li>PostgreSQL Basic Edition: <strong>pg.n2.serverless.1c</strong></li>
     * <li>PostgreSQL high-availability series: <strong>pg.n2.serverless.2c</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.n2.medium.2c</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The name of the instance. The name must be 2 to 255 characters in length. It must start with a letter and can contain digits, letters, and hyphens (-).</p>
     * <blockquote>
     * <p>The name cannot start with http:// or https://.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testInstance</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The network connectivity type of the instance. Set the value to <strong>Intranet</strong>, which indicates an internal network connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("DBInstanceNetType")
    public String DBInstanceNetType;

    /**
     * <p>Instance storage capacity of the instance. Unit: GB. Instance storage capacity increases in increments of 5 GB. For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
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
     * <li><strong>local_ssd</strong>: high-performance local SSD (recommended).</li>
     * <li><strong>general_essd</strong>: Premium ESSD cloud disk (recommended).</li>
     * <li><strong>cloud_essd</strong>: PL1 ESSD.</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
     * <li><strong>cloud_ssd</strong>: standard SSD (not recommended, discontinued in some regions).</li>
     * </ul>
     * <p>The default value of this parameter is automatically determined based on the instance type specified by <strong>DBInstanceClass</strong>:</p>
     * <ul>
     * <li>If the instance type is a high-performance local SSD type, the default value is <strong>local_ssd</strong>.</li>
     * <li>If the instance type is a cloud disk type, the default value is <strong>cloud_essd</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>Serverless instances support only PL1 ESSDs and Premium ESSD cloud disks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>general_essd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>Specifies whether table names are case-sensitive. Valid values:</p>
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
     * <p>The ID of the parameter template. You can call the DescribeParameterGroups operation to query the parameter template ID.</p>
     * <blockquote>
     * <p>This parameter is supported only by MySQL and PostgreSQL. If you do not specify this parameter, the default parameter template is used. You can also create a custom parameter template and specify it here.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rpg-sys-****</p>
     */
    @NameInMap("DBParamGroupId")
    public String DBParamGroupId;

    /**
     * <p>The time zone of the instance. This parameter takes effect only when <strong>Engine</strong> is set to <strong>MySQL</strong> or <strong>PostgreSQL</strong>.</p>
     * <ul>
     * <li>If <strong>Engine</strong> is set to <strong>MySQL</strong>:<ul>
     * <li>This parameter specifies the UTC time zone. Valid values: <strong>-12:59</strong> to <strong>+13:00</strong>.</li>
     * <li>For an instance with Premium Local SSDs, you can specify a named time zone, such as Asia/Hong_Kong. For more information about named time zones, see <a href="https://help.aliyun.com/document_detail/297356.html">Named time zones</a>.</li>
     * </ul>
     * </li>
     * <li>If <strong>Engine</strong> is set to <strong>PostgreSQL</strong>:<ul>
     * <li>This parameter specifies a named time zone. UTC time zones are not supported. For more information about named time zones, see <a href="https://help.aliyun.com/document_detail/297356.html">Named time zones</a>.</li>
     * <li>This parameter can be configured only for ApsaraDB RDS for PostgreSQL instances with cloud disks.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can set the time zone when you purchase a primary instance. Read-only instances do not support parameter settings for the time zone and inherit the time zone of the primary instance.</li>
     * <li>If you do not specify this parameter, the system selects the default time zone based on the region where the instance is created.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>+08:00</p>
     */
    @NameInMap("DBTimeZone")
    public String DBTimeZone;

    /**
     * <p>The ID of the dedicated cluster host group.</p>
     * <p>This parameter is required when you create an instance in a dedicated cluster.</p>
     * <ul>
     * <li>You can call the DescribeDedicatedHostGroups operation to query the host group information.</li>
     * <li>If you have not created a host group, you can call the CreateDedicatedHostGroup operation to create one.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dhg-4n****</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>Specifies whether to enable release protection for the instance. This feature is supported only for pay-as-you-go instances. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables release protection.</li>
     * <li><strong>false</strong>: disables release protection. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to perform a precheck before creating the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a precheck but does not create the instance. The system checks the request parameters, request format, service limits, and inventory.</li>
     * <li><strong>false</strong>: sends a normal request and creates the instance after the request passes the precheck. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the key used for cloud disk encryption in the same region. If you specify this parameter, cloud disk encryption is enabled and cannot be disabled. You must also specify <strong>RoleARN</strong>.</p>
     * <p>You can view the key ID or create a new key in the Key Management Service (KMS) console. For more information, see <a href="https://help.aliyun.com/document_detail/181610.html">Create a key</a>.</p>
     * <blockquote>
     * <ul>
     * <li>For ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and ApsaraDB RDS for SQL Server, you do not need to specify this parameter. You only need to specify <strong>RoleARN</strong> to use the service key to create an instance with cloud disk encryption enabled.</li>
     * <li>If RAM authorization requires RAM users to enable cloud disk encryption when creating instances, the instances cannot be created if cloud disk encryption is not enabled. Configure the following RAM policy for the RAM user:
     * <code>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Deny&quot;,&quot;Action&quot;:&quot;rds:CreateDBInstance&quot;,&quot;Resource&quot;:&quot;*&quot;,&quot;Condition&quot;:{&quot;StringEquals&quot;:{&quot;rds:DiskEncryptionRequired&quot;:&quot;false&quot;}}}]}</code>
     * Warning: This configuration also affects the CreateOrder operation for creating instances in the console.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0d24*****-da7b-4786-b981-9a164dxxxxxx</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The database engine. Valid values:</p>
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
     * <p>The database engine version. Valid values:</p>
     * <ul>
     * <li>Regular instances<ul>
     * <li>MySQL: <strong>5.5</strong>, <strong>5.6</strong>, <strong>5.7</strong>, and <strong>8.0</strong></li>
     * <li>SQL Server: <strong>08r2_ent_ha</strong> (cloud disk edition, discontinued), <strong>2008r2</strong> (high-performance local SSD, discontinued), <strong>2012</strong> (Enterprise Edition Standalone), <strong>2012_ent_ha</strong>, <strong>2012_std_ha</strong>, <strong>2012_web</strong>, <strong>2014_ent_ha</strong>, <strong>2014_std_ha</strong>, <strong>2016_ent_ha</strong>, <strong>2016_std_ha</strong>, <strong>2016_web</strong>, <strong>2017_ent</strong>, <strong>2017_std_ha</strong>, <strong>2017_web</strong>, <strong>2019_ent</strong>, <strong>2019_std_ha</strong>, <strong>2019_web</strong>, <strong>2022_ent</strong>, <strong>2022_std_ha</strong>, <strong>2022_web</strong>, <strong>2025_ent</strong>, and <strong>2025_std</strong></li>
     * <li>PostgreSQL: <strong>10.0</strong>, <strong>11.0</strong>, <strong>12.0</strong>, <strong>13.0</strong>, <strong>14.0</strong>, <strong>15.0</strong>, <strong>16.0</strong>, <strong>17.0</strong>, and <strong>18.0</strong></li>
     * <li>MariaDB: <strong>10.3</strong> and <strong>10.6</strong></li>
     * </ul>
     * </li>
     * <li>Serverless instances<ul>
     * <li>MySQL: <strong>5.7</strong> and <strong>8.0</strong></li>
     * <li>SQL Server: <strong>2016_std_sl</strong>, <strong>2017_std_sl</strong>, and <strong>2019_std_sl</strong></li>
     * <li>PostgreSQL: <strong>14.0</strong>, <strong>15.0</strong>, <strong>16.0</strong>, <strong>17.0</strong>, and <strong>18.0</strong></li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>MariaDB does not support Serverless instances.</li>
     * <li>For SQL Server instances, <code>_ent</code> indicates the Enterprise Edition Cluster, <code>_ent_ha</code> indicates the Enterprise Edition, <code>_std_ha</code> indicates the Standard Edition, and <code>_web</code> indicates the Web Edition.</li>
     * <li>SQL Server 2014 instances are not available on the international site.</li>
     * <li>Babelfish for ApsaraDB RDS for PostgreSQL instances support only major version 15.0.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>Specifies whether to enable <a href="https://help.aliyun.com/document_detail/2856526.html">native replication for ApsaraDB RDS for MySQL</a>. Valid values:</p>
     * <ul>
     * <li><strong>ON</strong>: enables native replication.</li>
     * <li><strong>OFF</strong>: disables native replication.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("ExternalReplication")
    public Boolean externalReplication;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong>: Virtual Private Cloud (VPC).</li>
     * <li><strong>Classic</strong>: classic network.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>ApsaraDB RDS for MySQL cloud disk instances support only VPCs. You must set this parameter to <strong>VPC</strong>.</li>
     * <li>ApsaraDB RDS for PostgreSQL and ApsaraDB RDS for MariaDB instances support only VPCs. You must set this parameter to <strong>VPC</strong>.</li>
     * <li>ApsaraDB RDS for SQL Server Basic Edition and Web Edition instances support both the classic network and VPCs. Other instances support only VPCs. You must set this parameter to <strong>VPC</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2527067.html">Buffer Pool Extension (BPE)</a> feature for Premium ESSD cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enables the feature.</li>
     * <li><strong>0</strong>: disables the feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IoAccelerationEnabled")
    public String ioAccelerationEnabled;

    /**
     * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2858761.html">16KB atomic write</a> feature. Valid values:</p>
     * <ul>
     * <li><strong>optimized</strong>: enables the feature.</li>
     * <li><strong>none</strong>: disables the feature. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("OptimizedWrites")
    public String optimizedWrites;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * <li><strong>Serverless</strong>: Serverless billing method. MariaDB instances are not supported. For more information, see <a href="https://help.aliyun.com/document_detail/411291.html">Overview of ApsaraDB RDS for MySQL Serverless instances</a>, <a href="https://help.aliyun.com/document_detail/604344.html">Overview of ApsaraDB RDS for SQL Server Serverless instances</a>, and <a href="https://help.aliyun.com/document_detail/607742.html">Overview of ApsaraDB RDS for PostgreSQL Serverless instances</a>.<blockquote>
     * <p>The system automatically generates an order and completes the payment. You do not need to manually confirm the payment.</p>
     * </blockquote>
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
     * <p>The subscription period unit. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: year.</li>
     * <li><strong>Month</strong>: month.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The port used to initialize the instance upon creation. Valid values:</p>
     * <ul>
     * <li>MySQL: 1000 to 65534</li>
     * <li>PostgreSQL, SQL Server, and MariaDB: 1000 to 5999</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The internal IP address of the instance. The IP address must be within the address range of the specified vSwitch. By default, the system automatically allocates an IP address based on <strong>VPCId</strong> and <strong>VSwitchId</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The coupon code.</p>
     * 
     * <strong>example:</strong>
     * <p>aliwood-1688-mobile-promotion</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/610399.html">DescribeRegions</a> operation to query the region ID.</p>
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
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The global resource descriptor (ARN) used for the authorization of the ApsaraDB RDS service account by the primary account to access KMS. You can call the CheckCloudResourceAuthorized operation to query the descriptor.</p>
     * <blockquote>
     * <p>Notice: You must specify <strong>RoleARN</strong> when you enable cloud disk encryption.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1406****:role/aliyunrdsinstanceencryptiondefaultrole</p>
     */
    @NameInMap("RoleARN")
    public String roleARN;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/43185.html">IP address whitelist</a> of the instance. Separate multiple IP addresses or CIDR blocks with commas (,). Each IP address or CIDR block must be unique. You can add up to 1,000 IP addresses or CIDR blocks to the whitelist of a single instance. The following formats are supported:</p>
     * <ul>
     * <li>IP addresses, such as 10.10.XX.XX.</li>
     * <li>CIDR blocks, such as 10.10.XX.XX/24. In this example, 24 indicates that the prefix of the CIDR block is 24 bits long. The prefix length ranges from 1 to 32 bits.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.XX.XX/24</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The settings for the Serverless instance. This parameter is required when you create a Serverless instance.</p>
     * <blockquote>
     * <p>MariaDB does not support Serverless instances.</p>
     * </blockquote>
     */
    @NameInMap("ServerlessConfig")
    public CreateDBInstanceRequestServerlessConfig serverlessConfig;

    /**
     * <p>Specifies whether to enable automatic storage expansion. This parameter is supported only by MySQL and PostgreSQL. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: enables automatic storage expansion.</li>
     * <li><strong>Disable</strong>: disables automatic storage expansion. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <p>You can also call the ModifyDasInstanceConfig operation to adjust this setting after the instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/173826.html">Configure automatic storage expansion</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    /**
     * <p>The threshold that triggers automatic storage expansion. Unit: %. Valid values:</p>
     * <ul>
     * <li><strong>10</strong></li>
     * <li><strong>20</strong></li>
     * <li><strong>30</strong></li>
     * <li><strong>40</strong></li>
     * <li><strong>50</strong></li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when <strong>StorageAutoScale</strong> is set to <strong>Enable</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("StorageThreshold")
    public Integer storageThreshold;

    /**
     * <p>The maximum storage capacity after automatic storage expansion. Automatic storage expansion does not increase the total storage capacity of the instance beyond this value. Unit: GB.</p>
     * <blockquote>
     * <ul>
     * <li>The value must be greater than or equal to 0.</li>
     * <li>This parameter is required when <strong>StorageAutoScale</strong> is set to <strong>Enable</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("StorageUpperBound")
    public Integer storageUpperBound;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not need to be configured.</p>
     * 
     * <strong>example:</strong>
     * <p>gbk</p>
     */
    @NameInMap("SystemDBCharset")
    public String systemDBCharset;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDBInstanceRequestTag> tag;

    /**
     * <p>The ID of the host for the logger node in the dedicated cluster.</p>
     * <p>This parameter is required when you create an RDS Enterprise Edition instance in a dedicated cluster. If you do not specify this parameter, the system automatically allocates a host by default.</p>
     * <ul>
     * <li>You can call the DescribeDedicatedHosts operation to query the host information in the dedicated cluster.</li>
     * <li>If you do not have a host, you can call the CreateDedicatedHost operation to add one.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>i-bp****</p>
     */
    @NameInMap("TargetDedicatedHostIdForLog")
    public String targetDedicatedHostIdForLog;

    /**
     * <p>The ID of the host on which the primary instance is created in the dedicated cluster.</p>
     * <p>This parameter is required when you create an instance in a dedicated cluster. If you do not specify this parameter, the system automatically assigns a host.</p>
     * <ul>
     * <li>You can call the DescribeDedicatedHosts operation to query the host information in the host group.</li>
     * <li>If you do not have a host, you can call the CreateDedicatedHost operation to add one.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>i-bp****</p>
     */
    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    /**
     * <p>The ID of the host on which the secondary instance is created in the dedicated cluster.</p>
     * <p>This parameter is required when you create a high-availability series or RDS Enterprise Edition instance in a dedicated cluster. If you do not specify this parameter, the system automatically allocates a host by default.</p>
     * <ul>
     * <li>You can call the DescribeDedicatedHosts operation to query the host information in the dedicated cluster.</li>
     * <li>If you do not have a host, you can call the CreateDedicatedHost operation to add one.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>i-bp****</p>
     */
    @NameInMap("TargetDedicatedHostIdForSlave")
    public String targetDedicatedHostIdForSlave;

    /**
     * <p>The minor engine version of the RDS instance to be created. This parameter is required only when you create a MySQL or PostgreSQL instance.
     * Format:</p>
     * <ul>
     * <li><p>MySQL: <code>&lt;Instance version&gt;_&lt;Numeric version number&gt;</code>. Examples: <code>rds_20200229</code>, <code>xcluster_20200229</code>, and <code>xcluster80_20200229</code>. Description:</p>
     * <ul>
     * <li>rds: high-availability series or Basic Edition.</li>
     * <li>xcluster: MySQL 5.7 RDS Enterprise Edition.</li>
     * <li>xcluster80: MySQL 8.0 RDS Enterprise Edition.</li>
     * </ul>
     * <blockquote>
     * <p>You can call the DescribeDBMiniEngineVersions operation to query the numeric version number. For more information about the differences between versions, see <a href="https://help.aliyun.com/document_detail/96060.html">AliSQL release notes</a>.</p>
     * </blockquote>
     * </li>
     * <li><p>PostgreSQL: <code>rds_postgres_&lt;Major version&gt;00_&lt;Minor engine version number&gt;</code>. Example: <code>rds_postgres_1400_20220830</code>. Description:</p>
     * <ul>
     * <li>1400: PostgreSQL major version 14.</li>
     * <li>20220830: AliPG minor engine version. You can call the DescribeDBMiniEngineVersions operation to query the minor engine version. For more information about the differences between versions, see <a href="https://help.aliyun.com/document_detail/126002.html">PostgreSQL release notes</a>.</li>
     * </ul>
     * <blockquote>
     * <p>If Babelfish is enabled in <strong>BabelfishConfig</strong>, the minor engine version format for ApsaraDB RDS for PostgreSQL is: <code>rds_postgres_&lt;Major version&gt;00_&lt;AliPG minor engine version&gt;_babelfish</code>.</p>
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
     * <p>The subscription duration. Valid values:</p>
     * <ul>
     * <li>If <strong>Period</strong> is set to <strong>Year</strong>, the valid values of <strong>UsedTime</strong> are <strong>1</strong> to <strong>5</strong>.</li>
     * <li>If <strong>Period</strong> is set to <strong>Month</strong>, the valid values of <strong>UsedTime</strong> are <strong>1</strong> to <strong>11</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The ID of the user backup. You can call the ListUserBackupFiles operation to query the backup ID. If you specify this parameter, the instance is created based on the user backup.</p>
     * <p>To specify this parameter, the following limits apply:</p>
     * <ul>
     * <li><strong>PayType</strong> must be set to <strong>Postpaid</strong>.</li>
     * <li><strong>Engine</strong> must be set to <strong>MySQL</strong>.</li>
     * <li><strong>EngineVersion</strong> must be set to <strong>5.7</strong>.</li>
     * <li><strong>Category</strong> must be set to <strong>Basic</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>67798****</p>
     */
    @NameInMap("UserBackupId")
    public String userBackupId;

    /**
     * <p>The ID of the VPC.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the network type <strong>InstanceNetworkType</strong> is set to <strong>VPC</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch.</p>
     * <ul>
     * <li><strong>Zone mapping</strong>: The zone of the vSwitch must match the zone of the primary node (<strong>ZoneId</strong>) and the zone of the secondary node (<strong>ZoneIdSlave1</strong>). If you specify two vSwitch IDs, their order must match the order of <strong>ZoneId</strong> and <strong>ZoneIdSlave1</strong>.</li>
     * <li><strong>Network type limit</strong>: <strong>InstanceNetworkType</strong> must be set to <strong>VPC</strong>.</li>
     * <li><strong>Multiple vSwitches</strong>: If you specify <strong>ZoneIdSlave1</strong> and the value is not <strong>Auto</strong>, you must specify two vSwitch IDs and separate them with a comma (,).</li>
     * <li><strong>Character limit</strong>: <strong>VSwitchId</strong> cannot contain special characters such as spaces, exclamation marks (!), number signs (#), currency symbols (¥), ampersands (&amp;), and percent signs (%).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The list of whitelists.
     * To configure multiple IP addresses, separate them with commas (,). Do not add spaces before or after the commas. Example: <code>192.168.0.1,172.16.213.9</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.1,172.16.213.9</p>
     */
    @NameInMap("WhitelistTemplateList")
    public String whitelistTemplateList;

    /**
     * <p>The zone ID of the primary node.</p>
     * <ul>
     * <li>If you specify a VPC and a vSwitch, you must specify the zone ID of the vSwitch. Otherwise, the instance cannot be created.</li>
     * <li>For a high-availability series instance, you must also specify <strong>ZoneIdSlave1</strong> to determine whether the instance uses a single-zone deployment or multi-zone deployment.</li>
     * <li>For an RDS Enterprise Edition instance, you must also specify <strong>ZoneIdSlave1</strong> and <strong>ZoneIdSlave2</strong> to determine whether the instance uses a single-zone deployment or multi-zone deployment.</li>
     * <li>For an ApsaraDB RDS Cluster Edition instance, you must also specify <strong>ZoneIdSlave1</strong> for a two-node instance, and both <strong>ZoneIdSlave1</strong> and <strong>ZoneIdSlave2</strong> for a three-node instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The zone ID of the secondary node.</p>
     * <ul>
     * <li>If you set this parameter to <strong>Auto</strong>, the instance uses a multi-zone deployment and the system automatically selects a zone for the secondary node.</li>
     * <li>If you set this parameter to the same value as <strong>ZoneId</strong>, the instance uses a single-zone deployment.</li>
     * <li>If you set this parameter to a value different from <strong>ZoneId</strong>, the instance uses a multi-zone deployment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-c</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>The zone ID of the second secondary node. ApsaraDB RDS for MySQL Cluster Edition instances support the creation of one or two secondary nodes when you create an instance. You can use this parameter to specify the zone of the second secondary node.</p>
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

    public CreateDBInstanceRequest setAutoCreateProxy(Boolean autoCreateProxy) {
        this.autoCreateProxy = autoCreateProxy;
        return this;
    }
    public Boolean getAutoCreateProxy() {
        return this.autoCreateProxy;
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

    public CreateDBInstanceRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
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

    public CreateDBInstanceRequest setCustomExtraInfo(String customExtraInfo) {
        this.customExtraInfo = customExtraInfo;
        return this;
    }
    public String getCustomExtraInfo() {
        return this.customExtraInfo;
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

    public CreateDBInstanceRequest setExternalReplication(Boolean externalReplication) {
        this.externalReplication = externalReplication;
        return this;
    }
    public Boolean getExternalReplication() {
        return this.externalReplication;
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

    public CreateDBInstanceRequest setOptimizedWrites(String optimizedWrites) {
        this.optimizedWrites = optimizedWrites;
        return this;
    }
    public String getOptimizedWrites() {
        return this.optimizedWrites;
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

    public CreateDBInstanceRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
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
         * <p>Specifies whether to enable the smart pause and resume feature for the Serverless instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the feature.</li>
         * <li><strong>false</strong>: disables the feature. This is the default value.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required only for MySQL and PostgreSQL Serverless instances. If no connections are established within 10 minutes, the instance enters the paused state and automatically resumes when a new connection is established.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoPause")
        public Boolean autoPause;

        /**
         * <p>The maximum number of RDS capacity units (RCUs) for automatic scaling. Valid values:</p>
         * <ul>
         * <li>MySQL: <strong>1</strong> to <strong>32</strong></li>
         * <li>SQL Server: <strong>2</strong> to <strong>16</strong></li>
         * <li>PostgreSQL: <strong>1</strong> to <strong>14</strong></li>
         * </ul>
         * <blockquote>
         * <p>The value of this parameter must be greater than or equal to the value of <strong>MinCapacity</strong>. Only <strong>integers</strong> are supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MaxCapacity")
        public Double maxCapacity;

        /**
         * <p>The minimum number of RCUs for automatic scaling. Valid values:</p>
         * <ul>
         * <li>MySQL: <strong>0.5</strong> to <strong>32</strong></li>
         * <li>SQL Server: <strong>2</strong> to <strong>16</strong> (integers only)</li>
         * <li>PostgreSQL: <strong>0.5</strong> to <strong>14</strong></li>
         * </ul>
         * <blockquote>
         * <p>The value of this parameter must be less than or equal to the value of <strong>MaxCapacity</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("MinCapacity")
        public Double minCapacity;

        /**
         * <p>Specifies whether to enable forced elastic scaling for the Serverless instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables forced elastic scaling.</li>
         * <li><strong>false</strong>: disables forced elastic scaling. This is the default value.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is required only for MySQL and PostgreSQL Serverless instances. If you enable this parameter, the instance will be unavailable for 30 to 120 seconds during forced scaling. Use this parameter with caution based on your business requirements.</li>
         * <li>Elastic scaling of RCUs usually takes effect immediately. However, in some special cases (such as during the execution of a large transaction), scaling cannot be completed immediately. In this case, you can enable this parameter to force scaling.</li>
         * </ul>
         * </blockquote>
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
         * <p>The tag key. Specify this parameter to add a tag to the instance.</p>
         * <ul>
         * <li>If the specified tag key already exists, the tag key is directly added to the instance. You can call the ListTagResources operation to query existing tags.</li>
         * <li>If the specified tag key does not exist, the system creates the tag key and adds it to the instance.</li>
         * <li>Empty strings are not allowed.</li>
         * <li>This parameter must be used together with <strong>Tag.Value</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value that corresponds to the tag key. Specify this parameter to add a tag to the instance.</p>
         * <ul>
         * <li>If the specified tag value exists for the corresponding tag key, the tag value is directly added to the instance. You can call the ListTagResources operation to query existing tags.</li>
         * <li>If the specified tag value does not exist for the corresponding tag key, the system creates the tag value and adds it to the instance.</li>
         * <li>This parameter must be used together with <strong>Tag.Key</strong>.</li>
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
