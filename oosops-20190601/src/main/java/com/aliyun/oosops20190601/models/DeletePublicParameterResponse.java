// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class DeletePublicParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePublicParameterResponseBody body;

    public static DeletePublicParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePublicParameterResponse self = new DeletePublicParameterResponse();
        return TeaModel.build(map, self);
    }

    public DeletePublicParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePublicParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePublicParameterResponse setBody(DeletePublicParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePublicParameterResponseBody getBody() {
        return this.body;
    }

}
