// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetErrorCodeSolutionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetErrorCodeSolutionsResponseBody body;

    public static GetErrorCodeSolutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetErrorCodeSolutionsResponse self = new GetErrorCodeSolutionsResponse();
        return TeaModel.build(map, self);
    }

    public GetErrorCodeSolutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetErrorCodeSolutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetErrorCodeSolutionsResponse setBody(GetErrorCodeSolutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetErrorCodeSolutionsResponseBody getBody() {
        return this.body;
    }

}
