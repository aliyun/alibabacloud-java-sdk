// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateImageAnalyzeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImageAnalyzeTaskResponseBody body;

    public static CreateImageAnalyzeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageAnalyzeTaskResponse self = new CreateImageAnalyzeTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageAnalyzeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageAnalyzeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImageAnalyzeTaskResponse setBody(CreateImageAnalyzeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageAnalyzeTaskResponseBody getBody() {
        return this.body;
    }

}
