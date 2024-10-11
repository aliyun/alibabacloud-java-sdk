// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class SubmitSparkSQLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSparkSQLResponseBody body;

    public static SubmitSparkSQLResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkSQLResponse self = new SubmitSparkSQLResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSparkSQLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSparkSQLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSparkSQLResponse setBody(SubmitSparkSQLResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSparkSQLResponseBody getBody() {
        return this.body;
    }

}
