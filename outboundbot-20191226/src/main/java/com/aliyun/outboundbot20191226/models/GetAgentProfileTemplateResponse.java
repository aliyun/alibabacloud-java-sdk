// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAgentProfileTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentProfileTemplateResponseBody body;

    public static GetAgentProfileTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentProfileTemplateResponse self = new GetAgentProfileTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentProfileTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentProfileTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentProfileTemplateResponse setBody(GetAgentProfileTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentProfileTemplateResponseBody getBody() {
        return this.body;
    }

}
