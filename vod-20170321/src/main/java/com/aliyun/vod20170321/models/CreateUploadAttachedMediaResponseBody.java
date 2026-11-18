// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadAttachedMediaResponseBody extends TeaModel {
    /**
     * <p>The OSS URL of the auxiliary media asset file (without authentication).</p>
     * <p>When you add an image watermark template, this URL can be used as the FileUrl request parameter of the <a href="~~AddWatermark~~">AddWatermark</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>https://<strong><strong>.oss-cn-shanghai.aliyuncs.com/watermark/</strong></strong>.mov</p>
     */
    @NameInMap("FileURL")
    public String fileURL;

    /**
     * <p>The media asset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>97dc17a5abc3668489b84ce9****</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The access URL of the media asset.</p>
     * <p>If a CDN domain name is configured, the CDN URL is returned. Otherwise, the OSS URL is returned.</p>
     * <blockquote>
     * <p>If the returned MediaURL cannot be accessed in a browser (403 error), it is because you have enabled the authentication feature for the VOD domain name. You can disable <a href="https://help.aliyun.com/document_detail/86090.html">URL authentication</a> or <a href="https://help.aliyun.com/document_detail/57007.html">generate an authentication signature</a> by yourself.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.aliyundoc.com/watermark/****.mov?auth_key=">http://example.aliyundoc.com/watermark/****.mov?auth_key=</a>****</p>
     */
    @NameInMap("MediaURL")
    public String mediaURL;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>73254DE5-F260-4720-D06856B63C01****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The upload URL.</p>
     * <blockquote>
     * <p>The upload URL returned by the operation is Base64-encoded. When you call the SDK or API to upload the media asset, you must Base64-decode the URL before use. You only need to parse UploadAddress when you use the native OSS SDK or OSS API to upload the media asset.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LWNuLXNoYW5naGFpLmFsaXl1b****</p>
     */
    @NameInMap("UploadAddress")
    public String uploadAddress;

    /**
     * <p>The upload credential.</p>
     * <blockquote>
     * <p>The upload credential returned by the operation is Base64-encoded. When you call the SDK or API to upload the media asset, you must Base64-decode the credential before use. You only need to parse UploadAuth when you use the native OSS SDK or OSS API to upload the media asset.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>UzFnUjFxNkZ0NUIZTaklyNWJoQ00zdHF****</p>
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
