// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateDriveRequest extends TeaModel {
    /**
     * <p>Specifies whether the drive is the default drive. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("default")
    public Boolean _default;

    /**
     * <p>The description of the drive. The description can be up to 1,024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>drive for test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the drive. The name can be up to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_drive</p>
     */
    @NameInMap("drive_name")
    public String driveName;

    /**
     * <p>The type of the drive. Set the value to normal.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("drive_type")
    public String driveType;

    /**
     * <p>The owner of the drive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3b3d7245c159488da17d081ad6c64687</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>The type of the owner. Valid values:</p>
     * <p>user and group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("owner_type")
    public String ownerType;

    /**
     * <p>The state of the drive. Valid values:</p>
     * <p>enabled and disabled.</p>
     * <p>Default value: enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The total size of the drive. Unit: bytes. By default, the size is unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("total_size")
    public Long totalSize;

    public static CreateDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDriveRequest self = new CreateDriveRequest();
        return TeaModel.build(map, self);
    }

    public CreateDriveRequest set_default(Boolean _default) {
        this._default = _default;
        return this;
    }
    public Boolean get_default() {
        return this._default;
    }

    public CreateDriveRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDriveRequest setDriveName(String driveName) {
        this.driveName = driveName;
        return this;
    }
    public String getDriveName() {
        return this.driveName;
    }

    public CreateDriveRequest setDriveType(String driveType) {
        this.driveType = driveType;
        return this;
    }
    public String getDriveType() {
        return this.driveType;
    }

    public CreateDriveRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateDriveRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public CreateDriveRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateDriveRequest setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
