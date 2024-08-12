// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteUdfFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUdfFunctionResponseBody body;

    public static DeleteUdfFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUdfFunctionResponse self = new DeleteUdfFunctionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUdfFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUdfFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUdfFunctionResponse setBody(DeleteUdfFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUdfFunctionResponseBody getBody() {
        return this.body;
    }

}
