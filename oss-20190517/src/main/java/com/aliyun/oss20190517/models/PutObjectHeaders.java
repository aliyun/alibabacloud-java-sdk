// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutObjectHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-oss-forbid-overwrite")
    public Boolean forbidOverwrite;

    @NameInMap("x-oss-meta-*")
    public java.util.Map<String, String> userMetadata;

    @NameInMap("x-oss-object-acl")
    public String acl;

    @NameInMap("x-oss-server-side-data-encryption")
    public String sseDataEncryption;

    @NameInMap("x-oss-server-side-encryption")
    public String sse;

    @NameInMap("x-oss-server-side-encryption-key-id")
    public String sseKeyId;

    @NameInMap("x-oss-storage-class")
    public String storageClass;

    @NameInMap("x-oss-tagging")
    public String tagging;

    public static PutObjectHeaders build(java.util.Map<String, ?> map) throws Exception {
        PutObjectHeaders self = new PutObjectHeaders();
        return TeaModel.build(map, self);
    }

    public PutObjectHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public PutObjectHeaders setForbidOverwrite(Boolean forbidOverwrite) {
        this.forbidOverwrite = forbidOverwrite;
        return this;
    }
    public Boolean getForbidOverwrite() {
        return this.forbidOverwrite;
    }

    public PutObjectHeaders setUserMetadata(java.util.Map<String, String> userMetadata) {
        this.userMetadata = userMetadata;
        return this;
    }
    public java.util.Map<String, String> getUserMetadata() {
        return this.userMetadata;
    }

    public PutObjectHeaders setAcl(String acl) {
        this.acl = acl;
        return this;
    }
    public String getAcl() {
        return this.acl;
    }

    public PutObjectHeaders setSseDataEncryption(String sseDataEncryption) {
        this.sseDataEncryption = sseDataEncryption;
        return this;
    }
    public String getSseDataEncryption() {
        return this.sseDataEncryption;
    }

    public PutObjectHeaders setSse(String sse) {
        this.sse = sse;
        return this;
    }
    public String getSse() {
        return this.sse;
    }

    public PutObjectHeaders setSseKeyId(String sseKeyId) {
        this.sseKeyId = sseKeyId;
        return this;
    }
    public String getSseKeyId() {
        return this.sseKeyId;
    }

    public PutObjectHeaders setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public PutObjectHeaders setTagging(String tagging) {
        this.tagging = tagging;
        return this;
    }
    public String getTagging() {
        return this.tagging;
    }

}
