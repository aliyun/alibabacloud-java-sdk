// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetAgentTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentTaskResultResponseBody body;

    public static GetAgentTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentTaskResultResponse self = new GetAgentTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentTaskResultResponse setBody(GetAgentTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentTaskResultResponseBody getBody() {
        return this.body;
    }

}
