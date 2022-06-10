// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeletePhysicalConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePhysicalConnectionResponseBody body;

    public static DeletePhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePhysicalConnectionResponse self = new DeletePhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DeletePhysicalConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePhysicalConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePhysicalConnectionResponse setBody(DeletePhysicalConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePhysicalConnectionResponseBody getBody() {
        return this.body;
    }

}
