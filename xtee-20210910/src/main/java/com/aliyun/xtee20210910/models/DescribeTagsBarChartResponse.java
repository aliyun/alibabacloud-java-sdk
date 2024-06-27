// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsBarChartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTagsBarChartResponseBody body;

    public static DescribeTagsBarChartResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsBarChartResponse self = new DescribeTagsBarChartResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagsBarChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagsBarChartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTagsBarChartResponse setBody(DescribeTagsBarChartResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagsBarChartResponseBody getBody() {
        return this.body;
    }

}
