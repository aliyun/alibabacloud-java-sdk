// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAgentProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentProfileResponseBody body;

    public static GetAgentProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentProfileResponse self = new GetAgentProfileResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentProfileResponse setBody(GetAgentProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentProfileResponseBody getBody() {
        return this.body;
    }

}
