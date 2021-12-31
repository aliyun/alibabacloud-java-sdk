// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteFunctionInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFunctionInstanceResponseBody body;

    public static DeleteFunctionInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionInstanceResponse self = new DeleteFunctionInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFunctionInstanceResponse setBody(DeleteFunctionInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFunctionInstanceResponseBody getBody() {
        return this.body;
    }

}
