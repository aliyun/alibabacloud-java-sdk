// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdatePortfolioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePortfolioResponseBody body;

    public static UpdatePortfolioResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePortfolioResponse self = new UpdatePortfolioResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePortfolioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePortfolioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePortfolioResponse setBody(UpdatePortfolioResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePortfolioResponseBody getBody() {
        return this.body;
    }

}
