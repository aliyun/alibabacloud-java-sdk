// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DeleteRevisionRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The version ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("revision_id")
    public String revisionId;

    public static DeleteRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRevisionRequest self = new DeleteRevisionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRevisionRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public DeleteRevisionRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public DeleteRevisionRequest setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

}
