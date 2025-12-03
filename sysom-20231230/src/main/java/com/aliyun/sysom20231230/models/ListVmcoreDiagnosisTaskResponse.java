// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListVmcoreDiagnosisTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVmcoreDiagnosisTaskResponseBody body;

    public static ListVmcoreDiagnosisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVmcoreDiagnosisTaskResponse self = new ListVmcoreDiagnosisTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListVmcoreDiagnosisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVmcoreDiagnosisTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVmcoreDiagnosisTaskResponse setBody(ListVmcoreDiagnosisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVmcoreDiagnosisTaskResponseBody getBody() {
        return this.body;
    }

}
