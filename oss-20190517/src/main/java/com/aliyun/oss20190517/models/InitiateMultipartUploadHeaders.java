// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class InitiateMultipartUploadHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The caching behavior of the web page when the object is downloaded. For more information, see **[RFC 2616](https://www.ietf.org/rfc/rfc2616.txt)**. </p>
     * <p>Default value: null.</p>
     */
    @NameInMap("Cache-Control")
    public String cacheControl;

    /**
     * <p>The name of the object when the object is downloaded. For more information, see **[RFC 2616](https://www.ietf.org/rfc/rfc2616.txt)**. </p>
     * <p>Default value: null.</p>
     */
    @NameInMap("Content-Disposition")
    public String contentDisposition;

    /**
     * <p>The content encoding format of the object when the object is downloaded. For more information, see **[RFC 2616](https://www.ietf.org/rfc/rfc2616.txt)**. </p>
     * <p>Default value: null.</p>
     */
    @NameInMap("Content-Encoding")
    public String contentEncoding;

    /**
     * <p>The expiration time of the request. Unit: milliseconds. For more information, see **[RFC 2616](https://www.ietf.org/rfc/rfc2616.txt)**. </p>
     * <p>Default value: null.</p>
     */
    @NameInMap("Expires")
    public String expires;

    /**
     * <p>Specifies whether the InitiateMultipartUpload operation overwrites the existing object that has the same name as the object that you want to upload. When versioning is enabled or suspended for the bucket to which you want to upload the object, the **x-oss-forbid-overwrite** header does not take effect. In this case, the InitiateMultipartUpload operation overwrites the existing object that has the same name as the object that you want to upload. </p>
     * <p>  - If you do not specify the **x-oss-forbid-overwrite** header or set the **x-oss-forbid-overwrite** header to **false**, the object that is uploaded by calling the PutObject operation overwrites the existing object that has the same name. </p>
     * <p>  - If the value of **x-oss-forbid-overwrite** is set to **true**, existing objects cannot be overwritten by objects that have the same names. </p>
     * <p></p>
     * <p>If you specify the **x-oss-forbid-overwrite** request header, the queries per second (QPS) performance of OSS is degraded. If you want to use the **x-oss-forbid-overwrite** request header to perform a large number of operations (QPS greater than 1,000), contact technical support</p>
     */
    @NameInMap("x-oss-forbid-overwrite")
    public String forbidOverwrite;

    /**
     * <p>The algorithm that is used to encrypt the object that you want to upload. If this header is not specified, the object is encrypted by using AES-256. This header is valid only when **x-oss-server-side-encryption** is set to KMS. </p>
     * <p>Valid value: SM4.</p>
     */
    @NameInMap("x-oss-server-side-data-encryption")
    public String sseDataEncryption;

    /**
     * <p>The server-side encryption method that is used to encrypt each part of the object that you want to upload. </p>
     * <p>Valid values: **AES256**, **KMS**, and **SM4**.</p>
     * <p>> You must activate Key Management Service (KMS) before you set this header to KMS. </p>
     * <br>
     * <br>
     * <p>If you specify this header in the request, this header is included in the response. OSS uses the method specified by this header to encrypt each uploaded part. When you download the object, the x-oss-server-side-encryption header is included in the response and the header value is set to the algorithm that is used to encrypt the object.</p>
     */
    @NameInMap("x-oss-server-side-encryption")
    public String serverSideEncryption;

    /**
     * <p>The ID of the CMK that is managed by KMS. </p>
     * <p>This header is valid only when **x-oss-server-side-encryption** is set to KMS.</p>
     */
    @NameInMap("x-oss-server-side-encryption-key-id")
    public String sseKeyId;

    /**
     * <p>The storage class of the bucket. Default value: Standard.  Valid values:</p>
     * <p></p>
     * <p>- Standard</p>
     * <p>- IA</p>
     * <p>- Archive</p>
     * <p>- ColdArchive</p>
     */
    @NameInMap("x-oss-storage-class")
    public String storageClass;

    /**
     * <p>The tag of the object. You can configure multiple tags for the object. Example: TagA=A&amp;TagB=B.</p>
     * <p>> The key and value of a tag must be URL-encoded. If a tag does not contain an equal sign (=), the value of the tag is considered an empty string.</p>
     */
    @NameInMap("x-oss-tagging")
    public String tagging;

    public static InitiateMultipartUploadHeaders build(java.util.Map<String, ?> map) throws Exception {
        InitiateMultipartUploadHeaders self = new InitiateMultipartUploadHeaders();
        return TeaModel.build(map, self);
    }

    public InitiateMultipartUploadHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public InitiateMultipartUploadHeaders setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }
    public String getCacheControl() {
        return this.cacheControl;
    }

    public InitiateMultipartUploadHeaders setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    public InitiateMultipartUploadHeaders setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public InitiateMultipartUploadHeaders setExpires(String expires) {
        this.expires = expires;
        return this;
    }
    public String getExpires() {
        return this.expires;
    }

    public InitiateMultipartUploadHeaders setForbidOverwrite(String forbidOverwrite) {
        this.forbidOverwrite = forbidOverwrite;
        return this;
    }
    public String getForbidOverwrite() {
        return this.forbidOverwrite;
    }

    public InitiateMultipartUploadHeaders setSseDataEncryption(String sseDataEncryption) {
        this.sseDataEncryption = sseDataEncryption;
        return this;
    }
    public String getSseDataEncryption() {
        return this.sseDataEncryption;
    }

    public InitiateMultipartUploadHeaders setServerSideEncryption(String serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
        return this;
    }
    public String getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    public InitiateMultipartUploadHeaders setSseKeyId(String sseKeyId) {
        this.sseKeyId = sseKeyId;
        return this;
    }
    public String getSseKeyId() {
        return this.sseKeyId;
    }

    public InitiateMultipartUploadHeaders setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public InitiateMultipartUploadHeaders setTagging(String tagging) {
        this.tagging = tagging;
        return this;
    }
    public String getTagging() {
        return this.tagging;
    }

}
