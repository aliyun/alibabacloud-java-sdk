// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultTemplateGroupConsoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDefaultTemplateGroupConsoleResponseBody body;

    public static SetDefaultTemplateGroupConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultTemplateGroupConsoleResponse self = new SetDefaultTemplateGroupConsoleResponse();
        return TeaModel.build(map, self);
    }

    public SetDefaultTemplateGroupConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDefaultTemplateGroupConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDefaultTemplateGroupConsoleResponse setBody(SetDefaultTemplateGroupConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDefaultTemplateGroupConsoleResponseBody getBody() {
        return this.body;
    }

}
