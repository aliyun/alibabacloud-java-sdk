// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class QueryDigitalHumanProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDigitalHumanProjectResponseBody body;

    public static QueryDigitalHumanProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalHumanProjectResponse self = new QueryDigitalHumanProjectResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalHumanProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDigitalHumanProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDigitalHumanProjectResponse setBody(QueryDigitalHumanProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDigitalHumanProjectResponseBody getBody() {
        return this.body;
    }

}
