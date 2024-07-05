// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDeviceResponseBody body;

    public static StartDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDeviceResponse self = new StartDeviceResponse();
        return TeaModel.build(map, self);
    }

    public StartDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDeviceResponse setBody(StartDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDeviceResponseBody getBody() {
        return this.body;
    }

}
