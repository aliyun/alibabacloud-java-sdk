// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class EstimateMonocularImageDepthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EstimateMonocularImageDepthResponseBody body;

    public static EstimateMonocularImageDepthResponse build(java.util.Map<String, ?> map) throws Exception {
        EstimateMonocularImageDepthResponse self = new EstimateMonocularImageDepthResponse();
        return TeaModel.build(map, self);
    }

    public EstimateMonocularImageDepthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EstimateMonocularImageDepthResponse setBody(EstimateMonocularImageDepthResponseBody body) {
        this.body = body;
        return this;
    }
    public EstimateMonocularImageDepthResponseBody getBody() {
        return this.body;
    }

}
