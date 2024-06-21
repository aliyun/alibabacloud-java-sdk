// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetDocumentRankResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocumentRankResponseBody body;

    public static GetDocumentRankResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentRankResponse self = new GetDocumentRankResponse();
        return TeaModel.build(map, self);
    }

    public GetDocumentRankResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocumentRankResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocumentRankResponse setBody(GetDocumentRankResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocumentRankResponseBody getBody() {
        return this.body;
    }

}
