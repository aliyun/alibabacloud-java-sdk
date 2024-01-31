// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterRuleSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterRuleSummaryResponseBody body;

    public static GetClusterRuleSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterRuleSummaryResponse self = new GetClusterRuleSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterRuleSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterRuleSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterRuleSummaryResponse setBody(GetClusterRuleSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterRuleSummaryResponseBody getBody() {
        return this.body;
    }

}
