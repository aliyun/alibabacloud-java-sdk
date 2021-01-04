// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class ExecuteRequestMLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteRequestMLResponseBody body;

    public static ExecuteRequestMLResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRequestMLResponse self = new ExecuteRequestMLResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteRequestMLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteRequestMLResponse setBody(ExecuteRequestMLResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteRequestMLResponseBody getBody() {
        return this.body;
    }

}
