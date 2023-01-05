// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeDsReportsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDsReportsResponseBody body;

    public static DescribeDsReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDsReportsResponse self = new DescribeDsReportsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDsReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDsReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDsReportsResponse setBody(DescribeDsReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDsReportsResponseBody getBody() {
        return this.body;
    }

}
