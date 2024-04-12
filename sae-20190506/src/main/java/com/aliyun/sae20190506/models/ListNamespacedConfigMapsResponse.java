// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespacedConfigMapsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNamespacedConfigMapsResponseBody body;

    public static ListNamespacedConfigMapsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacedConfigMapsResponse self = new ListNamespacedConfigMapsResponse();
        return TeaModel.build(map, self);
    }

    public ListNamespacedConfigMapsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNamespacedConfigMapsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNamespacedConfigMapsResponse setBody(ListNamespacedConfigMapsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNamespacedConfigMapsResponseBody getBody() {
        return this.body;
    }

}
