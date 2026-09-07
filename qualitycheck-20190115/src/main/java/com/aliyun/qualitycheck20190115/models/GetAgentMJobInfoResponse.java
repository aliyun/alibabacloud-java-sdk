// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetAgentMJobInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentMJobInfoResponseBody body;

    public static GetAgentMJobInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentMJobInfoResponse self = new GetAgentMJobInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentMJobInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentMJobInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentMJobInfoResponse setBody(GetAgentMJobInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentMJobInfoResponseBody getBody() {
        return this.body;
    }

}
