// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListInstanceNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceNodesResponseBody body;

    public static ListInstanceNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceNodesResponse self = new ListInstanceNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceNodesResponse setBody(ListInstanceNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceNodesResponseBody getBody() {
        return this.body;
    }

}
