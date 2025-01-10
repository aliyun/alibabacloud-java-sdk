// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class VideoPreviewSubtitleInfo extends TeaModel {
    @NameInMap("language")
    public String language;

    @NameInMap("status")
    public String status;

    @NameInMap("url")
    public String url;

    public static VideoPreviewSubtitleInfo build(java.util.Map<String, ?> map) throws Exception {
        VideoPreviewSubtitleInfo self = new VideoPreviewSubtitleInfo();
        return TeaModel.build(map, self);
    }

    public VideoPreviewSubtitleInfo setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public VideoPreviewSubtitleInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VideoPreviewSubtitleInfo setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
