// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateFacegroupRequest extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("group_cover_face_id")
    public String groupCoverFaceId;

    @NameInMap("group_id")
    public String groupId;

    @NameInMap("group_name")
    public String groupName;

    @NameInMap("remarks")
    public String remarks;

    public static UpdateFacegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFacegroupRequest self = new UpdateFacegroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFacegroupRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public UpdateFacegroupRequest setGroupCoverFaceId(String groupCoverFaceId) {
        this.groupCoverFaceId = groupCoverFaceId;
        return this;
    }
    public String getGroupCoverFaceId() {
        return this.groupCoverFaceId;
    }

    public UpdateFacegroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateFacegroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateFacegroupRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

}
