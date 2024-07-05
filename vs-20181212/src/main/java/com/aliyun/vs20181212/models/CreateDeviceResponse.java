// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDeviceResponseBody body;

    public static CreateDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceResponse self = new CreateDeviceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeviceResponse setBody(CreateDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeviceResponseBody getBody() {
        return this.body;
    }

}
