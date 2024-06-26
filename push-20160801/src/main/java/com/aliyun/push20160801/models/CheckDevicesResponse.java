// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CheckDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDevicesResponseBody body;

    public static CheckDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDevicesResponse self = new CheckDevicesResponse();
        return TeaModel.build(map, self);
    }

    public CheckDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDevicesResponse setBody(CheckDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDevicesResponseBody getBody() {
        return this.body;
    }

}
