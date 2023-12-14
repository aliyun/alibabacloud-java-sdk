// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteExpressSyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteExpressSyncResponseBody body;

    public static DeleteExpressSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressSyncResponse self = new DeleteExpressSyncResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExpressSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExpressSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExpressSyncResponse setBody(DeleteExpressSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExpressSyncResponseBody getBody() {
        return this.body;
    }

}
