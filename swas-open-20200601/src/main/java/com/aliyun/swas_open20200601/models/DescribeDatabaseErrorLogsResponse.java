// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseErrorLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDatabaseErrorLogsResponseBody body;

    public static DescribeDatabaseErrorLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabaseErrorLogsResponse self = new DescribeDatabaseErrorLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDatabaseErrorLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDatabaseErrorLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDatabaseErrorLogsResponse setBody(DescribeDatabaseErrorLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDatabaseErrorLogsResponseBody getBody() {
        return this.body;
    }

}
