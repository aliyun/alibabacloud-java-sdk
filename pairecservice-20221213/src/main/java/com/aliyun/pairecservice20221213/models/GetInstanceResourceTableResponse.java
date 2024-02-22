// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetInstanceResourceTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceResourceTableResponseBody body;

    public static GetInstanceResourceTableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResourceTableResponse self = new GetInstanceResourceTableResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceResourceTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceResourceTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceResourceTableResponse setBody(GetInstanceResourceTableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceResourceTableResponseBody getBody() {
        return this.body;
    }

}
