// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteSolutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSolutionResponseBody body;

    public static DeleteSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSolutionResponse self = new DeleteSolutionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSolutionResponse setBody(DeleteSolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSolutionResponseBody getBody() {
        return this.body;
    }

}
