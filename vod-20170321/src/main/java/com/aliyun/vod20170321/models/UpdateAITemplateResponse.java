// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAITemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAITemplateResponseBody body;

    public static UpdateAITemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAITemplateResponse self = new UpdateAITemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAITemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAITemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAITemplateResponse setBody(UpdateAITemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAITemplateResponseBody getBody() {
        return this.body;
    }

}
