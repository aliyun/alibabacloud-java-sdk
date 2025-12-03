// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenTitlesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScreenTitlesResponseBody body;

    public static DescribeScreenTitlesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenTitlesResponse self = new DescribeScreenTitlesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScreenTitlesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScreenTitlesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScreenTitlesResponse setBody(DescribeScreenTitlesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScreenTitlesResponseBody getBody() {
        return this.body;
    }

}
