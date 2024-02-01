// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetFlowLogServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFlowLogServiceStatusResponseBody body;

    public static GetFlowLogServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFlowLogServiceStatusResponse self = new GetFlowLogServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetFlowLogServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFlowLogServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFlowLogServiceStatusResponse setBody(GetFlowLogServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFlowLogServiceStatusResponseBody getBody() {
        return this.body;
    }

}
