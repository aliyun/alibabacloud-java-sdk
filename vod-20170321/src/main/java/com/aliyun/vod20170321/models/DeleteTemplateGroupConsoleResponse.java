// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteTemplateGroupConsoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTemplateGroupConsoleResponseBody body;

    public static DeleteTemplateGroupConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateGroupConsoleResponse self = new DeleteTemplateGroupConsoleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateGroupConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTemplateGroupConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTemplateGroupConsoleResponse setBody(DeleteTemplateGroupConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTemplateGroupConsoleResponseBody getBody() {
        return this.body;
    }

}
