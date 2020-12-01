// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UnbindSlbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindSlbResponseBody body;

    public static UnbindSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindSlbResponse self = new UnbindSlbResponse();
        return TeaModel.build(map, self);
    }

    public UnbindSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindSlbResponse setBody(UnbindSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindSlbResponseBody getBody() {
        return this.body;
    }

}
