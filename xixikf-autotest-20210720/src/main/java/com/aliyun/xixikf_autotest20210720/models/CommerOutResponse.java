// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf_autotest20210720.models;

import com.aliyun.tea.*;

public class CommerOutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CommerOutResponseBody body;

    public static CommerOutResponse build(java.util.Map<String, ?> map) throws Exception {
        CommerOutResponse self = new CommerOutResponse();
        return TeaModel.build(map, self);
    }

    public CommerOutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommerOutResponse setBody(CommerOutResponseBody body) {
        this.body = body;
        return this;
    }
    public CommerOutResponseBody getBody() {
        return this.body;
    }

}
