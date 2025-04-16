// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitEnterpriseVocAnalysisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitEnterpriseVocAnalysisTaskResponseBody body;

    public static SubmitEnterpriseVocAnalysisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitEnterpriseVocAnalysisTaskResponse self = new SubmitEnterpriseVocAnalysisTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitEnterpriseVocAnalysisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitEnterpriseVocAnalysisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitEnterpriseVocAnalysisTaskResponse setBody(SubmitEnterpriseVocAnalysisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitEnterpriseVocAnalysisTaskResponseBody getBody() {
        return this.body;
    }

}
