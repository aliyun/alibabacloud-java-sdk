// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLLogRecordsResponseBody body;

    public static DescribeSQLLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogRecordsResponse self = new DescribeSQLLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLLogRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLLogRecordsResponse setBody(DescribeSQLLogRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLLogRecordsResponseBody getBody() {
        return this.body;
    }

}
