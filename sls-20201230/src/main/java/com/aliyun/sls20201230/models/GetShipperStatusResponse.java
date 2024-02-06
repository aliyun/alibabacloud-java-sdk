// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetShipperStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetShipperStatusResponseBody body;

    public static GetShipperStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetShipperStatusResponse self = new GetShipperStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetShipperStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetShipperStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetShipperStatusResponse setBody(GetShipperStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetShipperStatusResponseBody getBody() {
        return this.body;
    }

}
