// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetLicensesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLicensesResponseBody body;

    public static GetLicensesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLicensesResponse self = new GetLicensesResponse();
        return TeaModel.build(map, self);
    }

    public GetLicensesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLicensesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLicensesResponse setBody(GetLicensesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLicensesResponseBody getBody() {
        return this.body;
    }

}
