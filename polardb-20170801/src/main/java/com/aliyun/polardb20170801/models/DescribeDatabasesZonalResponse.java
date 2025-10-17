// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDatabasesZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDatabasesZonalResponseBody body;

    public static DescribeDatabasesZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabasesZonalResponse self = new DescribeDatabasesZonalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDatabasesZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDatabasesZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDatabasesZonalResponse setBody(DescribeDatabasesZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDatabasesZonalResponseBody getBody() {
        return this.body;
    }

}
