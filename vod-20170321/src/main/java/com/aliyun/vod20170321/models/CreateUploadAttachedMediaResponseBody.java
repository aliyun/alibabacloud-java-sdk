// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadAttachedMediaResponseBody extends TeaModel {
    // The OSS URL of the file. The URL does not contain the information used for URL signing. You can set the FileUrl parameter to this URL when you call the [AddWatermark](~~98617~~) operation.
    @NameInMap("FileURL")
    public String fileURL;

    // The ID of the auxiliary media asset.
    @NameInMap("MediaId")
    public String mediaId;

    // The URL of the auxiliary media asset. If a domain name for Alibaba Cloud CDN (CDN) is specified, a CDN URL is returned. Otherwise, an OSS URL is returned.
    // > If you enable the URL signing feature of ApsaraVideo VOD, you may be unable to access the returned URL of the auxiliary media asset by using a browser and the HTTP status code 403 may be returned. You can disable the [URL signing](~~86090~~) feature or [generate an authentication signature](~~57007~~).
    @NameInMap("MediaURL")
    public String mediaURL;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The upload URL.
    // > The upload URL returned by this operation is Base64-encoded. Before you can use an SDK or an API operation to upload a media asset based on the upload URL, you must decode the upload URL by using the Base64 algorithm. You must parse the upload URL only if you use native OSS SDKs or OSS API for uploads.
    @NameInMap("UploadAddress")
    public String uploadAddress;

    // The upload credential.
    // > The upload credential returned by this operation is Base64-encoded. Before you can use an SDK or an API operation to upload a media asset based on the upload credential, you must decode the upload credential by using the Base64 algorithm. You must parse the upload credential only if you use native OSS SDKs or OSS API for uploads.
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
