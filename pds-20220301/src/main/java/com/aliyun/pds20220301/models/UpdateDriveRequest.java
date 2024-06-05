// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateDriveRequest extends TeaModel {
    /**
     * <p>The description of the drive. The description can be up to 1,024 characters in length.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The drive ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The name of the drive. The name can be up to 128 characters in length.</p>
     */
    @NameInMap("drive_name")
    public String driveName;

    /**
     * <p>The owner of the drive. Note: You can modify the owner of a personal drive only by using an AccessKey pair.</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>The state of the drive. Valid values:</p>
     * <br>
     * <p>enabled and disabled.</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The total size of the drive. Unit: bytes. A value of -1 specifies that the size is unlimited.</p>
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
