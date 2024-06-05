// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UCDataRefFileInfo extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("file_id")
    public String fileId;

    @NameInMap("revision_id")
    public String revisionId;

    public static UCDataRefFileInfo build(java.util.Map<String, ?> map) throws Exception {
        UCDataRefFileInfo self = new UCDataRefFileInfo();
        return TeaModel.build(map, self);
    }

    public UCDataRefFileInfo setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public UCDataRefFileInfo setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UCDataRefFileInfo setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

}
