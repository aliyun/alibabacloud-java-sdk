// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class EstimateMonocularVideoDepthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EstimateMonocularVideoDepthResponseBody body;

    public static EstimateMonocularVideoDepthResponse build(java.util.Map<String, ?> map) throws Exception {
        EstimateMonocularVideoDepthResponse self = new EstimateMonocularVideoDepthResponse();
        return TeaModel.build(map, self);
    }

    public EstimateMonocularVideoDepthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EstimateMonocularVideoDepthResponse setBody(EstimateMonocularVideoDepthResponseBody body) {
        this.body = body;
        return this;
    }
    public EstimateMonocularVideoDepthResponseBody getBody() {
        return this.body;
    }

}
