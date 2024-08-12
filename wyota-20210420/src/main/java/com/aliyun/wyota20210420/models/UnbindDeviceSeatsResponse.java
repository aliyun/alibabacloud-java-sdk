// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class UnbindDeviceSeatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindDeviceSeatsResponseBody body;

    public static UnbindDeviceSeatsResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindDeviceSeatsResponse self = new UnbindDeviceSeatsResponse();
        return TeaModel.build(map, self);
    }

    public UnbindDeviceSeatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindDeviceSeatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindDeviceSeatsResponse setBody(UnbindDeviceSeatsResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindDeviceSeatsResponseBody getBody() {
        return this.body;
    }

}
