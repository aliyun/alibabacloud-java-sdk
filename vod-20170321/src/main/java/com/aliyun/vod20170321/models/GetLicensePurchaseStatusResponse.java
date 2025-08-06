// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetLicensePurchaseStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLicensePurchaseStatusResponseBody body;

    public static GetLicensePurchaseStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLicensePurchaseStatusResponse self = new GetLicensePurchaseStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetLicensePurchaseStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLicensePurchaseStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLicensePurchaseStatusResponse setBody(GetLicensePurchaseStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLicensePurchaseStatusResponseBody getBody() {
        return this.body;
    }

}
