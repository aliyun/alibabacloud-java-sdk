// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class DeleteRunResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRunResponseBody body;

    public static DeleteRunResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRunResponse self = new DeleteRunResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRunResponse setBody(DeleteRunResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRunResponseBody getBody() {
        return this.body;
    }

}
