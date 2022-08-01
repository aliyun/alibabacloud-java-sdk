// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetShipperConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetShipperConfigResponseBody body;

    public static GetShipperConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetShipperConfigResponse self = new GetShipperConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetShipperConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetShipperConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetShipperConfigResponse setBody(GetShipperConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetShipperConfigResponseBody getBody() {
        return this.body;
    }

}
