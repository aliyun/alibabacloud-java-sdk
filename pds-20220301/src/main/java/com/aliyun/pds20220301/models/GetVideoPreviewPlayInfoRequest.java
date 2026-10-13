// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetVideoPreviewPlayInfoRequest extends TeaModel {
    /**
     * <p>The category. You must enable the corresponding transcoding feature. Valid values:</p>
     * <ul>
     * <li>live_transcoding: live transcoding and streaming</li>
     * <li>quick_video: quick transcoding and streaming</li>
     * <li>offline_audio: offline audio transcoding</li>
     * <li>offline_video: offline video transcoding</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>quick_video</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The drive ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

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
     * <p>Specifies whether to obtain the URL of the master m3u8 file. This parameter is valid only when category is set to quick_video.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("get_master_url")
    public Boolean getMasterUrl;

    @NameInMap("get_subtitle_info")
    public Boolean getSubtitleInfo;

    /**
     * <p>Specifies whether to exclude the playback URL. If you set this parameter to true, only transcoding metadata is obtained, TS transcoding is not triggered, and the returned information does not contain the playback URL. Otherwise, the playback URL is returned. If the video for this template_id has not been transcoded, the backend triggers transcoding. Transcoding incurs corresponding value-added service fees.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("get_without_url")
    public Boolean getWithoutUrl;

    /**
     * <p>Specifies whether to initiate re-transcoding. If you set this parameter to true, re-transcoding is initiated for the file, and a 202 response is returned to prompt you to wait and retry. Before you use this parameter, contact us to enable the support.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("re_transcode")
    public Boolean reTranscode;

    /**
     * <p>The share ID. If you manage files through a share, include the <code>x-share-token</code> header for authentication and pass this field. In this case, <code>drive_id</code> is invalid. Otherwise, use the <code>aksk</code> or <code>access_token</code> method for authentication and pass the <code>drive_id</code> field. You must specify either <code>share_id</code> or <code>drive_id</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1FswpQ8</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The definition template ID. If you leave this parameter empty, all available definition templates are retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>264_480p</p>
     */
    @NameInMap("template_id")
    public String templateId;

    /**
     * <p>The URL timeout period. Unit: seconds. Default value: 15 minutes. Maximum value: 4 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
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

    public GetVideoPreviewPlayInfoRequest setGetSubtitleInfo(Boolean getSubtitleInfo) {
        this.getSubtitleInfo = getSubtitleInfo;
        return this;
    }
    public Boolean getGetSubtitleInfo() {
        return this.getSubtitleInfo;
    }

    public GetVideoPreviewPlayInfoRequest setGetWithoutUrl(Boolean getWithoutUrl) {
        this.getWithoutUrl = getWithoutUrl;
        return this;
    }
    public Boolean getGetWithoutUrl() {
        return this.getWithoutUrl;
    }

    public GetVideoPreviewPlayInfoRequest setReTranscode(Boolean reTranscode) {
        this.reTranscode = reTranscode;
        return this;
    }
    public Boolean getReTranscode() {
        return this.reTranscode;
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
