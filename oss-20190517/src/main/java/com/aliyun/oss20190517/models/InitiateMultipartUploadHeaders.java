// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class InitiateMultipartUploadHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-oss-forbid-overwrite")
    public String xOssForbidOverwrite;

    @NameInMap("x-oss-server-side-data-encryption")
    public String xOssServerSideDataEncryption;

    @NameInMap("x-oss-server-side-encryption")
    public String xOssServerSideEncryption;

    @NameInMap("x-oss-server-side-encryption-key-id")
    public String xOssServerSideEncryptionKeyId;

    @NameInMap("x-oss-storage-class")
    public String xOssStorageClass;

    @NameInMap("x-oss-tagging")
    public String xOssTagging;

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

    public InitiateMultipartUploadHeaders setXOssForbidOverwrite(String xOssForbidOverwrite) {
        this.xOssForbidOverwrite = xOssForbidOverwrite;
        return this;
    }
    public String getXOssForbidOverwrite() {
        return this.xOssForbidOverwrite;
    }

    public InitiateMultipartUploadHeaders setXOssServerSideDataEncryption(String xOssServerSideDataEncryption) {
        this.xOssServerSideDataEncryption = xOssServerSideDataEncryption;
        return this;
    }
    public String getXOssServerSideDataEncryption() {
        return this.xOssServerSideDataEncryption;
    }

    public InitiateMultipartUploadHeaders setXOssServerSideEncryption(String xOssServerSideEncryption) {
        this.xOssServerSideEncryption = xOssServerSideEncryption;
        return this;
    }
    public String getXOssServerSideEncryption() {
        return this.xOssServerSideEncryption;
    }

    public InitiateMultipartUploadHeaders setXOssServerSideEncryptionKeyId(String xOssServerSideEncryptionKeyId) {
        this.xOssServerSideEncryptionKeyId = xOssServerSideEncryptionKeyId;
        return this;
    }
    public String getXOssServerSideEncryptionKeyId() {
        return this.xOssServerSideEncryptionKeyId;
    }

    public InitiateMultipartUploadHeaders setXOssStorageClass(String xOssStorageClass) {
        this.xOssStorageClass = xOssStorageClass;
        return this;
    }
    public String getXOssStorageClass() {
        return this.xOssStorageClass;
    }

    public InitiateMultipartUploadHeaders setXOssTagging(String xOssTagging) {
        this.xOssTagging = xOssTagging;
        return this;
    }
    public String getXOssTagging() {
        return this.xOssTagging;
    }

}
