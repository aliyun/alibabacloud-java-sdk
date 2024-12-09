// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAgentInstanceConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentInstanceConfigsResponseBody body;

    public static ListAgentInstanceConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentInstanceConfigsResponse self = new ListAgentInstanceConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentInstanceConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentInstanceConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentInstanceConfigsResponse setBody(ListAgentInstanceConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentInstanceConfigsResponseBody getBody() {
        return this.body;
    }

}
