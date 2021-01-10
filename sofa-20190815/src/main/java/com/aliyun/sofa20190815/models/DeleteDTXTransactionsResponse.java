// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDTXTransactionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDTXTransactionsResponseBody body;

    public static DeleteDTXTransactionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDTXTransactionsResponse self = new DeleteDTXTransactionsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDTXTransactionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDTXTransactionsResponse setBody(DeleteDTXTransactionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDTXTransactionsResponseBody getBody() {
        return this.body;
    }

}
