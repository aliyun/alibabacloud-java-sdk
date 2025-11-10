// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GenerateCLICommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateCLICommandResponseBody body;

    public static GenerateCLICommandResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateCLICommandResponse self = new GenerateCLICommandResponse();
        return TeaModel.build(map, self);
    }

    public GenerateCLICommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateCLICommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateCLICommandResponse setBody(GenerateCLICommandResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateCLICommandResponseBody getBody() {
        return this.body;
    }

}
