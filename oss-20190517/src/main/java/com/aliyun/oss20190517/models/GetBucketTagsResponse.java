// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBucketTagsResponseBody body;

    public static GetBucketTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketTagsResponse self = new GetBucketTagsResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketTagsResponse setBody(GetBucketTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketTagsResponseBody getBody() {
        return this.body;
    }

}
