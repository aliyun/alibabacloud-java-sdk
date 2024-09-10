// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAuthSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuthSummaryResponseBody body;

    public static GetAuthSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthSummaryResponse self = new GetAuthSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuthSummaryResponse setBody(GetAuthSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthSummaryResponseBody getBody() {
        return this.body;
    }

}
