// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketLifecycleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketLifecycleResponseBody body;

    public static GetBucketLifecycleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketLifecycleResponse self = new GetBucketLifecycleResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketLifecycleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketLifecycleResponse setBody(GetBucketLifecycleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketLifecycleResponseBody getBody() {
        return this.body;
    }

}
