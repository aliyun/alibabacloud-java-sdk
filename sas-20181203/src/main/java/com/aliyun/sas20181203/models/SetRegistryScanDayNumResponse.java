// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetRegistryScanDayNumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetRegistryScanDayNumResponseBody body;

    public static SetRegistryScanDayNumResponse build(java.util.Map<String, ?> map) throws Exception {
        SetRegistryScanDayNumResponse self = new SetRegistryScanDayNumResponse();
        return TeaModel.build(map, self);
    }

    public SetRegistryScanDayNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetRegistryScanDayNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetRegistryScanDayNumResponse setBody(SetRegistryScanDayNumResponseBody body) {
        this.body = body;
        return this;
    }
    public SetRegistryScanDayNumResponseBody getBody() {
        return this.body;
    }

}
