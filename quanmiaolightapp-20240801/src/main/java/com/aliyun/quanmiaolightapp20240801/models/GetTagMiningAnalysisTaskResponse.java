// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetTagMiningAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTagMiningAnalysisTaskResponseBody body;

    public static GetTagMiningAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTagMiningAnalysisTaskResponse self = new GetTagMiningAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetTagMiningAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTagMiningAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTagMiningAnalysisTaskResponse setBody(GetTagMiningAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTagMiningAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
