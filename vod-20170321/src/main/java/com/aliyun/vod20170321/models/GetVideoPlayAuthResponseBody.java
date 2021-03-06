// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoPlayAuthResponseBody extends TeaModel {
    @NameInMap("PlayAuth")
    public String playAuth;

    @NameInMap("VideoMeta")
    public GetVideoPlayAuthResponseBodyVideoMeta videoMeta;

    @NameInMap("RequestId")
    public String requestId;

    public static GetVideoPlayAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPlayAuthResponseBody self = new GetVideoPlayAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoPlayAuthResponseBody setPlayAuth(String playAuth) {
        this.playAuth = playAuth;
        return this;
    }
    public String getPlayAuth() {
        return this.playAuth;
    }

    public GetVideoPlayAuthResponseBody setVideoMeta(GetVideoPlayAuthResponseBodyVideoMeta videoMeta) {
        this.videoMeta = videoMeta;
        return this;
    }
    public GetVideoPlayAuthResponseBodyVideoMeta getVideoMeta() {
        return this.videoMeta;
    }

    public GetVideoPlayAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVideoPlayAuthResponseBodyVideoMeta extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VideoId")
        public String videoId;

        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("Title")
        public String title;

        public static GetVideoPlayAuthResponseBodyVideoMeta build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlayAuthResponseBodyVideoMeta self = new GetVideoPlayAuthResponseBodyVideoMeta();
            return TeaModel.build(map, self);
        }

        public GetVideoPlayAuthResponseBodyVideoMeta setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoPlayAuthResponseBodyVideoMeta setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public GetVideoPlayAuthResponseBodyVideoMeta setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetVideoPlayAuthResponseBodyVideoMeta setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetVideoPlayAuthResponseBodyVideoMeta setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
