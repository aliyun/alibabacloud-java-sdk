// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateDocumentAnalyzeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDocumentAnalyzeTaskResponseBody body;

    public static CreateDocumentAnalyzeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDocumentAnalyzeTaskResponse self = new CreateDocumentAnalyzeTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDocumentAnalyzeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDocumentAnalyzeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDocumentAnalyzeTaskResponse setBody(CreateDocumentAnalyzeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDocumentAnalyzeTaskResponseBody getBody() {
        return this.body;
    }

}
