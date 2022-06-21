// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetOpportunityMarketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOpportunityMarketResponseBody body;

    public static GetOpportunityMarketResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpportunityMarketResponse self = new GetOpportunityMarketResponse();
        return TeaModel.build(map, self);
    }

    public GetOpportunityMarketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpportunityMarketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpportunityMarketResponse setBody(GetOpportunityMarketResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpportunityMarketResponseBody getBody() {
        return this.body;
    }

}
