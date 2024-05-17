// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetWorkFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkFlowResponseBody body;

    public static GetWorkFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkFlowResponse self = new GetWorkFlowResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkFlowResponse setBody(GetWorkFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkFlowResponseBody getBody() {
        return this.body;
    }

}
