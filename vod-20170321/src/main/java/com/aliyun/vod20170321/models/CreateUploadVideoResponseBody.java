// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadVideoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-04D5-D7393642****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The upload URL.</p>
     * <blockquote>
     * <p>The upload URL returned by the operation is Base64-encoded. When you call an SDK or API operation to upload the media asset, you must decode the URL before use. You only need to parse UploadAddress when you use the native OSS SDK or OSS API for upload.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eyJTZWN1cml0a2VuIjoiQ0FJU3p3TjF****</p>
     */
    @NameInMap("UploadAddress")
    public String uploadAddress;

    /**
     * <p>The upload credential.</p>
     * <blockquote>
     * <p>The upload credential returned by the operation is Base64-encoded. When you call an SDK or API operation to upload the media asset, you must decode the credential before use. You only need to parse UploadAuth when you use the native OSS SDK or OSS API for upload.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eyJFbmRwb2ludCI6Imm****</p>
     */
    @NameInMap("UploadAuth")
    public String uploadAuth;

    /**
     * <p>The audio or video ID. You can use this ID as a request parameter for media asset management, media processing, and media review operations.</p>
     * 
     * <strong>example:</strong>
     * <p>93ab850b4f6f54b6e91d24d81d44****</p>
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
