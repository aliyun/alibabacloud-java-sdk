// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetRevisionRequest extends TeaModel {
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
     * <p>Specifies the fields to return.</p>
     * <p>By default, this parameter is empty. If you set this parameter to an asterisk (\*), all fields are returned, including the creator name.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("fields")
    public String fields;

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
     * <p>The revision ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40CB7794C929</p>
     */
    @NameInMap("revision_id")
    public String revisionId;

    /**
     * <p>The URL expiration time in seconds. The value must be between 10 and 86400.</p>
     * <p>The default value is 900 seconds (15 minutes).</p>
     * 
     * <strong>example:</strong>
     * <p>900</p>
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
