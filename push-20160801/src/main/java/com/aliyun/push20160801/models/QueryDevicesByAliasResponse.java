// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDevicesByAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDevicesByAliasResponseBody body;

    public static QueryDevicesByAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicesByAliasResponse self = new QueryDevicesByAliasResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicesByAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicesByAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDevicesByAliasResponse setBody(QueryDevicesByAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicesByAliasResponseBody getBody() {
        return this.body;
    }

}
