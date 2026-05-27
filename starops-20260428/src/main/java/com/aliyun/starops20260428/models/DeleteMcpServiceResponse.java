// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class DeleteMcpServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMcpServiceResponseBody body;

    public static DeleteMcpServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcpServiceResponse self = new DeleteMcpServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcpServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcpServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMcpServiceResponse setBody(DeleteMcpServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcpServiceResponseBody getBody() {
        return this.body;
    }

}
