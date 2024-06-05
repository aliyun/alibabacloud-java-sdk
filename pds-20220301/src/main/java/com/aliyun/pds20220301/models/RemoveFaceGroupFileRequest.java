// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class RemoveFaceGroupFileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("face_group_id")
    public String faceGroupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    public static RemoveFaceGroupFileRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveFaceGroupFileRequest self = new RemoveFaceGroupFileRequest();
        return TeaModel.build(map, self);
    }

    public RemoveFaceGroupFileRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public RemoveFaceGroupFileRequest setFaceGroupId(String faceGroupId) {
        this.faceGroupId = faceGroupId;
        return this;
    }
    public String getFaceGroupId() {
        return this.faceGroupId;
    }

    public RemoveFaceGroupFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
