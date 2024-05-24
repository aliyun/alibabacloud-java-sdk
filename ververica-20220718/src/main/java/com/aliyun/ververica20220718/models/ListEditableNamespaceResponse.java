// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListEditableNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEditableNamespaceResponseBody body;

    public static ListEditableNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEditableNamespaceResponse self = new ListEditableNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public ListEditableNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEditableNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEditableNamespaceResponse setBody(ListEditableNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEditableNamespaceResponseBody getBody() {
        return this.body;
    }

}
