// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DeleteAppEnvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAppEnvResponseBody body;

    public static DeleteAppEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppEnvResponse self = new DeleteAppEnvResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppEnvResponse setBody(DeleteAppEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppEnvResponseBody getBody() {
        return this.body;
    }

}
