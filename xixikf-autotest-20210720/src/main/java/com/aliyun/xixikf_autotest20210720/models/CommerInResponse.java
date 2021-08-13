// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf_autotest20210720.models;

import com.aliyun.tea.*;

public class CommerInResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CommerInResponseBody body;

    public static CommerInResponse build(java.util.Map<String, ?> map) throws Exception {
        CommerInResponse self = new CommerInResponse();
        return TeaModel.build(map, self);
    }

    public CommerInResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommerInResponse setBody(CommerInResponseBody body) {
        this.body = body;
        return this;
    }
    public CommerInResponseBody getBody() {
        return this.body;
    }

}
