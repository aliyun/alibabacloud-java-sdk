// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentlessTaskResponseBody body;

    public static ListAgentlessTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessTaskResponse self = new ListAgentlessTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentlessTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentlessTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentlessTaskResponse setBody(ListAgentlessTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentlessTaskResponseBody getBody() {
        return this.body;
    }

}
