// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteInstanceResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInstanceResourceResponseBody body;

    public static DeleteInstanceResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceResourceResponse self = new DeleteInstanceResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstanceResourceResponse setBody(DeleteInstanceResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceResourceResponseBody getBody() {
        return this.body;
    }

}
