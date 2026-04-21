// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class BatchGetYikeAssetMediaInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetYikeAssetMediaInfosResponseBody body;

    public static BatchGetYikeAssetMediaInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetYikeAssetMediaInfosResponse self = new BatchGetYikeAssetMediaInfosResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetYikeAssetMediaInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetYikeAssetMediaInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetYikeAssetMediaInfosResponse setBody(BatchGetYikeAssetMediaInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetYikeAssetMediaInfosResponseBody getBody() {
        return this.body;
    }

}
