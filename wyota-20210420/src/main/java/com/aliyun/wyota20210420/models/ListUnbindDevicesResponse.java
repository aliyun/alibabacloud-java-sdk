// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListUnbindDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUnbindDevicesResponseBody body;

    public static ListUnbindDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUnbindDevicesResponse self = new ListUnbindDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListUnbindDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUnbindDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUnbindDevicesResponse setBody(ListUnbindDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUnbindDevicesResponseBody getBody() {
        return this.body;
    }

}
