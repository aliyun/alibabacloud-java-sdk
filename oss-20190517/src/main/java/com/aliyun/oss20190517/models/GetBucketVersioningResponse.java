// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketVersioningResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketVersioningResponseBody body;

    public static GetBucketVersioningResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketVersioningResponse self = new GetBucketVersioningResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketVersioningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketVersioningResponse setBody(GetBucketVersioningResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketVersioningResponseBody getBody() {
        return this.body;
    }

}
