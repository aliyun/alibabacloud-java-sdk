// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetModelProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetModelProgressResponseBody body;

    public static GetModelProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelProgressResponse self = new GetModelProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetModelProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelProgressResponse setBody(GetModelProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelProgressResponseBody getBody() {
        return this.body;
    }

}
