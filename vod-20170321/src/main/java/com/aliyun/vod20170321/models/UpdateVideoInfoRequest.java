// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfoRequest extends TeaModel {
    @NameInMap("VideoId")
    public String videoId;

    @NameInMap("Title")
    public String title;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Description")
    public String description;

    @NameInMap("CoverURL")
    public String coverURL;

    @NameInMap("CateId")
    public Long cateId;

    @NameInMap("DownloadSwitch")
    public String downloadSwitch;

    @NameInMap("Status")
    public String status;

    @NameInMap("CustomMediaInfo")
    public String customMediaInfo;

    public static UpdateVideoInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoInfoRequest self = new UpdateVideoInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVideoInfoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public UpdateVideoInfoRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateVideoInfoRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateVideoInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateVideoInfoRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public UpdateVideoInfoRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public UpdateVideoInfoRequest setDownloadSwitch(String downloadSwitch) {
        this.downloadSwitch = downloadSwitch;
        return this;
    }
    public String getDownloadSwitch() {
        return this.downloadSwitch;
    }

    public UpdateVideoInfoRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateVideoInfoRequest setCustomMediaInfo(String customMediaInfo) {
        this.customMediaInfo = customMediaInfo;
        return this;
    }
    public String getCustomMediaInfo() {
        return this.customMediaInfo;
    }

}
