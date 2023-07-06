// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryReportNotifiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryReportNotifiesResponseBody body;

    public static QueryReportNotifiesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReportNotifiesResponse self = new QueryReportNotifiesResponse();
        return TeaModel.build(map, self);
    }

    public QueryReportNotifiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryReportNotifiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryReportNotifiesResponse setBody(QueryReportNotifiesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryReportNotifiesResponseBody getBody() {
        return this.body;
    }

}
