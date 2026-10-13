// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateDriveRequest extends TeaModel {
    /**
     * <p>The description of the drive. The description can be up to 1,024 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>VIP space</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The drive ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The drive name. The name can be up to 128 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>My personal space</p>
     */
    @NameInMap("drive_name")
    public String driveName;

    /**
     * <p>The owner of the drive. Note: To change the owner of a personal drive, you must use an access key (AK).</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>The status of the drive. Valid values:</p>
     * <p>enabled: The drive is available for use.<br>disabled: The drive cannot be used.<br></p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The total size of the drive, in bytes. Set this value to -1 to have no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("total_size")
    public Long totalSize;

    public static UpdateDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDriveRequest self = new UpdateDriveRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDriveRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDriveRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public UpdateDriveRequest setDriveName(String driveName) {
        this.driveName = driveName;
        return this;
    }
    public String getDriveName() {
        return this.driveName;
    }

    public UpdateDriveRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateDriveRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateDriveRequest setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
