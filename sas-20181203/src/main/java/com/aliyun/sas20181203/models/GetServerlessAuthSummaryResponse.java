// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetServerlessAuthSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServerlessAuthSummaryResponseBody body;

    public static GetServerlessAuthSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServerlessAuthSummaryResponse self = new GetServerlessAuthSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetServerlessAuthSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServerlessAuthSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServerlessAuthSummaryResponse setBody(GetServerlessAuthSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServerlessAuthSummaryResponseBody getBody() {
        return this.body;
    }

}
