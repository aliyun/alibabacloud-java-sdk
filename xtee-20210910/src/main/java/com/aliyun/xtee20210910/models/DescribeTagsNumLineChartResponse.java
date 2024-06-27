// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsNumLineChartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTagsNumLineChartResponseBody body;

    public static DescribeTagsNumLineChartResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsNumLineChartResponse self = new DescribeTagsNumLineChartResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagsNumLineChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagsNumLineChartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTagsNumLineChartResponse setBody(DescribeTagsNumLineChartResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagsNumLineChartResponseBody getBody() {
        return this.body;
    }

}
