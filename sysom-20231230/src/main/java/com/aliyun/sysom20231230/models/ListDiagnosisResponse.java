// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDiagnosisResponseBody body;

    public static ListDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnosisResponse self = new ListDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public ListDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDiagnosisResponse setBody(ListDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDiagnosisResponseBody getBody() {
        return this.body;
    }

}
