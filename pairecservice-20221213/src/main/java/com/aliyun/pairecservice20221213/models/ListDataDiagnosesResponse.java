// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListDataDiagnosesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataDiagnosesResponseBody body;

    public static ListDataDiagnosesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataDiagnosesResponse self = new ListDataDiagnosesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataDiagnosesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataDiagnosesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataDiagnosesResponse setBody(ListDataDiagnosesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataDiagnosesResponseBody getBody() {
        return this.body;
    }

}
