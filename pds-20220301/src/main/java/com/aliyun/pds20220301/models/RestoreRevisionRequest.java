// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class RestoreRevisionRequest extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("file_id")
    public String fileId;

    @NameInMap("revision_id")
    public String revisionId;

    public static RestoreRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreRevisionRequest self = new RestoreRevisionRequest();
        return TeaModel.build(map, self);
    }

    public RestoreRevisionRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public RestoreRevisionRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public RestoreRevisionRequest setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

}
