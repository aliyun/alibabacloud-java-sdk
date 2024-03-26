// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAITemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAITemplateResponseBody body;

    public static DeleteAITemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAITemplateResponse self = new DeleteAITemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAITemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAITemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAITemplateResponse setBody(DeleteAITemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAITemplateResponseBody getBody() {
        return this.body;
    }

}
