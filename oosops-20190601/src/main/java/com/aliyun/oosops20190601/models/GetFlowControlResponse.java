// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetFlowControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFlowControlResponseBody body;

    public static GetFlowControlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFlowControlResponse self = new GetFlowControlResponse();
        return TeaModel.build(map, self);
    }

    public GetFlowControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFlowControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFlowControlResponse setBody(GetFlowControlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFlowControlResponseBody getBody() {
        return this.body;
    }

}
