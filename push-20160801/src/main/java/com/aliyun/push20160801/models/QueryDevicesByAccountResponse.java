// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDevicesByAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDevicesByAccountResponseBody body;

    public static QueryDevicesByAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicesByAccountResponse self = new QueryDevicesByAccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicesByAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicesByAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDevicesByAccountResponse setBody(QueryDevicesByAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicesByAccountResponseBody getBody() {
        return this.body;
    }

}
