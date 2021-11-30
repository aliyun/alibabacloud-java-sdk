// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class HeadObjectHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("If-Match")
    public String ifMatch;

    @NameInMap("If-Modified-Since")
    public String ifModifiedSince;

    @NameInMap("If-None-Match")
    public String ifNoneMatch;

    @NameInMap("If-Unmodified-Since")
    public String ifUnmodifiedSince;

    public static HeadObjectHeaders build(java.util.Map<String, ?> map) throws Exception {
        HeadObjectHeaders self = new HeadObjectHeaders();
        return TeaModel.build(map, self);
    }

    public HeadObjectHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public HeadObjectHeaders setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
    public String getIfMatch() {
        return this.ifMatch;
    }

    public HeadObjectHeaders setIfModifiedSince(String ifModifiedSince) {
        this.ifModifiedSince = ifModifiedSince;
        return this;
    }
    public String getIfModifiedSince() {
        return this.ifModifiedSince;
    }

    public HeadObjectHeaders setIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
        return this;
    }
    public String getIfNoneMatch() {
        return this.ifNoneMatch;
    }

    public HeadObjectHeaders setIfUnmodifiedSince(String ifUnmodifiedSince) {
        this.ifUnmodifiedSince = ifUnmodifiedSince;
        return this;
    }
    public String getIfUnmodifiedSince() {
        return this.ifUnmodifiedSince;
    }

}
