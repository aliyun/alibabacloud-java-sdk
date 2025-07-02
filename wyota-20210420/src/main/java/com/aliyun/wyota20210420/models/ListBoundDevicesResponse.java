// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListBoundDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBoundDevicesResponseBody body;

    public static ListBoundDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBoundDevicesResponse self = new ListBoundDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListBoundDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBoundDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBoundDevicesResponse setBody(ListBoundDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBoundDevicesResponseBody getBody() {
        return this.body;
    }

}
