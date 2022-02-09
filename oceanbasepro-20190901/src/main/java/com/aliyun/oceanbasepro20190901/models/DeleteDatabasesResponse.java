// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDatabasesResponseBody body;

    public static DeleteDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabasesResponse self = new DeleteDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatabasesResponse setBody(DeleteDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatabasesResponseBody getBody() {
        return this.body;
    }

}
