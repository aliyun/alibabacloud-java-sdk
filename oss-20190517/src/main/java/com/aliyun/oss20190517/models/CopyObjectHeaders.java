// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CopyObjectHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("source-bucket")
    public String sourceBucket;

    @NameInMap("source-key")
    public String sourceKey;

    @NameInMap("x-oss-copy-source-if-match")
    public String copySourceIfMatch;

    @NameInMap("x-oss-copy-source-if-modified-since")
    public String copySourceIfModifiedSince;

    @NameInMap("x-oss-copy-source-if-none-match")
    public String copySourceIfNoneMatch;

    @NameInMap("x-oss-copy-source-if-unmodified-since")
    public String copySourceIfUnmodifiedSince;

    @NameInMap("x-oss-forbid-overwrite")
    public String forbidOverwrite;

    @NameInMap("x-oss-metadata-directive")
    public String metadataDirective;

    @NameInMap("x-oss-object-acl")
    public String acl;

    @NameInMap("x-oss-server-side-encryption")
    public String sse;

    @NameInMap("x-oss-server-side-encryption-key-id")
    public String sseKeyId;

    @NameInMap("x-oss-storage-class")
    public String storageClass;

    @NameInMap("x-oss-tagging")
    public String tagging;

    public static CopyObjectHeaders build(java.util.Map<String, ?> map) throws Exception {
        CopyObjectHeaders self = new CopyObjectHeaders();
        return TeaModel.build(map, self);
    }

    public CopyObjectHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CopyObjectHeaders setSourceBucket(String sourceBucket) {
        this.sourceBucket = sourceBucket;
        return this;
    }
    public String getSourceBucket() {
        return this.sourceBucket;
    }

    public CopyObjectHeaders setSourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
        return this;
    }
    public String getSourceKey() {
        return this.sourceKey;
    }

    public CopyObjectHeaders setCopySourceIfMatch(String copySourceIfMatch) {
        this.copySourceIfMatch = copySourceIfMatch;
        return this;
    }
    public String getCopySourceIfMatch() {
        return this.copySourceIfMatch;
    }

    public CopyObjectHeaders setCopySourceIfModifiedSince(String copySourceIfModifiedSince) {
        this.copySourceIfModifiedSince = copySourceIfModifiedSince;
        return this;
    }
    public String getCopySourceIfModifiedSince() {
        return this.copySourceIfModifiedSince;
    }

    public CopyObjectHeaders setCopySourceIfNoneMatch(String copySourceIfNoneMatch) {
        this.copySourceIfNoneMatch = copySourceIfNoneMatch;
        return this;
    }
    public String getCopySourceIfNoneMatch() {
        return this.copySourceIfNoneMatch;
    }

    public CopyObjectHeaders setCopySourceIfUnmodifiedSince(String copySourceIfUnmodifiedSince) {
        this.copySourceIfUnmodifiedSince = copySourceIfUnmodifiedSince;
        return this;
    }
    public String getCopySourceIfUnmodifiedSince() {
        return this.copySourceIfUnmodifiedSince;
    }

    public CopyObjectHeaders setForbidOverwrite(String forbidOverwrite) {
        this.forbidOverwrite = forbidOverwrite;
        return this;
    }
    public String getForbidOverwrite() {
        return this.forbidOverwrite;
    }

    public CopyObjectHeaders setMetadataDirective(String metadataDirective) {
        this.metadataDirective = metadataDirective;
        return this;
    }
    public String getMetadataDirective() {
        return this.metadataDirective;
    }

    public CopyObjectHeaders setAcl(String acl) {
        this.acl = acl;
        return this;
    }
    public String getAcl() {
        return this.acl;
    }

    public CopyObjectHeaders setSse(String sse) {
        this.sse = sse;
        return this;
    }
    public String getSse() {
        return this.sse;
    }

    public CopyObjectHeaders setSseKeyId(String sseKeyId) {
        this.sseKeyId = sseKeyId;
        return this;
    }
    public String getSseKeyId() {
        return this.sseKeyId;
    }

    public CopyObjectHeaders setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public CopyObjectHeaders setTagging(String tagging) {
        this.tagging = tagging;
        return this;
    }
    public String getTagging() {
        return this.tagging;
    }

}
