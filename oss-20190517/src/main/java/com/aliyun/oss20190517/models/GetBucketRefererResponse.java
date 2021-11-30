// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketRefererResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketRefererResponseBody body;

    public static GetBucketRefererResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketRefererResponse self = new GetBucketRefererResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketRefererResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketRefererResponse setBody(GetBucketRefererResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketRefererResponseBody getBody() {
        return this.body;
    }

}
