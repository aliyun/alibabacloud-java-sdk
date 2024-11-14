// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserAbnormalTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserAbnormalTrendResponseBody body;

    public static DescribeUserAbnormalTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAbnormalTrendResponse self = new DescribeUserAbnormalTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserAbnormalTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserAbnormalTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserAbnormalTrendResponse setBody(DescribeUserAbnormalTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserAbnormalTrendResponseBody getBody() {
        return this.body;
    }

}
