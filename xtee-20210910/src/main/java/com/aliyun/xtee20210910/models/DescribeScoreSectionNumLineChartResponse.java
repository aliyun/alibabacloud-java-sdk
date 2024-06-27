// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeScoreSectionNumLineChartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScoreSectionNumLineChartResponseBody body;

    public static DescribeScoreSectionNumLineChartResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScoreSectionNumLineChartResponse self = new DescribeScoreSectionNumLineChartResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScoreSectionNumLineChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScoreSectionNumLineChartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScoreSectionNumLineChartResponse setBody(DescribeScoreSectionNumLineChartResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScoreSectionNumLineChartResponseBody getBody() {
        return this.body;
    }

}
