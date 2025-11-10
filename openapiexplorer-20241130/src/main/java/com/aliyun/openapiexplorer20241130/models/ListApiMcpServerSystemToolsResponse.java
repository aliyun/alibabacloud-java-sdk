// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class ListApiMcpServerSystemToolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApiMcpServerSystemToolsResponseBody body;

    public static ListApiMcpServerSystemToolsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApiMcpServerSystemToolsResponse self = new ListApiMcpServerSystemToolsResponse();
        return TeaModel.build(map, self);
    }

    public ListApiMcpServerSystemToolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApiMcpServerSystemToolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApiMcpServerSystemToolsResponse setBody(ListApiMcpServerSystemToolsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApiMcpServerSystemToolsResponseBody getBody() {
        return this.body;
    }

}
