// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetRevisionRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>Specifies the returned fields.</p>
     * <br>
     * <p>By default, this parameter is left empty. If you set this parameter to \*, all fields are returned. If you leave this parameter empty, the creator of the file is not returned.</p>
     */
    @NameInMap("fields")
    public String fields;

    /**
     * <p>The file ID.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The version ID.</p>
     */
    @NameInMap("revision_id")
    public String revisionId;

    /**
     * <p>The validity period of the file download or preview. Valid values: 10 to 86400.</p>
     * <br>
     * <p>Default value: 900. Unit: seconds.</p>
     */
    @NameInMap("url_expire_sec")
    public Long urlExpireSec;

    public static GetRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRevisionRequest self = new GetRevisionRequest();
        return TeaModel.build(map, self);
    }

    public GetRevisionRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public GetRevisionRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public GetRevisionRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public GetRevisionRequest setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

    public GetRevisionRequest setUrlExpireSec(Long urlExpireSec) {
        this.urlExpireSec = urlExpireSec;
        return this;
    }
    public Long getUrlExpireSec() {
        return this.urlExpireSec;
    }

}
