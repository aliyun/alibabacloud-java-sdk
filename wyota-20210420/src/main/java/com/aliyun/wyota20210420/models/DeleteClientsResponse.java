// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DeleteClientsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteClientsResponseBody body;

    public static DeleteClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientsResponse self = new DeleteClientsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClientsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteClientsResponse setBody(DeleteClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClientsResponseBody getBody() {
        return this.body;
    }

}
