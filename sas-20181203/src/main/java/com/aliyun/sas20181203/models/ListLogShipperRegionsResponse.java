// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListLogShipperRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLogShipperRegionsResponseBody body;

    public static ListLogShipperRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogShipperRegionsResponse self = new ListLogShipperRegionsResponse();
        return TeaModel.build(map, self);
    }

    public ListLogShipperRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogShipperRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogShipperRegionsResponse setBody(ListLogShipperRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogShipperRegionsResponseBody getBody() {
        return this.body;
    }

}
