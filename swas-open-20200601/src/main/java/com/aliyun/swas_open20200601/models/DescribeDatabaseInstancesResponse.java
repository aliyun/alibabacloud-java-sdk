// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDatabaseInstancesResponseBody body;

    public static DescribeDatabaseInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabaseInstancesResponse self = new DescribeDatabaseInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDatabaseInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDatabaseInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDatabaseInstancesResponse setBody(DescribeDatabaseInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDatabaseInstancesResponseBody getBody() {
        return this.body;
    }

}
