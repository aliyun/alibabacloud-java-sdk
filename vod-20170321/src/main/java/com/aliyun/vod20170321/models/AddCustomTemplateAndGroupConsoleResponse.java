// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddCustomTemplateAndGroupConsoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCustomTemplateAndGroupConsoleResponseBody body;

    public static AddCustomTemplateAndGroupConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCustomTemplateAndGroupConsoleResponse self = new AddCustomTemplateAndGroupConsoleResponse();
        return TeaModel.build(map, self);
    }

    public AddCustomTemplateAndGroupConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCustomTemplateAndGroupConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCustomTemplateAndGroupConsoleResponse setBody(AddCustomTemplateAndGroupConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCustomTemplateAndGroupConsoleResponseBody getBody() {
        return this.body;
    }

}
