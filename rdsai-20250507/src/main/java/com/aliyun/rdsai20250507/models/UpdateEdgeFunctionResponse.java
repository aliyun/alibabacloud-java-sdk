// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateEdgeFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEdgeFunctionResponseBody body;

    public static UpdateEdgeFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeFunctionResponse self = new UpdateEdgeFunctionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEdgeFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEdgeFunctionResponse setBody(UpdateEdgeFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEdgeFunctionResponseBody getBody() {
        return this.body;
    }

}
