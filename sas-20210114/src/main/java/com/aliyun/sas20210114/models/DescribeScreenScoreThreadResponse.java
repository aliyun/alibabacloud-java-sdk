// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenScoreThreadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScreenScoreThreadResponseBody body;

    public static DescribeScreenScoreThreadResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenScoreThreadResponse self = new DescribeScreenScoreThreadResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScreenScoreThreadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScreenScoreThreadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScreenScoreThreadResponse setBody(DescribeScreenScoreThreadResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScreenScoreThreadResponseBody getBody() {
        return this.body;
    }

}
