// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCheckSummaryResponseBody body;

    public static GetCheckSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckSummaryResponse self = new GetCheckSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetCheckSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCheckSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCheckSummaryResponse setBody(GetCheckSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCheckSummaryResponseBody getBody() {
        return this.body;
    }

}
