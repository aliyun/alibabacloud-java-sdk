// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshUploadVideoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The upload URL.</p>
     * <br>
     * <p>> The upload URL returned by this operation is Base64-encoded. Before you can use an SDK or an API operation to upload a media asset based on the upload URL, you must decode the upload URL by using the Base64 algorithm. You must parse the upload URL only if you use native Object Storage Service (OSS) SDKs or OSS API for uploads.</p>
     */
    @NameInMap("UploadAddress")
    public String uploadAddress;

    /**
     * <p>The upload credential.</p>
     * <br>
     * <p>> The upload credential returned by this operation is Base64-encoded. Before you can use an SDK or an API operation to upload a media asset based on the upload credential, you must decode the upload credential by using the Base64 algorithm. You must parse the upload credential only if you use native OSS SDKs or OSS API for uploads.</p>
     */
    @NameInMap("UploadAuth")
    public String uploadAuth;

    /**
     * <p>The ID of the audio or video file.</p>
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
