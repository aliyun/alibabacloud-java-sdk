// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ActivateDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActivateDeviceResponseBody body;

    public static ActivateDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateDeviceResponse self = new ActivateDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ActivateDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateDeviceResponse setBody(ActivateDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateDeviceResponseBody getBody() {
        return this.body;
    }

}
