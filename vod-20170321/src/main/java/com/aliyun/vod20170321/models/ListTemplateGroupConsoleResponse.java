// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTemplateGroupConsoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTemplateGroupConsoleResponseBody body;

    public static ListTemplateGroupConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateGroupConsoleResponse self = new ListTemplateGroupConsoleResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplateGroupConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTemplateGroupConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTemplateGroupConsoleResponse setBody(ListTemplateGroupConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTemplateGroupConsoleResponseBody getBody() {
        return this.body;
    }

}
