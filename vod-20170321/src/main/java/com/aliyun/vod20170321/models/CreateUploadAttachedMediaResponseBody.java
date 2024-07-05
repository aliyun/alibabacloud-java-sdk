// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadAttachedMediaResponseBody extends TeaModel {
    /**
     * <p>The OSS URL of the file. The URL does not contain the information used for URL signing. You can set the FileUrl parameter to this URL when you call the <a href="https://help.aliyun.com/document_detail/98617.html">AddWatermark</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>https://<strong><strong>.oss-cn-shanghai.aliyuncs.com/watermark/</strong></strong>.mov</p>
     */
    @NameInMap("FileURL")
    public String fileURL;

    /**
     * <p>The ID of the auxiliary media asset.</p>
     * 
     * <strong>example:</strong>
     * <p>97dc17a5abc3668489b84ce9****</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The URL of the auxiliary media asset. If a domain name for Alibaba Cloud CDN (CDN) is specified, a CDN URL is returned. Otherwise, an OSS URL is returned.</p>
     * <blockquote>
     * <p> If you enable the URL signing feature of ApsaraVideo VOD, you may be unable to access the returned URL of the auxiliary media asset by using a browser and the HTTP status code 403 may be returned. You can disable the <a href="https://help.aliyun.com/document_detail/86090.html">URL signing</a> feature or <a href="https://help.aliyun.com/document_detail/57007.html">generate an authentication signature</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.aliyundoc.com/watermark/****.mov?auth_key=">http://example.aliyundoc.com/watermark/****.mov?auth_key=</a>****</p>
     */
    @NameInMap("MediaURL")
    public String mediaURL;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>73254DE5-F260-4720-D06856B63C01****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The upload URL.</p>
     * <blockquote>
     * <p> The upload URL returned by this operation is Base64-encoded. Before you can use an SDK or an API operation to upload a media asset based on the upload URL, you must decode the upload URL by using the Base64 algorithm. You must parse the upload URL only if you use native OSS SDKs or OSS API for uploads.</p>
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
     * <p> The upload credential returned by this operation is Base64-encoded. Before you can use an SDK or an API operation to upload a media asset based on the upload credential, you must decode the upload credential by using the Base64 algorithm. You must parse the upload credential only if you use native OSS SDKs or OSS API for uploads.</p>
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
