// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSampleSqlRawTextsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSampleSqlRawTextsResponseBody body;

    public static DescribeSampleSqlRawTextsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleSqlRawTextsResponse self = new DescribeSampleSqlRawTextsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSampleSqlRawTextsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSampleSqlRawTextsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSampleSqlRawTextsResponse setBody(DescribeSampleSqlRawTextsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSampleSqlRawTextsResponseBody getBody() {
        return this.body;
    }

}
