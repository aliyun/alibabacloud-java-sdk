// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisTrafficRankingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNisTrafficRankingResponseBody body;

    public static DescribeNisTrafficRankingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisTrafficRankingResponse self = new DescribeNisTrafficRankingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNisTrafficRankingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNisTrafficRankingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNisTrafficRankingResponse setBody(DescribeNisTrafficRankingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNisTrafficRankingResponseBody getBody() {
        return this.body;
    }

}
