// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class AssociatePrincipalWithPortfolioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AssociatePrincipalWithPortfolioResponseBody body;

    public static AssociatePrincipalWithPortfolioResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociatePrincipalWithPortfolioResponse self = new AssociatePrincipalWithPortfolioResponse();
        return TeaModel.build(map, self);
    }

    public AssociatePrincipalWithPortfolioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociatePrincipalWithPortfolioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociatePrincipalWithPortfolioResponse setBody(AssociatePrincipalWithPortfolioResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociatePrincipalWithPortfolioResponseBody getBody() {
        return this.body;
    }

}
