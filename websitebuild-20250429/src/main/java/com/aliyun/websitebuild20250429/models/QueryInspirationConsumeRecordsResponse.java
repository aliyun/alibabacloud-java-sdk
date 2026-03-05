// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryInspirationConsumeRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryInspirationConsumeRecordsResponseBody body;

    public static QueryInspirationConsumeRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInspirationConsumeRecordsResponse self = new QueryInspirationConsumeRecordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryInspirationConsumeRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInspirationConsumeRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInspirationConsumeRecordsResponse setBody(QueryInspirationConsumeRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInspirationConsumeRecordsResponseBody getBody() {
        return this.body;
    }

}
