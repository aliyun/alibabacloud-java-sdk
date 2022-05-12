// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class OpenSaeServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OpenSaeServiceResponseBody body;

    public static OpenSaeServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenSaeServiceResponse self = new OpenSaeServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenSaeServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenSaeServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenSaeServiceResponse setBody(OpenSaeServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenSaeServiceResponseBody getBody() {
        return this.body;
    }

}
