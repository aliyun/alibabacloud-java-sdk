// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetVideoPreviewPlayInfoRequest extends TeaModel {
    @NameInMap("category")
    public String category;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("file_id")
    public String fileId;

    @NameInMap("get_without_url")
    public Boolean getWithoutUrl;

    @NameInMap("share_id")
    public String shareId;

    @NameInMap("template_id")
    public String templateId;

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
