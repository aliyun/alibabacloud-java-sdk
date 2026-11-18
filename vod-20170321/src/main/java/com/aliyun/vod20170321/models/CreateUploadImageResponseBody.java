// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadImageResponseBody extends TeaModel {
    /**
     * <p>The OSS URL of the image file. The URL does not contain authentication information.</p>
     * <p>When you add an image watermark template, you can use this URL as the value of the <code>FileUrl</code> request parameter for the <a href="~~AddWatermark~~">AddWatermark</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.aliyundoc.com/cover/2017-34DB-4F4C-9373-003AA060****.png">http://example.aliyundoc.com/cover/2017-34DB-4F4C-9373-003AA060****.png</a></p>
     */
    @NameInMap("FileURL")
    public String fileURL;

    /**
     * <p>The image ID. You can use it as a request parameter for operations such as <a href="~~GetImageInfo~~">GetImageInfo</a>, <a href="~~GetImageInfos~~">GetImageInfos</a>, <a href="~~UpdateImageInfos~~">UpdateImageInfos</a>, and <a href="~~DeleteImage~~">DeleteImage</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>93ab850b4f6f46e91d24d81d4****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The access URL of the image.</p>
     * <blockquote>
     * <p>If the returned ImageURL cannot be accessed in a browser and a 403 error is returned, it is because you have enabled URL authentication for the ApsaraVideo VOD domain name. You can disable <a href="https://help.aliyun.com/document_detail/86090.html">URL authentication</a> or <a href="https://help.aliyun.com/document_detail/57007.html">generate an authentication signature</a> by yourself.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.aliyundoc.com/cover/2017-34DB-4F4C-9373-003AA060****.png">http://example.aliyundoc.com/cover/2017-34DB-4F4C-9373-003AA060****.png</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-AEF6-D7393642****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The upload URL.</p>
     * <blockquote>
     * <p>The upload URL returned by the operation is Base64-encoded. When you call an SDK or API operation to upload media assets, you must Base64-decode the URL before use. You need to parse UploadAddress only when you use the native OSS SDK or OSS API to upload media assets.</p>
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
     * <p>The upload credential returned by the operation is Base64-encoded. When you call an SDK or API operation to upload media assets, you must Base64-decode the credential before use. You need to parse UploadAuth only when you use the native OSS SDK or OSS API to upload media assets.</p>
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
