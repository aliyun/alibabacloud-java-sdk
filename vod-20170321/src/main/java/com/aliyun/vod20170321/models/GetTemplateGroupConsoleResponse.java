// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTemplateGroupConsoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTemplateGroupConsoleResponseBody body;

    public static GetTemplateGroupConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateGroupConsoleResponse self = new GetTemplateGroupConsoleResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateGroupConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplateGroupConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTemplateGroupConsoleResponse setBody(GetTemplateGroupConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplateGroupConsoleResponseBody getBody() {
        return this.body;
    }

}
