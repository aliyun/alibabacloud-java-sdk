// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteCustVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustVariableResponseBody body;

    public static DeleteCustVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustVariableResponse self = new DeleteCustVariableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustVariableResponse setBody(DeleteCustVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustVariableResponseBody getBody() {
        return this.body;
    }

}
