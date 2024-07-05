// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoPlayAuthResponseBody extends TeaModel {
    /**
     * <p>The credential for media playback.</p>
     * 
     * <strong>example:</strong>
     * <p>sstyYuew6789000000xtt7TYUh****</p>
     */
    @NameInMap("PlayAuth")
    public String playAuth;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E4EBD2BF-5EB0-4476-8829-9D94E1B1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The metadata of the audio or video file.</p>
     */
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
        /**
         * <p>The thumbnail URL of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.aliyundoc.com/****.jpg">https://example.aliyundoc.com/****.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The duration of the media file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120.0</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The status of the media file. For more information about the value range and description, see <a href="~~52839#title-vqg-8cz-7p8~~">Status: the status of a video</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The title of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>VOD</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The ID of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>dfde02284a5c46622a097adaf44a****</p>
         */
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
