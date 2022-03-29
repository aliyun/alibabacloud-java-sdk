// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteFunctionTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFunctionTaskResponseBody body;

    public static DeleteFunctionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionTaskResponse self = new DeleteFunctionTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFunctionTaskResponse setBody(DeleteFunctionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFunctionTaskResponseBody getBody() {
        return this.body;
    }

}
