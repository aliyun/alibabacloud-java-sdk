// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAITemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAITemplateResponseBody body;

    public static GetAITemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAITemplateResponse self = new GetAITemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetAITemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAITemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAITemplateResponse setBody(GetAITemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAITemplateResponseBody getBody() {
        return this.body;
    }

}
