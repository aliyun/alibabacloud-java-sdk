// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppPluginVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppPluginVersionsResponseBody body;

    public static ListAppPluginVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppPluginVersionsResponse self = new ListAppPluginVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppPluginVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppPluginVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppPluginVersionsResponse setBody(ListAppPluginVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppPluginVersionsResponseBody getBody() {
        return this.body;
    }

}
