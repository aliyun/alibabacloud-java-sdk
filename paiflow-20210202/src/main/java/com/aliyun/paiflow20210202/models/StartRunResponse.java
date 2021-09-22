// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class StartRunResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartRunResponseBody body;

    public static StartRunResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRunResponse self = new StartRunResponse();
        return TeaModel.build(map, self);
    }

    public StartRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRunResponse setBody(StartRunResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRunResponseBody getBody() {
        return this.body;
    }

}
