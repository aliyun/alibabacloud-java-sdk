// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadImageResponseBody extends TeaModel {
    /**
     * <p>The OSS URL of the file. The URL does not contain the information used for URL signing. You can specify FileUrl when you call the <a href="https://help.aliyun.com/document_detail/98617.html">AddWatermark</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.aliyundoc.com/cover/2017-34DB-4F4C-9373-003AA060****.png">http://example.aliyundoc.com/cover/2017-34DB-4F4C-9373-003AA060****.png</a></p>
     */
    @NameInMap("FileURL")
    public String fileURL;

    /**
     * <p>The ID of the image file.</p>
     * 
     * <strong>example:</strong>
     * <p>93ab850b4f6f46e91d24d81d4****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The URL of the image.</p>
     * <blockquote>
     * <p>If the returned URL is inaccessible from a browser and the HTTP 403 status code is returned, the URL signing feature in ApsaraVideo VOD is enabled. To resolve this issue, you can disable the <a href="https://help.aliyun.com/document_detail/86090.html">URL signing</a> feature or <a href="https://help.aliyun.com/document_detail/57007.html">generate a signed URL</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.aliyundoc.com/cover/2017-34DB-4F4C-9373-003AA060****.png">http://example.aliyundoc.com/cover/2017-34DB-4F4C-9373-003AA060****.png</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-AEF6-D7393642****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The upload URL.</p>
     * <blockquote>
     * <p>The returned upload URL is a Base64-encoded URL. You must decode the Base64-encoded URL before you use an SDK or call an API operation to upload auxiliary media assets. You need to parse UploadAddress only if you use the OSS SDK or call an OSS API operation to upload auxiliary media assets.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eyJTZWN1cmuIjoiQ0FJU3p3TjF****</p>
     */
    @NameInMap("UploadAddress")
    public String uploadAddress;

    /**
     * <p>The upload credential.</p>
     * <blockquote>
     * <p>The returned upload credential is a Base64-encoded value. You must decode the Base64-encoded credential before you use an SDK or call an API operation to upload auxiliary media assets. You need to parse UploadAuth only if you use the OSS SDK or call an OSS API operation to upload auxiliary media assets.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eyJFbmmRCI6Im****</p>
     */
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
