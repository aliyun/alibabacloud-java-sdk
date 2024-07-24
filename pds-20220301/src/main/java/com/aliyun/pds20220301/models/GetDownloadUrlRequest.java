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
     * <p>The validity period of the download URL. Maximum value: 115200. Default value: 900. Unit: seconds.</p>
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
     * <p>The name of the file. The name can be up to 1,024 characters in length.</p>
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
     * <p>The share ID. If you want to manage a file by using a sharing link, carry the <code>x-share-token</code> header in the request and specify share_id. In this case, <code>drive_id</code> is invalid. Otherwise, use an <code>AccessKey pair</code> or <code>access token</code> for authentication and specify <code>drive_id</code>. You must specify at least either <code>share_id</code> or <code>drive_id</code>.</p>
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
