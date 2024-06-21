// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetDocumentSplitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocumentSplitResponseBody body;

    public static GetDocumentSplitResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentSplitResponse self = new GetDocumentSplitResponse();
        return TeaModel.build(map, self);
    }

    public GetDocumentSplitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocumentSplitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocumentSplitResponse setBody(GetDocumentSplitResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocumentSplitResponseBody getBody() {
        return this.body;
    }

}
