// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class SearchProductsAsAdminResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchProductsAsAdminResponseBody body;

    public static SearchProductsAsAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchProductsAsAdminResponse self = new SearchProductsAsAdminResponse();
        return TeaModel.build(map, self);
    }

    public SearchProductsAsAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchProductsAsAdminResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchProductsAsAdminResponse setBody(SearchProductsAsAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchProductsAsAdminResponseBody getBody() {
        return this.body;
    }

}
