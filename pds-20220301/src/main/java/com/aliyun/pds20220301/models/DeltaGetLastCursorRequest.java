// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DeltaGetLastCursorRequest extends TeaModel {
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
     * <p>The ID of the root file of the synced folder.</p>
     * 
     * <strong>example:</strong>
     * <p>622fb09598ae66777c7040109a16f49381f6abe1</p>
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
