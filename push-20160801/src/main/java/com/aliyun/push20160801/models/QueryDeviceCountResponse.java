// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDeviceCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceCountResponseBody body;

    public static QueryDeviceCountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceCountResponse self = new QueryDeviceCountResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceCountResponse setBody(QueryDeviceCountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceCountResponseBody getBody() {
        return this.body;
    }

}
