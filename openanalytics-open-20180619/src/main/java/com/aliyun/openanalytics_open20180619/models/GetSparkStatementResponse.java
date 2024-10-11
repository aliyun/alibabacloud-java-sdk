// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetSparkStatementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkStatementResponseBody body;

    public static GetSparkStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkStatementResponse self = new GetSparkStatementResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkStatementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkStatementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkStatementResponse setBody(GetSparkStatementResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkStatementResponseBody getBody() {
        return this.body;
    }

}
