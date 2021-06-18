// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAssetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAssetResponseBody body;

    public static DeleteAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAssetResponse self = new DeleteAssetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAssetResponse setBody(DeleteAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAssetResponseBody getBody() {
        return this.body;
    }

}
