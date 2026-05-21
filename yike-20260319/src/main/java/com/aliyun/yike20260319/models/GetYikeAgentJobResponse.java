// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeAgentJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetYikeAgentJobResponseBody body;

    public static GetYikeAgentJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYikeAgentJobResponse self = new GetYikeAgentJobResponse();
        return TeaModel.build(map, self);
    }

    public GetYikeAgentJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYikeAgentJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYikeAgentJobResponse setBody(GetYikeAgentJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYikeAgentJobResponseBody getBody() {
        return this.body;
    }

}
