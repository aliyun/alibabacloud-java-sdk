// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteCustomTemplateConsoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomTemplateConsoleResponseBody body;

    public static DeleteCustomTemplateConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomTemplateConsoleResponse self = new DeleteCustomTemplateConsoleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomTemplateConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomTemplateConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomTemplateConsoleResponse setBody(DeleteCustomTemplateConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomTemplateConsoleResponseBody getBody() {
        return this.body;
    }

}
