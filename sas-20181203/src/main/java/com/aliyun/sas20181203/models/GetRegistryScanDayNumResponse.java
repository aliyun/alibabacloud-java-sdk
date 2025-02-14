// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetRegistryScanDayNumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRegistryScanDayNumResponseBody body;

    public static GetRegistryScanDayNumResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegistryScanDayNumResponse self = new GetRegistryScanDayNumResponse();
        return TeaModel.build(map, self);
    }

    public GetRegistryScanDayNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRegistryScanDayNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRegistryScanDayNumResponse setBody(GetRegistryScanDayNumResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRegistryScanDayNumResponseBody getBody() {
        return this.body;
    }

}
