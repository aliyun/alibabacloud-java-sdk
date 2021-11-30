// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class UploadPartCopyHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("source-bucket")
    public String sourceBucket;

    @NameInMap("source-key")
    public String sourceKey;

    @NameInMap("x-oss-copy-source-if-match")
    public String xOssCopySourceIfMatch;

    @NameInMap("x-oss-copy-source-if-modified-since")
    public String xOssCopySourceIfModifiedSince;

    @NameInMap("x-oss-copy-source-if-none-match")
    public String xOssCopySourceIfNoneMatch;

    @NameInMap("x-oss-copy-source-if-unmodified-since")
    public String xOssCopySourceIfUnmodifiedSince;

    @NameInMap("x-oss-copy-source-range")
    public String xOssCopySourceRange;

    public static UploadPartCopyHeaders build(java.util.Map<String, ?> map) throws Exception {
        UploadPartCopyHeaders self = new UploadPartCopyHeaders();
        return TeaModel.build(map, self);
    }

    public UploadPartCopyHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UploadPartCopyHeaders setSourceBucket(String sourceBucket) {
        this.sourceBucket = sourceBucket;
        return this;
    }
    public String getSourceBucket() {
        return this.sourceBucket;
    }

    public UploadPartCopyHeaders setSourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
        return this;
    }
    public String getSourceKey() {
        return this.sourceKey;
    }

    public UploadPartCopyHeaders setXOssCopySourceIfMatch(String xOssCopySourceIfMatch) {
        this.xOssCopySourceIfMatch = xOssCopySourceIfMatch;
        return this;
    }
    public String getXOssCopySourceIfMatch() {
        return this.xOssCopySourceIfMatch;
    }

    public UploadPartCopyHeaders setXOssCopySourceIfModifiedSince(String xOssCopySourceIfModifiedSince) {
        this.xOssCopySourceIfModifiedSince = xOssCopySourceIfModifiedSince;
        return this;
    }
    public String getXOssCopySourceIfModifiedSince() {
        return this.xOssCopySourceIfModifiedSince;
    }

    public UploadPartCopyHeaders setXOssCopySourceIfNoneMatch(String xOssCopySourceIfNoneMatch) {
        this.xOssCopySourceIfNoneMatch = xOssCopySourceIfNoneMatch;
        return this;
    }
    public String getXOssCopySourceIfNoneMatch() {
        return this.xOssCopySourceIfNoneMatch;
    }

    public UploadPartCopyHeaders setXOssCopySourceIfUnmodifiedSince(String xOssCopySourceIfUnmodifiedSince) {
        this.xOssCopySourceIfUnmodifiedSince = xOssCopySourceIfUnmodifiedSince;
        return this;
    }
    public String getXOssCopySourceIfUnmodifiedSince() {
        return this.xOssCopySourceIfUnmodifiedSince;
    }

    public UploadPartCopyHeaders setXOssCopySourceRange(String xOssCopySourceRange) {
        this.xOssCopySourceRange = xOssCopySourceRange;
        return this;
    }
    public String getXOssCopySourceRange() {
        return this.xOssCopySourceRange;
    }

}
