// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultAITemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDefaultAITemplateResponseBody body;

    public static SetDefaultAITemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultAITemplateResponse self = new SetDefaultAITemplateResponse();
        return TeaModel.build(map, self);
    }

    public SetDefaultAITemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDefaultAITemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDefaultAITemplateResponse setBody(SetDefaultAITemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDefaultAITemplateResponseBody getBody() {
        return this.body;
    }

}
