// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210823_161417275.models;

import com.aliyun.tea.*;

public class HttpGroupTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HttpGroupTestResponseBody body;

    public static HttpGroupTestResponse build(java.util.Map<String, ?> map) throws Exception {
        HttpGroupTestResponse self = new HttpGroupTestResponse();
        return TeaModel.build(map, self);
    }

    public HttpGroupTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HttpGroupTestResponse setBody(HttpGroupTestResponseBody body) {
        this.body = body;
        return this;
    }
    public HttpGroupTestResponseBody getBody() {
        return this.body;
    }

}
