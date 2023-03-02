// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadVideoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The upload URL.</p>
     * <br>
     * <p>> The returned upload URL is a Base64-encoded URL. You must decode the Base64-encoded URL before you use an SDK or call an API operation to upload media files. You need to parse UploadAddress only if you use the Object Storage Service (OSS) SDK or call an OSS API operation to upload media files.</p>
     */
    @NameInMap("UploadAddress")
    public String uploadAddress;

    /**
     * <p>The upload credential.</p>
     * <br>
     * <p>> The returned upload credential is a Base64-encoded value. You must decode the Base64-encoded credential before you use an SDK or call an API operation to upload media files. You need to parse UploadAuth only if you use the OSS SDK or call an OSS API operation to upload media files.</p>
     */
    @NameInMap("UploadAuth")
    public String uploadAuth;

    /**
     * <p>The ID of the audio or video file. VideoId can be used as a request parameter when you call an operation for media asset management, media processing, or media review.</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static CreateUploadVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadVideoResponseBody self = new CreateUploadVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUploadVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUploadVideoResponseBody setUploadAddress(String uploadAddress) {
        this.uploadAddress = uploadAddress;
        return this;
    }
    public String getUploadAddress() {
        return this.uploadAddress;
    }

    public CreateUploadVideoResponseBody setUploadAuth(String uploadAuth) {
        this.uploadAuth = uploadAuth;
        return this;
    }
    public String getUploadAuth() {
        return this.uploadAuth;
    }

    public CreateUploadVideoResponseBody setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
