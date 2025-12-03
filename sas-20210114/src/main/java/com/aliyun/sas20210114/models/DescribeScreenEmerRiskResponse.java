// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenEmerRiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScreenEmerRiskResponseBody body;

    public static DescribeScreenEmerRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenEmerRiskResponse self = new DescribeScreenEmerRiskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScreenEmerRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScreenEmerRiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScreenEmerRiskResponse setBody(DescribeScreenEmerRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScreenEmerRiskResponseBody getBody() {
        return this.body;
    }

}
