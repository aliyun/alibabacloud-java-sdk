// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAgentHotlineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentHotlineResponseBody body;

    public static GetAgentHotlineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentHotlineResponse self = new GetAgentHotlineResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentHotlineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentHotlineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentHotlineResponse setBody(GetAgentHotlineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentHotlineResponseBody getBody() {
        return this.body;
    }

}
