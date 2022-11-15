// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class DeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteResponseBody body;

    public static DeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResponse self = new DeleteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResponse setBody(DeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResponseBody getBody() {
        return this.body;
    }

}
