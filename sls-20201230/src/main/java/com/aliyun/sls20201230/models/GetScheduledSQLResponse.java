// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetScheduledSQLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScheduledSQL body;

    public static GetScheduledSQLResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledSQLResponse self = new GetScheduledSQLResponse();
        return TeaModel.build(map, self);
    }

    public GetScheduledSQLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScheduledSQLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScheduledSQLResponse setBody(ScheduledSQL body) {
        this.body = body;
        return this;
    }
    public ScheduledSQL getBody() {
        return this.body;
    }

}
