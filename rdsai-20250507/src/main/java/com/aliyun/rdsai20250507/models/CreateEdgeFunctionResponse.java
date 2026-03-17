// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateEdgeFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEdgeFunctionResponseBody body;

    public static CreateEdgeFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeFunctionResponse self = new CreateEdgeFunctionResponse();
        return TeaModel.build(map, self);
    }

    public CreateEdgeFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEdgeFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEdgeFunctionResponse setBody(CreateEdgeFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeFunctionResponseBody getBody() {
        return this.body;
    }

}
