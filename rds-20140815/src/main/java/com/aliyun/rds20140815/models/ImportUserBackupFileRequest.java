// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportUserBackupFileRequest extends TeaModel {
    /**
     * <p>A JSON array that consists of the information about the full backup file stored as an object in an OSS bucket. Example: <code>{&quot;Bucket&quot;:&quot;test&quot;, &quot;Object&quot;:&quot;test/test_db_employees.xb&quot;,&quot;Location&quot;:&quot;ap-southeast-1&quot;}</code></p>
     * <p>The JSON array contains the following fields:</p>
     * <ul>
     * <li><strong>Bucket</strong>: The name of the OSS bucket in which the full backup file is stored as an object. You can call the <a href="https://help.aliyun.com/document_detail/31965.html">GetBucket</a> operation to query the name of the bucket.</li>
     * <li><strong>Object</strong>: The path of the full backup file that is stored as an object in the OSS bucket. You can call the <a href="https://help.aliyun.com/document_detail/31980.html">GetObject</a> operation to query the path of the object.</li>
     * <li><strong>Location</strong>: The ID of the region in which the OSS bucket is located. You can call the <a href="https://help.aliyun.com/document_detail/31967.html">GetBucketLocation</a> operation to query the region of the bucket.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;test&quot;, &quot;Object&quot;:&quot;test/test_db_employees.xb&quot;,&quot;Location&quot;:&quot;ap-southeast-1&quot;}</p>
     */
    @NameInMap("BackupFile")
    public String backupFile;

    /**
     * <p>The region ID of the OSS bucket where the full backup file of the self-managed MySQL database is located. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BucketRegion")
    public String bucketRegion;

    /**
     * <p>The description of the full backup file.</p>
     * 
     * <strong>example:</strong>
     * <p>BackupTest</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The version of the database engine that is run on the self-managed MySQL database and ApsaraDB RDS for MySQL instance. Set the value to <strong>5.7</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5.7</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <blockquote>
     * <ul>
     * <li>The value of this parameter is the ID of the region in which you want to create the instance.</li>
     * <li>The value of this parameter must be consistent with the value of <strong>BucketRegion</strong>.</li>
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
     * <p>The amount of storage that is required to restore the data of the full backup file. Unit: GB.</p>
     * <blockquote>
     * <ul>
     * <li>The default value of this parameter is 5 times the size of the full backup file.</li>
     * <li>The minimum value of this parameter is 20.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("RestoreSize")
    public Integer restoreSize;

    /**
     * <p>The retention period of the full backup file. Unit: days. Valid values: any <strong>non-zero</strong> positive integer.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Retention")
    public Integer retention;

    /**
     * <p>The zone ID. You can call the DescribeRegions operation to query the zone ID.</p>
     * <blockquote>
     * <ul>
     * <li>If you specify this parameter, the system creates a snapshot in single-digit seconds, which greatly reduces the time that is required to import the full backup file.</li>
     * <li>When you call the CreateDBInstance operation to create an instance by using the full backup file, the instance is created in the zone that you specify for this parameter.</li>
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

    public ImportUserBackupFileRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ImportUserBackupFileRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
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

    public ImportUserBackupFileRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
