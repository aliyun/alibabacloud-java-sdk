// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteNetworkOptimizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNetworkOptimizationResponseBody body;

    public static DeleteNetworkOptimizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkOptimizationResponse self = new DeleteNetworkOptimizationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkOptimizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkOptimizationResponse setBody(DeleteNetworkOptimizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkOptimizationResponseBody getBody() {
        return this.body;
    }

}
