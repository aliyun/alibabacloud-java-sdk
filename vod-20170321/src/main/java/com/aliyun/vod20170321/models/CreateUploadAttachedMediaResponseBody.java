// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadAttachedMediaResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("FileURL")
    public String fileURL;

    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("MediaURL")
    public String mediaURL;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The OSS URL of the file. The URL does not contain the information used for URL signing. You can set the FileUrl parameter to this URL when you call the [AddWatermark](~~98617~~) operation.</p>
     */
    @NameInMap("UploadAddress")
    public String uploadAddress;

    /**
     * <p>The upload URL.</p>
     * <p>> The upload URL returned by this operation is Base64-encoded. Before you can use an SDK or an API operation to upload a media asset based on the upload URL, you must decode the upload URL by using the Base64 algorithm. You must parse the upload URL only if you use native OSS SDKs or OSS API for uploads.</p>
     */
    @NameInMap("UploadAuth")
    public String uploadAuth;

    public static CreateUploadAttachedMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadAttachedMediaResponseBody self = new CreateUploadAttachedMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUploadAttachedMediaResponseBody setFileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }
    public String getFileURL() {
        return this.fileURL;
    }

    public CreateUploadAttachedMediaResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public CreateUploadAttachedMediaResponseBody setMediaURL(String mediaURL) {
        this.mediaURL = mediaURL;
        return this;
    }
    public String getMediaURL() {
        return this.mediaURL;
    }

    public CreateUploadAttachedMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUploadAttachedMediaResponseBody setUploadAddress(String uploadAddress) {
        this.uploadAddress = uploadAddress;
        return this;
    }
    public String getUploadAddress() {
        return this.uploadAddress;
    }

    public CreateUploadAttachedMediaResponseBody setUploadAuth(String uploadAuth) {
        this.uploadAuth = uploadAuth;
        return this;
    }
    public String getUploadAuth() {
        return this.uploadAuth;
    }

}
