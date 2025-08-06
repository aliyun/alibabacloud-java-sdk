// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateCustomTemplateAndGroupConsoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomTemplateAndGroupConsoleResponseBody body;

    public static UpdateCustomTemplateAndGroupConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomTemplateAndGroupConsoleResponse self = new UpdateCustomTemplateAndGroupConsoleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomTemplateAndGroupConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomTemplateAndGroupConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomTemplateAndGroupConsoleResponse setBody(UpdateCustomTemplateAndGroupConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomTemplateAndGroupConsoleResponseBody getBody() {
        return this.body;
    }

}
