// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportUserBackupFileRequest extends TeaModel {
    /**
     * <p>The JSON array that describes the information about the backup file in the OSS bucket. Example:
     * <code>{&quot;Bucket&quot;:&quot;test&quot;, &quot;Object&quot;:&quot;test/test_db_employees.xb&quot;,&quot;Location&quot;:&quot;ap-southeast-1&quot;}</code></p>
     * <p>Parameters in the array:</p>
     * <ul>
     * <li><strong>Bucket</strong>: the name of the OSS bucket where the backup file is stored. You can call the <a href="https://help.aliyun.com/document_detail/31965.html">GetBucket</a> operation to query the name.</li>
     * <li><strong>Object</strong>: the detailed path of the directory where the backup file is stored. You can call the <a href="https://help.aliyun.com/document_detail/31980.html">GetObject</a> operation to query the path.</li>
     * <li><strong>Location</strong>: the region ID of the OSS bucket. You can call the <a href="https://help.aliyun.com/document_detail/31967.html">GetBucketLocation</a> operation to query the region ID.</li>
     * </ul>
     * <p>This parameter is required when <strong>Mode</strong> is set to <strong>oss</strong>. For <strong>Location</strong>, specify the region ID of the OSS bucket. You can call the GetBucketLocation operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;test&quot;, &quot;Object&quot;:&quot;test/test_db_employees.xb&quot;,&quot;Location&quot;:&quot;ap-southeast-1&quot;}</p>
     */
    @NameInMap("BackupFile")
    public String backupFile;

    /**
     * <p>The region ID of the OSS bucket where the backup file of the self-managed MySQL 5.7 database is stored. You can call the DescribeRegions operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BucketRegion")
    public String bucketRegion;

    /**
     * <p>Specifies whether to automatically set up replication. Valid values:</p>
     * <ul>
     * <li>true: yes. The MasterInfo parameter is required.</li>
     * <li>false: no.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only for native replication instances. You must specify the DBInstanceId parameter when you call this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BuildReplication")
    public Boolean buildReplication;

    /**
     * <p>The description of the user backup to be imported.</p>
     * 
     * <strong>example:</strong>
     * <p>BackupTest</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The version of the MySQL database. Valid values: <strong>5.7</strong> and <strong>8.0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5.7</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The case-sensitive JSON array that provides the master information for setting up MySQL replication. Example:</p>
     * <pre><code>{&quot;masterIp&quot;:&quot;172.20.xx.xx&quot;,&quot;masterPort&quot;:&quot;3306&quot;,&quot;masterUser&quot;:&quot;replica&quot;,&quot;masterPassword&quot;:&quot;W33uopkehBQ=&quot;}
     * </code></pre>
     * <p>Parameters in the array:</p>
     * <ul>
     * <li>masterIp: the IP address of the primary database.</li>
     * <li>masterPort: the port of the primary database.</li>
     * <li>masterUser: the replication account of the primary database.</li>
     * <li>masterPassword: the password of the replication account of the primary database. The password must be Base64-encoded.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only for native replication instances. You must specify the DBInstanceId parameter when you call this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;masterIp&quot;:&quot;172.20.xx.xx&quot;,&quot;masterPort&quot;:&quot;3306&quot;,&quot;masterUser&quot;:&quot;replica&quot;,&quot;masterPassword&quot;:&quot;W33uopkehBQ=&quot;}</p>
     */
    @NameInMap("MasterInfo")
    public String masterInfo;

    /**
     * <p>The import mode. Valid values:</p>
     * <ul>
     * <li>oss: downloads the backup from OSS and imports it.</li>
     * <li>stream: imports the backup over the network.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("Mode")
    public String mode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the ApsaraDB RDS instance. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <blockquote>
     * <ul>
     * <li>The value of this parameter is the region ID where you want to create the ApsaraDB RDS instance.</li>
     * <li>The value must be the same as the value of the <strong>BucketRegion</strong> parameter.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. You can call the DescribeDBInstanceAttribute operation to query the resource group ID.</p>
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
     * <p>The storage space required to restore the user backup. Unit: GB.</p>
     * <blockquote>
     * <ul>
     * <li>The default value is five times the size of the backup file.</li>
     * <li>The minimum value is 20.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("RestoreSize")
    public Integer restoreSize;

    /**
     * <p>The retention period of the user backup file. Unit: days. The value must be an integer greater than <strong>0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Retention")
    public Integer retention;

    /**
     * <p>The case-sensitive JSON array that provides the source information of the full backup. Example:</p>
     * <pre><code>{&quot;sourceIp&quot;:&quot;172.20.xx.xx&quot;,&quot;sourcePort&quot;:&quot;9999&quot;}
     * </code></pre>
     * <p>Parameters in the array:</p>
     * <ul>
     * <li><p>sourceIp: the source IP address.</p>
     * </li>
     * <li><p>sourcePort: the port listened by Netcat on the source.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only for native replication instances. You must specify the DBInstanceId parameter when you call this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sourceIp&quot;:&quot;172.20.xx.xx&quot;,&quot;sourcePort&quot;:&quot;9999&quot;}</p>
     */
    @NameInMap("SourceInfo")
    public String sourceInfo;

    /**
     * <p>The zone ID. You can call the DescribeRegions operation to query the most recent zone list.</p>
     * <blockquote>
     * <ul>
     * <li>After you specify a zone, the system creates a snapshot within seconds in the zone, which significantly reduces the time required to import the backup.</li>
     * <li>When you call the CreateDBInstance operation to create an instance by using the user backup, the instance is created in this zone.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static ImportUserBackupFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportUserBackupFileRequest self = new ImportUserBackupFileRequest();
        return TeaModel.build(map, self);
    }

    public ImportUserBackupFileRequest setBackupFile(String backupFile) {
        this.backupFile = backupFile;
        return this;
    }
    public String getBackupFile() {
        return this.backupFile;
    }

    public ImportUserBackupFileRequest setBucketRegion(String bucketRegion) {
        this.bucketRegion = bucketRegion;
        return this;
    }
    public String getBucketRegion() {
        return this.bucketRegion;
    }

    public ImportUserBackupFileRequest setBuildReplication(Boolean buildReplication) {
        this.buildReplication = buildReplication;
        return this;
    }
    public Boolean getBuildReplication() {
        return this.buildReplication;
    }

    public ImportUserBackupFileRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ImportUserBackupFileRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ImportUserBackupFileRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public ImportUserBackupFileRequest setMasterInfo(String masterInfo) {
        this.masterInfo = masterInfo;
        return this;
    }
    public String getMasterInfo() {
        return this.masterInfo;
    }

    public ImportUserBackupFileRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ImportUserBackupFileRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImportUserBackupFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportUserBackupFileRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ImportUserBackupFileRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ImportUserBackupFileRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ImportUserBackupFileRequest setRestoreSize(Integer restoreSize) {
        this.restoreSize = restoreSize;
        return this;
    }
    public Integer getRestoreSize() {
        return this.restoreSize;
    }

    public ImportUserBackupFileRequest setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public ImportUserBackupFileRequest setSourceInfo(String sourceInfo) {
        this.sourceInfo = sourceInfo;
        return this;
    }
    public String getSourceInfo() {
        return this.sourceInfo;
    }

    public ImportUserBackupFileRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
