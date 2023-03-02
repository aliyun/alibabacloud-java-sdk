// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfoRequest extends TeaModel {
    /**
     * <p>The ID of the video category.</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The URL of the video thumbnail.</p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the video.</p>
     * <br>
     * <p>*   The value can be up to 1,024 bytes in length.</p>
     * <p>*   The string must be encoded in the UTF-8 format.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The tags of the video.</p>
     * <br>
     * <p>*   Each tag can be up to 32 bytes in length. A maximum of 16 tags can be specified.</p>
     * <p>*   Separate multiple tags with commas (,).</p>
     * <p>*   The string must be encoded in the UTF-8 format.</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The title of the video.</p>
     * <br>
     * <p>*   The value can be up to 128 bytes in length.</p>
     * <p>*   The string must be encoded in the UTF-8 format.</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The ID of the video.</p>
     */
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
