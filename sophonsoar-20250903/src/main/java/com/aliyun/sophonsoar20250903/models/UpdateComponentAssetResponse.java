// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class UpdateComponentAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateComponentAssetResponseBody body;

    public static UpdateComponentAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComponentAssetResponse self = new UpdateComponentAssetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComponentAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComponentAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateComponentAssetResponse setBody(UpdateComponentAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateComponentAssetResponseBody getBody() {
        return this.body;
    }

}
