// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class CreateAssetCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAssetCategoryResponseBody body;

    public static CreateAssetCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetCategoryResponse self = new CreateAssetCategoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateAssetCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAssetCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAssetCategoryResponse setBody(CreateAssetCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAssetCategoryResponseBody getBody() {
        return this.body;
    }

}
