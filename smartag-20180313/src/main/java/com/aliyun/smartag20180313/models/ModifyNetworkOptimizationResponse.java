// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyNetworkOptimizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyNetworkOptimizationResponseBody body;

    public static ModifyNetworkOptimizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkOptimizationResponse self = new ModifyNetworkOptimizationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkOptimizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNetworkOptimizationResponse setBody(ModifyNetworkOptimizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNetworkOptimizationResponseBody getBody() {
        return this.body;
    }

}
