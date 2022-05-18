// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreatePortfolioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePortfolioResponseBody body;

    public static CreatePortfolioResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePortfolioResponse self = new CreatePortfolioResponse();
        return TeaModel.build(map, self);
    }

    public CreatePortfolioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePortfolioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePortfolioResponse setBody(CreatePortfolioResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePortfolioResponseBody getBody() {
        return this.body;
    }

}
