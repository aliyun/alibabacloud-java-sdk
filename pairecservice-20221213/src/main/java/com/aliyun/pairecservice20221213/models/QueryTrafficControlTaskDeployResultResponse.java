// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QueryTrafficControlTaskDeployResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTrafficControlTaskDeployResultResponseBody body;

    public static QueryTrafficControlTaskDeployResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrafficControlTaskDeployResultResponse self = new QueryTrafficControlTaskDeployResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrafficControlTaskDeployResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTrafficControlTaskDeployResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTrafficControlTaskDeployResultResponse setBody(QueryTrafficControlTaskDeployResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrafficControlTaskDeployResultResponseBody getBody() {
        return this.body;
    }

}
