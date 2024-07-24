// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateRevisionRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9520943DC264</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>Specifies whether to permanently retain a version.</p>
     * <p>By default, this parameter is not specified, which indicates that you do not modify the permanent retention configuration of the version.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("keep_forever")
    public Boolean keepForever;

    /**
     * <p>The description of the version. The description can be up to 1,024 characters in length.</p>
     * <p>By default, this parameter is not specified, which indicates that you do not modify the description of the version.</p>
     * 
     * <strong>example:</strong>
     * <p>aaa</p>
     */
    @NameInMap("revision_description")
    public String revisionDescription;

    /**
     * <p>The version ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40CB7794C929</p>
     */
    @NameInMap("revision_id")
    public String revisionId;

    public static UpdateRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRevisionRequest self = new UpdateRevisionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRevisionRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public UpdateRevisionRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UpdateRevisionRequest setKeepForever(Boolean keepForever) {
        this.keepForever = keepForever;
        return this;
    }
    public Boolean getKeepForever() {
        return this.keepForever;
    }

    public UpdateRevisionRequest setRevisionDescription(String revisionDescription) {
        this.revisionDescription = revisionDescription;
        return this;
    }
    public String getRevisionDescription() {
        return this.revisionDescription;
    }

    public UpdateRevisionRequest setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

}
