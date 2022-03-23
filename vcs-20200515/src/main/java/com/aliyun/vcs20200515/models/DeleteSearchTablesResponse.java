// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteSearchTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSearchTablesResponseBody body;

    public static DeleteSearchTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSearchTablesResponse self = new DeleteSearchTablesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSearchTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSearchTablesResponse setBody(DeleteSearchTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSearchTablesResponseBody getBody() {
        return this.body;
    }

}
