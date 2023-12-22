// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateInstanceResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInstanceResourceResponseBody body;

    public static CreateInstanceResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResourceResponse self = new CreateInstanceResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceResourceResponse setBody(CreateInstanceResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceResourceResponseBody getBody() {
        return this.body;
    }

}
