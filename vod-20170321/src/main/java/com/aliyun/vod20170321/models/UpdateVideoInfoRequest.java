// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfoRequest extends TeaModel {
    @NameInMap("CateId")
    public Long cateId;

    @NameInMap("CoverURL")
    public String coverURL;

    @NameInMap("Description")
    public String description;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Title")
    public String title;

    @NameInMap("VideoId")
    public String videoId;

    public static UpdateVideoInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoInfoRequest self = new UpdateVideoInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVideoInfoRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public UpdateVideoInfoRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public UpdateVideoInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateVideoInfoRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateVideoInfoRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateVideoInfoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
