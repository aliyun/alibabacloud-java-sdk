// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListAvailableZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAvailableZonesResponseBody body;

    public static ListAvailableZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableZonesResponse self = new ListAvailableZonesResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvailableZonesResponse setBody(ListAvailableZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableZonesResponseBody getBody() {
        return this.body;
    }

}
