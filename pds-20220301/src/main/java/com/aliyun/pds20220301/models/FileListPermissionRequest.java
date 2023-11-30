// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FileListPermissionRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    public static FileListPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        FileListPermissionRequest self = new FileListPermissionRequest();
        return TeaModel.build(map, self);
    }

    public FileListPermissionRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public FileListPermissionRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
