// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DisassociateProductFromPortfolioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisassociateProductFromPortfolioResponseBody body;

    public static DisassociateProductFromPortfolioResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociateProductFromPortfolioResponse self = new DisassociateProductFromPortfolioResponse();
        return TeaModel.build(map, self);
    }

    public DisassociateProductFromPortfolioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisassociateProductFromPortfolioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisassociateProductFromPortfolioResponse setBody(DisassociateProductFromPortfolioResponseBody body) {
        this.body = body;
        return this;
    }
    public DisassociateProductFromPortfolioResponseBody getBody() {
        return this.body;
    }

}
