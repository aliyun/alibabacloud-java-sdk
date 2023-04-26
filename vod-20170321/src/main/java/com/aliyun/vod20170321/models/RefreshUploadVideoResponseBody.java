// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshUploadVideoResponseBody extends TeaModel {
    /**
     * <p>Obtains a new upload credential after the video upload times out.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UploadAddress")
    public String uploadAddress;

    @NameInMap("UploadAuth")
    public String uploadAuth;

    @NameInMap("VideoId")
    public String videoId;

    public static RefreshUploadVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshUploadVideoResponseBody self = new RefreshUploadVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshUploadVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshUploadVideoResponseBody setUploadAddress(String uploadAddress) {
        this.uploadAddress = uploadAddress;
        return this;
    }
    public String getUploadAddress() {
        return this.uploadAddress;
    }

    public RefreshUploadVideoResponseBody setUploadAuth(String uploadAuth) {
        this.uploadAuth = uploadAuth;
        return this;
    }
    public String getUploadAuth() {
        return this.uploadAuth;
    }

    public RefreshUploadVideoResponseBody setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
