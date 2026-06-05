// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppPluginsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppPluginsResponseBody body;

    public static ListAppPluginsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppPluginsResponse self = new ListAppPluginsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppPluginsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppPluginsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppPluginsResponse setBody(ListAppPluginsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppPluginsResponseBody getBody() {
        return this.body;
    }

}
