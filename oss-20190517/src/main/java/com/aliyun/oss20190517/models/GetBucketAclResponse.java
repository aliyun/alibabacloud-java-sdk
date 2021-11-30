// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketAclResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketAclResponseBody body;

    public static GetBucketAclResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketAclResponse self = new GetBucketAclResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketAclResponse setBody(GetBucketAclResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketAclResponseBody getBody() {
        return this.body;
    }

}
