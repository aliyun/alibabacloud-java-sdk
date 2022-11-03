// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class SdkChargeFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SdkChargeFlowResponseBody body;

    public static SdkChargeFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        SdkChargeFlowResponse self = new SdkChargeFlowResponse();
        return TeaModel.build(map, self);
    }

    public SdkChargeFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SdkChargeFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SdkChargeFlowResponse setBody(SdkChargeFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public SdkChargeFlowResponseBody getBody() {
        return this.body;
    }

}
