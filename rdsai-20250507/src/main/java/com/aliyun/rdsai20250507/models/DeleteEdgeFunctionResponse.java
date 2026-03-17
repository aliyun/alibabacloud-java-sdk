// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteEdgeFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEdgeFunctionResponseBody body;

    public static DeleteEdgeFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeFunctionResponse self = new DeleteEdgeFunctionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEdgeFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEdgeFunctionResponse setBody(DeleteEdgeFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEdgeFunctionResponseBody getBody() {
        return this.body;
    }

}
