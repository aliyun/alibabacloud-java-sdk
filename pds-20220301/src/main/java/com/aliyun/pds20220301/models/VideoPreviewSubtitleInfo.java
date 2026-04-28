// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class VideoPreviewSubtitleInfo extends TeaModel {
    /**
     * <p>The subtitle language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <p>The status of the subtitle task.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>finished</li>
     * <li>failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>finished</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The subtitle URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.data.aliyunpds.com/lt/A05EF408DAB5D3F57C94F67658C99C406EFCA7DD/subtitle/subtitle_0.vtt">https://example.data.aliyunpds.com/lt/A05EF408DAB5D3F57C94F67658C99C406EFCA7DD/subtitle/subtitle_0.vtt</a></p>
     */
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
