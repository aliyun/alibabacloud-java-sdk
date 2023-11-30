// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetVideoPreviewPlayMetaRequest extends TeaModel {
    /**
     * <p>The preview type. You must enable the corresponding video transcoding feature. Valid values:</p>
     * <br>
     * <p>*   live_transcoding: previews a live stream while transcoding is in progress.</p>
     * <p>*   quick_video: previews a video while transcoding is in progress.</p>
     * <p>*   offline_audio: previews a piece of audio after the audio is transcoded offline.</p>
     * <p>*   offline_video: previews a video after the video is transcoded offline.</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The share ID. If you want to manage a file by using a sharing link, carry the `x-share-token` header in the request and specify share_id. In this case, `drive_id` is invalid. Otherwise, use an `AccessKey pair` or `access token` for authentication and specify `drive_id`. You must specify at least either `share_id` or `drive_id`.</p>
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
