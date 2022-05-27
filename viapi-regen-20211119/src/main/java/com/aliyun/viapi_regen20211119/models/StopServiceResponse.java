// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class StopServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopServiceResponseBody body;

    public static StopServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopServiceResponse self = new StopServiceResponse();
        return TeaModel.build(map, self);
    }

    public StopServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopServiceResponse setBody(StopServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopServiceResponseBody getBody() {
        return this.body;
    }

}
