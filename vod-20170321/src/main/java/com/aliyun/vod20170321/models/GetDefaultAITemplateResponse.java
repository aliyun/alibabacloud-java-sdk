// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDefaultAITemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDefaultAITemplateResponseBody body;

    public static GetDefaultAITemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultAITemplateResponse self = new GetDefaultAITemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetDefaultAITemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDefaultAITemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDefaultAITemplateResponse setBody(GetDefaultAITemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDefaultAITemplateResponseBody getBody() {
        return this.body;
    }

}
