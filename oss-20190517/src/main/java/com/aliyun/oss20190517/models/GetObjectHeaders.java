// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetObjectHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("Accept-Encoding")
    public String acceptEncoding;

    @NameInMap("If-Match")
    public String ifMatch;

    @NameInMap("If-Modified-Since")
    public String ifModifiedSince;

    @NameInMap("If-None-Match")
    public String ifNoneMatch;

    @NameInMap("If-Unmodified-Since")
    public String ifUnmodifiedSince;

    @NameInMap("Range")
    public String range;

    public static GetObjectHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetObjectHeaders self = new GetObjectHeaders();
        return TeaModel.build(map, self);
    }

    public GetObjectHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetObjectHeaders setAcceptEncoding(String acceptEncoding) {
        this.acceptEncoding = acceptEncoding;
        return this;
    }
    public String getAcceptEncoding() {
        return this.acceptEncoding;
    }

    public GetObjectHeaders setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
    public String getIfMatch() {
        return this.ifMatch;
    }

    public GetObjectHeaders setIfModifiedSince(String ifModifiedSince) {
        this.ifModifiedSince = ifModifiedSince;
        return this;
    }
    public String getIfModifiedSince() {
        return this.ifModifiedSince;
    }

    public GetObjectHeaders setIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
        return this;
    }
    public String getIfNoneMatch() {
        return this.ifNoneMatch;
    }

    public GetObjectHeaders setIfUnmodifiedSince(String ifUnmodifiedSince) {
        this.ifUnmodifiedSince = ifUnmodifiedSince;
        return this;
    }
    public String getIfUnmodifiedSince() {
        return this.ifUnmodifiedSince;
    }

    public GetObjectHeaders setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

}
