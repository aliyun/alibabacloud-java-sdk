// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddDeviceSeatsAndLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDeviceSeatsAndLabelsResponseBody body;

    public static AddDeviceSeatsAndLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceSeatsAndLabelsResponse self = new AddDeviceSeatsAndLabelsResponse();
        return TeaModel.build(map, self);
    }

    public AddDeviceSeatsAndLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDeviceSeatsAndLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDeviceSeatsAndLabelsResponse setBody(AddDeviceSeatsAndLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDeviceSeatsAndLabelsResponseBody getBody() {
        return this.body;
    }

}
