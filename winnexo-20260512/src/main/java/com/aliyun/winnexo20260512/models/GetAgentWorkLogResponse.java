// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetAgentWorkLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentWorkLogResponseBody body;

    public static GetAgentWorkLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentWorkLogResponse self = new GetAgentWorkLogResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentWorkLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentWorkLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentWorkLogResponse setBody(GetAgentWorkLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentWorkLogResponseBody getBody() {
        return this.body;
    }

}
