// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListTrustDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrustDevicesResponseBody body;

    public static ListTrustDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrustDevicesResponse self = new ListTrustDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListTrustDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrustDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrustDevicesResponse setBody(ListTrustDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrustDevicesResponseBody getBody() {
        return this.body;
    }

}
