// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecDWSStoreRestartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecDWSStoreRestartResponseBody body;

    public static ExecDWSStoreRestartResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDWSStoreRestartResponse self = new ExecDWSStoreRestartResponse();
        return TeaModel.build(map, self);
    }

    public ExecDWSStoreRestartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDWSStoreRestartResponse setBody(ExecDWSStoreRestartResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDWSStoreRestartResponseBody getBody() {
        return this.body;
    }

}
