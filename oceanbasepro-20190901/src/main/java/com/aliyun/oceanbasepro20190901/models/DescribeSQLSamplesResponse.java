// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLSamplesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLSamplesResponseBody body;

    public static DescribeSQLSamplesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLSamplesResponse self = new DescribeSQLSamplesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLSamplesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLSamplesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLSamplesResponse setBody(DescribeSQLSamplesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLSamplesResponseBody getBody() {
        return this.body;
    }

}
