// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class GetScriptProfileTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScriptProfileTemplateResponseBody body;

    public static GetScriptProfileTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScriptProfileTemplateResponse self = new GetScriptProfileTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetScriptProfileTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScriptProfileTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScriptProfileTemplateResponse setBody(GetScriptProfileTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScriptProfileTemplateResponseBody getBody() {
        return this.body;
    }

}
