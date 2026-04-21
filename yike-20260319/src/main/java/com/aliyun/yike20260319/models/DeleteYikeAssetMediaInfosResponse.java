// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class DeleteYikeAssetMediaInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteYikeAssetMediaInfosResponseBody body;

    public static DeleteYikeAssetMediaInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteYikeAssetMediaInfosResponse self = new DeleteYikeAssetMediaInfosResponse();
        return TeaModel.build(map, self);
    }

    public DeleteYikeAssetMediaInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteYikeAssetMediaInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteYikeAssetMediaInfosResponse setBody(DeleteYikeAssetMediaInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteYikeAssetMediaInfosResponseBody getBody() {
        return this.body;
    }

}
