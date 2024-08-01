// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteCustomLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomLineResponseBody body;

    public static DeleteCustomLineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomLineResponse self = new DeleteCustomLineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomLineResponse setBody(DeleteCustomLineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomLineResponseBody getBody() {
        return this.body;
    }

}
