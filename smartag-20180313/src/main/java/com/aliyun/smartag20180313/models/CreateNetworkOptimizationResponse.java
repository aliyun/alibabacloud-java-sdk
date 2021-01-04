// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateNetworkOptimizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNetworkOptimizationResponseBody body;

    public static CreateNetworkOptimizationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkOptimizationResponse self = new CreateNetworkOptimizationResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkOptimizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkOptimizationResponse setBody(CreateNetworkOptimizationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkOptimizationResponseBody getBody() {
        return this.body;
    }

}
