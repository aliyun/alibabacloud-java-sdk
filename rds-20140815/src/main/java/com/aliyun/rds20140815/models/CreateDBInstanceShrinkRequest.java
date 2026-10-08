// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The number of ApsaraDB RDS for MySQL instances to create. This parameter applies only to batch creation of ApsaraDB RDS for MySQL instances.</p>
     * <p>Valid values: <strong>1</strong> to <strong>20</strong>. Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>When creating multiple ApsaraDB RDS for MySQL instances, consider using <strong>Tag.Key</strong> and <strong>Tag.Value</strong> to tag all instances in the same batch, so that you can manage them by tag after creation.</li>
     * <li>After multiple ApsaraDB RDS for MySQL instances are created, the operation returns only <strong>TaskId</strong>, <strong>RequestId</strong>, and <strong>Message</strong>. Other details are not returned. To query the details of individual instances, call DescribeDBInstanceAttribute.</li>
     * <li>If <strong>engine</strong> is not set to <strong>MySQL</strong> and this parameter is set to a value greater than <strong>1</strong>, the operation fails and returns the error code <code>InvalidParam.Engine</code>.</li>
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
     * <li><p><strong>true</strong>: enables automatic automatic creation. The default proxy type is general-purpose.</p>
     * </li>
     * <li><p><strong>false</strong>: disables automatic automatic creation.</p>
     * </li>
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
     * <p>The default value is true. If your payment method has insufficient balance, set AutoPay to false. This generates an unpaid order, which you can pay for in the ApsaraDB RDS console.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. This parameter is valid only for subscription instances. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you purchase the instance on a monthly basis, the auto-renewal cycle is one month.</li>
     * <li>If you purchase the instance on a yearly basis, the auto-renewal cycle is one year.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: uses a coupon.</li>
     * <li><strong>false</strong> (default): does not use a coupon.</li>
     * </ul>
     * <blockquote>
     * <p>If you use a coupon and then perform a downgrade, the amount offset by the coupon is not refunded.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The Babelfish configuration for ApsaraDB RDS for PostgreSQL instances.</p>
     * <p>Configuration format: {&quot;babelfishEnabled&quot;:&quot;true&quot;,&quot;migrationMode&quot;:&quot;xxxxxxx&quot;,&quot;masterUsername&quot;:&quot;xxxxxxx&quot;,&quot;masterUserPassword&quot;:&quot;xxxxxxxx&quot;}</p>
     * <p>The parameters are described as follows:</p>
     * <ul>
     * <li><strong>babelfishEnabled</strong>: specifies whether to enable Babelfish. Set to <strong>true</strong> to enable. Babelfish is disabled by default if this parameter is not configured.</li>
     * <li><strong>migrationMode</strong>: the database mode. Set to <strong>single-db</strong> for single-database mode or <strong>multi-db</strong> for multi-database mode.</li>
     * <li><strong>masterUsername</strong>: the initial administrator account name. The name can contain lowercase letters, digits, and underscores (_), must start with a letter, must end with a letter or digit, can be up to 63 characters in length, and cannot start with pg.</li>
     * <li><strong>masterUserPassword</strong>: the password of the administrator account. The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The password must be 8 to 32 characters in length. Special characters include <code>! @ # $ % ^ &amp; * () _ + - =</code>.</li>
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

    @NameInMap("BpeEnabled")
    public String bpeEnabled;

    /**
     * <p>Specifies whether to enable the I/O performance burst feature for premium performance disks (cloud disks). Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled.</li>
     * <li><strong>false</strong>: disabled.<blockquote>
     * <p>For more information about the I/O performance burst feature for premium performance disks, see <a href="https://help.aliyun.com/document_detail/2340501.html">What is a premium performance disk</a>.</p>
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
     * <p>The business extension parameter.</p>
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
     * <li><strong>HighAvailability</strong>: High-availability Edition.</li>
     * <li><strong>cluster</strong>: MySQL or PostgreSQL Cluster Edition.</li>
     * <li><strong>AlwaysOn</strong>: SQL Server Cluster Edition.</li>
     * <li><strong>Finance</strong>: RDS Enterprise Edition.<blockquote>
     * <p>This parameter is required when you create a SQL Server Enterprise Cluster Edition&lt;props=&quot;china&quot;&gt;, Basic Edition Standard Edition, or Basic Edition Enterprise Edition instance. For example, to create a Basic Edition 2022 Enterprise Cluster Edition (2022_ent) instance, set this parameter to Basic.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li><p>Serverless instances</p>
     * <ul>
     * <li><strong>serverless_basic</strong>: Serverless Basic Edition. (Applicable to MySQL and PostgreSQL only.)</li>
     * <li><strong>serverless_standard</strong>: Serverless High-availability Edition. (Applicable to MySQL and PostgreSQL only.)</li>
     * <li><strong>serverless_ha</strong>: SQL Server Serverless High-availability Edition.</li>
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
     * <p>The client token that is used to ensure the idempotency of the request. The token is generated by the client and must be unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2701832.html">cold data archiving</a> feature for premium performance disks (cloud disks). Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled.</li>
     * <li><strong>false</strong>: disabled.</li>
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
     * <p>SQL Server 2012, 2016, and 2017 support only standard access mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ConnectionMode")
    public String connectionMode;

    /**
     * <p>The internal endpoint of the database.</p>
     * <p>The endpoint format is <code>xxx.mysql.rds.aliyuncs.com</code>, where <code>xxx</code> is the prefix of the instance ID, such as rm-uf6wjk5***.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The batch instance creation strategy. This parameter takes effect only when <strong>Amount</strong> is greater than 1. Valid values:</p>
     * <ul>
     * <li><strong>Atomicity</strong> (default): atomic. All instances in the same batch must be created successfully. If any instance fails to be created, all instances in the batch fail.</li>
     * <li><strong>Partial</strong>: non-atomic. The creation of each instance is independent of other instances in the same batch.</li>
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
     * <p>The instance type. You can specify a standard or YiTian instance type. For details, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary instance types</a>.</p>
     * <p>To create a serverless instance, use one of the following values:</p>
     * <ul>
     * <li>MySQL Basic Edition: <strong>mysql.n2.serverless.1c</strong></li>
     * <li>MySQL High-availability Edition: <strong>mysql.n2.serverless.2c</strong></li>
     * <li>SQL Server: <strong>mssql.mem2.serverless.s2</strong></li>
     * <li>PostgreSQL Basic Edition: <strong>pg.n2.serverless.1c</strong></li>
     * <li>PostgreSQL High-availability Edition: <strong>pg.n2.serverless.2c</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.n2.medium.2c</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance name. The name must be 2 to 255 characters in length. It must start with a Chinese character or an English letter, and can contain digits, Chinese characters, English letters, and hyphens (-).</p>
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
     * <p>The network connectivity type of the instance. Set this parameter to <strong>Intranet</strong>, which indicates an internal network connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("DBInstanceNetType")
    public String DBInstanceNetType;

    /**
     * <p>The instance storage capacity. Unit: GB. The value increments in steps of 5 GB. For the valid values, see <a href="https://help.aliyun.com/document_detail/26312.html">Instance types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The instance storage type. Valid values:</p>
     * <ul>
     * <li><strong>local_ssd</strong>: instance with Premium Local SSDs (recommended).</li>
     * <li><strong>general_essd</strong>: premium performance disk (recommended).</li>
     * <li><strong>cloud_essd</strong>: PL1 ESSD.</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
     * <li><strong>cloud_ssd</strong>: standard SSD (not recommended. No longer available in some regions).</li>
     * </ul>
     * <p>The default value of this parameter is automatically determined based on the instance type specified in <strong>DBInstanceClass</strong>:</p>
     * <ul>
     * <li>If the instance type is an instance with Premium Local SSDs, the default value is <strong>local_ssd</strong>.</li>
     * <li>If the instance type is a cloud disk type, the default value is <strong>cloud_essd</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>Serverless instances support only PL1 ESSDs and premium performance disks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>general_essd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>Specifies whether table names are case-insensitive. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: case-insensitive (default).</li>
     * <li><strong>false</strong>: case-sensitive.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DBIsIgnoreCase")
    public String DBIsIgnoreCase;

    /**
     * <p>The parameter template ID. You can call DescribeParameterGroups to query the ID.</p>
     * <blockquote>
     * <p>This parameter is supported only for MySQL and PostgreSQL instances. If you do not specify this parameter, the system default parameter template is used. You can also create a custom parameter template and specify it here.</p>
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
     * <li>When <strong>Engine</strong> is <strong>MySQL</strong>:<ul>
     * <li>This parameter configures the UTC time zone. Valid values: <strong>-12:59</strong> to <strong>+13:00</strong>.</li>
     * <li>Instances with Premium Local SSDs support named time zones, such as Asia/Hong_Kong. For more information about named time zones, see <a href="https://help.aliyun.com/document_detail/297356.html">Named time zone reference</a>.</li>
     * </ul>
     * </li>
     * <li>When <strong>Engine</strong> is <strong>PostgreSQL</strong>:<ul>
     * <li>This parameter configures a named time zone. UTC time zones are not supported. For more information about named time zones, see <a href="https://help.aliyun.com/document_detail/297356.html">Named time zone reference</a>.</li>
     * <li>This parameter can be configured only for PostgreSQL instances with cloud disks.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can configure the time zone when creating a primary instance. Read-only instances do not support custom time zones and inherit the time zone of the primary instance.</li>
     * <li>If you do not specify this parameter, the system selects a default time zone based on the region where you purchase the instance.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>+08:00</p>
     */
    @NameInMap("DBTimeZone")
    public String DBTimeZone;

    /**
     * <p>The ID of the dedicated host group.</p>
     * <p>This parameter is required when you create an ApsaraDB RDS instance in a dedicated cluster.</p>
     * <ul>
     * <li>You can call DescribeDedicatedHostGroups to query the host group information.</li>
     * <li>If you have not created a host group, call CreateDedicatedHostGroup to create one.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dhg-4n****</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>Specifies whether to enable the release protection feature for the RDS instance. This parameter is supported only for pay-as-you-go instances. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables release protection.</li>
     * <li><strong>false</strong>: disables release protection (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to perform a dry run for this instance creation operation. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without creating the instance. The dry run checks the request parameters, request format, business limits, and resource availability.</li>
     * <li><strong>false</strong>: sends a normal request and creates the instance directly after the check passes (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the cloud disk encryption key in the same region. Specifying this parameter enables cloud disk encryption (which cannot be disabled after it is enabled) and requires you to also specify <strong>RoleARN</strong>.</p>
     * <p>You can view the key ID in the Key Management Service console or create a new key. For more information, see <a href="https://help.aliyun.com/document_detail/181610.html">Create a key</a>.</p>
     * <blockquote>
     * <ul>
     * <li>For ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and ApsaraDB RDS for SQL Server instances, you can omit this parameter and specify only <strong>RoleARN</strong> to create a cloud disk-encrypted instance using a service key.</li>
     * <li>To allow RAM users to create instances only when cloud disk encryption is enabled, configure the following RAM authorization policy. If cloud disk encryption is not enabled, the RAM user cannot create instances:
     * <code>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Deny&quot;,&quot;Action&quot;:&quot;rds:CreateDBInstance&quot;,&quot;Resource&quot;:&quot;*&quot;,&quot;Condition&quot;:{&quot;StringEquals&quot;:{&quot;rds:DiskEncryptionRequired&quot;:&quot;false&quot;}}}]}</code>
     * Warning: This configuration also affects the CreateOrder operation that is called when you create an instance in the console.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0d24*****-da7b-4786-b981-9a164dxxxxxx</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The database engine type. Valid values:</p>
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
     * <li>MySQL: <strong>5.5</strong>, <strong>5.6</strong>, <strong>5.7</strong>, <strong>8.0</strong></li>
     * <li>SQL Server: <strong>08r2_ent_ha</strong> (cloud disk, discontinued), <strong>2008r2</strong> (Premium Local SSD, discontinued), <strong>2012</strong> (Enterprise Edition single-node), <strong>2012_ent_ha</strong>, <strong>2012_std_ha</strong>, <strong>2012_web</strong>, <strong>2014_ent_ha</strong>, <strong>2014_std_ha</strong>, <strong>2016_ent_ha</strong>, <strong>2016_std_ha</strong>, <strong>2016_web</strong>, <strong>2017_ent</strong>, <strong>2017_std_ha</strong>, <strong>2017_web</strong>, <strong>2019_ent</strong>, <strong>2019_std_ha</strong>, <strong>2019_web</strong>, <strong>2022_ent</strong>, <strong>2022_std_ha</strong>, <strong>2022_web</strong>, <strong>2025_ent</strong>, <strong>2025_std</strong></li>
     * <li>PostgreSQL: <strong>10.0</strong>, <strong>11.0</strong>, <strong>12.0</strong>, <strong>13.0</strong>, <strong>14.0</strong>, <strong>15.0</strong>, <strong>16.0</strong>, <strong>17.0</strong>, <strong>18.0</strong></li>
     * <li>MariaDB: <strong>10.3</strong>, <strong>10.6</strong></li>
     * </ul>
     * </li>
     * <li>Serverless instances<ul>
     * <li>MySQL: <strong>5.7</strong>, <strong>8.0</strong></li>
     * <li>SQL Server: <strong>2016_std_sl</strong>, <strong>2017_std_sl</strong>, <strong>2019_std_sl</strong></li>
     * <li>PostgreSQL: <strong>14.0</strong>, <strong>15.0</strong>, <strong>16.0</strong>, <strong>17.0</strong>, <strong>18.0</strong></li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>MariaDB does not support serverless instances.</li>
     * <li>In SQL Server instance versions, <code>_ent</code> indicates Enterprise Cluster Edition, <code>_ent_ha</code> indicates Enterprise Edition, <code>_std_ha</code> indicates Standard Edition, and <code>_web</code> indicates Web Edition.</li>
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
     * <p>Specifies whether to enable <a href="https://help.aliyun.com/document_detail/2856526.html">ApsaraDB RDS for MySQL native replication</a>. Valid values:</p>
     * <ul>
     * <li><strong>ON</strong>: enabled.</li>
     * <li><strong>OFF</strong>: disabled.</li>
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
     * <li><strong>VPC</strong>: virtual private cloud.</li>
     * <li><strong>Classic</strong>: classic network.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>ApsaraDB RDS for MySQL cloud disk instances support only VPCs. Set this parameter to <strong>VPC</strong>.</li>
     * <li>ApsaraDB RDS for PostgreSQL and MariaDB instances support only VPCs. Set this parameter to <strong>VPC</strong>.</li>
     * <li>ApsaraDB RDS for SQL Server Basic Edition and Web Edition instances support both classic networks and VPCs. All other instances support only VPCs. Set this parameter to <strong>VPC</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2527067.html">Buffer Pool Extension (BPE)</a> feature for premium performance disks (cloud disks). Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled.</li>
     * <li><strong>0</strong>: disabled.</li>
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
     * <li><strong>optimized</strong>: enabled.</li>
     * <li><strong>none</strong> (default): disabled.</li>
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
     * <li><strong>Serverless</strong>: serverless billing method. MariaDB instances do not support this billing method. For more information, see <a href="https://help.aliyun.com/document_detail/411291.html">Overview of MySQL Serverless instances</a>, <a href="https://help.aliyun.com/document_detail/604344.html">Overview of SQL Server Serverless instances</a>, and <a href="https://help.aliyun.com/document_detail/607742.html">Overview of PostgreSQL Serverless instances</a>.<blockquote>
     * <p>The system automatically generates and pays for the order. No manual payment confirmation is required.</p>
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
     * <p>The subscription type of the prepaid instance. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: subscription on a yearly basis.</li>
     * <li><strong>Month</strong>: subscription on a monthly basis.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if the billing method is <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The port to initialize when creating the ApsaraDB RDS instance. Valid values:</p>
     * <ul>
     * <li>MySQL: 1000 to 65534</li>
     * <li>PostgreSQL, SQL Server, MariaDB: 1000 to 5999</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>Settings for the internal network IP address of the instance. The IP address must be within the address range of the specified vSwitch. By default, the system automatically allocates an IP address based on <strong>VPCId</strong> and <strong>vSwitchId</strong>.</p>
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
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/610399.html">DescribeRegions</a> to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The global resource descriptor (ARN) that grants the RDS service account authorization to access KMS on behalf of the primary account. You can call CheckCloudResourceAuthorized to query the ARN information.</p>
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
     * <p>The <a href="https://help.aliyun.com/document_detail/43185.html">IP whitelist</a> of the instance. Separate multiple entries with commas (,). Duplicate entries are not allowed. You can add up to 1,000 IP addresses or CIDR blocks to a single instance. The following formats are supported:</p>
     * <ul>
     * <li>IP address format, for example: 10.10.XX.XX.</li>
     * <li>CIDR block format, for example: 10.10.XX.XX/24 (classless inter-domain routing, where 24 indicates the length of the prefix in the address, ranging from 1 to 32).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.XX.XX/24</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The settings for the serverless ApsaraDB RDS instance. This parameter is required when you create a serverless instance.</p>
     * <blockquote>
     * <p>MariaDB does not support serverless instances.</p>
     * </blockquote>
     */
    @NameInMap("ServerlessConfig")
    public String serverlessConfigShrink;

    /**
     * <p>Specifies whether to enable automatic storage expansion. This parameter is supported only for MySQL and PostgreSQL instances. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: enables automatic storage expansion.</li>
     * <li><strong>Disable</strong>: disables automatic storage expansion (default).</li>
     * </ul>
     * <blockquote>
     * <p>You can also call ModifyDasInstanceConfig after the instance is created to adjust this setting. For more information, see <a href="https://help.aliyun.com/document_detail/173826.html">Configure automatic storage expansion</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    /**
     * <p>The threshold (percentage) that triggers automatic storage expansion. Valid values:</p>
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
     * <p>The maximum total storage capacity allowed for automatic storage expansion. Automatic storage expansion does not cause the total storage capacity of the instance to exceed this value. Unit: GB.</p>
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
     * <p>This parameter is deprecated. You do not need to configure it.</p>
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
    public java.util.List<CreateDBInstanceShrinkRequestTag> tag;

    /**
     * <p>The host ID of the logger instance in the dedicated cluster.</p>
     * <p>This parameter is required when you create an ApsaraDB RDS Enterprise Edition instance in a dedicated cluster. If you do not specify this parameter, the system automatically assigns a host.</p>
     * <ul>
     * <li>You can call DescribeDedicatedHosts to query the host information in the dedicated cluster.</li>
     * <li>If you have not added a host, call CreateDedicatedHost to add one.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>i-bp****</p>
     */
    @NameInMap("TargetDedicatedHostIdForLog")
    public String targetDedicatedHostIdForLog;

    /**
     * <p>The host ID of the primary instance in the dedicated cluster.</p>
     * <p>This parameter is required when you create an ApsaraDB RDS instance in a dedicated cluster. If you do not specify this parameter, the system automatically assigns a host.</p>
     * <ul>
     * <li>You can call DescribeDedicatedHosts to query the host information in the host group.</li>
     * <li>If you have not added a host, call CreateDedicatedHost to add one.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>i-bp****</p>
     */
    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    /**
     * <p>The host ID of the secondary instance in the dedicated cluster.</p>
     * <p>This parameter is required when you create an ApsaraDB RDS High-availability Edition or RDS Enterprise Edition instance in a dedicated cluster. If you do not specify this parameter, the system automatically allocates a host by default.</p>
     * <ul>
     * <li>You can call DescribeDedicatedHosts to query the host information in the dedicated cluster.</li>
     * <li>If you have not added a host, call CreateDedicatedHost to add one.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>i-bp****</p>
     */
    @NameInMap("TargetDedicatedHostIdForSlave")
    public String targetDedicatedHostIdForSlave;

    /**
     * <p>The minor engine version of the RDS instance to create. This parameter is required only when you create a MySQL or PostgreSQL instance.
     * Format:</p>
     * <ul>
     * <li><p>MySQL: <code>&lt;instance version&gt;_&lt;numeric version number&gt;</code>. For example, <code>rds_20200229</code>, <code>xcluster_20200229</code>, or <code>xcluster80_20200229</code>. The prefixes are described as follows:</p>
     * <ul>
     * <li>rds: high availability series or Basic Edition.</li>
     * <li>xcluster: MySQL 5.7 RDS Enterprise Edition.</li>
     * <li>xcluster80: MySQL 8.0 RDS Enterprise Edition.</li>
     * </ul>
     * <blockquote>
     * <p>You can call DescribeDBMiniEngineVersions to query the numeric version number. For differences between versions, see <a href="https://help.aliyun.com/document_detail/96060.html">AliSQL minor version release notes</a>.</p>
     * </blockquote>
     * </li>
     * <li><p>PostgreSQL: <code>rds_postgres_&lt;major version&gt;00_&lt;minor version number&gt;</code>. For example, <code>rds_postgres_1400_20220830</code>. The fields are described as follows:</p>
     * <ul>
     * <li>1400: PostgreSQL major version 14.</li>
     * <li>20220830: AliPG minor engine version. You can call DescribeDBMiniEngineVersions to query the minor version number. For differences between versions, see <a href="https://help.aliyun.com/document_detail/126002.html">PostgreSQL minor version release notes</a>.</li>
     * </ul>
     * <blockquote>
     * <p>If Babelfish is enabled in <strong>BabelfishConfig</strong>, the minor version format for ApsaraDB RDS for PostgreSQL instances is: <code>rds_postgres_&lt;major version&gt;00_&lt;AliPG minor version&gt;_babelfish</code>.</p>
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
     * <li>If <strong>Period</strong> is set to <strong>Year</strong>, <strong>UsedTime</strong> can be set to <strong>1 to 5</strong>.</li>
     * <li>If <strong>Period</strong> is set to <strong>Month</strong>, <strong>UsedTime</strong> can be set to <strong>1 to 11</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if the billing method is <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The user backup ID. You can call ListUserBackupFiles to query the ID. Specifying this parameter creates an instance from a user backup.</p>
     * <p>The following restrictions apply when you specify this parameter:</p>
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
     * <p>The VPC ID.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>InstanceNetworkType</strong> is set to <strong>VPC</strong>, which indicates the network type is VPC.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * <ul>
     * <li><strong>Zone correspondence</strong>: The zone of the vSwitch must correspond to the zone of the primary node (ZoneId) and the zone of the secondary node (ZoneIdSlave1). If you specify two vSwitch IDs, their order must match the order of ZoneId and ZoneSlaveId1.</li>
     * <li><strong>Network type requirement</strong>: <strong>InstanceNetworkType</strong> must be set to <strong>VPC</strong>.</li>
     * <li><strong>Multiple vSwitch requirement</strong>: If you specify <strong>ZoneSlaveId1</strong> (the zone ID of the secondary node) and it is not set to <strong>Auto</strong>, you must specify two vSwitch IDs separated by a comma (,).</li>
     * <li><strong>Character restriction</strong>: VSwitchId cannot contain special characters such as spaces, <code>!</code>, <code>#</code>, <code>￥</code>, <code>&amp;</code>, or <code>%</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The whitelist. If you need to configure multiple IP addresses, separate them with commas (,) without spaces before or after the commas. Example: <code>192.168.0.1,172.16.213.9</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.1,172.16.213.9</p>
     */
    @NameInMap("WhitelistTemplateList")
    public String whitelistTemplateList;

    /**
     * <p>The zone ID of the primary node.</p>
     * <ul>
     * <li>If you specify a VPC and a vSwitch, you must set this parameter to the zone ID of the vSwitch. Otherwise, the instance cannot be created.</li>
     * <li>For high availability series instances, you must also specify <strong>ZoneIdSlave1</strong> to determine whether the instance uses single-zone or multi-zone deployment.</li>
     * <li>For RDS Enterprise Edition instances, you must also specify <strong>ZoneIdSlave1</strong> and <strong>ZoneIdSlave2</strong> to determine whether the instance uses single-zone or multi-zone deployment.</li>
     * <li>For RDS Cluster Edition instances, two-node clusters require <strong>ZoneIdSlave1</strong>, and three-node clusters require both <strong>ZoneIdSlave1</strong> and <strong>ZoneIdSlave2</strong>.</li>
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
     * <li>If you set this parameter to <strong>Auto</strong>, the instance uses multi-zone deployment and the system automatically selects a zone for the secondary node.</li>
     * <li>If this parameter is the same as <strong>ZoneId</strong>, the instance uses single-zone deployment.</li>
     * <li>If this parameter is different from <strong>ZoneId</strong>, the instance uses multi-zone deployment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-c</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>The zone ID of the second secondary node. ApsaraDB RDS for MySQL Cluster Edition instances support creating one or two secondary nodes when you create the instance. If you need this, use this parameter to specify the zone of the second secondary node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-d</p>
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

    public CreateDBInstanceShrinkRequest setAutoCreateProxy(Boolean autoCreateProxy) {
        this.autoCreateProxy = autoCreateProxy;
        return this;
    }
    public Boolean getAutoCreateProxy() {
        return this.autoCreateProxy;
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

    public CreateDBInstanceShrinkRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
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

    public CreateDBInstanceShrinkRequest setColdDataEnabled(Boolean coldDataEnabled) {
        this.coldDataEnabled = coldDataEnabled;
        return this;
    }
    public Boolean getColdDataEnabled() {
        return this.coldDataEnabled;
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

    public CreateDBInstanceShrinkRequest setCustomExtraInfo(String customExtraInfo) {
        this.customExtraInfo = customExtraInfo;
        return this;
    }
    public String getCustomExtraInfo() {
        return this.customExtraInfo;
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

    public CreateDBInstanceShrinkRequest setExternalReplication(Boolean externalReplication) {
        this.externalReplication = externalReplication;
        return this;
    }
    public Boolean getExternalReplication() {
        return this.externalReplication;
    }

    public CreateDBInstanceShrinkRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public CreateDBInstanceShrinkRequest setIoAccelerationEnabled(String ioAccelerationEnabled) {
        this.ioAccelerationEnabled = ioAccelerationEnabled;
        return this;
    }
    public String getIoAccelerationEnabled() {
        return this.ioAccelerationEnabled;
    }

    public CreateDBInstanceShrinkRequest setOptimizedWrites(String optimizedWrites) {
        this.optimizedWrites = optimizedWrites;
        return this;
    }
    public String getOptimizedWrites() {
        return this.optimizedWrites;
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

    public CreateDBInstanceShrinkRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
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

    public CreateDBInstanceShrinkRequest setWhitelistTemplateList(String whitelistTemplateList) {
        this.whitelistTemplateList = whitelistTemplateList;
        return this;
    }
    public String getWhitelistTemplateList() {
        return this.whitelistTemplateList;
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
         * <p>The tag key. Specifying this parameter binds a tag to the instance.</p>
         * <ul>
         * <li>If the specified tag key already exists, the tag is directly bound to the instance. You can call ListTagResources to query existing tags.</li>
         * <li>If the specified tag key does not exist, the tag key is created and then bound to the instance.</li>
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
         * <p>The tag value corresponding to the tag key. Specifying this parameter binds a tag to the instance.</p>
         * <ul>
         * <li>If the specified tag value already exists under the corresponding tag key, the tag value is directly bound to the instance. You can call ListTagResources to query existing tags.</li>
         * <li>If the specified tag value does not exist under the corresponding tag key, the tag value is created and then bound to the instance.</li>
         * <li>This parameter must be used together with <strong>Tag.Key</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testvalue1</p>
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
