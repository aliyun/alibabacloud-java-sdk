// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetInstanceResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceResourceResponseBody body;

    public static GetInstanceResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResourceResponse self = new GetInstanceResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceResourceResponse setBody(GetInstanceResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceResourceResponseBody getBody() {
        return this.body;
    }

}
