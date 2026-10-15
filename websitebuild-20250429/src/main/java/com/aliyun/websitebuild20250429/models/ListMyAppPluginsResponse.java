// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListMyAppPluginsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMyAppPluginsResponseBody body;

    public static ListMyAppPluginsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMyAppPluginsResponse self = new ListMyAppPluginsResponse();
        return TeaModel.build(map, self);
    }

    public ListMyAppPluginsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMyAppPluginsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMyAppPluginsResponse setBody(ListMyAppPluginsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMyAppPluginsResponseBody getBody() {
        return this.body;
    }

}
