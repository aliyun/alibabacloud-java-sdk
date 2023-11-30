// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DeltaGetLastCursorRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The ID of the root file of the synced folder.</p>
     */
    @NameInMap("sync_root_id")
    public String syncRootId;

    public static DeltaGetLastCursorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeltaGetLastCursorRequest self = new DeltaGetLastCursorRequest();
        return TeaModel.build(map, self);
    }

    public DeltaGetLastCursorRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public DeltaGetLastCursorRequest setSyncRootId(String syncRootId) {
        this.syncRootId = syncRootId;
        return this;
    }
    public String getSyncRootId() {
        return this.syncRootId;
    }

}
