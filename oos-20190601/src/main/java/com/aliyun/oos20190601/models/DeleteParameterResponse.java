// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteParameterResponseBody body;

    public static DeleteParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteParameterResponse self = new DeleteParameterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteParameterResponse setBody(DeleteParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteParameterResponseBody getBody() {
        return this.body;
    }

}
