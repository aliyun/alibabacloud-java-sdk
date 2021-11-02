// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadImageResponseBody extends TeaModel {
    @NameInMap("FileURL")
    public String fileURL;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UploadAddress")
    public String uploadAddress;

    @NameInMap("UploadAuth")
    public String uploadAuth;

    public static CreateUploadImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadImageResponseBody self = new CreateUploadImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUploadImageResponseBody setFileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }
    public String getFileURL() {
        return this.fileURL;
    }

    public CreateUploadImageResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateUploadImageResponseBody setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public CreateUploadImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUploadImageResponseBody setUploadAddress(String uploadAddress) {
        this.uploadAddress = uploadAddress;
        return this;
    }
    public String getUploadAddress() {
        return this.uploadAddress;
    }

    public CreateUploadImageResponseBody setUploadAuth(String uploadAuth) {
        this.uploadAuth = uploadAuth;
        return this;
    }
    public String getUploadAuth() {
        return this.uploadAuth;
    }

}
