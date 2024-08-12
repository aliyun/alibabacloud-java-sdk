// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddDeviceFromSNResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDeviceFromSNResponseBody body;

    public static AddDeviceFromSNResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceFromSNResponse self = new AddDeviceFromSNResponse();
        return TeaModel.build(map, self);
    }

    public AddDeviceFromSNResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDeviceFromSNResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDeviceFromSNResponse setBody(AddDeviceFromSNResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDeviceFromSNResponseBody getBody() {
        return this.body;
    }

}
