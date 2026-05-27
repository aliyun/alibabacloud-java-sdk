// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class ListMcpServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMcpServicesResponseBody body;

    public static ListMcpServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcpServicesResponse self = new ListMcpServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListMcpServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcpServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMcpServicesResponse setBody(ListMcpServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcpServicesResponseBody getBody() {
        return this.body;
    }

}
