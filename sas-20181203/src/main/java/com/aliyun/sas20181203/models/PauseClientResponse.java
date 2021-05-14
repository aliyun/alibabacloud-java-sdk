// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PauseClientResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PauseClientResponseBody body;

    public static PauseClientResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseClientResponse self = new PauseClientResponse();
        return TeaModel.build(map, self);
    }

    public PauseClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseClientResponse setBody(PauseClientResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseClientResponseBody getBody() {
        return this.body;
    }

}
