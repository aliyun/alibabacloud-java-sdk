// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetAllTrendCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAllTrendCategoryResponseBody body;

    public static GetAllTrendCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllTrendCategoryResponse self = new GetAllTrendCategoryResponse();
        return TeaModel.build(map, self);
    }

    public GetAllTrendCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllTrendCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAllTrendCategoryResponse setBody(GetAllTrendCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllTrendCategoryResponseBody getBody() {
        return this.body;
    }

}
