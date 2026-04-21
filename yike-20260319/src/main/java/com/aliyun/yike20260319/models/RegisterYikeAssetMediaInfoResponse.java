// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class RegisterYikeAssetMediaInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterYikeAssetMediaInfoResponseBody body;

    public static RegisterYikeAssetMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterYikeAssetMediaInfoResponse self = new RegisterYikeAssetMediaInfoResponse();
        return TeaModel.build(map, self);
    }

    public RegisterYikeAssetMediaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterYikeAssetMediaInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterYikeAssetMediaInfoResponse setBody(RegisterYikeAssetMediaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterYikeAssetMediaInfoResponseBody getBody() {
        return this.body;
    }

}
