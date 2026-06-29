// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class ListAgentStoragesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentStoragesResponseBody body;

    public static ListAgentStoragesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentStoragesResponse self = new ListAgentStoragesResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentStoragesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentStoragesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentStoragesResponse setBody(ListAgentStoragesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentStoragesResponseBody getBody() {
        return this.body;
    }

}
