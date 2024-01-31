// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInterceptionSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInterceptionSummaryResponseBody body;

    public static GetInterceptionSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInterceptionSummaryResponse self = new GetInterceptionSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetInterceptionSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInterceptionSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInterceptionSummaryResponse setBody(GetInterceptionSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInterceptionSummaryResponseBody getBody() {
        return this.body;
    }

}
