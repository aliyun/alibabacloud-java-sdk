// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CheckInstanceResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckInstanceResourcesResponseBody body;

    public static CheckInstanceResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceResourcesResponse self = new CheckInstanceResourcesResponse();
        return TeaModel.build(map, self);
    }

    public CheckInstanceResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckInstanceResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckInstanceResourcesResponse setBody(CheckInstanceResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckInstanceResourcesResponseBody getBody() {
        return this.body;
    }

}
