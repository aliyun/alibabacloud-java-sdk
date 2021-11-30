// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketCorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketCorsResponseBody body;

    public static GetBucketCorsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketCorsResponse self = new GetBucketCorsResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketCorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketCorsResponse setBody(GetBucketCorsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketCorsResponseBody getBody() {
        return this.body;
    }

}
