// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportUserBackupFileRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("BucketRegion")
    public String bucketRegion;

    @NameInMap("BackupFile")
    public String backupFile;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("RestoreSize")
    public Integer restoreSize;

    @NameInMap("Retention")
    public Integer retention;

    @NameInMap("ZoneId")
    public String zoneId;

    public static ImportUserBackupFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportUserBackupFileRequest self = new ImportUserBackupFileRequest();
        return TeaModel.build(map, self);
    }

    public ImportUserBackupFileRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public ImportUserBackupFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportUserBackupFileRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public ImportUserBackupFileRequest setBucketRegion(String bucketRegion) {
        this.bucketRegion = bucketRegion;
        return this;
    }
    public String getBucketRegion() {
        return this.bucketRegion;
    }

    public ImportUserBackupFileRequest setBackupFile(String backupFile) {
        this.backupFile = backupFile;
        return this;
    }
    public String getBackupFile() {
        return this.backupFile;
    }

    public ImportUserBackupFileRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
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
