// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateFacegroupRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The face ID of the thumbnail of the face-based group. You can obtain the face ID from the **image_media_metadata** parameter in the returned results of the GetFile, ListFile, or SearchFile operation.</p>
     */
    @NameInMap("group_cover_face_id")
    public String groupCoverFaceId;

    /**
     * <p>The ID of the face-based group. You can call the ListFacegroups operation to query the group ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("group_id")
    public String groupId;

    /**
     * <p>The name of the face-based group. The name can be up to 128 characters in length.</p>
     */
    @NameInMap("group_name")
    public String groupName;

    /**
     * <p>The remarks. The remarks can be up to 128 characters in length.</p>
     */
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
