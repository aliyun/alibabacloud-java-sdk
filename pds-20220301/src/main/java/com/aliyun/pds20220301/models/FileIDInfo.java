// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FileIDInfo extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("file_id")
    public String fileId;

    @NameInMap("type")
    public String type;

    public static FileIDInfo build(java.util.Map<String, ?> map) throws Exception {
        FileIDInfo self = new FileIDInfo();
        return TeaModel.build(map, self);
    }

    public FileIDInfo setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public FileIDInfo setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public FileIDInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
