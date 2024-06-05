// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetFileRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The fields to return.</p>
     * <br>
     * <p>1.  If this parameter is set to \\*, all fields of the file except the fields that must be specified are returned.</p>
     * <p>2.  If only specific fields are required, you can specify the following fields: url, thumbnail, exif, cropping_suggestion, characteristic_hash, video_metadata, and video_preview_metadata. If multiple fields are required, separate them with commas (,). Example: url,thumbnail.</p>
     * <p>3.  The investigation_info field is returned only if you specify this field.</p>
     * <br>
     * <p>By default, all fields except the fields that must be specified are returned.</p>
     */
    @NameInMap("fields")
    public String fields;

    /**
     * <p>The file ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The share ID. If you want to manage a file by using a share link, carry the `x-share-token` header for authentication in the request and specify share_id. In this case, `drive_id` is invalid. Otherwise, use an `AccessKey pair` or `access token` for authentication and specify `drive_id`. You must specify one of `share_id` and `drive_id`.</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>缩略图配置，可一次性返回最多5个缩略图，map的key可以自定义，返回时按key返回对应的缩略图链接</p>
     */
    @NameInMap("thumbnail_processes")
    public java.util.Map<String, ImageProcess> thumbnailProcesses;

    /**
     * <p>The time when the file expires. Unit: seconds. Valid values: 10 to 14400.</p>
     */
    @NameInMap("url_expire_sec")
    public Integer urlExpireSec;

    public static GetFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileRequest self = new GetFileRequest();
        return TeaModel.build(map, self);
    }

    public GetFileRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public GetFileRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public GetFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public GetFileRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public GetFileRequest setThumbnailProcesses(java.util.Map<String, ImageProcess> thumbnailProcesses) {
        this.thumbnailProcesses = thumbnailProcesses;
        return this;
    }
    public java.util.Map<String, ImageProcess> getThumbnailProcesses() {
        return this.thumbnailProcesses;
    }

    public GetFileRequest setUrlExpireSec(Integer urlExpireSec) {
        this.urlExpireSec = urlExpireSec;
        return this;
    }
    public Integer getUrlExpireSec() {
        return this.urlExpireSec;
    }

}
