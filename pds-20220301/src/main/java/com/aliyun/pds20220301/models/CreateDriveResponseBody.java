// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateDriveResponseBody extends TeaModel {
    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-14T03:14:28.109Z</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p>The ID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>c9b7a5aa04d14ae3867fdc886fa01da4</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>VIP space</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The domain ID.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The drive ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The drive name.</p>
     * 
     * <strong>example:</strong>
     * <p>My personal space</p>
     */
    @NameInMap("drive_name")
    public String driveName;

    /**
     * <p>The drive type.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("drive_type")
    public String driveType;

    /**
     * <p>The owner ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3b3d7245c159488da17d081ad6c64687</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>The owner type.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("owner_type")
    public String ownerType;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The total size of the drive in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("total_size")
    public Long totalSize;

    /**
     * <p>The used space in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("used_size")
    public Long usedSize;

    public static CreateDriveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDriveResponseBody self = new CreateDriveResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDriveResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateDriveResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CreateDriveResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDriveResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public CreateDriveResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CreateDriveResponseBody setDriveName(String driveName) {
        this.driveName = driveName;
        return this;
    }
    public String getDriveName() {
        return this.driveName;
    }

    public CreateDriveResponseBody setDriveType(String driveType) {
        this.driveType = driveType;
        return this;
    }
    public String getDriveType() {
        return this.driveType;
    }

    public CreateDriveResponseBody setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateDriveResponseBody setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public CreateDriveResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateDriveResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public CreateDriveResponseBody setUsedSize(Long usedSize) {
        this.usedSize = usedSize;
        return this;
    }
    public Long getUsedSize() {
        return this.usedSize;
    }

}
