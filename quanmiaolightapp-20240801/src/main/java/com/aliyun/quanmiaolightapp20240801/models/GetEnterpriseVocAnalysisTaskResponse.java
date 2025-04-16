// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetEnterpriseVocAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEnterpriseVocAnalysisTaskResponseBody body;

    public static GetEnterpriseVocAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseVocAnalysisTaskResponse self = new GetEnterpriseVocAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseVocAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnterpriseVocAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEnterpriseVocAnalysisTaskResponse setBody(GetEnterpriseVocAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnterpriseVocAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
