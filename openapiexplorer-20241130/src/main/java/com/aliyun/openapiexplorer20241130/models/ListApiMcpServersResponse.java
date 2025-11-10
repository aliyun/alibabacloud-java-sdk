// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class ListApiMcpServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApiMcpServersResponseBody body;

    public static ListApiMcpServersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApiMcpServersResponse self = new ListApiMcpServersResponse();
        return TeaModel.build(map, self);
    }

    public ListApiMcpServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApiMcpServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApiMcpServersResponse setBody(ListApiMcpServersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApiMcpServersResponseBody getBody() {
        return this.body;
    }

}
