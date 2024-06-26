// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDeviceStatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceStatResponseBody body;

    public static QueryDeviceStatResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceStatResponse self = new QueryDeviceStatResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceStatResponse setBody(QueryDeviceStatResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceStatResponseBody getBody() {
        return this.body;
    }

}
