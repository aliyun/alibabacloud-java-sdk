// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class UpdateAssetCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAssetCategoryResponseBody body;

    public static UpdateAssetCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAssetCategoryResponse self = new UpdateAssetCategoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAssetCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAssetCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAssetCategoryResponse setBody(UpdateAssetCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAssetCategoryResponseBody getBody() {
        return this.body;
    }

}
