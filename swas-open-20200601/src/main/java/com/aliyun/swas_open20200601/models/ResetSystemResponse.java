// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ResetSystemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetSystemResponseBody body;

    public static ResetSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetSystemResponse self = new ResetSystemResponse();
        return TeaModel.build(map, self);
    }

    public ResetSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetSystemResponse setBody(ResetSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetSystemResponseBody getBody() {
        return this.body;
    }

}
