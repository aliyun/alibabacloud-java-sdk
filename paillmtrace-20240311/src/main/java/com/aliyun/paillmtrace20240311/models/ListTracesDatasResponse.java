// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListTracesDatasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTracesDatasResponseBody body;

    public static ListTracesDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTracesDatasResponse self = new ListTracesDatasResponse();
        return TeaModel.build(map, self);
    }

    public ListTracesDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTracesDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTracesDatasResponse setBody(ListTracesDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTracesDatasResponseBody getBody() {
        return this.body;
    }

}
