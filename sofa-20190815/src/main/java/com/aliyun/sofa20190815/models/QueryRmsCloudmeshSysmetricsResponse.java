// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshSysmetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsCloudmeshSysmetricsResponseBody body;

    public static QueryRmsCloudmeshSysmetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshSysmetricsResponse self = new QueryRmsCloudmeshSysmetricsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshSysmetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsCloudmeshSysmetricsResponse setBody(QueryRmsCloudmeshSysmetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsCloudmeshSysmetricsResponseBody getBody() {
        return this.body;
    }

}
