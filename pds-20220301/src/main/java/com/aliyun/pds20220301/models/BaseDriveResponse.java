// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BaseDriveResponse extends TeaModel {
    @NameInMap("action_list")
    public java.util.List<String> actionList;

    @NameInMap("category")
    public String category;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("creator")
    public String creator;

    @NameInMap("delta_enabled")
    public Boolean deltaEnabled;

    @NameInMap("description")
    public String description;

    @NameInMap("domain_id")
    public String domainId;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("drive_name")
    public String driveName;

    @NameInMap("drive_type")
    public String driveType;

    @NameInMap("encrypt_data_access")
    public Boolean encryptDataAccess;

    @NameInMap("encrypt_mode")
    public String encryptMode;

    @NameInMap("is_handover")
    public Boolean isHandover;

    @NameInMap("owner")
    public String owner;

    @NameInMap("owner_type")
    public String ownerType;

    @NameInMap("path_status")
    public String pathStatus;

    @NameInMap("permission")
    public java.util.Map<String, IDPermission> permission;

    @NameInMap("relative_path")
    public String relativePath;

    @NameInMap("status")
    public String status;

    @NameInMap("store_id")
    public String storeId;

    @NameInMap("total_size")
    public Long totalSize;

    @NameInMap("updated_at")
    public String updatedAt;

    @NameInMap("used_size")
    public Long usedSize;

    public static BaseDriveResponse build(java.util.Map<String, ?> map) throws Exception {
        BaseDriveResponse self = new BaseDriveResponse();
        return TeaModel.build(map, self);
    }

    public BaseDriveResponse setActionList(java.util.List<String> actionList) {
        this.actionList = actionList;
        return this;
    }
    public java.util.List<String> getActionList() {
        return this.actionList;
    }

    public BaseDriveResponse setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public BaseDriveResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public BaseDriveResponse setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public BaseDriveResponse setDeltaEnabled(Boolean deltaEnabled) {
        this.deltaEnabled = deltaEnabled;
        return this;
    }
    public Boolean getDeltaEnabled() {
        return this.deltaEnabled;
    }

    public BaseDriveResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BaseDriveResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public BaseDriveResponse setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public BaseDriveResponse setDriveName(String driveName) {
        this.driveName = driveName;
        return this;
    }
    public String getDriveName() {
        return this.driveName;
    }

    public BaseDriveResponse setDriveType(String driveType) {
        this.driveType = driveType;
        return this;
    }
    public String getDriveType() {
        return this.driveType;
    }

    public BaseDriveResponse setEncryptDataAccess(Boolean encryptDataAccess) {
        this.encryptDataAccess = encryptDataAccess;
        return this;
    }
    public Boolean getEncryptDataAccess() {
        return this.encryptDataAccess;
    }

    public BaseDriveResponse setEncryptMode(String encryptMode) {
        this.encryptMode = encryptMode;
        return this;
    }
    public String getEncryptMode() {
        return this.encryptMode;
    }

    public BaseDriveResponse setIsHandover(Boolean isHandover) {
        this.isHandover = isHandover;
        return this;
    }
    public Boolean getIsHandover() {
        return this.isHandover;
    }

    public BaseDriveResponse setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public BaseDriveResponse setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public BaseDriveResponse setPathStatus(String pathStatus) {
        this.pathStatus = pathStatus;
        return this;
    }
    public String getPathStatus() {
        return this.pathStatus;
    }

    public BaseDriveResponse setPermission(java.util.Map<String, IDPermission> permission) {
        this.permission = permission;
        return this;
    }
    public java.util.Map<String, IDPermission> getPermission() {
        return this.permission;
    }

    public BaseDriveResponse setRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }
    public String getRelativePath() {
        return this.relativePath;
    }

    public BaseDriveResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BaseDriveResponse setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public BaseDriveResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public BaseDriveResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public BaseDriveResponse setUsedSize(Long usedSize) {
        this.usedSize = usedSize;
        return this;
    }
    public Long getUsedSize() {
        return this.usedSize;
    }

}
