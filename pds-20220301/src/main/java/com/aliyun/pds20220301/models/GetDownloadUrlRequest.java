// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetDownloadUrlRequest extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("expire_sec")
    public Integer expireSec;

    @NameInMap("file_id")
    public String fileId;

    @NameInMap("file_name")
    public String fileName;

    @NameInMap("share_id")
    public String shareId;

    public static GetDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadUrlRequest self = new GetDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetDownloadUrlRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public GetDownloadUrlRequest setExpireSec(Integer expireSec) {
        this.expireSec = expireSec;
        return this;
    }
    public Integer getExpireSec() {
        return this.expireSec;
    }

    public GetDownloadUrlRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public GetDownloadUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetDownloadUrlRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

}
