// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddOrUpdateDeviceSeatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddOrUpdateDeviceSeatsResponseBody body;

    public static AddOrUpdateDeviceSeatsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateDeviceSeatsResponse self = new AddOrUpdateDeviceSeatsResponse();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateDeviceSeatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddOrUpdateDeviceSeatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddOrUpdateDeviceSeatsResponse setBody(AddOrUpdateDeviceSeatsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddOrUpdateDeviceSeatsResponseBody getBody() {
        return this.body;
    }

}
