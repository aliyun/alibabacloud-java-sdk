// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class CancelSparkStatementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelSparkStatementResponseBody body;

    public static CancelSparkStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSparkStatementResponse self = new CancelSparkStatementResponse();
        return TeaModel.build(map, self);
    }

    public CancelSparkStatementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelSparkStatementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelSparkStatementResponse setBody(CancelSparkStatementResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelSparkStatementResponseBody getBody() {
        return this.body;
    }

}
