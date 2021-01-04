// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DetachNetworkOptimizationSagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachNetworkOptimizationSagsResponseBody body;

    public static DetachNetworkOptimizationSagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachNetworkOptimizationSagsResponse self = new DetachNetworkOptimizationSagsResponse();
        return TeaModel.build(map, self);
    }

    public DetachNetworkOptimizationSagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachNetworkOptimizationSagsResponse setBody(DetachNetworkOptimizationSagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachNetworkOptimizationSagsResponseBody getBody() {
        return this.body;
    }

}
