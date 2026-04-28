// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Drive extends TeaModel {
    /**
     * <p>The time when the drive was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p>The user who created the drive.</p>
     * 
     * <strong>example:</strong>
     * <p>c9b7a5aa04d14ae3867fdc886fa01da4</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>The description of the drive.</p>
     * 
     * <strong>example:</strong>
     * <p>vipdrive</p>
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
     * <p>drv1</p>
     */
    @NameInMap("drive_name")
    public String driveName;

    /**
     * <p>The type of the drive.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("drive_type")
    public String driveType;

    /**
     * <p>The owner of the drive.</p>
     * 
     * <strong>example:</strong>
     * <p>c9b7a5aa04d14ae3867fdc886fa01da4</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>The type of the owner.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("owner_type")
    public String ownerType;

    /**
     * <p>The status of the driver.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The total storage space of the drive.</p>
     * 
     * <strong>example:</strong>
     * <p>204800</p>
     */
    @NameInMap("total_size")
    public Long totalSize;

    /**
     * <p>The occupied storage space of the drive.</p>
     * 
     * <strong>example:</strong>
     * <p>20480</p>
     */
    @NameInMap("used_size")
    public Long usedSize;

    public static Drive build(java.util.Map<String, ?> map) throws Exception {
        Drive self = new Drive();
        return TeaModel.build(map, self);
    }

    public Drive setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Drive setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Drive setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Drive setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public Drive setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public Drive setDriveName(String driveName) {
        this.driveName = driveName;
        return this;
    }
    public String getDriveName() {
        return this.driveName;
    }

    public Drive setDriveType(String driveType) {
        this.driveType = driveType;
        return this;
    }
    public String getDriveType() {
        return this.driveType;
    }

    public Drive setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public Drive setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public Drive setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Drive setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public Drive setUsedSize(Long usedSize) {
        this.usedSize = usedSize;
        return this;
    }
    public Long getUsedSize() {
        return this.usedSize;
    }

}
