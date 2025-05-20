// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetVideoPreviewPlayInfoRequest extends TeaModel {
    /**
     * <p>The category. It is the transcoding mode that you want to use. Valid values:</p>
     * <ul>
     * <li>live_transcoding: plays a live stream while transcoding is in progress.</li>
     * <li>quick_video: plays a video while transcoding is in progress.</li>
     * <li>offline_audio: plays a piece of audio after the audio is transcoded offline.</li>
     * <li>offline_video: plays a video after the video is transcoded offline.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>live_transcoding</p>
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
     * <p>Specifies whether to obtain the URL of the master M3U8 playlist. This parameter is valid only if the category parameter is set to quick_video.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("get_master_url")
    public Boolean getMasterUrl;

    /**
     * <p>Specifies whether not to query the playback URL. If you set this parameter to true, only transcoding metadata is returned. The video is not transcoded in the TS format, and the playback URL is not returned. If you set this parameter to false, the playback URL is returned. If the video has not been transcoded by using the template specified by template_id, the transcoding process is triggered. You are charged value-added service fees generated for transcoding.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("get_without_url")
    public Boolean getWithoutUrl;

    /**
     * <p>Specifies whether to initiate re-transcoding. If you set this parameter to true, the file is re-transcoded, with a fixed 202 response for retries. Before you use this parameter, contact us to enable it for you.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("re_transcode")
    public Boolean reTranscode;

    /**
     * <p>The share ID. If you want to share a file, carry the <code>x-share-token</code> header for authentication in the request and specify share_id. In this case, <code>drive_id</code> is invalid. Otherwise, use an <code>AccessKey pair</code> or <code>access token</code> for authentication and specify <code>drive_id</code>. You must specify one of <code>share_id</code> and <code>drive_id</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1FswpQ8</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The ID of the definition template. If you leave this parameter empty, all definition templates are available.</p>
     * 
     * <strong>example:</strong>
     * <p>264_480p</p>
     */
    @NameInMap("template_id")
    public String templateId;

    /**
     * <p>The validity period of the URL. Unit: seconds. Default value: 900, which is 15 minutes. Maximum value: 14400, which is 4 hours.</p>
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
