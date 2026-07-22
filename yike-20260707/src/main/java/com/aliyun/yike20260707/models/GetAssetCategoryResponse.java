// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetAssetCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAssetCategoryResponseBody body;

    public static GetAssetCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAssetCategoryResponse self = new GetAssetCategoryResponse();
        return TeaModel.build(map, self);
    }

    public GetAssetCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAssetCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAssetCategoryResponse setBody(GetAssetCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAssetCategoryResponseBody getBody() {
        return this.body;
    }

}
