// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadAttachedMediaResponseBody extends TeaModel {
    @NameInMap("FileURL")
    public String fileURL;

    @NameInMap("MediaURL")
    public String mediaURL;

    @NameInMap("UploadAddress")
    public String uploadAddress;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MediaId")
    public String mediaId;

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

    public CreateUploadAttachedMediaResponseBody setMediaURL(String mediaURL) {
        this.mediaURL = mediaURL;
        return this;
    }
    public String getMediaURL() {
        return this.mediaURL;
    }

    public CreateUploadAttachedMediaResponseBody setUploadAddress(String uploadAddress) {
        this.uploadAddress = uploadAddress;
        return this;
    }
    public String getUploadAddress() {
        return this.uploadAddress;
    }

    public CreateUploadAttachedMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUploadAttachedMediaResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public CreateUploadAttachedMediaResponseBody setUploadAuth(String uploadAuth) {
        this.uploadAuth = uploadAuth;
        return this;
    }
    public String getUploadAuth() {
        return this.uploadAuth;
    }

}
