// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class DeleteAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAppResponseBody body;

    public static DeleteAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppResponse self = new DeleteAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppResponse setBody(DeleteAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppResponseBody getBody() {
        return this.body;
    }

}
