// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeAgentJobEstimatedCreditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetYikeAgentJobEstimatedCreditResponseBody body;

    public static GetYikeAgentJobEstimatedCreditResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYikeAgentJobEstimatedCreditResponse self = new GetYikeAgentJobEstimatedCreditResponse();
        return TeaModel.build(map, self);
    }

    public GetYikeAgentJobEstimatedCreditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYikeAgentJobEstimatedCreditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYikeAgentJobEstimatedCreditResponse setBody(GetYikeAgentJobEstimatedCreditResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYikeAgentJobEstimatedCreditResponseBody getBody() {
        return this.body;
    }

}
