// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListCustomAgentToolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomAgentToolsResponseBody body;

    public static ListCustomAgentToolsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAgentToolsResponse self = new ListCustomAgentToolsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomAgentToolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomAgentToolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomAgentToolsResponse setBody(ListCustomAgentToolsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomAgentToolsResponseBody getBody() {
        return this.body;
    }

}
