// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoPlayAuthResponseBody extends TeaModel {
    // The credential for video or audio playback.
    @NameInMap("PlayAuth")
    public String playAuth;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The metadata of the audio or video file.
    @NameInMap("VideoMeta")
    public GetVideoPlayAuthResponseBodyVideoMeta videoMeta;

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

    public GetVideoPlayAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoPlayAuthResponseBody setVideoMeta(GetVideoPlayAuthResponseBodyVideoMeta videoMeta) {
        this.videoMeta = videoMeta;
        return this;
    }
    public GetVideoPlayAuthResponseBodyVideoMeta getVideoMeta() {
        return this.videoMeta;
    }

    public static class GetVideoPlayAuthResponseBodyVideoMeta extends TeaModel {
        // The thumbnail URL of the audio or video file.
        @NameInMap("CoverURL")
        public String coverURL;

        // The duration of the audio or video file. Unit: seconds.
        @NameInMap("Duration")
        public Float duration;

        // The status of the audio or video file. For more information about the value range and description, see the [Status](~~52839~~) table.
        @NameInMap("Status")
        public String status;

        // The title of the audio or video file.
        @NameInMap("Title")
        public String title;

        // The ID of the audio or video file.
        @NameInMap("VideoId")
        public String videoId;

        public static GetVideoPlayAuthResponseBodyVideoMeta build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlayAuthResponseBodyVideoMeta self = new GetVideoPlayAuthResponseBodyVideoMeta();
            return TeaModel.build(map, self);
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

        public GetVideoPlayAuthResponseBodyVideoMeta setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoPlayAuthResponseBodyVideoMeta setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetVideoPlayAuthResponseBodyVideoMeta setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}
