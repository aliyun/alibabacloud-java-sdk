// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class CreateComponentAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateComponentAssetResponseBody body;

    public static CreateComponentAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComponentAssetResponse self = new CreateComponentAssetResponse();
        return TeaModel.build(map, self);
    }

    public CreateComponentAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComponentAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateComponentAssetResponse setBody(CreateComponentAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComponentAssetResponseBody getBody() {
        return this.body;
    }

}
