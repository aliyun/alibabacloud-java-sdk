// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteSubConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSubConnectionResponseBody body;

    public static DeleteSubConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubConnectionResponse self = new DeleteSubConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSubConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSubConnectionResponse setBody(DeleteSubConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSubConnectionResponseBody getBody() {
        return this.body;
    }

}
