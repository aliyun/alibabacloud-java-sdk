// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class KnowledgeFileItem extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    public static KnowledgeFileItem build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeFileItem self = new KnowledgeFileItem();
        return TeaModel.build(map, self);
    }

    public KnowledgeFileItem setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public KnowledgeFileItem setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
