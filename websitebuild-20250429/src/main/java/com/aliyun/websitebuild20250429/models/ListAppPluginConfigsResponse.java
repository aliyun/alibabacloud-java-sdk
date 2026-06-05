// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppPluginConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppPluginConfigsResponseBody body;

    public static ListAppPluginConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppPluginConfigsResponse self = new ListAppPluginConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppPluginConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppPluginConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppPluginConfigsResponse setBody(ListAppPluginConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppPluginConfigsResponseBody getBody() {
        return this.body;
    }

}
