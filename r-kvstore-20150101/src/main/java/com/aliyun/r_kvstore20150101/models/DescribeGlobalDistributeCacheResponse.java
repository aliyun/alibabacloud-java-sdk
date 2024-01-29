// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeGlobalDistributeCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGlobalDistributeCacheResponseBody body;

    public static DescribeGlobalDistributeCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDistributeCacheResponse self = new DescribeGlobalDistributeCacheResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDistributeCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGlobalDistributeCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGlobalDistributeCacheResponse setBody(DescribeGlobalDistributeCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGlobalDistributeCacheResponseBody getBody() {
        return this.body;
    }

}
