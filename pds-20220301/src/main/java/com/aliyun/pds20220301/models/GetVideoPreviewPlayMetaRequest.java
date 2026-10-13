// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetVideoPreviewPlayMetaRequest extends TeaModel {
    /**
     * <p>You must enable the corresponding transcoding feature. Valid values are:</p>
     * <ul>
     * <li><p><code>live_transcoding</code> (live transcoding)</p>
     * </li>
     * <li><p><code>quick_video</code> (quick video transcoding)</p>
     * </li>
     * <li><p><code>offline_audio</code> (offline audio transcoding)</p>
     * </li>
     * <li><p><code>offline_video</code> (offline video transcoding)</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>live_transcoding</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The ID of the drive.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The ID of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9520943DC264</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The ID of the share. To access a file from a share, specify this parameter and include the <code>x-share-token</code> header for authentication. In this case, <code>drive_id</code> is ignored. Alternatively, to access a file in a drive, specify <code>drive_id</code> and authenticate by using an AccessKey pair (<code>aksk</code>) or an access token (<code>access_token</code>). You must specify either <code>share_id</code> or <code>drive_id</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1FswpQ8</p>
     */
    @NameInMap("share_id")
    public String shareId;

    public static GetVideoPreviewPlayMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPreviewPlayMetaRequest self = new GetVideoPreviewPlayMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoPreviewPlayMetaRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public GetVideoPreviewPlayMetaRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public GetVideoPreviewPlayMetaRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public GetVideoPreviewPlayMetaRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

}
