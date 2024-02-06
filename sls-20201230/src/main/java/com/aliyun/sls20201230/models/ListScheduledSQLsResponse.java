// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListScheduledSQLsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScheduledSQLsResponseBody body;

    public static ListScheduledSQLsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledSQLsResponse self = new ListScheduledSQLsResponse();
        return TeaModel.build(map, self);
    }

    public ListScheduledSQLsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScheduledSQLsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScheduledSQLsResponse setBody(ListScheduledSQLsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScheduledSQLsResponseBody getBody() {
        return this.body;
    }

}
