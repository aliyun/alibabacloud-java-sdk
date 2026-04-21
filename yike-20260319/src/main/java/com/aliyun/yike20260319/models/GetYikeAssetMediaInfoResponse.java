// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeAssetMediaInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetYikeAssetMediaInfoResponseBody body;

    public static GetYikeAssetMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYikeAssetMediaInfoResponse self = new GetYikeAssetMediaInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetYikeAssetMediaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYikeAssetMediaInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYikeAssetMediaInfoResponse setBody(GetYikeAssetMediaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYikeAssetMediaInfoResponseBody getBody() {
        return this.body;
    }

}
