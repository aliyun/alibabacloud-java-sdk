// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QueryRecallManagementTableRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRecallManagementTableRecordsResponseBody body;

    public static QueryRecallManagementTableRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecallManagementTableRecordsResponse self = new QueryRecallManagementTableRecordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecallManagementTableRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecallManagementTableRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecallManagementTableRecordsResponse setBody(QueryRecallManagementTableRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecallManagementTableRecordsResponseBody getBody() {
        return this.body;
    }

}
