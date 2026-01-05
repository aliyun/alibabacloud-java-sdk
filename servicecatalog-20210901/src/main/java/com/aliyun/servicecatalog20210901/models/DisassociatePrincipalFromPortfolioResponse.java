// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DisassociatePrincipalFromPortfolioResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisassociatePrincipalFromPortfolioResponseBody body;

    public static DisassociatePrincipalFromPortfolioResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociatePrincipalFromPortfolioResponse self = new DisassociatePrincipalFromPortfolioResponse();
        return TeaModel.build(map, self);
    }

    public DisassociatePrincipalFromPortfolioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisassociatePrincipalFromPortfolioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisassociatePrincipalFromPortfolioResponse setBody(DisassociatePrincipalFromPortfolioResponseBody body) {
        this.body = body;
        return this;
    }
    public DisassociatePrincipalFromPortfolioResponseBody getBody() {
        return this.body;
    }

}
