// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RenewAssetOperationTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewAssetOperationTokenResponseBody body;

    public static RenewAssetOperationTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewAssetOperationTokenResponse self = new RenewAssetOperationTokenResponse();
        return TeaModel.build(map, self);
    }

    public RenewAssetOperationTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewAssetOperationTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewAssetOperationTokenResponse setBody(RenewAssetOperationTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewAssetOperationTokenResponseBody getBody() {
        return this.body;
    }

}
