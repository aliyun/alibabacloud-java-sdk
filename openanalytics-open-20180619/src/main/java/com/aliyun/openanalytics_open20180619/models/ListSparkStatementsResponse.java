// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ListSparkStatementsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSparkStatementsResponseBody body;

    public static ListSparkStatementsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSparkStatementsResponse self = new ListSparkStatementsResponse();
        return TeaModel.build(map, self);
    }

    public ListSparkStatementsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSparkStatementsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSparkStatementsResponse setBody(ListSparkStatementsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSparkStatementsResponseBody getBody() {
        return this.body;
    }

}
