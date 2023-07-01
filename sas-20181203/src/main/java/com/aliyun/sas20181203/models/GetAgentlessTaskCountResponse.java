// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAgentlessTaskCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentlessTaskCountResponseBody body;

    public static GetAgentlessTaskCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentlessTaskCountResponse self = new GetAgentlessTaskCountResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentlessTaskCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentlessTaskCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentlessTaskCountResponse setBody(GetAgentlessTaskCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentlessTaskCountResponseBody getBody() {
        return this.body;
    }

}
