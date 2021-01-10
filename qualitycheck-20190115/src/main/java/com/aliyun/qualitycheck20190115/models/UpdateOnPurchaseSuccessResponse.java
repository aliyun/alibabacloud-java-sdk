// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateOnPurchaseSuccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOnPurchaseSuccessResponseBody body;

    public static UpdateOnPurchaseSuccessResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOnPurchaseSuccessResponse self = new UpdateOnPurchaseSuccessResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOnPurchaseSuccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOnPurchaseSuccessResponse setBody(UpdateOnPurchaseSuccessResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOnPurchaseSuccessResponseBody getBody() {
        return this.body;
    }

}
