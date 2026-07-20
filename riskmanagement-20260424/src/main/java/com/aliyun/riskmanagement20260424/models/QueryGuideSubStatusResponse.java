// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryGuideSubStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryGuideSubStatusResponseBody body;

    public static QueryGuideSubStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGuideSubStatusResponse self = new QueryGuideSubStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryGuideSubStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGuideSubStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGuideSubStatusResponse setBody(QueryGuideSubStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGuideSubStatusResponseBody getBody() {
        return this.body;
    }

}
