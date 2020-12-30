// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20170331.models;

import com.aliyun.tea.*;

public class ExecuteRequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteRequestResponseBody body;

    public static ExecuteRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRequestResponse self = new ExecuteRequestResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteRequestResponse setBody(ExecuteRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteRequestResponseBody getBody() {
        return this.body;
    }

}
