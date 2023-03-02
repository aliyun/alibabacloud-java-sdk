// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseInstanceParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDatabaseInstanceParametersResponseBody body;

    public static DescribeDatabaseInstanceParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabaseInstanceParametersResponse self = new DescribeDatabaseInstanceParametersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDatabaseInstanceParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDatabaseInstanceParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDatabaseInstanceParametersResponse setBody(DescribeDatabaseInstanceParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDatabaseInstanceParametersResponseBody getBody() {
        return this.body;
    }

}
