// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetDownloadUrlRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The time-to-live (TTL) of the download URL, in seconds. The maximum value is 115200. The default value is 900.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("expire_sec")
    public Integer expireSec;

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
     * <p>The file name. The maximum length is 1,024 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1.txt</p>
     */
    @NameInMap("file_name")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>video/mp4</p>
     */
    @NameInMap("response_content_type")
    public String responseContentType;

    /**
     * <p>The share ID.
     * If you access the file through a share, include the <code>x-share-token</code> header for authentication and provide this field. In that case, the <code>drive_id</code> field is ignored. Otherwise, use an AccessKey pair or an access token for authentication and provide the <code>drive_id</code> field.
     * You must specify either <code>share_id</code> or <code>drive_id</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1FswpQ8</p>
     */
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

    public GetDownloadUrlRequest setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public GetDownloadUrlRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

}
