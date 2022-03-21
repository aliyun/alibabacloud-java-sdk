// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class EnableResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableResourceTypeResponseBody body;

    public static EnableResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableResourceTypeResponse self = new EnableResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public EnableResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableResourceTypeResponse setBody(EnableResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableResourceTypeResponseBody getBody() {
        return this.body;
    }

}
