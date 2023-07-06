// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class GetAnalysisComponentResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAnalysisComponentResultResponseBody body;

    public static GetAnalysisComponentResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAnalysisComponentResultResponse self = new GetAnalysisComponentResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAnalysisComponentResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAnalysisComponentResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAnalysisComponentResultResponse setBody(GetAnalysisComponentResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAnalysisComponentResultResponseBody getBody() {
        return this.body;
    }

}
