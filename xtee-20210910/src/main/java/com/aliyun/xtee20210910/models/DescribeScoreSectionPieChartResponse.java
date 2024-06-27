// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeScoreSectionPieChartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScoreSectionPieChartResponseBody body;

    public static DescribeScoreSectionPieChartResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScoreSectionPieChartResponse self = new DescribeScoreSectionPieChartResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScoreSectionPieChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScoreSectionPieChartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScoreSectionPieChartResponse setBody(DescribeScoreSectionPieChartResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScoreSectionPieChartResponseBody getBody() {
        return this.body;
    }

}
