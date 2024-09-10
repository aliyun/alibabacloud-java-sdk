// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCustomizedDictResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomizedDictResponseBody body;

    public static DeleteCustomizedDictResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizedDictResponse self = new DeleteCustomizedDictResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizedDictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomizedDictResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomizedDictResponse setBody(DeleteCustomizedDictResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomizedDictResponseBody getBody() {
        return this.body;
    }

}
