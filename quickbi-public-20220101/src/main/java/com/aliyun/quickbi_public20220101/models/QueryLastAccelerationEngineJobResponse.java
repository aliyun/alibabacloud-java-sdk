// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryLastAccelerationEngineJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLastAccelerationEngineJobResponseBody body;

    public static QueryLastAccelerationEngineJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLastAccelerationEngineJobResponse self = new QueryLastAccelerationEngineJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryLastAccelerationEngineJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLastAccelerationEngineJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLastAccelerationEngineJobResponse setBody(QueryLastAccelerationEngineJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLastAccelerationEngineJobResponseBody getBody() {
        return this.body;
    }

}
