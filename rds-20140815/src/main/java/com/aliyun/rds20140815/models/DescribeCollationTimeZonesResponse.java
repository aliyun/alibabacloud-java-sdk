// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCollationTimeZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCollationTimeZonesResponseBody body;

    public static DescribeCollationTimeZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCollationTimeZonesResponse self = new DescribeCollationTimeZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCollationTimeZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCollationTimeZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCollationTimeZonesResponse setBody(DescribeCollationTimeZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCollationTimeZonesResponseBody getBody() {
        return this.body;
    }

}
