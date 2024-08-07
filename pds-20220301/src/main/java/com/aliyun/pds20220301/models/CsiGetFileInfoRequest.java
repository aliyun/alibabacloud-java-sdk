// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CsiGetFileInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9520943DC264</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("url_expire_sec")
    public Integer urlExpireSec;

    public static CsiGetFileInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CsiGetFileInfoRequest self = new CsiGetFileInfoRequest();
        return TeaModel.build(map, self);
    }

    public CsiGetFileInfoRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CsiGetFileInfoRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CsiGetFileInfoRequest setUrlExpireSec(Integer urlExpireSec) {
        this.urlExpireSec = urlExpireSec;
        return this;
    }
    public Integer getUrlExpireSec() {
        return this.urlExpireSec;
    }

}
