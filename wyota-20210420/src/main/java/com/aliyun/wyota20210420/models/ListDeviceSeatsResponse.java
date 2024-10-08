// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListDeviceSeatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeviceSeatsResponseBody body;

    public static ListDeviceSeatsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceSeatsResponse self = new ListDeviceSeatsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceSeatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceSeatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeviceSeatsResponse setBody(ListDeviceSeatsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceSeatsResponseBody getBody() {
        return this.body;
    }

}
