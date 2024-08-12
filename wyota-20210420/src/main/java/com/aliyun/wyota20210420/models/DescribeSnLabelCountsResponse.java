// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeSnLabelCountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSnLabelCountsResponseBody body;

    public static DescribeSnLabelCountsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnLabelCountsResponse self = new DescribeSnLabelCountsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSnLabelCountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSnLabelCountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSnLabelCountsResponse setBody(DescribeSnLabelCountsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSnLabelCountsResponseBody getBody() {
        return this.body;
    }

}
