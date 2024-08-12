// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddDevicesFromCSVResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDevicesFromCSVResponseBody body;

    public static AddDevicesFromCSVResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDevicesFromCSVResponse self = new AddDevicesFromCSVResponse();
        return TeaModel.build(map, self);
    }

    public AddDevicesFromCSVResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDevicesFromCSVResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDevicesFromCSVResponse setBody(AddDevicesFromCSVResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDevicesFromCSVResponseBody getBody() {
        return this.body;
    }

}
