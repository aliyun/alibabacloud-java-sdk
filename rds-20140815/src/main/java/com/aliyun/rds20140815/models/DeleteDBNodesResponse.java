// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDBNodesResponseBody body;

    public static DeleteDBNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBNodesResponse self = new DeleteDBNodesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBNodesResponse setBody(DeleteDBNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBNodesResponseBody getBody() {
        return this.body;
    }

}
