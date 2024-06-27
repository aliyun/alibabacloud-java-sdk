// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableMarketListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVariableMarketListResponseBody body;

    public static DescribeVariableMarketListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableMarketListResponse self = new DescribeVariableMarketListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVariableMarketListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVariableMarketListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVariableMarketListResponse setBody(DescribeVariableMarketListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVariableMarketListResponseBody getBody() {
        return this.body;
    }

}
