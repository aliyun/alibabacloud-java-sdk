// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketLocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketLocationResponseBody body;

    public static GetBucketLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketLocationResponse self = new GetBucketLocationResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketLocationResponse setBody(GetBucketLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketLocationResponseBody getBody() {
        return this.body;
    }

}
