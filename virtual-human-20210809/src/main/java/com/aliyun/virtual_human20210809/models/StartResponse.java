// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class StartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartResponseBody body;

    public static StartResponse build(java.util.Map<String, ?> map) throws Exception {
        StartResponse self = new StartResponse();
        return TeaModel.build(map, self);
    }

    public StartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartResponse setBody(StartResponseBody body) {
        this.body = body;
        return this;
    }
    public StartResponseBody getBody() {
        return this.body;
    }

}
