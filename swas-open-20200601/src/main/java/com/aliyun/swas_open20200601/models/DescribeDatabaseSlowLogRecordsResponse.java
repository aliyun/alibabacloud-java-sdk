// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseSlowLogRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
