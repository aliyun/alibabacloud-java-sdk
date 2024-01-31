// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaStrategyTemplateSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOpaStrategyTemplateSummaryResponseBody body;

    public static GetOpaStrategyTemplateSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpaStrategyTemplateSummaryResponse self = new GetOpaStrategyTemplateSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetOpaStrategyTemplateSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpaStrategyTemplateSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpaStrategyTemplateSummaryResponse setBody(GetOpaStrategyTemplateSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpaStrategyTemplateSummaryResponseBody getBody() {
        return this.body;
    }

}
