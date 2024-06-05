// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetVideoPreviewPlayInfoRequest extends TeaModel {
    /**
     * <p>The preview type. You must enable the corresponding video transcoding feature. Valid values:</p>
     * <br>
     * <p>*   live_transcoding: previews a live stream while transcoding is in progress.</p>
     * <p>*   quick_video: previews a video while transcoding is in progress.</p>
     * <p>*   offline_audio: previews a piece of audio after the audio is transcoded offline.</p>
     * <p>*   offline_video: previews a video after the video is transcoded offline.</p>
     * <br>
     * <p>This parameter is required.</p>
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
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    @NameInMap("get_master_url")
    public Boolean getMasterUrl;

    /**
     * <p>Specifies whether not to query the playback URL. If you set this parameter to true, only transcoding metadata is returned. The video is not transcoded in the TS format, and the playback URL is not returned. If you set this parameter to false, the playback URL is returned. If the video has not been transcoded by using the template specified by template_id, the transcoding process is triggered. You are charged for the value-added service fees generated for transcoding.</p>
     */
    @NameInMap("get_without_url")
    public Boolean getWithoutUrl;

    /**
     * <p>The share ID. If you want to manage a file by using a sharing link, carry the `x-share-token` header in the request and specify share_id. In this case, `drive_id` is invalid. Otherwise, use an `AccessKey pair` or `access token` for authentication and specify `drive_id`. You must specify at least either `share_id` or `drive_id`.</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The ID of the definition template. If you leave this parameter empty, all definition templates are available.</p>
     */
    @NameInMap("template_id")
    public String templateId;

    /**
     * <p>The validity period of the video preview. Unit: seconds. Default value: 900. Maximum value: 14400.</p>
     */
    @NameInMap("url_expire_sec")
    public Long urlExpireSec;

    public static GetVideoPreviewPlayInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPreviewPlayInfoRequest self = new GetVideoPreviewPlayInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoPreviewPlayInfoRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public GetVideoPreviewPlayInfoRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public GetVideoPreviewPlayInfoRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public GetVideoPreviewPlayInfoRequest setGetMasterUrl(Boolean getMasterUrl) {
        this.getMasterUrl = getMasterUrl;
        return this;
    }
    public Boolean getGetMasterUrl() {
        return this.getMasterUrl;
    }

    public GetVideoPreviewPlayInfoRequest setGetWithoutUrl(Boolean getWithoutUrl) {
        this.getWithoutUrl = getWithoutUrl;
        return this;
    }
    public Boolean getGetWithoutUrl() {
        return this.getWithoutUrl;
    }

    public GetVideoPreviewPlayInfoRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public GetVideoPreviewPlayInfoRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetVideoPreviewPlayInfoRequest setUrlExpireSec(Long urlExpireSec) {
        this.urlExpireSec = urlExpireSec;
        return this;
    }
    public Long getUrlExpireSec() {
        return this.urlExpireSec;
    }

}
