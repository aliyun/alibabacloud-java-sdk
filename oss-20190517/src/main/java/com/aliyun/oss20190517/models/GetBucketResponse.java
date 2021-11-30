// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketResponseBody body;

    public static GetBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketResponse self = new GetBucketResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketResponse setBody(GetBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketResponseBody getBody() {
        return this.body;
    }

}
