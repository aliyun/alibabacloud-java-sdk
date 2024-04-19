// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetBusinessCategoryListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBusinessCategoryListResponseBody body;

    public static GetBusinessCategoryListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessCategoryListResponse self = new GetBusinessCategoryListResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessCategoryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessCategoryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusinessCategoryListResponse setBody(GetBusinessCategoryListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessCategoryListResponseBody getBody() {
        return this.body;
    }

}
