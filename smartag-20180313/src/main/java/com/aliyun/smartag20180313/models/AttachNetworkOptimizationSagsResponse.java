// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AttachNetworkOptimizationSagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachNetworkOptimizationSagsResponseBody body;

    public static AttachNetworkOptimizationSagsResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachNetworkOptimizationSagsResponse self = new AttachNetworkOptimizationSagsResponse();
        return TeaModel.build(map, self);
    }

    public AttachNetworkOptimizationSagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachNetworkOptimizationSagsResponse setBody(AttachNetworkOptimizationSagsResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachNetworkOptimizationSagsResponseBody getBody() {
        return this.body;
    }

}
