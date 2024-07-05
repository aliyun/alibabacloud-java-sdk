// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDeviceResponseBody body;

    public static StopDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDeviceResponse self = new StopDeviceResponse();
        return TeaModel.build(map, self);
    }

    public StopDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDeviceResponse setBody(StopDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDeviceResponseBody getBody() {
        return this.body;
    }

}
