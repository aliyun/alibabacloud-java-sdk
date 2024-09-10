// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListStrategyUuidCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWhiteListStrategyUuidCountResponseBody body;

    public static DescribeWhiteListStrategyUuidCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListStrategyUuidCountResponse self = new DescribeWhiteListStrategyUuidCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListStrategyUuidCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhiteListStrategyUuidCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWhiteListStrategyUuidCountResponse setBody(DescribeWhiteListStrategyUuidCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhiteListStrategyUuidCountResponseBody getBody() {
        return this.body;
    }

}
