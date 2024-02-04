// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDatabasesResponseBody body;

    public static DescribeDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabasesResponse self = new DescribeDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDatabasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDatabasesResponse setBody(DescribeDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDatabasesResponseBody getBody() {
        return this.body;
    }

}
