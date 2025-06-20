// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeQueryApproveFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SafeChangeQueryApproveFlowResponseBody body;

    public static SafeChangeQueryApproveFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeQueryApproveFlowResponse self = new SafeChangeQueryApproveFlowResponse();
        return TeaModel.build(map, self);
    }

    public SafeChangeQueryApproveFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SafeChangeQueryApproveFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SafeChangeQueryApproveFlowResponse setBody(SafeChangeQueryApproveFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public SafeChangeQueryApproveFlowResponseBody getBody() {
        return this.body;
    }

}
