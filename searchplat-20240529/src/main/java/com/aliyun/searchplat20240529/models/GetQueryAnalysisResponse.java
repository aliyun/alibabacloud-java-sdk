// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetQueryAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQueryAnalysisResponseBody body;

    public static GetQueryAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueryAnalysisResponse self = new GetQueryAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public GetQueryAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueryAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueryAnalysisResponse setBody(GetQueryAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryAnalysisResponseBody getBody() {
        return this.body;
    }

}
