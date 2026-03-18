// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class UpdateBackupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>bk-t1232839</p>
     */
    @NameInMap("backupTaskId")
    public String backupTaskId;

    /**
     * <strong>example:</strong>
     * <p>backupTask-desc1</p>
     */
    @NameInMap("description")
    public String description;

    public static UpdateBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBackupRequest self = new UpdateBackupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBackupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateBackupRequest setBackupTaskId(String backupTaskId) {
        this.backupTaskId = backupTaskId;
        return this;
    }
    public String getBackupTaskId() {
        return this.backupTaskId;
    }

    public UpdateBackupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
