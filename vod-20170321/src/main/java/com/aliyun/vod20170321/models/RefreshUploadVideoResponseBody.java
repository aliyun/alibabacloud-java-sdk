// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshUploadVideoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A43-7DF6-D7393642****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The upload URL.</p>
     * <blockquote>
     * <p> The returned upload URL is a Base64-encoded URL. You must decode the Base64-encoded upload URL before you use an SDK or call an API operation to upload media files. You need to parse UploadAddress only if you use the OSS SDK or call an OSS API operation to upload media files.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eyJTZWN1cml0eVRiQ0FJU3p3TjFxNkZ0NUIyeW****</p>
     */
    @NameInMap("UploadAddress")
    public String uploadAddress;

    /**
     * <p>The upload credential.</p>
     * <blockquote>
     * <p> The returned upload credential is a Base64-encoded value. You must decode the Base64-encoded upload URL before you use an SDK or call an API operation to upload media files. You need to parse UploadAuth only if you use the OSS SDK or call an OSS API operation to upload media files.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>FJU3p3TZ0NUIyeW****</p>
     */
    @NameInMap("UploadAuth")
    public String uploadAuth;

    /**
     * <p>The ID of the audio or video file.</p>
     * 
     * <strong>example:</strong>
     * <p>c6a23a870c8c4ffcd40cbd381333****</p>
     */
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
