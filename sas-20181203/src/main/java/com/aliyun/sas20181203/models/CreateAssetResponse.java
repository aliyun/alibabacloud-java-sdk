// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAssetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAssetResponseBody body;

    public static CreateAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetResponse self = new CreateAssetResponse();
        return TeaModel.build(map, self);
    }

    public CreateAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAssetResponse setBody(CreateAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAssetResponseBody getBody() {
        return this.body;
    }

}
