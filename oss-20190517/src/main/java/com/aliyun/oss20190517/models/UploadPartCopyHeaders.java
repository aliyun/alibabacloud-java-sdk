// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class UploadPartCopyHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-oss-copy-source")
    public String copySource;

    @NameInMap("x-oss-copy-source-if-match")
    public String copySourceIfMatch;

    @NameInMap("x-oss-copy-source-if-modified-since")
    public String copySourceIfModifiedSince;

    @NameInMap("x-oss-copy-source-if-none-match")
    public String copySourceIfNoneMatch;

    @NameInMap("x-oss-copy-source-if-unmodified-since")
    public String copySourceIfUnmodifiedSince;

    @NameInMap("x-oss-copy-source-range")
    public String copySourceRange;

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

    public UploadPartCopyHeaders setCopySource(String copySource) {
        this.copySource = copySource;
        return this;
    }
    public String getCopySource() {
        return this.copySource;
    }

    public UploadPartCopyHeaders setCopySourceIfMatch(String copySourceIfMatch) {
        this.copySourceIfMatch = copySourceIfMatch;
        return this;
    }
    public String getCopySourceIfMatch() {
        return this.copySourceIfMatch;
    }

    public UploadPartCopyHeaders setCopySourceIfModifiedSince(String copySourceIfModifiedSince) {
        this.copySourceIfModifiedSince = copySourceIfModifiedSince;
        return this;
    }
    public String getCopySourceIfModifiedSince() {
        return this.copySourceIfModifiedSince;
    }

    public UploadPartCopyHeaders setCopySourceIfNoneMatch(String copySourceIfNoneMatch) {
        this.copySourceIfNoneMatch = copySourceIfNoneMatch;
        return this;
    }
    public String getCopySourceIfNoneMatch() {
        return this.copySourceIfNoneMatch;
    }

    public UploadPartCopyHeaders setCopySourceIfUnmodifiedSince(String copySourceIfUnmodifiedSince) {
        this.copySourceIfUnmodifiedSince = copySourceIfUnmodifiedSince;
        return this;
    }
    public String getCopySourceIfUnmodifiedSince() {
        return this.copySourceIfUnmodifiedSince;
    }

    public UploadPartCopyHeaders setCopySourceRange(String copySourceRange) {
        this.copySourceRange = copySourceRange;
        return this;
    }
    public String getCopySourceRange() {
        return this.copySourceRange;
    }

}
