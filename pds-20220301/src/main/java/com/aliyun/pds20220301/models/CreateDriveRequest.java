// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateDriveRequest extends TeaModel {
    /**
     * <p>Specifies whether the drive is the default drive. The default value is <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("default")
    public Boolean _default;

    /**
     * <p>The description. The description can be up to 1024 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>VIP space</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the drive. The name can be up to 128 characters long.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>My personal space</p>
     */
    @NameInMap("drive_name")
    public String driveName;

    /**
     * <p>The drive type. Currently, only <code>normal</code> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("drive_type")
    public String driveType;

    /**
     * <p>The ID of the owner.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3b3d7245c159488da17d081ad6c64687</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>The owner type. Valid values:</p>
     * <p>user<br>group<br></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("owner_type")
    public String ownerType;

    /**
     * <p>The status. Valid values:</p>
     * <p>enabled: The drive is available.<br>disabled: The drive is unavailable.<br></p>
     * <p>The default value is <code>enabled</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The total size of the drive in bytes. By default, the size is unlimited.</p>
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
