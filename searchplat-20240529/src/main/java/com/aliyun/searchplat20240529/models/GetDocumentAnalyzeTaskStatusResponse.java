// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetDocumentAnalyzeTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocumentAnalyzeTaskStatusResponseBody body;

    public static GetDocumentAnalyzeTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentAnalyzeTaskStatusResponse self = new GetDocumentAnalyzeTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetDocumentAnalyzeTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocumentAnalyzeTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocumentAnalyzeTaskStatusResponse setBody(GetDocumentAnalyzeTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocumentAnalyzeTaskStatusResponseBody getBody() {
        return this.body;
    }

}
