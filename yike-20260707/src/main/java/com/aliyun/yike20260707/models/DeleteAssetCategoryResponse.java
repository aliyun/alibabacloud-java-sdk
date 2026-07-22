// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class DeleteAssetCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAssetCategoryResponseBody body;

    public static DeleteAssetCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAssetCategoryResponse self = new DeleteAssetCategoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAssetCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAssetCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAssetCategoryResponse setBody(DeleteAssetCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAssetCategoryResponseBody getBody() {
        return this.body;
    }

}
