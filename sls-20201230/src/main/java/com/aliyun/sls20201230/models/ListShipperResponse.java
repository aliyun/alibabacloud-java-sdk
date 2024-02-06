// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListShipperResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListShipperResponseBody body;

    public static ListShipperResponse build(java.util.Map<String, ?> map) throws Exception {
        ListShipperResponse self = new ListShipperResponse();
        return TeaModel.build(map, self);
    }

    public ListShipperResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListShipperResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListShipperResponse setBody(ListShipperResponseBody body) {
        this.body = body;
        return this;
    }
    public ListShipperResponseBody getBody() {
        return this.body;
    }

}
