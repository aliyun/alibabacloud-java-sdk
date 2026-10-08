// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportUserBackupFileRequest extends TeaModel {
    /**
     * <p>A JSON array that describes the backup file information in the OSS bucket. Example:
     * <code>{&quot;Bucket&quot;:&quot;test&quot;, &quot;Object&quot;:&quot;test/test_db_employees.xb&quot;,&quot;Location&quot;:&quot;ap-southeast-1&quot;}</code></p>
     * <p>The following list describes the parameters in the array:</p>
     * <ul>
     * <li><strong>Bucket</strong>: the name of the OSS bucket that stores the backup file. You can call <a href="https://help.aliyun.com/document_detail/31965.html">GetBucket</a> to query the bucket name.</li>
     * <li><strong>Object</strong>: the full path of the backup file in the directory. You can call <a href="https://help.aliyun.com/document_detail/31980.html">GetObject</a> to query the path.</li>
     * <li><strong>Location</strong>: the region ID of the OSS bucket. You can call <a href="https://help.aliyun.com/document_detail/31967.html">GetBucketLocation</a> to query the region ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;test&quot;, &quot;Object&quot;:&quot;test/test_db_employees.xb&quot;,&quot;Location&quot;:&quot;ap-southeast-1&quot;}</p>
     */
    @NameInMap("BackupFile")
    public String backupFile;

    /**
     * <p>The region ID of the OSS bucket that stores the backup file of the self-managed MySQL 5.7 database. You can call DescribeRegions to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BucketRegion")
    public String bucketRegion;

    /**
     * <p>Specifies whether to automatically set up replication. Valid values:</p>
     * <ul>
     * <li>true: automatically sets up replication. The <code>MasterInfo</code> parameter is required.</li>
     * <li>false: does not set up replication.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only for native replication instances. You must specify the <code>DBInstanceId</code> parameter when you call this operation.</p>
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
     * <p>The version of the MySQL database engine. Valid values: <strong>5.7</strong> and <strong>8.0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5.7</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>A JSON array that contains the master information for setting up MySQL replication (case-sensitive). Example:</p>
     * <pre><code>{&quot;masterIp&quot;:&quot;172.20.xx.xx&quot;,&quot;masterPort&quot;:&quot;3306&quot;,&quot;masterUser&quot;:&quot;replica&quot;,&quot;masterPassword&quot;:&quot;W33uopkehBQ=&quot;}
     * </code></pre>
     * <p>The following list describes the parameters in the array:</p>
     * <ul>
     * <li><code>masterIp</code>: the IP address of the primary database.</li>
     * <li><code>masterPort</code>: the port of the primary database.</li>
     * <li><code>masterUser</code>: the replication account of the primary database.</li>
     * <li><code>masterPassword</code>: the password of the replication account for the primary database. The password must be Base64-encoded.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only for native replication instances. You must specify the <code>DBInstanceId</code> parameter when you call this operation.</p>
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
     * <li>oss: imports the backup from OSS.</li>
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
     * <p>The region ID of the ApsaraDB RDS instance. You can call DescribeRegions to query the region ID.</p>
     * <blockquote>
     * <ul>
     * <li>The value of this parameter specifies the region ID in which you want to create the ApsaraDB RDS instance.</li>
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
     * <p>The resource group ID. You can call DescribeDBInstanceAttribute to query the resource group ID.</p>
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
     * <p>A JSON array that provides the source information for the full backup (case-sensitive). Example:</p>
     * <pre><code>{&quot;sourceIp&quot;:&quot;172.20.xx
     * .xx&quot;,&quot;sourcePort&quot;:&quot;9999&quot;}
     * </code></pre>
     * <p>The following list describes the parameters in the array:</p>
     * <ul>
     * <li><p><code>sourceIp</code>: the source IP address.</p>
     * </li>
     * <li><p><code>sourcePort</code>: the Netcat listening port on the source.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only for native replication instances. You must specify the <code>DBInstanceId</code> parameter when you call this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sourceIp&quot;:&quot;172.20.xx.xx&quot;,&quot;sourcePort&quot;:&quot;9999&quot;}</p>
     */
    @NameInMap("SourceInfo")
    public String sourceInfo;

    /**
     * <p>The zone ID. You can call DescribeRegions to query the zone ID.</p>
     * <blockquote>
     * <ul>
     * <li>After you specify a zone, the system creates a second-level snapshot in the zone, which significantly reduces the time required for backup import.</li>
     * <li>When you call CreateDBInstance to create an instance from the user backup, this zone is the zone in which the new instance resides.</li>
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
