// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeLinkaHealthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeLinkaHealthResponseBody body;

    public static CheckLinkeLinkaHealthResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeLinkaHealthResponse self = new CheckLinkeLinkaHealthResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeLinkaHealthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeLinkaHealthResponse setBody(CheckLinkeLinkaHealthResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeLinkaHealthResponseBody getBody() {
        return this.body;
    }

}
