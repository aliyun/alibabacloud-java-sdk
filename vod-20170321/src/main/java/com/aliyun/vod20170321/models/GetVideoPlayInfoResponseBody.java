// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoPlayInfoResponseBody extends TeaModel {
    @NameInMap("PlayInfo")
    public GetVideoPlayInfoResponseBodyPlayInfo playInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VideoInfo")
    public GetVideoPlayInfoResponseBodyVideoInfo videoInfo;

    public static GetVideoPlayInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPlayInfoResponseBody self = new GetVideoPlayInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoPlayInfoResponseBody setPlayInfo(GetVideoPlayInfoResponseBodyPlayInfo playInfo) {
        this.playInfo = playInfo;
        return this;
    }
    public GetVideoPlayInfoResponseBodyPlayInfo getPlayInfo() {
        return this.playInfo;
    }

    public GetVideoPlayInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoPlayInfoResponseBody setVideoInfo(GetVideoPlayInfoResponseBodyVideoInfo videoInfo) {
        this.videoInfo = videoInfo;
        return this;
    }
    public GetVideoPlayInfoResponseBodyVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public static class GetVideoPlayInfoResponseBodyPlayInfo extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("AuthInfo")
        public String authInfo;

        @NameInMap("PlayDomain")
        public String playDomain;

        @NameInMap("Region")
        public String region;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static GetVideoPlayInfoResponseBodyPlayInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlayInfoResponseBodyPlayInfo self = new GetVideoPlayInfoResponseBodyPlayInfo();
            return TeaModel.build(map, self);
        }

        public GetVideoPlayInfoResponseBodyPlayInfo setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetVideoPlayInfoResponseBodyPlayInfo setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetVideoPlayInfoResponseBodyPlayInfo setAuthInfo(String authInfo) {
            this.authInfo = authInfo;
            return this;
        }
        public String getAuthInfo() {
            return this.authInfo;
        }

        public GetVideoPlayInfoResponseBodyPlayInfo setPlayDomain(String playDomain) {
            this.playDomain = playDomain;
            return this;
        }
        public String getPlayDomain() {
            return this.playDomain;
        }

        public GetVideoPlayInfoResponseBodyPlayInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetVideoPlayInfoResponseBodyPlayInfo setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

    public static class GetVideoPlayInfoResponseBodyVideoInfo extends TeaModel {
        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("CustomerId")
        public Long customerId;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("VideoId")
        public String videoId;

        public static GetVideoPlayInfoResponseBodyVideoInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlayInfoResponseBodyVideoInfo self = new GetVideoPlayInfoResponseBodyVideoInfo();
            return TeaModel.build(map, self);
        }

        public GetVideoPlayInfoResponseBodyVideoInfo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetVideoPlayInfoResponseBodyVideoInfo setCustomerId(Long customerId) {
            this.customerId = customerId;
            return this;
        }
        public Long getCustomerId() {
            return this.customerId;
        }

        public GetVideoPlayInfoResponseBodyVideoInfo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetVideoPlayInfoResponseBodyVideoInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoPlayInfoResponseBodyVideoInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetVideoPlayInfoResponseBodyVideoInfo setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}
