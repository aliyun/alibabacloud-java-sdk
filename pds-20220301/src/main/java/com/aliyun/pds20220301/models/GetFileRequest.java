// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetFileRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>Specifies which fields to return:</p>
     * <ol>
     * <li><p>If you set this parameter to <code>*</code>, this operation returns all file fields, except for those that must be explicitly requested.</p>
     * </li>
     * <li><p>To return specific fields, provide a comma-separated list, such as <code>url,thumbnail</code>. Supported fields include <code>url</code>, <code>thumbnail</code>, <code>exif</code>, <code>cropping_suggestion</code>, <code>characteristic_hash</code>, <code>video_metadata</code>, and <code>video_preview_metadata</code>.</p>
     * </li>
     * <li><p>You must include <code>investigation_info</code> in the value to retrieve the <code>investigation_info</code> field.</p>
     * </li>
     * </ol>
     * <p>By default, this operation returns all file fields, except for those that require an explicit request.</p>
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
     * <p>The share ID. To access a file in a share, provide this parameter and authenticate with the <code>x-share-token</code> header, in which case <code>drive_id</code> is ignored. Otherwise, provide <code>drive_id</code> and authenticate with an AccessKey pair or an <code>access_token</code>. You must specify either <code>share_id</code> or <code>drive_id</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1FswpQ8</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>Specifies the thumbnail configuration. Request up to five thumbnails in a single call by defining custom keys for the map. The response returns the URL for each requested thumbnail under its corresponding key.</p>
     */
    @NameInMap("thumbnail_processes")
    public java.util.Map<String, ImageProcess> thumbnailProcesses;

    /**
     * <p>The expiration time in seconds. The value must be an integer from 10 to 14,400, inclusive.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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
