// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ResetLogShipperResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetLogShipperResponseBody body;

    public static ResetLogShipperResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetLogShipperResponse self = new ResetLogShipperResponse();
        return TeaModel.build(map, self);
    }

    public ResetLogShipperResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetLogShipperResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetLogShipperResponse setBody(ResetLogShipperResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetLogShipperResponseBody getBody() {
        return this.body;
    }

}
