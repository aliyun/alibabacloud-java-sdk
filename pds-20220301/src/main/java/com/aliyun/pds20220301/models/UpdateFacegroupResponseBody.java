// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateFacegroupResponseBody extends TeaModel {
    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The group ID.</p>
     */
    @NameInMap("group_id")
    public String groupId;

    public static UpdateFacegroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFacegroupResponseBody self = new UpdateFacegroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFacegroupResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public UpdateFacegroupResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
