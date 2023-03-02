// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseSlowLogRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDatabaseSlowLogRecordsResponseBody body;

    public static DescribeDatabaseSlowLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabaseSlowLogRecordsResponse self = new DescribeDatabaseSlowLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDatabaseSlowLogRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDatabaseSlowLogRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDatabaseSlowLogRecordsResponse setBody(DescribeDatabaseSlowLogRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDatabaseSlowLogRecordsResponseBody getBody() {
        return this.body;
    }

}
