// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateFacegroupRequest extends TeaModel {
    /**
     * <p>The ID of the drive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The ID of the group cover face. You can obtain this ID from the <strong>ImageMediaMetadata</strong> field in the response from the file/get, file/list, or file/search operations.</p>
     * 
     * <strong>example:</strong>
     * <p>face1</p>
     */
    @NameInMap("group_cover_face_id")
    public String groupCoverFaceId;

    /**
     * <p>The ID of the face group. You can obtain this ID in the response from the list face groups operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group-abc</p>
     */
    @NameInMap("group_id")
    public String groupId;

    /**
     * <p>The name of the face group. The name can be up to 128 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>Face of John</p>
     */
    @NameInMap("group_name")
    public String groupName;

    /**
     * <p>Remarks about the face group. The remarks can be up to 128 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>John Doe</p>
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
