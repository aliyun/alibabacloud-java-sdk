// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class GetTemplateCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTemplateCategoriesResponseBody body;

    public static GetTemplateCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateCategoriesResponse self = new GetTemplateCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplateCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTemplateCategoriesResponse setBody(GetTemplateCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplateCategoriesResponseBody getBody() {
        return this.body;
    }

}
