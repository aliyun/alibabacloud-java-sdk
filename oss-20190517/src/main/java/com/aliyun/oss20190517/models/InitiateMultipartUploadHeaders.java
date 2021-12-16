// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class InitiateMultipartUploadHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("Cache-Control")
    public String cacheControl;

    @NameInMap("Content-Disposition")
    public String contentDisposition;

    @NameInMap("Content-Encoding")
    public String contentEncoding;

    @NameInMap("Expires")
    public String expires;

    @NameInMap("x-oss-forbid-overwrite")
    public String forbidOverwrite;

    @NameInMap("x-oss-server-side-data-encryption")
    public String sseDataEncryption;

    @NameInMap("x-oss-server-side-encryption")
    public String serverSideEncryption;

    @NameInMap("x-oss-server-side-encryption-key-id")
    public String sseKeyId;

    @NameInMap("x-oss-storage-class")
    public String storageClass;

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
