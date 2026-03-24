// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterCheckSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterCheckSummaryResponseBody body;

    public static GetClusterCheckSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterCheckSummaryResponse self = new GetClusterCheckSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterCheckSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterCheckSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterCheckSummaryResponse setBody(GetClusterCheckSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterCheckSummaryResponseBody getBody() {
        return this.body;
    }

}
