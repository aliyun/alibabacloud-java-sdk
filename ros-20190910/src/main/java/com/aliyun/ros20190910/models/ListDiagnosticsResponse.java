// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListDiagnosticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDiagnosticsResponseBody body;

    public static ListDiagnosticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnosticsResponse self = new ListDiagnosticsResponse();
        return TeaModel.build(map, self);
    }

    public ListDiagnosticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDiagnosticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDiagnosticsResponse setBody(ListDiagnosticsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDiagnosticsResponseBody getBody() {
        return this.body;
    }

}
