// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetPortfolioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPortfolioResponseBody body;

    public static GetPortfolioResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPortfolioResponse self = new GetPortfolioResponse();
        return TeaModel.build(map, self);
    }

    public GetPortfolioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPortfolioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPortfolioResponse setBody(GetPortfolioResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPortfolioResponseBody getBody() {
        return this.body;
    }

}
