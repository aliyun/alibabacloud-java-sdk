// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDdrInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the backup set used for restoration from a backup set. You can call the DescribeCrossRegionBackups operation to query backup set IDs.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>RestoreType</strong> is set to <strong>BackupSet</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>14****</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>The region where the backup set resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("BackupSetRegion")
    public String backupSetRegion;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The access mode of the target instance. Valid values:</p>
     * <ul>
     * <li><strong>Standard</strong> (default): standard access mode</li>
     * <li><strong>Safe</strong>: database proxy mode</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ConnectionMode")
    public String connectionMode;

    /**
     * <p>The instance type of the target instance. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Instance types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rds.mysql.s1.small</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The name of the target instance. The name must be 2 to 256 characters in length. The name must start with a letter or a Chinese character and can contain digits, Chinese characters, letters, underscores (_), and hyphens (-).</p>
     * <blockquote>
     * <p>The name cannot start with <code>http://</code> or <code>https://</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The network connectivity type of the target instance. Valid values:</p>
     * <ul>
     * <li><strong>Internet</strong>: public network connection</li>
     * <li><strong>Intranet</strong>: internal network connection</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("DBInstanceNetType")
    public String DBInstanceNetType;

    /**
     * <p>The instance storage capacity of the target instance. Valid values: <strong>5 to 2000</strong>. The value is incremented in steps of 5 GB. Unit: GB. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Instance types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The instance storage type of the target instance. Valid values:</p>
     * <blockquote>
     * <p>Use the same storage type as the source instance.</p>
     * </blockquote>
     * <details>
     * <summary>ApsaraDB RDS for MySQL</summary>
     * 
     * <ul>
     * <li>local_ssd: Premium Local SSDs (default)</li>
     * <li>cloud_essd: PL1 ESSD cloud disk</li>
     * <li>cloud_essd2: PL2 ESSD cloud disk</li>
     * <li>cloud_essd3: PL3 ESSD cloud disk</li>
     * <li>cloud_ssd: standard SSD cloud disk (discontinued)</details></li>
     * </ul>
     * <details>
     * <summary>ApsaraDB RDS for SQL Server</summary>
     * 
     * <ul>
     * <li>cloud_essd: PL1 ESSD cloud disk</li>
     * <li>cloud_essd2: PL2 ESSD cloud disk</li>
     * <li>cloud_essd3: PL3 ESSD cloud disk</li>
     * <li>local_ssd: Premium Local SSDs (discontinued)</li>
     * <li>cloud_ssd: standard SSD cloud disk (discontinued)</li>
     * </ul>
     * </details>
     * 
     * <details>
     * <summary>ApsaraDB RDS for PostgreSQL</summary>
     * 
     * <ul>
     * <li>cloud_essd: PL1 ESSD cloud disk</li>
     * <li>cloud_essd2: PL2 ESSD cloud disk</li>
     * <li>cloud_essd3: PL3 ESSD cloud disk</li>
     * <li>local_ssd: Premium Local SSDs (discontinued)</li>
     * <li>cloud_ssd: standard SSD cloud disk (discontinued)</li>
     * </ul>
     * </details>
     * 
     * <strong>example:</strong>
     * <p>local_ssd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The ID of the custom key used for cloud disk encryption for <strong>SQL Server instances</strong>. Specifying this parameter enables cloud disk encryption (which cannot be disabled after it is enabled). You must also specify <strong>RoleARN</strong>.
     * You can view the key ID in the Key Management Service (KMS) console or <a href="https://help.aliyun.com/document_detail/181610.html">create a new key</a>.</p>
     * <blockquote>
     * <p>You can also leave this parameter empty and specify only <strong>RoleARN</strong> to set the cloud disk encryption type to the RDS-managed service key (Default Service CMK).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>749c1df7-<strong><strong>-</strong></strong>-<strong><strong>-</strong></strong></p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The type of the destination database engine. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>SQLServer</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version of the destination database engine. The valid values vary based on the value of <strong>Engine</strong>:</p>
     * <ul>
     * <li>MySQL: <strong>5.5/5.6/5.7/8.0</strong></li>
     * <li>SQL Server: <strong>2008r2 (Premium Local SSDs, discontinued)/08r2_ent_ha (cloud disks, discontinued)/2012/2012_ent_ha/2012_std_ha/2012_web/2014_std_ha/2016_ent_ha/2016_std_ha/2016_web/2017_std_ha/2017_ent/2019_std_ha/2019_ent</strong></li>
     * <li>PostgreSQL: <strong>10.0/11.0/12.0/13.0/14.0/15.0</strong></li>
     * </ul>
     * <blockquote>
     * <p>For SQL Server instances, <code>_ent</code> indicates Cluster Edition, <code>_ent_ha</code> indicates Enterprise Edition, <code>_std_ha</code> indicates Standard Edition, and <code>_web</code> indicates Web Edition.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.6</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The network type of the target instance. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong>: VPC</li>
     * <li><strong>Classic</strong>: classic network (offline)</li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to <strong>VPC</strong>, you must also specify the <strong>VpcId</strong> and <strong>VSwitchId</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Classic</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the target instance. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go</li>
     * <li><strong>Prepaid</strong>: upfront (subscription)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the upfront subscription duration for the target instance. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: yearly subscription</li>
     * <li><strong>Month</strong>: monthly subscription</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when PayType is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>Settings for the internal network IP address of the target instance. The IP address must be within the IP address range of the specified vSwitch. By default, the system automatically allocates an internal network IP address based on the values of <strong>VPCId</strong> and <strong>VSwitchId</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>172.XX.XX.69</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The ID of the destination region. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query region IDs.</p>
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

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to which you want to restore data when you restore data to a point in time. The point in time must be earlier than the current time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
     * <blockquote>
     * <p>This parameter is required when <strong>RestoreType</strong> is set to <strong>BackupTime</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-05-30T03:29:10Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The restoration method. Valid values:</p>
     * <ul>
     * <li><strong>BackupSet</strong>: restores data from a backup set. The data in the backup set is restored to the new instance. You must also specify the <strong>BackupSetId</strong> parameter.</li>
     * <li><strong>BackupTime</strong>: restores data to a point in time within the log backup retention period. You must also specify the <strong>RestoreTime</strong>, <strong>SourceRegion</strong>, and <strong>SourceDBInstanceName</strong> parameters.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BackupSet</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>The global resource descriptor (ARN) that provides authorization for the RDS cloud service account to access Key Management Service (KMS) for <strong>SQL Server instances</strong>. You can call the <a href="https://help.aliyun.com/document_detail/2628797.html">CheckCloudResourceAuthorized</a> operation to query the ARN.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1406****:role/aliyunrdsinstanceencryptiondefaultrole</p>
     */
    @NameInMap("RoleARN")
    public String roleARN;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/43185.html">IP whitelist</a> of the target instance. Separate multiple IP addresses with commas (,). IP addresses cannot be duplicated. You can specify up to 1,000 IP addresses. The following two formats are supported:</p>
     * <ul>
     * <li>IP address format, such as 10.23.12.24.</li>
     * <li>CIDR format, such as 10.23.12.24/24 (Classless Inter-Domain Routing. 24 indicates the length of the prefix in the address. The value ranges from 1 to 32).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The ID of the source instance for point-in-time restoration.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>RestoreType</strong> is set to <strong>BackupTime</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("SourceDBInstanceName")
    public String sourceDBInstanceName;

    /**
     * <p>The ID of the source region for point-in-time restoration.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>RestoreType</strong> is set to <strong>BackupTime</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceRegion")
    public String sourceRegion;

    /**
     * <p>The character set of the target instance. Valid values:</p>
     * <ul>
     * <li><strong>utf8</strong></li>
     * <li><strong>gbk</strong></li>
     * <li><strong>latin1</strong></li>
     * <li><strong>utf8mb4</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>uft8</p>
     */
    @NameInMap("SystemDBCharset")
    public String systemDBCharset;

    /**
     * <p>The subscription duration. Valid values:</p>
     * <ul>
     * <li>If <strong>Period</strong> is set to <strong>Year</strong>, the valid values of UsedTime are <strong>1 to 3</strong>.</li>
     * <li>If <strong>Period</strong> is set to <strong>Month</strong>, the valid values of UsedTime are <strong>1 to 9</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when PayType is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The VPC ID of the target instance.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when <strong>InstanceNetworkType</strong> is set to <strong>VPC</strong>.</li>
     * <li>If you specify this parameter, you must also specify the <strong>ZoneId</strong> parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the target instance. Separate multiple values with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when <strong>InstanceNetworkType</strong> is set to <strong>VPC</strong>.</li>
     * <li>If you specify this parameter, you must also specify the <strong>ZoneId</strong> parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The active zone ID of the target instance. Separate multiple zones with colons (:).</p>
     * <blockquote>
     * <p>If you specify a VPC and a vSwitch, this parameter is required to match the zone of the specified vSwitch.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDdrInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDdrInstanceRequest self = new CreateDdrInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDdrInstanceRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CreateDdrInstanceRequest setBackupSetRegion(String backupSetRegion) {
        this.backupSetRegion = backupSetRegion;
        return this;
    }
    public String getBackupSetRegion() {
        return this.backupSetRegion;
    }

    public CreateDdrInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDdrInstanceRequest setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
        return this;
    }
    public String getConnectionMode() {
        return this.connectionMode;
    }

    public CreateDdrInstanceRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CreateDdrInstanceRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateDdrInstanceRequest setDBInstanceNetType(String DBInstanceNetType) {
        this.DBInstanceNetType = DBInstanceNetType;
        return this;
    }
    public String getDBInstanceNetType() {
        return this.DBInstanceNetType;
    }

    public CreateDdrInstanceRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public CreateDdrInstanceRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public CreateDdrInstanceRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public CreateDdrInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDdrInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDdrInstanceRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public CreateDdrInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDdrInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDdrInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDdrInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDdrInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateDdrInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDdrInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDdrInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDdrInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDdrInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CreateDdrInstanceRequest setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public CreateDdrInstanceRequest setRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }
    public String getRoleARN() {
        return this.roleARN;
    }

    public CreateDdrInstanceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateDdrInstanceRequest setSourceDBInstanceName(String sourceDBInstanceName) {
        this.sourceDBInstanceName = sourceDBInstanceName;
        return this;
    }
    public String getSourceDBInstanceName() {
        return this.sourceDBInstanceName;
    }

    public CreateDdrInstanceRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    public CreateDdrInstanceRequest setSystemDBCharset(String systemDBCharset) {
        this.systemDBCharset = systemDBCharset;
        return this;
    }
    public String getSystemDBCharset() {
        return this.systemDBCharset;
    }

    public CreateDdrInstanceRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateDdrInstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDdrInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDdrInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
