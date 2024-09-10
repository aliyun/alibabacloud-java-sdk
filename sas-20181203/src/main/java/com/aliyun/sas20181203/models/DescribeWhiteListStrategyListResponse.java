// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListStrategyListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWhiteListStrategyListResponseBody body;

    public static DescribeWhiteListStrategyListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListStrategyListResponse self = new DescribeWhiteListStrategyListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListStrategyListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhiteListStrategyListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWhiteListStrategyListResponse setBody(DescribeWhiteListStrategyListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhiteListStrategyListResponseBody getBody() {
        return this.body;
    }

}
